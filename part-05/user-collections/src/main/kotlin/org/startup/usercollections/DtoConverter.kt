package org.startup.usercollections

import org.startup.usercollections.db.CardCopy
import org.startup.usercollections.db.User
import org.startup.usercollections.dto.CardCopyDto
import org.startup.usercollections.dto.UserDto


object DtoConverter {


    fun transform(user: User) : UserDto {

        return UserDto().apply {
            userId = user.userId
            coins = user.coins
            cardPacks = user.cardPacks
            ownedCards = user.ownedCards.map { transform(it) }.toMutableList()
        }
    }

    fun transform(cardCopy: CardCopy) : CardCopyDto {
        return CardCopyDto().apply {
            cardId = cardCopy.cardId
            numberOfCopies = cardCopy.numberOfCopies
        }
    }
}