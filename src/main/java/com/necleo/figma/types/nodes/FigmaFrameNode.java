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

/**
 * The frame node is a container used to define a layout hierarchy. It is similar to <div> in HTML.
 * It is different from GroupNode, which is closer to a folder for layers. Frames can be created
 * using figma.createFrame. Frames generally have their own size, though the size can be determined
 * by that of its children in the case of auto-layout frames.
 */
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
@Jacksonized
public class FigmaFrameNode extends FigmaNode
    implements FillStroke, Corner, StrokeWeight, Children, AutoLayout, Padding {
  @JsonUnwrapped
  CornerProps corner;
  @JsonUnwrapped
  StrokeWeightProps strokeWeight;
  @JsonUnwrapped
  FillStrokeProps fillStroke;
  @JsonUnwrapped
  PaddingProps padding;
  @JsonUnwrapped
  AutoLayoutProps autoLayout;

  List<FigmaNode> children;
  int layoutGrow;
  boolean expanded;
  boolean clipsContent;
  InferredAutoLayoutResult inferredAutoLayoutResult;
}
