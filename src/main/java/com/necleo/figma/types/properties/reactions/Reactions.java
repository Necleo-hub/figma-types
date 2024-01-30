package com.necleo.figma.types.properties.reactions;

import java.util.List;

import com.necleo.figma.types.properties.reactions.actions.Action;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.extern.jackson.Jacksonized;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Jacksonized
public class Reactions {
  List<Action> actions;
  Trigger trigger;
}
