package org.mathieu.sandbox.ui.screens.characterdetails

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import org.mathieu.sandbox.domain.models.Episode
import org.mathieu.sandbox.utils.playSound
import org.mathieu.sandbox.utils.vibratePhone


@Composable
fun CharacterDetailsScreen(
    navController: NavController,
    characterId: Int
) {
    val viewModel: CharacterDetailsViewModel = viewModel()
    val state: CharacterDetailsState by viewModel.state.collectAsState()

    LaunchedEffect(key1 = 0) {
        viewModel.initialize(id = characterId)
    }

    Content(
        state = state,
        navController = navController
    )
}


@Composable
private fun Content(
    state: CharacterDetailsState,
    navController: NavController
) = Column {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)
    ) {
        Column(modifier = Modifier.padding(8.dp)) {
            Text(text = state.firstName)
            Text(text = state.lastName)
        }
    }
    LazyColumn(modifier = Modifier.padding(4.dp)) {
        items(state.episodes){
            episode -> EpisodeItem(episode = episode, navController = navController, name = state.lastName)
        }
    }
}

@Composable
private fun EpisodeItem(episode: Episode, navController: NavController, name: String) {
    val context = LocalContext.current
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
            .clickable{
                playSound(context, name)
                vibratePhone(context)
                navController.navigate("episodeDetails/${episode.name}/${episode.date}")
            }
    ) {
        Column(modifier = Modifier.padding(8.dp)) {
            Text(text = episode.date)
            Text(text = episode.name)
        }
    }
}
