package com.necleo.figma.types.properties.strokes;

import java.util.List;

import com.necleo.figma.types.enums.GradientType;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.extern.jackson.Jacksonized;

@Getter
@Jacksonized
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Strokes {
  GradientType type; // enum
  boolean visible;
  double opacity;
  // todo: riktam
  String BlendMode;
  Color color;
  List<GradientStop> gradientStops;
  List<List<Double>> gradientTransforms;
}
