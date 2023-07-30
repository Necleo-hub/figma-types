package com.necleo.figma.types.node.type;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.util.ArrayList;
import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
@Jacksonized
@ToString
@Getter
public class ColorBorderProps {
    ArrayList<EffectType> effects;
    String effectsStyleId;
    // Corner Related Properties

    int cornerRadius;
    int cornerSmoothing;
    int topLeftRadius;
    int topRightRadius;
    int bottomLeftRadius;
    int bottomRightRadius;

    // geometry related properties
    List<Fills> fills;
    String fillStyleId;
    List<Strokes> strokes;
    String strokeStyleId;
    int strokeWeight;
    StrokeJoin strokeJoin;
    StrokeAlign strokeAlign;
    List<String> dashPattern;
    List<Object> strokeGeometry;
    StrokeCap strokeCap;
    int strokeMitterLimit;
    List<com.necleo.codemonkey.lib.types.figma.properties.fills.FillGeometry> FillGeometry;
    int strokeTopWeight;
    int strokeBottomWeight;
    int strokeLeftWeight;
    int strokeRightWeight;

}
