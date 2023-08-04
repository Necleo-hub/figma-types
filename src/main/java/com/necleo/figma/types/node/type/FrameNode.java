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

/**
 * The frame node is a container used to define a layout hierarchy. It is similar to {@code <div>} in HTML.<br>
 *
 * It is different from <a href="https://www.figma.com/plugin-docs/api/GroupNode">GroupNode</a>,
 * which is closer to a folder for layers.<br>
 *
 * Frames can be created using <a href="https://www.figma.com/plugin-docs/api/properties/figma-createframe">
 * figma.createFrame</a>.<br>
 *
 * Frames generally have their own size, though the size can be determined by that of its children in the case of auto-layout frames.
 *
 * @apiNote ⚠️ It is possible for a user to convert a frame into a group via the UI, and vice-versa.
 * If you hold onto a node in a long-running plugin, you can't assume its type never changes.
 */
@Getter
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@SuperBuilder
@Jacksonized
public class FrameNode extends BaseNode implements AutoLayout, ColorBorder {
  /**
   * Returns the parent of this node, if any. This property is not meant to be directly edited.
   */
  String parent;
  /**
   * An array of nodes that are direct children of this node
   */
  List<BaseNode> children;
  /**
   * If true, layer is locked and cannot be edited
   */
  Boolean locked;

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
