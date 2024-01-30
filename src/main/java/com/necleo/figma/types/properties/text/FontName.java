package com.necleo.figma.types.properties.text;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.jackson.Jacksonized;

// todo: riktam

@Getter
@Builder
@Jacksonized
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class FontName {
  String family;
  String style;
}
