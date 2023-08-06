package com.necleo.figma.types.node.type;

import com.necleo.figma.types.FigmaNode;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

/**
 * The document node is the root node.<br>
 * There can only be one document node per browser tab, and each of its children must be a
 * <a href="https://www.figma.com/plugin-docs/api/PageNode">PageNode</a>.<br>
 * <br>
 * Most plugins will not need to use this node unless they are creating new pages or performing a document-wide operation.<br>
 * In the latter case, it's recommended to only read and not write, as the user may not see the modifications made on a different page.
 */
@Getter
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@SuperBuilder
@Jacksonized
public class DocumentNode extends FigmaNode {
    /**
     * An array of canvases attached to the document
     */
    List<PageNode> children;
}
