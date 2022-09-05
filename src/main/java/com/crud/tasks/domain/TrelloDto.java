package com.crud.tasks.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TrelloDto {

    @JsonProperty("board")
    private Integer board;

    @JsonProperty("card")
    private Integer card;
}
