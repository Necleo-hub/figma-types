package com.necleo.figma.types.properties.reactions;


import com.necleo.codemonkey.lib.types.figma.properties.reactions.actions.Action;
import com.necleo.codemonkey.lib.types.figma.properties.reactions.trigger.Trigger;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Reaction {
    Action action;
    Trigger trigger;

}