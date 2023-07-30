package com.necleo.codemonkey.lib.types.figma.properties;

import com.necleo.codemonkey.lib.types.enums.figmaEnums.HorizontalConstraint;
import com.necleo.codemonkey.lib.types.enums.figmaEnums.VerticalConstraint;
import lombok.Getter;

@Getter
public class Constraints {

  public HorizontalConstraint horizontal;
  public VerticalConstraint vertical;
}
