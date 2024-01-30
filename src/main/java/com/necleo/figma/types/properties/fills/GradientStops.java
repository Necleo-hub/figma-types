package com.necleo.figma.types.properties.fills;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.extern.jackson.Jacksonized;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Jacksonized
public class GradientStops {
  Color color;

  double position;
}
