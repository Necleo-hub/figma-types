package com.necleo.figma.types.nodes;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import java.util.List;

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
public class FigmaInstanceNode extends FigmaNode
    implements FillStroke, Corner, StrokeWeight, AutoLayout, Padding, Children {
  FigmaComponentNode mainComponent;
  int scaleFactor;
  List<FigmaInstanceNode> exposedInstance;
  boolean isExposedInstance;
  boolean clipsContent;
  boolean expanded;

  @JsonUnwrapped
  CornerProps corner;

  @JsonUnwrapped
  FillStrokeProps fillStroke;

  @JsonUnwrapped
  StrokeWeightProps strokeWeight;

  @JsonUnwrapped
  AutoLayoutProps autoLayout;

  @JsonUnwrapped
  PaddingProps padding;

  List<FigmaNode> children;

  InferredAutoLayoutResult inferredAutoLayoutResult;
}
