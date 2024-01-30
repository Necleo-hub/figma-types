package com.necleo.figma.types.properties.reactions.actions;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

/** todo: to complete this class */
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@SuperBuilder
@Jacksonized
public class MediaAction extends Action {
  String url;
}
