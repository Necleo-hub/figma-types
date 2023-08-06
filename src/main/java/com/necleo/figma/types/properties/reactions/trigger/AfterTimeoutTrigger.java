package com.necleo.figma.types.properties.reactions.trigger;

import com.necleo.figma.types.properties.reactions.trigger.Trigger;
import lombok.Getter;

@Getter
class AfterTimeoutTrigger extends Trigger {
    private Double timeout;
    // Specific fields and methods for AFTER_TIMEOUT type

    // Getter and Setter for 'timeout'
    @Override
    public TriggerType getType() {
        return TriggerType.AFTER_TIMEOUT;
    }
}
