package com.necleo.codemonkey.lib.types.figma.properties.reactions.actions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Transition {
    private String type;
    private String direction;
    private Boolean matchLayers;
    private Easing easing;
    private Double duration;

    // Constructors, getters, setters, etc.

    // Specific fields and methods for Transition
}
