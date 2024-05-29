package org.mathieu.sandbox.domain.models

data class Character(
    val id: Int,
    val firstName: String,
    val lastName: String,
    val age: Int,
    val episode: List<Episode>
)