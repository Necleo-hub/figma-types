package com.necleo.figma.types.properties;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.extern.jackson.Jacksonized;

/**
 * A structure used to describe when a particular node or variable is directly bound to a variable.
 * The id of the bound variable can be used in conjunction with functions that accept a VariableId,
 * such as figma.variables.getVariableById.
 */
@Getter
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Builder
@Jacksonized
public class VariableAlias {
    /**
     * The id of the variable that the current variable is aliased to.<br>
     * This variable can be a local or remote variable,
     * and both can be retrieved via the GET /v1/files/:file_key/variables/local endpoint.
     */
    String id;
    /**
     * Value is always VARIABLE_ALIAS.
     */
    String type;
}
