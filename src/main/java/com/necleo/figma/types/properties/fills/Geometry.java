package com.necleo.figma.types.properties.fills;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.extern.jackson.Jacksonized;

@Getter
@Builder
@Jacksonized
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class Geometry {
  String windingRule; // actually an enum
  String data;
}
