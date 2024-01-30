package com.necleo.figma.types.properties.fills.subtypes;

import com.necleo.figma.types.properties.fills.Fills;
import com.necleo.figma.types.properties.fills.enums.ScaleMode;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
@Jacksonized
public class FillsImage extends Fills {
  ScaleMode scaleMode;
  int[][] imageTransform;
  int scalingFactor;
  int rotation;
  Filters filters;
  String imageHash;
}
