package com.crud.tasks.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BadgesTrelloDto {

    @JsonProperty("votes")
    private Integer votes;

    @JsonProperty("attachment")
    private AtachmentsByTypeTrelloDto attachments;
}
