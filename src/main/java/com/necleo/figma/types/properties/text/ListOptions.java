package com.necleo.figma.types.properties.text;

import com.necleo.figma.types.enums.ListOptionsType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
@Jacksonized
public class ListOptions {
  ListOptionsType type;
}
