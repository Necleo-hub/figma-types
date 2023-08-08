package com.necleo.figma.types.node.type;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.necleo.codemonkey.lib.types.figma.properties.vector.VectorPaths;
import com.necleo.figma.types.FigmaNode;
import com.necleo.figma.types.enums.HandleMirroring;
import com.necleo.figma.types.node.props.CornerProps;
import com.necleo.figma.types.node.props.FillStrokeProps;
import com.necleo.figma.types.node.props.StrokeWeightProps;
import com.necleo.figma.types.properties.vector.VectorNetwork;
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
public class FigmaVectorNode extends FigmaNode implements  FillStroke{

//  int opacity;
//  boolean isMask;

//  //  List<Effect> effects;
//  String effectsStyleId;

  // Corner Related Properties

  int cornerRadius;
  int cornerSmoothing;



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
//  // StrokeCap strokeCap;
//  int strokeMitterLimit;
//  List<FillGeometry> FillGeometry;
  @JsonUnwrapped
  FillStrokeProps fillStroke;

//  int strokeTopWeight;
//  int strokeBottomWeight;
//  int strokeLeftWeight;
//  int strokeRightWeight;
  @JsonUnwrapped
StrokeWeightProps strokeWeight;

  // vector
  //  VectorNetwork vectorNetwork;
  List<VectorPaths> vectorPaths;
  VectorNetwork vectorNetwork;
  HandleMirroring handleMirroring;
}
