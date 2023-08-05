package com.necleo.codemonkey.lib.types.figma;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.necleo.codemonkey.lib.types.FigmaNode;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
@Jacksonized
public class FigmaComponentNode extends FigmaNode implements Common, Effect, Corner, FillStroke, AutoLayout, Padding{
//  int opacity;
//  boolean isMask;
  @JsonUnwrapped
  CommonProps common;

//  List<Effect> effects;
//  String effectsStyleId;
  @JsonUnwrapped
  EffectProps effect;

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
}
