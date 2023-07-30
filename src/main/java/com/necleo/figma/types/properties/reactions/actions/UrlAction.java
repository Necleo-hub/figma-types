package com.necleo.codemonkey.lib.types.figma.properties.reactions.actions;

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
