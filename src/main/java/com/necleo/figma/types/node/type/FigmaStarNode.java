package com.necleo.figma.types.node.type;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.necleo.figma.types.FigmaNode;
import com.necleo.figma.types.node.props.CornerProps;
import com.necleo.figma.types.node.props.FillStrokeProps;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
@Jacksonized
public class FigmaStarNode extends FigmaNode implements Corner, FillStroke{
    int pointCount;
    int innerRadius;

    @JsonUnwrapped
    CornerProps corner;

    @JsonUnwrapped
    FillStrokeProps fillStroke;
}
