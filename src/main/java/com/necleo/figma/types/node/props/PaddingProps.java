package com.necleo.figma.types.node.props;

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
public class PaddingProps {
    int paddingLeft;
    int paddingRight;
    int paddingTop;
    int paddingBottom;
    int itemSpacing;
}
