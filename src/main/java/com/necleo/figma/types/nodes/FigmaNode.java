package com.necleo.figma.types.nodes;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

import com.necleo.figma.types.FigmaParent;
import com.necleo.figma.types.enums.OverflowDirection;
import com.necleo.figma.types.enums.figmaenums.LayoutAlign;
import com.necleo.figma.types.enums.figmaenums.LayoutPositioning;
import com.necleo.figma.types.enums.figmaenums.LayoutSizing;
import com.necleo.figma.types.enums.figmaenums.nodetypes.FigmaNodeTypes;
import com.necleo.figma.types.properties.Constrains;
import com.necleo.figma.types.properties.reactions.Reactions;
import com.necleo.figma.types.rect.Rect;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

/**
 * Type declaration of figma screen <br>
 * <br>
 * {@link #type} figma node type <br>
 * figma node children
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "type",
    visible = true,
    defaultImpl = FigmaNode.class)
@JsonSubTypes({
  @JsonSubTypes.Type(value = FigmaRectangleNode.class, name = "RECTANGLE"),
  @JsonSubTypes.Type(value = FigmaEllipseNode.class, name = "ELLIPSE"),
  @JsonSubTypes.Type(value = FigmaLineNode.class, name = "LINE"),
  @JsonSubTypes.Type(value = FigmaPolygonNode.class, name = "POLYGON"),
  @JsonSubTypes.Type(value = FigmaStarNode.class, name = "STAR"),
  @JsonSubTypes.Type(value = FigmaVectorNode.class, name = "VECTOR"),
  @JsonSubTypes.Type(value = FigmaFrameNode.class, name = "FRAME"),
  @JsonSubTypes.Type(value = FigmaGroupNode.class, name = "GROUP"),
  @JsonSubTypes.Type(value = FigmaComponentNode.class, name = "COMPONENT"),
  @JsonSubTypes.Type(value = FigmaTextNode.class, name = "TEXT"),
  @JsonSubTypes.Type(value = FigmaInstanceNode.class, name = "INSTANCE"),
  @JsonSubTypes.Type(value = FigmaComponentSetNode.class, name = "COMPONENT_SET")
})
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@SuperBuilder
@NoArgsConstructor
@Jacksonized
@ToString
public class FigmaNode {
  FigmaNodeTypes type;
  double opacity;
  boolean isMask;
  List<Reactions> reactions;
  String id;
  String name;
  String effectsStyleId;
  FigmaParent parent;
  // todo: riktam why do we have setter here? need to fix this,
  @Setter
  Constrains constraints;
  boolean removed;
  boolean visible;
  boolean locked;
  int[][] absoluteTransform;
  int[][] relativeTransform;
  int x;
  int y;
  double rotation;
  int width;
  int height;
  double maxWidth;
  double maxHeight;
  double minWidth;
  double minHeight;
  LayoutAlign layoutAlign;
  int layoutGrow;
  //  List<Effect> effects;
  boolean constrainProportions;
  Rect absoluteRenderBounds;
  Rect absoluteBoundingBox;
  OverflowDirection overflowDirection;
  LayoutPositioning layoutPositioning;

  LayoutSizing layoutSizingHorizontal;
  LayoutSizing layoutSizingVertical;
}
