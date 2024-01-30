package com.necleo.figma.types.nodes;

import java.util.List;

import com.necleo.figma.types.enums.figmaenums.BlendMode;
import com.necleo.figma.types.properties.Children;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
@Jacksonized
@NoArgsConstructor
public class FigmaGroupNode extends FigmaNode implements Children {
  // attachedConnectors
  String backgroundStyleId;
  //  List<Paint> backgrounds;
  BlendMode blendMode;
  // componentPropertyReferences

  // https://www.figma.com/plugin-docs/api/node-properties/#expanded
  // NOT NEEDED CURRENTLY
  boolean expanded;
  boolean isAsset;

  List<FigmaNode> children;
}
