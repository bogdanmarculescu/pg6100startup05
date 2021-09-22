package org.startup.part05.usercollections

import org.startup.part05.usercollections.db.CardCopy
import org.startup.part05.usercollections.db.User
import org.startup.part05.usercollections.dto.CardCopyDto
import org.startup.part05.usercollections.dto.UserDto


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