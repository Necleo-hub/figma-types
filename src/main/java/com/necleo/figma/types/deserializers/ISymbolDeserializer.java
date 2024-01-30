package com.necleo.figma.types.deserializers;

import com.fasterxml.jackson.core.type.TypeReference;

@FunctionalInterface
public interface ISymbolDeserializer<T> {
  TypeReference<T> getType();
}
