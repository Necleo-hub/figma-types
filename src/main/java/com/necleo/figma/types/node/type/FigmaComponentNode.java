package com.necleo.figma.types.node.type;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.necleo.figma.types.FigmaNode;
import com.necleo.figma.types.enums.LayoutWrap;
import com.necleo.figma.types.node.props.*;
import java.util.List;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
@Jacksonized
public class FigmaComponentNode extends FigmaNode implements Corner, FillStroke, AutoLayout, Padding, Children{
//  int opacity;
//  boolean isMask;

//  List<Effect> effects;
//  String effectsStyleId;


  // Corner Related Properties\

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
//  List<String> strokeGeometry;
//  StrokeCap strokeCap;
//  int strokeMitterLimit;
//  List<FillGeometry> FillGeometry;
  @JsonUnwrapped
  FillStrokeProps fillStroke;

//  int strokeTopWeight;
//  int strokeBottomWeight;
//  int strokeLeftWeight;
//  int strokeRightWeight;
  @JsonUnwrapped
StrokeWeightProps strokeWeight;

//  LayoutMode layoutMode;
//  PrimaryAxisSizingMode primaryAxisSizingMode;
//  CounterAxisSizingMode counterAxisSizingMode;
//  PrimaryAxisAlignItems primaryAxisAlignItems;
//  CounterAxisAlignItems counterAxisAlignItems;
//  boolean itemReverseZIndex;
//  boolean strokesIncludedInLayout;
//  // layoutGrids - need to check
//  String gridStyleId;
//  boolean clipsContent;
  @JsonUnwrapped
  AutoLayoutProps autoLayout;

  // padding properties
//  int paddingLeft;
//  int paddingRight;
//  int paddingTop;
//  int paddingBottom;
//  int itemSpacing;
  @JsonUnwrapped
  PaddingProps padding;

  int counterAxisSpacing;
  LayoutWrap layoutWrap;

  List<FigmaInstanceNode> instances;
  String description;
  boolean remote;
  String key;

  List<FigmaNode> children;
}
