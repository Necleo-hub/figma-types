package com.necleo.figma.types.enums;

/**
 * Node type indicates what kind of node you are working with: for example, a FRAME node versus a RECTANGLE node.<br>
 * A node can have additional properties associated with it depending on its node type.<br>
 * The following is a catalog of properties that can be applied to a node, grouped by node type.
 */
public enum NodeTypes {
    RECTANGLE,
    ELLIPSE,
    POLYGON,
    LINE,
    VECTOR,
    TEXT,
    FRAME,
    STAR,
    COMPONENT,
    INSTANCE,
    COMPONENT_SET,
    BOOLEAN_OPERATION,
    CODE_BLOCK,
    CONNECTOR,
    EMBED,
    LINK_UNFURL,
    MEDIA,
    SECTION,
    SHAPE_WITH_TEXT,
    SLICE,
    STAMP,
    STICKY,
    TABLE,
    TABLE_CELL,
    WIDGET,
}
