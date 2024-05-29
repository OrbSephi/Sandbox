package org.mathieu.sandbox.ui.screens.episodedetails

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

/**
 * ViewModel for managing the state of the episode details screen.
 *
 * @property application Application context.
 */
class EpisodeDetailsViewModel(application: Application) : AndroidViewModel(application) {
    // Mutable state flow to hold the current state of the episode details
    private val _state: MutableStateFlow<EpisodeDetailsState> = MutableStateFlow(EpisodeDetailsState())

    // Immutable state flow representing the current state of the episode details
    val state: StateFlow<EpisodeDetailsState>
        get() = _state

    /**
     * Initializes the state of the episode details screen with episode details.
     *
     * @param episodeName Name of episode.
     * @param episodeDate Date of episode.
     */
    fun initialize(episodeName: String, episodeDate: String) {
        _state.value = EpisodeDetailsState(
            episodeName = episodeName,
            episodeDate = episodeDate
        )
    }
}

/**
 * Represents the state of the episode details screen.
 *
 * @property episodeName Name of episode.
 * @property episodeDate Date of episode.
 */
data class EpisodeDetailsState(
    val episodeName: String = "",
    val episodeDate: String = ""
)
