package com.necleo.figma.types.properties.reactions.actions;

import com.necleo.figma.types.properties.reactions.actions.ActionType;
import lombok.Getter;

@Getter
public class UpdateMediaRuntimeAction extends Action {
    private String destinationId;
    private String mediaAction;
    private Double amountToSkip;
    private Double newTimestamp;
    // Specific fields and methods for UPDATE_MEDIA_RUNTIME type

    // Getters and Setters for the specific fields
    @Override
    public ActionType getType() {
        return ActionType.UPDATE_MEDIA_RUNTIME;
    }
}
