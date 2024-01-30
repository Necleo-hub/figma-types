package com.necleo.figma.types.properties.reactions;

import com.necleo.figma.types.enums.figmaenums.TriggerType;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.extern.jackson.Jacksonized;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Jacksonized
public class Trigger {
  TriggerType type;
}
