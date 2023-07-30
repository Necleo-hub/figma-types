package com.necleo.figma.types.node.type;

import com.necleo.codemonkey.lib.types.enums.figmaEnums.*;
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
}
