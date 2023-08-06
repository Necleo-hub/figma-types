package com.necleo.figma.types.properties.reactions.actions;

import lombok.Getter;
import java.util.Vector;

import com.necleo.figma.types.properties.reactions.actions.Navigation;
import com.necleo.figma.types.properties.reactions.actions.ActionType;
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
