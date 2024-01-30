package com.necleo.figma.types;

import com.necleo.figma.types.enums.figmaenums.ParentType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
@Jacksonized
public class FigmaParent {
  String id;
  ParentType type;
  String name;
}
