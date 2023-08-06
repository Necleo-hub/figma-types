package com.necleo.figma.types.enums;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.extern.jackson.Jacksonized;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Jacksonized
public class FillGeometry {
  public String windingRule; // actually an enum
  public String data;
}
