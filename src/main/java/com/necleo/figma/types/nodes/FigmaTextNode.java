package com.necleo.figma.types.nodes;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.necleo.figma.types.enums.figmaenums.BlendMode;
import com.necleo.figma.types.enums.text.TextAlignHorizontal;
import com.necleo.figma.types.enums.text.TextAlignVertical;
import com.necleo.figma.types.enums.text.TextAutoResize;
import com.necleo.figma.types.properties.FillStroke;
import com.necleo.figma.types.properties.TextI;
import com.necleo.figma.types.properties.props.FillStrokeProps;
import com.necleo.figma.types.properties.props.TextProps;
import com.necleo.figma.types.properties.text.FigmaTextSegment;
import com.necleo.figma.types.properties.text.TextTruncation;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
@Jacksonized
public class FigmaTextNode extends FigmaNode implements FillStroke, TextI {
  @JsonUnwrapped
  FillStrokeProps fillStroke;
  @JsonUnwrapped
  TextProps text;

  int maxLines;
  BlendMode blendMode;
  TextTruncation textTruncation;
  boolean hasMissingFont;
  TextAutoResize textAutoResize;
  int paragraphIndent;
  int paragraphSpacing;
  boolean autoRename;
  TextAlignHorizontal textAlignHorizontal;
  TextAlignVertical textAlignVertical;
  List<FigmaTextSegment> getStyledTextSegments;
}
