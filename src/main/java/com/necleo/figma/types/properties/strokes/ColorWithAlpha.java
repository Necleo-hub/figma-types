package com.necleo.figma.types.properties.strokes;

import lombok.Getter;

@Getter
public class ColorWithAlpha extends Color {
  double a;

  public ColorWithAlpha(double r, double g, double b, double a) {
    super(r, g, b);
    this.a = a;
  }
}
