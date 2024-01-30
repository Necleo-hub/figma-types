package com.necleo.figma.types.properties.componentSet;

import com.necleo.figma.types.enums.WindingRule;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@SuperBuilder
@Jacksonized
public class Geometry {
  WindingRule windingRule;
  String data;
}
