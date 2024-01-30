package com.necleo.figma.types.properties.reactions.actions;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.necleo.figma.types.enums.figmaenums.ActionType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = UrlAction.class, name = "URL"),
  @JsonSubTypes.Type(value = NodeAction.class, name = "NODE"),
  @JsonSubTypes.Type(value = MediaAction.class, name = "MEDIA_RUNTIME_UPDATE"),
  @JsonSubTypes.Type(value = Action.class, name = "BACK"),
  @JsonSubTypes.Type(value = Action.class, name = "CLOSE"),
})
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@SuperBuilder
@Jacksonized
public class Action {
  ActionType type;
}
