package com.necleo.figma.types.properties.fills;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.extern.jackson.Jacksonized;

/**
 * An RGBA color<br>
 *
 * Red, Green, Blue, Alpha channel value, between 0 and 1
 */
@Getter
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Builder
@Jacksonized
public class Color {
  double r;
  double g;
  double b;
  double a;
}
