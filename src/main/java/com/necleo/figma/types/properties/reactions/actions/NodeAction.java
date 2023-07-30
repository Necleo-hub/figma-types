package com.necleo.codemonkey.lib.types.figma.properties.reactions.actions;

import lombok.Getter;
import java.util.Vector;

@Getter
public class NodeAction extends Action {
    private String destinationId;
    private Navigation navigation;
    private Transition transition;
    private Boolean preserveScrollPosition;
    private Vector overlayRelativePosition;
    private Boolean resetVideoPosition;
    private Boolean resetScrollPosition;
    private Boolean resetInteractiveComponents;

    // Specific fields and methods for NODE type

    // Getters and Setters for the specific fields
    @Override
    public ActionType getType() {
        return ActionType.NODE;
    }
}
