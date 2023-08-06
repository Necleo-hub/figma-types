package com.necleo.figma.types.properties.reactions.actions;

import com.necleo.figma.types.properties.reactions.actions.ActionType;
import lombok.Getter;

@Getter
public
class UrlAction extends Action {
    private String url;
    // Specific fields and methods for URL type

    // Getter and Setter for 'url'
    @Override
    public ActionType getType() {
        return ActionType.URL;
    }
}
