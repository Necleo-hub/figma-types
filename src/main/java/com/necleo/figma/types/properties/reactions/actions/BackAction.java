package com.necleo.codemonkey.lib.types.figma.properties.reactions.actions;

import lombok.Getter;

@Getter
class BackAction extends Action {
    // No specific fields and methods for BACK type
    @Override
    public ActionType getType() {
        return ActionType.BACK;
    }
}
