package com.necleo.codemonkey.lib.types.figma;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.necleo.codemonkey.lib.types.FigmaNode;
import com.necleo.codemonkey.lib.types.enums.figmaEnums.*;
import com.necleo.codemonkey.lib.types.figma.properties.fills.FillGeometry;
import com.necleo.codemonkey.lib.types.figma.properties.fills.Fills;
import com.necleo.codemonkey.lib.types.figma.properties.strokes.Strokes;
import com.necleo.codemonkey.service.flutter.InferredAutoLayout;
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
public class FigmaFrameNode extends FigmaNode implements  Common, Effect, Corner, FillStroke, StrokeWeight, AutoLayout, Padding, LayoutAlign{
//  int opacity;
//  boolean isMask;
  @JsonUnwrapped
  CommonProps common;

//  //  ArrayList<EffectType> effects;
//  String effectsStyleId;
  @JsonUnwrapped
  EffectProps effect;

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
  LayoutSizing layoutSizingHorizontal;
  LayoutSizing layoutSizingVertical;
  LayoutWrap layoutWrap;

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
  @JsonUnwrapped
  LayoutAlignProps layoutAlign;

  LayoutPositioning layoutPositioning;
  int counterAxisSpacing;

}
