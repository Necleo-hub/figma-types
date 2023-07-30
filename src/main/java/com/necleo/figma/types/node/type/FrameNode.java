package com.necleo.figma.types.node.type;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.necleo.figma.types.BaseNode;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.util.ArrayList;
import java.util.List;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
@Jacksonized
public class FrameNode extends BaseNode implements AutoLayout, ColorBorder {
  boolean isMask;
  ScaleMode scaleMode;

  LayoutMode layoutMode;
  boolean itemReverseZIndex;
  boolean strokesIncludedInLayout;
  // layoutGrids - need to check
  String gridStyleId;
  boolean clipsContent;
  @JsonUnwrapped
  AutoLayoutProps autoLayout;

//  LayoutMode layoutMode;
  CounterAxisSizingMode counterAxisSizingMode;
  PrimaryAxisSizingMode primaryAxisSizingMode;
  LayoutAlign layoutAlign;
  PrimaryAxisAlignItems primaryAxisAlignItems;
  CounterAxisAlignItems counterAxisAlignItems;
  int width;
  int layoutGrow;
  int itemSpacing;
  int height;
  int paddingLeft;
  int paddingRight;
  int paddingTop;
  int paddingBottom;

//  @Delegate(types = ColorBorderProps.class)
  @JsonUnwrapped
  ColorBorderProps colorBorder;

  ArrayList<EffectType> effects;
  String effectsStyleId;
  // Corner Related Properties

  int cornerRadius;
  int cornerSmoothing;
  int topLeftRadius;
  int topRightRadius;
  int bottomLeftRadius;
  int bottomRightRadius;

  // geometry related properties
  List<Fills> fills;
  String fillStyleId;
  List<Strokes> strokes;
  String strokeStyleId;
  int strokeWeight;
  StrokeJoin strokeJoin;
  StrokeAlign strokeAlign;
  List<String> dashPattern;
  List<Object> strokeGeometry;
  StrokeCap strokeCap;
  int strokeMitterLimit;
  List<FillGeometry> FillGeometry;
  int strokeTopWeight;
  int strokeBottomWeight;
  int strokeLeftWeight;
  int strokeRightWeight;

//  end of color border


  String layoutPositioning;
}
