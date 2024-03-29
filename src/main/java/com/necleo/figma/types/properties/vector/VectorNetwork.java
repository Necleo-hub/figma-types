package com.necleo.codemonkey.lib.types.figma.properties.vector;

import com.necleo.codemonkey.lib.types.figma.properties.vector.regions.RegionType;
import com.necleo.codemonkey.lib.types.figma.properties.vector.segment.Segment;
import java.util.List;
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
