package com.necleo.figma.types.properties.variables;

import java.util.List;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
@Jacksonized
public class VariableCollection {
  String id;
  String name;

  boolean hiddenFromPublishing;
  boolean remote;

  List<Mode> modes;
  List<String> variableIds;

  String defaultModeId;
  String key;
}
