package com.necleo.figma.types.properties.fills.subtypes;

import java.util.Map;

import com.necleo.figma.types.properties.fills.Color;
import com.necleo.figma.types.properties.fills.Fills;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
@Jacksonized
public class FillsSolid extends Fills {
  Color color;
  Map<String, Object> boundVariables;
}
