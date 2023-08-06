package com.necleo.figma.types.properties.reactions;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.extern.jackson.Jacksonized;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Jacksonized
public class Action {
    private String type;
    private String destinationId;
    private String navigation;
    private Object transition;
    private boolean resetVideoPosition;
}
