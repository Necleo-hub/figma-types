package com.necleo.figma.types.properties.text;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.necleo.figma.types.properties.TextI;
import com.necleo.figma.types.properties.fills.Fills;
import com.necleo.figma.types.properties.props.TextProps;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
@Jacksonized
public class FigmaTextSegment implements TextI {

  int end;
  String fillStyleId;
  List<Fills> fills;
  // TODO: Handle hyperlink property of text
  // Hyperlinktarget hyperlink;

  int indentation;
  ListOptions listOptions;
  int start;

  @JsonUnwrapped
  TextProps text;
}
