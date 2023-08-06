package com.necleo.figma.types.node.type;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.necleo.figma.types.FigmaNode;
import com.necleo.figma.types.node.props.AutoLayoutProps;
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
public class FigmaLineNode extends FigmaNode implements AutoLayout, StrokeWeight{

//  int opacity;
//  boolean isMask;

//  //  List<Effect> effects;
//  String effectsStyleId;


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
