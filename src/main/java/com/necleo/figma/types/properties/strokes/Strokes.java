package com.necleo.figma.types.properties.strokes;

import com.necleo.figma.types.properties.fills.Color;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Strokes {
  String type; // enum
  boolean visible;
  int opacity;
  String BlendMode;
  Color color;
}
