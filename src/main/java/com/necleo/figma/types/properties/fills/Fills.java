package com.necleo.figma.types.properties.fills;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.necleo.figma.types.enums.figmaenums.FillType;
import com.necleo.figma.types.properties.fills.subtypes.FillsGradient;
import com.necleo.figma.types.properties.fills.subtypes.FillsImage;
import com.necleo.figma.types.properties.fills.subtypes.FillsSolid;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "type",
    visible = true,
    defaultImpl = Fills.class)
@JsonSubTypes({
  @JsonSubTypes.Type(value = FillsImage.class, name = "IMAGE"),
  @JsonSubTypes.Type(value = FillsSolid.class, name = "SOLID"),
  @JsonSubTypes.Type(value = FillsGradient.class, name = "GRADIENT_LINEAR")
})
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@SuperBuilder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Jacksonized
public class Fills {
  FillType type;
  boolean visible;
  float opacity;
  String blendMode;
}
