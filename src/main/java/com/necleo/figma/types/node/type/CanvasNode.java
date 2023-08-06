package com.necleo.figma.types.node.type;

import com.necleo.figma.types.FigmaNode;
import com.necleo.figma.types.properties.ExportSetting;
import com.necleo.figma.types.properties.FlowStartingPoint;
import com.necleo.figma.types.properties.PrototypeDevice;
import com.necleo.figma.types.properties.fills.Color;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Getter
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@SuperBuilder
@Jacksonized
public class CanvasNode extends FigmaNode {
    /**
     * An array of top level layers on the canvas
     */
    List<FigmaNode> children;
    /**
     * Background color of the canvas.
     */
    Color backgroundColor;
    /**
     * Node ID that corresponds to the start frame for prototypes.
     * This is deprecated with the introduction of multiple flows.
     * Please use the flowStartingPoints field.
     */
    @Deprecated
    String prototypeStartNodeID;
    /**
     * A array of flow starting points sorted by its position in the prototype settings panel.
     */
    List<FlowStartingPoint> flowStartingPoints;
    /**
     * The device used to view a prototype
     */
    PrototypeDevice prototypeDevice;
    /**
     * An array of export settings representing images to export from the canvas
     */
    List<ExportSetting> exportSettings;
}
