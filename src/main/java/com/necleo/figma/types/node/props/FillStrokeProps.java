package com.necleo.figma.types.node.props;

import com.necleo.figma.types.enums.StrokeAlign;
import com.necleo.figma.types.enums.StrokeCap;
import com.necleo.figma.types.enums.StrokeJoin;
import com.necleo.codemonkey.lib.types.figma.properties.fills.FillGeometry;
import com.necleo.figma.types.properties.fills.Fills;
import com.necleo.figma.types.properties.strokes.Strokes;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
@Jacksonized
@ToString
@Getter
public class FillStrokeProps {
    List<Fills> fills;
    String fillStyleId;
    List<Strokes> strokes;
    String strokeStyleId;
    String strokeWeight;
    StrokeJoin strokeJoin;
    StrokeAlign strokeAlign;
    List<String> dashPattern;
    List<String> strokeGeometry;
    StrokeCap strokeCap;
    int strokeMitterLimit;
    List<FillGeometry> FillGeometry;
}
