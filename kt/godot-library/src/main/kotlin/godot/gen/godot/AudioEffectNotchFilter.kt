// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import kotlin.Suppress

/**
 * Adds a notch filter to the Audio bus.
 *
 * Attenuates frequencies in a narrow band around the [godot.AudioEffectFilter.cutoffHz] and cuts frequencies outside of this range.
 */
@GodotBaseType
open class AudioEffectNotchFilter : AudioEffectFilter() {
  override fun __new() {
    callConstructor(ENGINECLASS_AUDIOEFFECTNOTCHFILTER)
  }
}
