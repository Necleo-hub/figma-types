package com.necleo.figma.types.properties;

import com.necleo.figma.types.enums.GuideAxis;
import lombok.Getter;

@Getter
public class Guide {
    GuideAxis axis;
    int offset;
}
