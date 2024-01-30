package com.necleo.figma.types.properties.strokes;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@ToString
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GradientStop {
  ColorWithAlpha color;
  int position;
}
