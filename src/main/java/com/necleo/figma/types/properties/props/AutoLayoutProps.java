package com.necleo.figma.types.properties.props;

import com.necleo.figma.types.enums.figmaenums.*;
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
  String itemSpacing;
  boolean itemReverseZIndex;
  boolean strokesIncludedInLayout;
  int layoutGrow;
  int counterAxisSpacing;
  LayoutWrap layoutWrap;
  //    String gridStyleId;
  //    boolean clipsContent;
}
