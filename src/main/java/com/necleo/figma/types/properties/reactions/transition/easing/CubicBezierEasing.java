package com.necleo.figma.types.properties.reactions.transition.easing;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
public class CubicBezierEasing extends Easing {
  double x1;
  double y1;
  double x2;
  double y2;
}
