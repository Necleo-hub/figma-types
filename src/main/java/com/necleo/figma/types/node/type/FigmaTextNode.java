package com.necleo.figma.types.node.type;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.necleo.codemonkey.lib.types.figma.properties.LetterSpacing;
import com.necleo.codemonkey.lib.types.figma.properties.LineHeight;
import com.necleo.codemonkey.lib.types.figma.properties.text.FontName;
import com.necleo.figma.types.FigmaNode;
import com.necleo.figma.types.enums.BlendMode;
import com.necleo.figma.types.enums.PrimaryAxisAlignItems;
import com.necleo.figma.types.enums.text.TextAutoResize;
import com.necleo.figma.types.node.props.AutoLayoutProps;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
@Jacksonized
public class FigmaTextNode extends FigmaNode implements  AutoLayout{
//  int opacity;
//  boolean isMask;

//  //  List<Effect> effects;
//  String effectsStyleId;

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