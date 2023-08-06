package com.necleo.figma.types.node.type;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.necleo.figma.types.FigmaNode;
import com.necleo.figma.types.node.props.CornerProps;
import com.necleo.figma.types.node.props.FillStrokeProps;
import com.necleo.figma.types.node.props.StrokeWeightProps;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
@Jacksonized
public class FigmaInstanceNode extends FigmaNode implements FillStroke, Corner, StrokeWeight {
    @JsonUnwrapped
    FillStrokeProps fillStroke;

    @JsonUnwrapped
    CornerProps corner;

    @JsonUnwrapped
    StrokeWeightProps strokeWeight;
}
