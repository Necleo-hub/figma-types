package com.necleo.figma.types.node.type;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.necleo.figma.types.FigmaNode;
import com.necleo.figma.types.enums.LayoutWrap;
import com.necleo.figma.types.node.props.*;
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
public class FigmaFrameNode extends FigmaNode implements Corner, FillStroke, StrokeWeight, AutoLayout, Padding, Children{
//  int opacity;
//  boolean isMask;

//  //  ArrayList<EffectType> effects;
//  String effectsStyleId;

//  // Corner Related Properties
//
//  int cornerRadius;
//  int cornerSmoothing;
//  int topLeftRadius;
//  int topRightRadius;
//  int bottomLeftRadius;
//  int bottomRightRadius;
  @JsonUnwrapped
CornerProps corner;

//  // geometry related properties
//  List<Fills> fills;
//  String fillStyleId;
//  List<Strokes> strokes;
//  String strokeStyleId;
//  int strokeWeight;
//  StrokeJoin strokeJoin;
//  StrokeAlign strokeAlign;
//  List<String> dashPattern;
//  List<Object> strokeGeometry;
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

//  InferredAutoLayout inferredAutoLayout;


//  LayoutMode layoutMode;
//  PrimaryAxisSizingMode primaryAxisSizingMode;
//  CounterAxisSizingMode counterAxisSizingMode;
//  PrimaryAxisAlignItems primaryAxisAlignItems;
//  CounterAxisAlignItems counterAxisAlignItems;
//  boolean itemReverseZIndex;
//  boolean strokesIncludedInLayout;
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

  // layoutGrids - need to check
//  LayoutAlign layoutAlign;
//  int layoutGrow;

  int counterAxisSpacing;
  LayoutWrap layoutWrap;

  List<FigmaNode> children;

}
