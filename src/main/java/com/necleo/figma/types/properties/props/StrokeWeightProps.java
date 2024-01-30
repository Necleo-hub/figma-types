package com.necleo.figma.types.properties.props;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
@Jacksonized
@ToString
@Getter
public class StrokeWeightProps {
  int strokeTopWeight;
  int strokeBottomWeight;
  int strokeLeftWeight;
  int strokeRightWeight;
}
