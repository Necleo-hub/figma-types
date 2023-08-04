package com.necleo.figma.types.node.type;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

/**
 * The page node is always a descendent of the
 * <a href="https://www.figma.com/plugin-docs/api/DocumentNode">DocumentNode</a>.<br>
 * Most plugins only need to access the current page accessed via figma.currentPage.
 */
@Getter
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@SuperBuilder
@Jacksonized
public class PageNode {
}
