package com.necleo.figma.types.node.type;

import com.necleo.codemonkey.lib.types.enums.figmaEnums.StrokeAlign;
import com.necleo.codemonkey.lib.types.enums.figmaEnums.StrokeCap;
import com.necleo.codemonkey.lib.types.enums.figmaEnums.StrokeJoin;
import com.necleo.codemonkey.lib.types.figma.properties.fills.FillGeometry;
import com.necleo.codemonkey.lib.types.figma.properties.fills.Fills;
import com.necleo.codemonkey.lib.types.figma.properties.strokes.Strokes;
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
    int strokeWeight;
    StrokeJoin strokeJoin;
    StrokeAlign strokeAlign;
    List<String> dashPattern;
    List<String> strokeGeometry;
    StrokeCap strokeCap;
    int strokeMitterLimit;
    List<FillGeometry> FillGeometry;
}
