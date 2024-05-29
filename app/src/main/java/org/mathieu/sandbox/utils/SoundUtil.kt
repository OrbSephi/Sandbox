package org.mathieu.sandbox.utils

import android.content.Context
import android.media.MediaPlayer
import org.mathieu.sandbox.R

/**
 * Play a sound based on the character name.
 *
 * @param context Context to access system resources.
 * @param name Name of the character.
 */
fun playSound(context: Context, name: String){
    //Change the sound source with the name of the character
    val soundResourceId = when(name) {
        "Sparrow" -> R.raw.pirates
        "Snow" -> R.raw.thrones
        "Monkey.D" -> R.raw.one
        else -> -1 // Default case
    }

    //Check if its default case or not
    if (soundResourceId != -1) {
        val mediaPlayer = MediaPlayer.create(context, soundResourceId)
        mediaPlayer.start()
    }
}