package com.necleo.codemonkey.lib.types.figma.properties.reactions.actions;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Getter;
import lombok.Setter;

import java.util.Vector;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = BackAction.class, name = "BACK"),
        @JsonSubTypes.Type(value = UrlAction.class, name = "URL"),
        @JsonSubTypes.Type(value = UpdateMediaRuntimeAction.class, name = "UPDATE_MEDIA_RUNTIME"),
        @JsonSubTypes.Type(value = NodeAction.class, name = "NODE")
})
@Getter
public abstract class Action {
//    BackAction backAction;
//    NodeAction nodeAction;
//    UrlAction urlAction;
//    UpdateMediaRuntimeAction updateMediaRuntimeAction;
    // Common fields and methods for all subtypes

    public abstract ActionType getType();
}


