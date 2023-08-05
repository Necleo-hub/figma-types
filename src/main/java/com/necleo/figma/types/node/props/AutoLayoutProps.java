package com.necleo.figma.types.node.type;

import com.necleo.figma.types.enums.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
@Jacksonized
@ToString
@Getter
public class AutoLayoutProps {
    LayoutMode layoutMode;
    CounterAxisSizingMode counterAxisSizingMode;
    PrimaryAxisSizingMode primaryAxisSizingMode;
    PrimaryAxisAlignItems primaryAxisAlignItems;
    CounterAxisAlignItems counterAxisAlignItems;
    int width;
    int itemSpacing;
    int height;
    int paddingLeft;
    int paddingRight;
    int paddingTop;
    int paddingBottom;
    boolean itemReverseZIndex;
    boolean strokesIncludedInLayout;
    String gridStyleId;
    boolean clipsContent;
}
