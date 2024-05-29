package org.mathieu.sandbox.domain.models

/**
 * This is a character.
 *
 * @property id Unique identifier.
 * @property firstName First name.
 * @property lastName Last name.
 * @property age Age.
 * @property episode List of episodes.
 */
data class Character(
    val id: Int,
    val firstName: String,
    val lastName: String,
    val age: Int,
    val episode: List<Episode>
)