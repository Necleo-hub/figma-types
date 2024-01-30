package com.necleo.figma.types.nodes;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import java.util.List;

import com.necleo.figma.types.enums.figmaenums.nodetypes.FigmaNodeTypes;
import com.necleo.figma.types.properties.*;
import com.necleo.figma.types.properties.props.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
@Jacksonized
public class FigmaComponentNode extends FigmaNode
    implements FillStroke, Corner, StrokeWeight, Children, AutoLayout, Padding {

  @JsonUnwrapped
  CornerProps corner;
  @JsonUnwrapped
  FillStrokeProps fillStroke;
  @JsonUnwrapped
  StrokeWeightProps strokeWeight;
  @JsonUnwrapped
  AutoLayoutProps autoLayout;

  List<FigmaNode> children;

  String gridStyleId;
  boolean clipsContent;
  boolean expanded;

  @JsonUnwrapped
  PaddingProps padding;

  String parentId;
  FigmaNodeTypes parentType;
  InferredAutoLayoutResult inferredAutoLayoutResult;
}
