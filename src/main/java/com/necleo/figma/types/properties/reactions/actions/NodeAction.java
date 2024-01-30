package com.necleo.figma.types.properties.reactions.actions;

import com.necleo.figma.types.enums.figmaenums.NavigationType;
import com.necleo.figma.types.properties.reactions.transition.Transition;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@SuperBuilder
@Jacksonized
public class NodeAction extends Action {
  String destinationId;
  NavigationType navigation;
  Transition transition;
  boolean resetVideoPosition;
}
