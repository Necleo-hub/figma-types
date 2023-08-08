package com.necleo.figma.types.node.type;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.necleo.figma.types.FigmaNode;
import com.necleo.figma.types.enums.*;
import com.necleo.figma.types.node.props.*;
import com.necleo.figma.types.properties.OverlayBackground;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.awt.*;
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
public class FrameNode extends FigmaNode implements AutoLayout, Padding, Corner, FillStroke, StrokeWeight {
  /**
   * Returns the parent of this node, if any. This property is not meant to be directly edited.
   */
  String parent;
  /**
   * An array of nodes that are direct children of this node
   */
  List<FigmaNode> children;
  /**
   * If true, layer is locked and cannot be edited
   */
//  Boolean locked;

//  boolean isMask;
  ScaleMode scaleMode;

//  BlendMode blendMode;

//  LayoutMode layoutMode;
//  boolean itemReverseZIndex;
//  boolean strokesIncludedInLayout;
//  String gridStyleId;
//  boolean clipsContent;

  @JsonUnwrapped
  AutoLayoutProps autoLayout;

//  CounterAxisSizingMode counterAxisSizingMode;
//  PrimaryAxisSizingMode primaryAxisSizingMode;
//  LayoutAlign layoutAlign;
//  PrimaryAxisAlignItems primaryAxisAlignItems;
//  CounterAxisAlignItems counterAxisAlignItems;
//  int width;
//  int layoutGrow;
//  int itemSpacing;
//  int height;
//  int paddingLeft;
//  int paddingRight;
//  int paddingTop;
//  int paddingBottom;

  @JsonUnwrapped
  PaddingProps padding;

//  ArrayList<EffectType> effects;
//  String effectsStyleId;

//  int cornerRadius;
//  int cornerSmoothing;
//  int topLeftRadius;
//  int topRightRadius;
//  int bottomLeftRadius;
//  int bottomRightRadius;

  @JsonUnwrapped
  CornerProps corner;

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


//  String layoutPositioning;
//  LayoutSizing layoutSizingHorizontal;
//  LayoutSizing layoutSizingVertical;

  OverflowDirection overflowDirection;
  int numberOfFixedChildren;
  OverlayPositionType overlayPositionType;
  OverlayBackground overlayBackground;
  OverlayBackgroundInteraction overlayBackgroundInteraction;
}
