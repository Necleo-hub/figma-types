package com.necleo.figma.types.properties.reactions.trigger;

import com.necleo.figma.types.properties.reactions.trigger.Trigger;
import lombok.Getter;

@Getter
class OnClickTrigger extends Trigger {
    // No specific fields and methods for ON_CLICK type
    @Override
    public TriggerType getType() {
        return TriggerType.ON_CLICK;
    }
}
