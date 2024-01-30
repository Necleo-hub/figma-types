package com.necleo.figma.types.properties.fills.subtypes;

import java.util.List;

import com.necleo.figma.types.properties.fills.Fills;
import com.necleo.figma.types.properties.fills.GradientStops;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
@Jacksonized
public class FillsGradient extends Fills {
  String visible;
  float opacity;
  String blendMode;
  List<GradientStops> gradientStops;
  int[][] gradientTransform;
}
