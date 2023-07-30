package com.necleo.codemonkey.lib.types.figma.properties.reactions.trigger;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Getter;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = OnClickTrigger.class, name = "ON_CLICK"),
        @JsonSubTypes.Type(value = AfterTimeoutTrigger.class, name = "AFTER_TIMEOUT"),
        @JsonSubTypes.Type(value = MouseTrigger.class, name = "MOUSE_ENTER"),
        // Add other subtypes as needed
})
@Getter
public abstract class Trigger {
//    AfterTimeoutTrigger afterTimeoutTrigger;
//    MouseTrigger mouseTrigger;
//    OnClickTrigger onClickTrigger;
    public abstract TriggerType getType();

    // Common fields and methods for all subtypes
}

