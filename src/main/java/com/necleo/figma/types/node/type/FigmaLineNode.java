package com.necleo.codemonkey.lib.types.figma;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.necleo.codemonkey.lib.types.FigmaNode;
import com.necleo.codemonkey.lib.types.figma.properties.fills.FillGeometry;
import com.necleo.codemonkey.lib.types.figma.properties.fills.Fills;
import com.necleo.codemonkey.lib.types.figma.properties.strokes.StrokeGeometry;
import com.necleo.codemonkey.lib.types.figma.properties.strokes.Strokes;
import java.util.List;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
@Jacksonized
public class FigmaLineNode extends FigmaNode implements Common, Effect, AutoLayout, StrokeWeight{

//  int opacity;
//  boolean isMask;
  @JsonUnwrapped
        CommonProps common;
//  //  List<Effect> effects;
//  String effectsStyleId;
  @JsonUnwrapped
        EffectProps effect;

//  // geometry related properties
//  List<Fills> fills;
//  String fillStyleId;
//  List<Strokes> strokes;
//  String strokeStyleId;
//  int strokeWeight;
//  String strokeJoin; // actually an enum will have to look it up
//  String strokeAlign; // also an enum
//  List<String> dashPattern;
//  List<StrokeGeometry> strokeGeometry;
//  String strokeCap; // also an enum
//  int strokeMitterLimit;
//  List<FillGeometry> FillGeometry;
  @JsonUnwrapped
        AutoLayoutProps autoLayout;
//  int strokeTopWeight;
//  int strokeBottomWeight;
//  int strokeLeftWeight;
//  int strokeRightWeight;
  @JsonUnwrapped
  StrokeWeightProps strokeWeight;
}
