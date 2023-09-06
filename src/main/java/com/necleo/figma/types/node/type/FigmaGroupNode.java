package com.necleo.figma.types.node.type;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.necleo.figma.types.FigmaNode;
import com.necleo.figma.types.node.props.FillStrokeProps;
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
public class FigmaGroupNode extends FigmaNode implements FillStroke, Children {
    @JsonUnwrapped
    FillStrokeProps fillStroke;

    List<FigmaNode> children;

}
