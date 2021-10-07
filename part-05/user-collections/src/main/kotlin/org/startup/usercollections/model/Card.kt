package org.startup.usercollections.model

import org.startup.cardsdto.CardDto
import org.startup.cardsdto.Rarity


data class Card(
        val cardId : String,
        val rarity: Rarity
){

    constructor(dto: CardDto): this(
            dto.cardId ?: throw IllegalArgumentException("Null cardId"),
            dto.rarity ?: throw IllegalArgumentException("Null rarity"))
}