package com.necleo.figma.types.node.type;

import java.util.List;

import com.necleo.figma.types.BaseNode;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
@Jacksonized
public class FigmaComponentBaseNode extends BaseNode {
  int opacity;
  boolean isMask;
  List<Effect> effects;
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
  List<String> strokeGeometry;
  StrokeCap strokeCap;
  int strokeMitterLimit;
  List<FillGeometry> FillGeometry;
  int strokeTopWeight;
  int strokeBottomWeight;
  int strokeLeftWeight;
  int strokeRightWeight;
  LayoutMode layoutMode;
  PrimaryAxisSizingMode primaryAxisSizingMode;
  CounterAxisSizingMode counterAxisSizingMode;
  PrimaryAxisAlignItems primaryAxisAlignItems;
  CounterAxisAlignItems counterAxisAlignItems;

  // padding properties
  int paddingLeft;
  int paddingRight;
  int paddingTop;
  int paddingBottom;
  int itemSpacing;
  boolean itemReverseZIndex;
  boolean strokesIncludedInLayout;
  // layoutGrids - need to check
  String gridStyleId;
  boolean clipsContent;
}
