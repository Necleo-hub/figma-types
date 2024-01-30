package com.necleo.figma.types.properties.reactions.transition.easing;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@SuperBuilder
@Jacksonized
public class SpringEasing extends Easing {
  double mass;
  double stiffness;
  double damping;
  double initialVelocity;
}
