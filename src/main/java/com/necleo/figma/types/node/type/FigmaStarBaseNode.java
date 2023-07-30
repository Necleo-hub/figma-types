package com.necleo.figma.types.node.type;

import com.necleo.codemonkey.lib.types.FigmaNode;
import com.necleo.figma.types.BaseNode;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
@Jacksonized
public class FigmaStarBaseNode extends BaseNode {}
