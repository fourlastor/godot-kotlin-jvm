// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import kotlin.Suppress

/**
 * A custom global visual shader graph expression written in Godot Shading Language.
 *
 * Custom Godot Shader Language expression, which is placed on top of the generated shader. You can place various function definitions inside to call later in [godot.VisualShaderNodeExpression]s (which are injected in the main shader functions). You can also declare varyings, uniforms and global constants.
 */
@GodotBaseType
open class VisualShaderNodeGlobalExpression : VisualShaderNodeExpression() {
  override fun __new() {
    callConstructor(ENGINECLASS_VISUALSHADERNODEGLOBALEXPRESSION)
  }
}
