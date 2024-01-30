package com.necleo.figma.types.properties.reactions.transition.easing;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.necleo.figma.types.enums.figmaenums.EasingType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "type",
    visible = true,
    defaultImpl = Easing.class)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CubicBezierEasing.class, name = "CUSTOM_CUBIC_BEZIER"),
  @JsonSubTypes.Type(value = SpringEasing.class, name = "CUSTOM_SPRING"),
})
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@SuperBuilder
@Jacksonized
public class Easing {
  EasingType type;
}
