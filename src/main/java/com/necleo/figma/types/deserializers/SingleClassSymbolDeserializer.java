package com.necleo.figma.types.deserializers;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.necleo.figma.types.enums.figmaenums.StrokeCap;
import com.necleo.figma.types.enums.figmaenums.StrokeJoin;
import com.necleo.figma.types.properties.LetterSpacing;
import com.necleo.figma.types.properties.text.FontName;
import com.necleo.figma.types.properties.text.LineHeight;
import com.necleo.figma.types.properties.text.TextCase;
import com.necleo.figma.types.properties.text.TextDecoration;
import java.io.IOException;
import java.util.Optional;

public abstract class SingleClassSymbolDeserializer<T> extends JsonDeserializer<T>
    implements ISymbolDeserializer<T> {
  private final ObjectMapper objectMapper = new ObjectMapper();

  @Override
  public T deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
    JsonNode node = p.getCodec().readTree(p);

    // Check if the JSON node represents a single string or an array of strings
    if (node.isTextual() && node.asText().equals("symbol-figma.mixed")) {
      return null; // It's a single string
    } else {
      return objectMapper.readValue(node.toString(), getType()); // returns parsed type
    } // Return null for unsupported types
  }

  public abstract TypeReference<T> getType();

  public static class FigmaMixed<T> {
    private Optional<T> optional;

    public static <T> FigmaMixed<T> of(T t, boolean isPresent) {
      var obj = new FigmaMixed<T>();
      if (isPresent) {
        obj.optional = Optional.ofNullable(t);
      } else {
        obj.optional = Optional.empty();
      }
      return obj;
    }
  }

  public static class LineHeightDe extends SingleClassSymbolDeserializer<LineHeight> {
    @Override
    public TypeReference<LineHeight> getType() {
      return new TypeReference<>() {};
    }
  }

  public static class FontNameDe extends SingleClassSymbolDeserializer<FontName> {
    @Override
    public TypeReference<FontName> getType() {
      return new TypeReference<>() {};
    }
  }

  public static class IntDe extends SingleClassSymbolDeserializer<Integer> {
    @Override
    public TypeReference<Integer> getType() {
      return new TypeReference<>() {};
    }
  }

  public static class DoubleDe extends SingleClassSymbolDeserializer<Double> {
    @Override
    public TypeReference<Double> getType() {
      return new TypeReference<>() {};
    }
  }

  public static class StringDe extends SingleClassSymbolDeserializer<String> {
    @Override
    public TypeReference<String> getType() {
      return new TypeReference<>() {};
    }
  }

  public static class LetterSpacingDe extends SingleClassSymbolDeserializer<LetterSpacing> {
    @Override
    public TypeReference<LetterSpacing> getType() {
      return new TypeReference<>() {};
    }
  }

  public static class TextDecorationDe extends SingleClassSymbolDeserializer<TextDecoration> {
    @Override
    public TypeReference<TextDecoration> getType() {
      return new TypeReference<>() {};
    }
  }

  public static class TextCaseDe extends SingleClassSymbolDeserializer<TextCase> {
    @Override
    public TypeReference<TextCase> getType() {
      return new TypeReference<>() {};
    }
  }

  public static class StrokeJoinDe extends SingleClassSymbolDeserializer<StrokeJoin> {
    @Override
    public TypeReference<StrokeJoin> getType() {
      return new TypeReference<>() {};
    }
  }

  public static class StrokeCapDe extends SingleClassSymbolDeserializer<StrokeCap> {
    @Override
    public TypeReference<StrokeCap> getType() {
      return new TypeReference<>() {};
    }
  }

  public static class ItemSpaceDe extends SingleClassSymbolDeserializer<Integer> {
    @Override
    public TypeReference<Integer> getType() {
      return new TypeReference<>() {};
    }
  }
}
