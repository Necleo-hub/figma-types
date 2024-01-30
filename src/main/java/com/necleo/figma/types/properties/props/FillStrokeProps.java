package com.necleo.figma.types.properties.props;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;

import com.necleo.figma.types.deserializers.ListSymbolDeserializer;
import com.necleo.figma.types.deserializers.SingleClassSymbolDeserializer;
import com.necleo.figma.types.enums.figmaenums.StrokeAlign;
import com.necleo.figma.types.enums.figmaenums.StrokeCap;
import com.necleo.figma.types.enums.figmaenums.StrokeJoin;
import com.necleo.figma.types.properties.fills.Fills;
import com.necleo.figma.types.properties.fills.Geometry;
import com.necleo.figma.types.properties.strokes.Strokes;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
@Jacksonized
@ToString
@Getter
public class FillStrokeProps {
  @JsonDeserialize(using = ListSymbolDeserializer.FillsListDe.class)
  List<Fills> fills;

  String fillStyleId;
  List<Strokes> strokes;
  String strokeStyleId;
  String strokeWeight;

  @JsonDeserialize(using = SingleClassSymbolDeserializer.StrokeJoinDe.class)
  StrokeJoin strokeJoin;

  StrokeAlign strokeAlign;
  List<String> dashPattern;
  List<Geometry> strokeGeometry;

  @JsonDeserialize(using = SingleClassSymbolDeserializer.StrokeCapDe.class)
  StrokeCap strokeCap;

  int strokeMitterLimit;
  List<Geometry> fillGeometry;
}
