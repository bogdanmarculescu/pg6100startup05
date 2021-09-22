package org.startup.part05.usercollections.model

import org.startup.part05.cardsdto.CardDto
import org.startup.part05.cardsdto.Rarity


data class Card(
        val cardId : String,
        val rarity: Rarity
){

    constructor(dto: CardDto): this(
            dto.cardId ?: throw IllegalArgumentException("Null cardId"),
            dto.rarity ?: throw IllegalArgumentException("Null rarity"))
}