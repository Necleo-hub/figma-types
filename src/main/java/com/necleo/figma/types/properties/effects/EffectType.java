package com.necleo.figma.types.properties.effects;

import com.necleo.figma.types.enums.BlendMode;
import com.necleo.figma.types.enums.Effect;
import com.necleo.codemonkey.lib.types.figma.properties.effects.EffectColor;
import com.necleo.codemonkey.lib.types.figma.properties.effects.OffsetType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EffectType {
  private Effect type;
  private EffectColor color;
  private OffsetType offset;
  private int radius;
  private int spread;
  private boolean visible;
  private BlendMode blendMode;
  private boolean showShadowBehindNode;
}
