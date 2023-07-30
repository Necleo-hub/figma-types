package com.necleo.figma.types.node.type;

import com.necleo.codemonkey.lib.types.enums.figmaEnums.LayoutAlign;
import com.necleo.codemonkey.lib.types.enums.figmaEnums.LayoutPositioning;

public class FigmaImageBaseNode extends FigmaRectangleBaseNode {
  boolean constrainProportions;
  LayoutAlign layoutAlign;
  int layoutGrow;
  LayoutPositioning layoutPositioning;
}
