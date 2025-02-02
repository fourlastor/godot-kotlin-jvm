// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.NotImplementedError
import kotlin.Suppress

@GodotBaseType
open class GDScriptFunctionState : Reference() {
  val completed: Signal1<Any> by signal("result")

  override fun __new() {
    callConstructor(ENGINECLASS_GDSCRIPTFUNCTIONSTATE)
  }

  open fun _signalCallback(vararg __var_args: Any?): Any? {
    throw NotImplementedError("_signal_callback is not implemented for GDScriptFunctionState")
  }

  open fun isValid(extendedCheck: Boolean = false): Boolean {
    TransferContext.writeArguments(BOOL to extendedCheck)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GDSCRIPTFUNCTIONSTATE_IS_VALID,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun resume(arg: Any? = null): Any? {
    TransferContext.writeArguments(ANY to arg)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GDSCRIPTFUNCTIONSTATE_RESUME, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }
}
