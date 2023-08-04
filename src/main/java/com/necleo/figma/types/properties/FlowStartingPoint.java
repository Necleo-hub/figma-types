package com.necleo.figma.types.properties;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.extern.jackson.Jacksonized;

/**
 * A flow starting point used when launching a prototype to enter Presentation view.
 */
@Getter
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Builder
@Jacksonized
public class FlowStartingPoint {
    /**
     * Unique identifier specifying the frame
     */
    String nodeId;
    /**
     * Name of flow
     */
    String name;
}
