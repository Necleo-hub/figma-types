package com.necleo.figma.types.nodes;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.necleo.codemonkey.lib.types.figma.properties.vector.VectorPaths;
import java.util.List;

import com.necleo.figma.types.properties.Corner;
import com.necleo.figma.types.properties.FillStroke;
import com.necleo.figma.types.properties.StrokeWeight;
import com.necleo.figma.types.properties.props.CornerProps;
import com.necleo.figma.types.properties.props.FillStrokeProps;
import com.necleo.figma.types.properties.props.StrokeWeightProps;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
@Jacksonized
public class FigmaVectorNode extends FigmaNode implements FillStroke, Corner, StrokeWeight {
  @JsonUnwrapped
  CornerProps corner;
  @JsonUnwrapped
  FillStrokeProps fillStroke;
  @JsonUnwrapped
  StrokeWeightProps strokeWeight;

  List<VectorPaths> vectorPaths;
  String vectorHash;
}
