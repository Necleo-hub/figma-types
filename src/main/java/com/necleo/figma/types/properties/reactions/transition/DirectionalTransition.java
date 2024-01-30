package com.necleo.figma.types.properties.reactions.transition;

import com.necleo.figma.types.enums.figmaenums.Direction;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@SuperBuilder
@Jacksonized
public class DirectionalTransition extends Transition {
  Direction direction;
  boolean matchLayers;
}
