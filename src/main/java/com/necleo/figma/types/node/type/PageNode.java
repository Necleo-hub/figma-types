package com.necleo.figma.types.node.type;

import com.necleo.figma.types.enums.Paint;
import com.necleo.figma.types.properties.FlowStartingPoint;
import com.necleo.figma.types.properties.Guide;
import com.necleo.figma.types.properties.SelectedTextRange;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

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
    List<Guide> guides;

//    List<SceneNode> selection;
    SelectedTextRange selectedTextRange;
    List<FlowStartingPoint> flowStartingPoints;
    List<Paint> backgrounds;
    List<Paint> prototypeBackgrounds;

    //FrameNode | GroupNode | ComponentNode | InstanceNode prototypeStartNode;

}
