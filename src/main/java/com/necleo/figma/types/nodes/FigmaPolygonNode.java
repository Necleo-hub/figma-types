package com.necleo.figma.types.nodes;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.necleo.figma.types.properties.Corner;
import com.necleo.figma.types.properties.FillStroke;
import com.necleo.figma.types.properties.StrokeWeight;
import com.necleo.figma.types.properties.props.CornerProps;
import com.necleo.figma.types.properties.props.FillStrokeProps;
import com.necleo.figma.types.properties.props.StrokeWeightProps;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
@Jacksonized
public class FigmaPolygonNode extends FigmaNode implements FillStroke, Corner, StrokeWeight {
  @JsonUnwrapped
  CornerProps corner;
  @JsonUnwrapped
  FillStrokeProps fillStroke;
  @JsonUnwrapped
  StrokeWeightProps strokeWeight;
}
