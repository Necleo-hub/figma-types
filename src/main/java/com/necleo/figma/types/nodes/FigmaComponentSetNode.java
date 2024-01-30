package com.necleo.figma.types.nodes;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import java.util.List;
import java.util.Map;

import com.necleo.figma.types.properties.*;
import com.necleo.figma.types.properties.componentSet.DefaultVariant;
import com.necleo.figma.types.properties.componentSet.Value;
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
public class FigmaComponentSetNode extends FigmaNode
    implements FillStroke, Corner, StrokeWeight, Children, AutoLayout, Padding {
  DefaultVariant defaultVariant;

  int itemSpacing;
  int width;
  int height;
  String gridStyleId;
  boolean clipsContent;

  @JsonUnwrapped
  AutoLayoutProps autoLayout;
  @JsonUnwrapped
  FillStrokeProps fillStroke;
  @JsonUnwrapped
  StrokeWeightProps strokeWeight;
  @JsonUnwrapped
  CornerProps corner;
  @JsonUnwrapped
  PaddingProps padding;

  List<FigmaNode> children;

  boolean expanded;
  boolean remote;
  String description;
  String key;
  Map<String, Value> variantGroupProperties;
  InferredAutoLayoutResult inferredAutoLayoutResult;
}
