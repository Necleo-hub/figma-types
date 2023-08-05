package com.necleo.codemonkey.lib.types.figma;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.necleo.codemonkey.lib.types.FigmaNode;
import com.necleo.codemonkey.lib.types.enums.figmaEnums.*;
import com.necleo.codemonkey.lib.types.enums.text.TextAutoResize;
import com.necleo.codemonkey.lib.types.figma.properties.LetterSpacing;
import com.necleo.codemonkey.lib.types.figma.properties.LineHeight;
import com.necleo.codemonkey.lib.types.figma.properties.fills.FillGeometry;
import com.necleo.codemonkey.lib.types.figma.properties.fills.Fills;
import com.necleo.codemonkey.lib.types.figma.properties.strokes.StrokeGeometry;
import com.necleo.codemonkey.lib.types.figma.properties.strokes.Strokes;
import com.necleo.codemonkey.lib.types.figma.properties.text.FontName;
import java.util.List;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
@Jacksonized
public class FigmaTextNode extends FigmaNode implements  Common, Effect, AutoLayout{
//  int opacity;
//  boolean isMask;
  @JsonUnwrapped
        CommonProps common;
//  //  List<Effect> effects;
//  String effectsStyleId;
  @JsonUnwrapped
        EffectProps effect;
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
//  int strokeMitterLimit;
//  List<FillGeometry> FillGeometry;
  @JsonUnwrapped
          AutoLayoutProps autoLayout;

  boolean hasMissingFont;
  TextAutoResize textAutoResize;
  int paragraphIndent;
  int paragraphSpacing;
  boolean autoRename;
  String characters;

  BlendMode blendMode;


  FontName fontName;
  int fontWeight;
  String textAlignHorizontal;
  String fontSize;
  LineHeight lineHeight;

  LetterSpacing letterSpacing;

  PrimaryAxisAlignItems primaryAxisAlignitems;
}
