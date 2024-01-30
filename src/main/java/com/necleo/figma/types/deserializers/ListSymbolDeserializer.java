package com.necleo.figma.types.deserializers;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.necleo.figma.types.properties.fills.Fills;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class ListSymbolDeserializer<T> extends JsonDeserializer<List<T>> {
  private final ObjectMapper objectMapper = new ObjectMapper();

  @Override
  public List<T> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
    JsonNode node = p.getCodec().readTree(p);

    // Check if the JSON node represents a single string or an array of strings
    if (node.isTextual() && node.asText().equals("symbol-figma.mixed")) {
      return new ArrayList<>(); // It's a single string
    } else if (node.isArray()) {
      List<T> strings = new ArrayList<>();
      for (JsonNode element : node) {
        strings.add(objectMapper.readValue(element.toString(), new TypeReference<>() {}));
      }
      return strings; // It's an array of strings
    }

    return new ArrayList<>(); // Return null for unsupported types
  }

  //    @Override
  //    public T deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
  //        JsonNode node = p.getCodec().readTree(p);
  //        // Check if the JSON node represents a single string or an array of strings
  //        if (node.isTextual() && node.asText().equals("symbol-figma.mixed")) {
  //            return null; // It's a single string
  //        }
  ////        else if(node.isArray()) {
  ////            T strings = (T) new ArrayList<>();
  ////            for (JsonNode element : node) {
  ////                strings.add(objectMapper.readValue(element.toString(), new TypeReference<>() {
  ////                }));
  ////            }
  ////            return (T) strings;  // It's an array of strings
  ////        }
  //        else {
  //            return objectMapper.readValue(node.toString(), getType()); // returns parsed type
  //        }
  //    }

  public abstract TypeReference<T> getType();

  public static class FillsListDe extends SingleClassSymbolDeserializer<List<Fills>> {
    @Override
    public TypeReference<List<Fills>> getType() {
      return new TypeReference<>() {};
    }
  }
}
