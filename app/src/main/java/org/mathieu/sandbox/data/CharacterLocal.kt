package org.mathieu.sandbox.data

import org.mathieu.sandbox.domain.models.Character
import org.mathieu.sandbox.domain.models.Episode

object CharacterLocal {
    var characters: MutableList<Character> = mutableListOf(
        Character(
            id = 1,
            firstName = "John",
            lastName = "Snow",
            age = 20,
            episode = listOf(
                Episode(date = "2021-01-01", name = "Winter is Coming"),
                Episode(date = "2021-01-08", name = "The Kingsroad")
            )
        ),
        Character(
            id = 2,
            firstName = "Jack",
            lastName = "Sparrow",
            age = 21,
            episode = listOf(
                Episode(date = "2021-02-01", name = "Dead Man's Chest"),
                Episode(date = "2021-02-08", name = "At World's End")
            )
        ),
        Character(
            id = 3,
            firstName = "Luffy",
            lastName = "Monkey.D",
            age = 22,
            episode = listOf(
                Episode(date = "2023-12-17", name = "S20 E197 The dream of Luffy"),
                Episode(date = "1999-10-20", name = "I'm Luffy! The man who's gonna be the king of pirates !")
            )
        )
    )
}