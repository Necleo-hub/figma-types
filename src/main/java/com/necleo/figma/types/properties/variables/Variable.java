package com.necleo.figma.types.properties.variables;

import com.necleo.figma.types.enums.VariableResolvedDataType;
import com.necleo.figma.types.enums.VariableScope;
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
public class Variable {
  String id;
  String name;
  String description;
  boolean hiddenFromPublishing;
  boolean remote;
  String variableCollectionId;
  String key;
  VariableResolvedDataType resolvedType;
  List<VariableScope> scopes;
}
