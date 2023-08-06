package com.necleo.figma.types.properties;


import com.necleo.figma.types.enums.HorizontalConstraint;
import com.necleo.figma.types.enums.VerticalConstraint;
import lombok.Getter;

@Getter
public class Constraints {

  public HorizontalConstraint horizontal;
  public VerticalConstraint vertical;
}
