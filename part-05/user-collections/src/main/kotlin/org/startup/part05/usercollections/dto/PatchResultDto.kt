package org.startup.part05.usercollections.dto

import io.swagger.annotations.ApiModelProperty


class PatchResultDto(

        @get:ApiModelProperty("If a card pack was opened, specify which cards were in it")
        var cardIdsInOpenedPack: MutableList<String> = mutableListOf()
)