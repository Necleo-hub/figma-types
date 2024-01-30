package com.necleo.figma.types.rect;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.extern.jackson.Jacksonized;

/**
 * The bounds of the node that does not include rendered properties like drop shadows or strokes.
 * The {@link #x} and {@link #y} inside this property represent the absolute position of the node on
 * the page.
 */
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Jacksonized
public class Rect {
  int x;

  int y;

  int width;

  int height;
}
