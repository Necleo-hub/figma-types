package com.necleo.figma.types.properties.reactions.actions;

import lombok.Getter;
import lombok.Setter;
import com.necleo.figma.types.properties.reactions.actions.Easing;

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
