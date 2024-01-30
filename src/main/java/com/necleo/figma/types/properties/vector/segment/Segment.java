package com.necleo.figma.types.properties.vector.segment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Segment {
  private int start;
  private int end;
  private Point tangentStart;
  private Point tangentEnd;
}
