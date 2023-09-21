package com.necleo.figma.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.necleo.figma.types.enums.*;
import com.necleo.codemonkey.lib.types.figma.rect.Rect;
import com.necleo.figma.types.enums.Effect;
import com.necleo.figma.types.enums.LayoutAlign;
import com.necleo.figma.types.node.type.*;
import com.necleo.figma.types.properties.Constraints;
import com.necleo.figma.types.properties.VariableAlias;
import com.necleo.figma.types.properties.reactions.Reaction;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.util.List;
import java.util.Map;

/**
 * The following are properties that exist on every node.
 * <br>
 * These give us some basic information about identifying and viewing the node.
 * <br>
 * {@link #type} figma node type <br>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = FigmaRectangleNode.class, name = "RECTANGLE"),
        @JsonSubTypes.Type(value = FigmaEllipseNode.class, name = "ELLIPSE"),
        @JsonSubTypes.Type(value = FigmaLineNode.class, name = "LINE"),
        @JsonSubTypes.Type(value = FigmaPolygonNode.class, name = "POLYGON"),
        @JsonSubTypes.Type(value = FigmaStarNode.class, name = "STAR"),
        @JsonSubTypes.Type(value = FigmaVectorNode.class, name = "VECTOR"),
        @JsonSubTypes.Type(value = FrameNode.class, name = "FRAME"),
        @JsonSubTypes.Type(value = FigmaComponentNode.class, name = "COMPONENT"),
        @JsonSubTypes.Type(value = FigmaTextNode.class, name = "TEXT")
})
@JsonIgnoreProperties(ignoreUnknown = true)
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Getter
@SuperBuilder
@Jacksonized
@ToString
public class FigmaNode {

    /**
     * A string uniquely identifying this node within the document.
     */
    String id;
    /**
     * The name given to the node by the user in the tool.
     */
    String name;
    /**
     * Whether or not the node is visible on the canvas. default :true
     */
    boolean visible;
    /**
     * The type of the node, refer to table below for details.
     */
    NodeTypes type;
    /**
     * The rotation of the node, if not 0.
     */
    int rotation;
    /**
     * Data written by plugins that is visible only to the plugin that wrote it.<br>
     * Requires the `pluginData` to include the ID of the plugin.
     */
    Object pluginData;
    /**
     * Data written by plugins that is visible to all plugins.<br>
     * Requires the `pluginData` parameter to include the string "shared".
     */
    Object sharedPluginData;
    /**
     * A mapping of a layer's property to component property name of component properties attached to this node.<br>
     * The component property name can be used to look up more information on the corresponding component's
     *  or component set's componentPropertyDefinitions.
     */
    Map<String, String> componentPropertyReferences;
    /**
     * A mapping of field to the variables applied to this field.<br>
     * Most fields will only map to a single VariableAlias However, <br>
     * for fills, strokes, size, and component properties,<br>
     * it is possible to have multiple variables bound to the field.
     *
     * @apiNote value type - {@code Map<String, VariableAlias | VariableAlias[]>}
     */
    Map<String, VariableAlias[]> boundVariables;
    /**
     * Returns true if this node has been removed since it was first accessed.
     * If your plugin stays open for a while and stores references to nodes,
     * you should write your code defensively and check that the nodes haven't been removed by the user.
     */
    boolean isAsset;
    boolean removed;
    boolean locked;
    double[][] absoluteTransform;
    int[][] relativeTransform;
    int x;
    int y;
    int width;
    int height;
    int layoutGrow;
    Rect absoluteRenderBounds;
    Rect absoluteBoundingBox;
    int opacity;
    List<Reaction> reactions;
    Constraints constraints;
    boolean isMask;
    List<Effect> effects;
    String effectsStyleId;
    LayoutAlign layoutAlign;
    boolean constrainProportions;
    LayoutPositioning layoutPositioning;
    BlendMode blendMode;
    LayoutSizing layoutSizingHorizontal;
    LayoutSizing layoutSizingVertical;
    OverflowDirection overflowDirection;
}
