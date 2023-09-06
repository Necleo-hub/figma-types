package com.necleo.figma.types.node.type;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.necleo.figma.types.FigmaNode;
import com.necleo.figma.types.node.props.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.util.List;


@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
@Jacksonized
public class FigmaComponentSetNode extends FigmaNode implements Padding, AutoLayout, FillStroke, StrokeWeight, Corner, Children {
    @JsonUnwrapped
    PaddingProps padding;

    @JsonUnwrapped
    AutoLayoutProps autoLayout;

    @JsonUnwrapped
    FillStrokeProps fillStroke;

    @JsonUnwrapped
    StrokeWeightProps strokeWeight;

    @JsonUnwrapped
    CornerProps corner;

    List<FigmaNode> children;

    FigmaComponentNode defaultVariant;
}
