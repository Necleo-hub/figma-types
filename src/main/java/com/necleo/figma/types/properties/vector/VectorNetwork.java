package com.necleo.figma.types.properties.vector;

import java.util.List;

import com.necleo.figma.types.properties.vector.regions.RegionType;
import com.necleo.figma.types.properties.vector.segment.Segment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class VectorNetwork {
  private List<RegionType> regions;
  private List<Segment> segments;
}
