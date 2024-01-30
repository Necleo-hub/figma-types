package com.necleo.figma.types.properties.props;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.necleo.figma.types.deserializers.SingleClassSymbolDeserializer;
import com.necleo.figma.types.properties.LetterSpacing;
import com.necleo.figma.types.properties.text.FontName;
import com.necleo.figma.types.properties.text.LineHeight;
import com.necleo.figma.types.properties.text.TextCase;
import com.necleo.figma.types.properties.text.TextDecoration;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
@Jacksonized
@ToString
@Getter
public class TextProps {
  String characters;

  @JsonDeserialize(using = SingleClassSymbolDeserializer.FontNameDe.class)
  FontName fontName;

  @JsonDeserialize(using = SingleClassSymbolDeserializer.DoubleDe.class)
  Double fontSize;

  @JsonDeserialize(using = SingleClassSymbolDeserializer.IntDe.class)
  Integer fontWeight;

  @JsonDeserialize(using = SingleClassSymbolDeserializer.LetterSpacingDe.class)
  LetterSpacing letterSpacing;

  @JsonDeserialize(using = SingleClassSymbolDeserializer.LineHeightDe.class)
  LineHeight lineHeight;

  @JsonDeserialize(using = SingleClassSymbolDeserializer.TextDecorationDe.class)
  TextDecoration textDecoration;

  @JsonDeserialize(using = SingleClassSymbolDeserializer.TextCaseDe.class)
  TextCase textCase;

  String textStyleId;
}
