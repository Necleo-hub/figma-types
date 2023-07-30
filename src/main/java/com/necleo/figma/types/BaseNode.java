package com.necleo.figma.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.List;

import com.necleo.codemonkey.lib.types.figma.rect.Rect;
import com.necleo.figma.types.node.type.FigmaComponentBaseNode;
import com.necleo.figma.types.node.type.FigmaEllipseBaseNode;
import com.necleo.figma.types.node.type.FrameNode;
import com.necleo.figma.types.node.type.FigmaLineBaseNode;
import com.necleo.figma.types.node.type.FigmaPolygonBaseNode;
import com.necleo.figma.types.node.type.FigmaRectangleBaseNode;
import com.necleo.figma.types.node.type.FigmaStarBaseNode;
import com.necleo.figma.types.node.type.FigmaTextBaseNode;
import com.necleo.figma.types.node.type.FigmaVectorBaseNode;
import com.necleo.figma.types.properties.reactions.Reaction;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

/**
 * Type declaration of figma screen <br>
 * <br>
 * {@link #type} figma node type <br>
 * {@link #children} figma node children
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = FigmaRectangleBaseNode.class, name = "RECTANGLE"),
        @JsonSubTypes.Type(value = FigmaEllipseBaseNode.class, name = "ELLIPSE"),
        @JsonSubTypes.Type(value = FigmaLineBaseNode.class, name = "LINE"),
        @JsonSubTypes.Type(value = FigmaPolygonBaseNode.class, name = "POLYGON"),
        @JsonSubTypes.Type(value = FigmaStarBaseNode.class, name = "STAR"),
        @JsonSubTypes.Type(value = FigmaVectorBaseNode.class, name = "VECTOR"),
        @JsonSubTypes.Type(value = FrameNode.class, name = "FRAME"),
        @JsonSubTypes.Type(value = FigmaComponentBaseNode.class, name = "COMPONENT"),
        @JsonSubTypes.Type(value = FigmaTextBaseNode.class, name = "TEXT")
})
@JsonIgnoreProperties(ignoreUnknown = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@SuperBuilder
@Jacksonized
@ToString
public class BaseNode {
    FigmaNodeTypes type;
    List<BaseNode> children;
    String id;
    String name;
    boolean removed;
    boolean visible;
    boolean locked;
    double[][] absoluteTransform;
    int[][] relativeTransform;
    int x;
    int y;
    int rotation;
    int width;
    int height;
    Rect absoluteRenderBounds;
    Rect absoluteBoundingBox;
    int opacity;
    List<Reaction> reactions;
    Constraints constraints;
}
