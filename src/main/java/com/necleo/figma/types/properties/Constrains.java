package com.necleo.figma.types.properties;

import com.necleo.figma.types.enums.ConstrainsValue;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
@Jacksonized
@AllArgsConstructor
public class Constrains {
  ConstrainsValue horizontal;
  ConstrainsValue vertical;
}
