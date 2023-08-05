package com.necleo.codemonkey.lib.types.figma;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.necleo.codemonkey.lib.types.FigmaNode;
import com.necleo.codemonkey.lib.types.enums.figmaEnums.*;
import com.necleo.codemonkey.lib.types.figma.properties.fills.FillGeometry;
import com.necleo.codemonkey.lib.types.figma.properties.fills.Fills;
import com.necleo.codemonkey.lib.types.figma.properties.strokes.StrokeGeometry;
import com.necleo.codemonkey.lib.types.figma.properties.strokes.Strokes;

import java.awt.*;
import java.util.List;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
@Jacksonized
@NoArgsConstructor
public class FigmaRectangleNode extends FigmaNode implements  Common, Effect, Corner, AutoLayout, StrokeWeight {
//  int opacity;
//  boolean isMask;
  @JsonUnwrapped
        CommonProps common;
//  //  List<Effect> effects;
//  String effectStyleId;
  @JsonUnwrapped
        EffectProps effect;
  // Corner Related Properties
//  int cornerRadius;
//  int cornerSmoothing;
//  int topLeftRadius;
//  int topRightRadius;
//  int bottomLeftRadius;
//  int bottomRightRadius;
  @JsonUnwrapped
          CornerProps corner;
  // geometry related properties
//  List<Fills> fills;
//  String fillStyleId;
//  List<Strokes> strokes;
//  String strokeStyleId;
//  int strokeWeight;
//  StrokeJoin strokeJoin;
//  StrokeAlign strokeAlign;
//  List<String> dashPattern;
//  List<StrokeGeometry> strokeGeometry;
//  StrokeCap strokeCap;
//  int strokeMiterLimit;
//  List<FillGeometry> fillGeometry;
  @JsonUnwrapped
          AutoLayoutProps autoLayout;
//  int strokeTopWeight;
//  int strokeBottomWeight;
//  int strokeLeftWeight;
//  int strokeRightWeight;
  @JsonUnwrapped
  StrokeWeightProps strokeWeight;
}
