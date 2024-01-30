package com.necleo.figma.types.properties.reactions.transition;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.necleo.figma.types.enums.figmaenums.TransitionType;
import com.necleo.figma.types.properties.reactions.transition.easing.Easing;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "type",
    visible = true,
    defaultImpl = Transition.class)
@JsonSubTypes({
  @JsonSubTypes.Type(value = Transition.class, name = "DISSOLVE"),
  @JsonSubTypes.Type(value = Transition.class, name = "SMART_ANIMATE"),
  @JsonSubTypes.Type(value = Transition.class, name = "SCROLL_ANIMATE"),
  @JsonSubTypes.Type(value = DirectionalTransition.class, name = "MOVE_IN"),
  @JsonSubTypes.Type(value = DirectionalTransition.class, name = "MOVE_OUT"),
  @JsonSubTypes.Type(value = DirectionalTransition.class, name = "PUSH"),
  @JsonSubTypes.Type(value = DirectionalTransition.class, name = "SLIDE_IN"),
  @JsonSubTypes.Type(value = DirectionalTransition.class, name = "SLIDE_OUT"),
})
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@SuperBuilder
@Jacksonized
public class Transition {
  TransitionType type;
  Easing easing;
  double duration;
}
