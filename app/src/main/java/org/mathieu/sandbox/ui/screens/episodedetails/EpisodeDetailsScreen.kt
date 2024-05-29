package org.mathieu.sandbox.ui.screens.episodedetails

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController

/**
 * Composable function that displays the details of an episode.
 *
 * @param navController Used for navigating to other destinations.
 * @param episodeName Episode name to display.
 * @param episodeDate Episode date of publication to display.
 */
@Composable
fun EpisodeDetailsScreen(
    navController: NavController,
    episodeName: String,
    episodeDate: String
) {

    // Retrieving the ViewModel associated with this composable
    val viewModel: EpisodeDetailsViewModel = viewModel()

    // Initializing the ViewModel with the episode details
    LaunchedEffect(Unit) {
        viewModel.initialize(episodeName, episodeDate)
    }

    // Retrieving the current state of the ViewModel
    val state by viewModel.state.collectAsState()


    // Displaying the episode details
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Episode Details",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = "Name: ${state.episodeName}",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Text(
            text = "Date: ${state.episodeDate}",
            style = MaterialTheme.typography.bodyMedium
        )
    }
}
