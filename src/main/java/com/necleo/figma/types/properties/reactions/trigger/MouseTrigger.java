package com.necleo.figma.types.properties.reactions.trigger;

import com.necleo.figma.types.properties.reactions.trigger.Trigger;
import lombok.Getter;

@Getter
class MouseTrigger extends Trigger {
    private Double delay;
    // Specific fields and methods for MOUSE_ENTER type

    // Getter and Setter for 'delay'
    @Override
    public TriggerType getType() {
        return TriggerType.MOUSE_ENTER;
    }
}
