package com.necleo.figma.types.node.type;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.necleo.figma.types.FigmaNode;
import com.necleo.figma.types.node.props.AutoLayoutProps;
import com.necleo.figma.types.node.props.CornerProps;
import com.necleo.figma.types.node.props.StrokeWeightProps;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
@Jacksonized
public class FigmaPolygonNode extends FigmaNode {

  int pointCount;

//  int opacity;
//  boolean isMask;

//  List<Effect> effects;
//  String effectsStyleId;

  // Corner Related Properties

//  int cornerRadius;
//  int cornerSmoothing;
//  int topLeftRadius;
//  int topRightRadius;
//  int bottomLeftRadius;
//  int bottomRightRadius;
  @JsonUnwrapped
CornerProps corner;

  // geometry related properties
//  List<Fills> fills;
//  String fillStyleId;
//  List<Strokes> strokes;
//  String strokeStyleId;
//  int strokeWeight;
//  StrokeJoin strokeJoin;
//  StrokeAlign strokeAlign;
//  List<String> dashPattern;
//  List<StrokeGeometry> strokeGeometry;
//  StrokeCap strokeCap;
//  int strokeMitterLimit;
//  List<FillGeometry> FillGeometry;
  @JsonUnwrapped
  AutoLayoutProps autoLayout;

//  int strokeTopWeight;
//  int strokeBottomWeight;
//  int strokeLeftWeight;
//  int strokeRightWeight;
  @JsonUnwrapped
StrokeWeightProps strokeWeight;
}
