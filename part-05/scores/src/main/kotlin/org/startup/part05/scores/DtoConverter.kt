package org.startup.part05.scores

import org.startup.part05.scores.db.UserStats
import org.startup.part05.scores.dto.UserStatsDto


object DtoConverter {

    fun transform(stats: UserStats) : UserStatsDto =
            stats.run { UserStatsDto(userId, victories, defeats, draws, score) }

    fun transform(scores: Iterable<UserStats>) : List<UserStatsDto> = scores.map { transform(it) }
}