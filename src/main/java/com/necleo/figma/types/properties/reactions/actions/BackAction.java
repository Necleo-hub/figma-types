package com.necleo.figma.types.properties.reactions.actions;
import com.necleo.figma.types.properties.reactions.actions.ActionType;

import lombok.Getter;

@Getter
class BackAction extends Action {
    // No specific fields and methods for BACK type
    @Override
    public ActionType getType() {
        return ActionType.BACK;
    }
}
