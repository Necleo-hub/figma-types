package com.necleo.figma.types.properties.vector.regions;

import java.util.ArrayList;

import com.necleo.figma.types.properties.fills.Fills;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RegionType {
  private String windingRule;
  private ArrayList<ArrayList<Number>> loop;

  private ArrayList<Fills> fills;
  private String fillsStyleId;
}
