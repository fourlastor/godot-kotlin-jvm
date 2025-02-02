// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.STRING
import kotlin.Int
import kotlin.String
import kotlin.Suppress

/**
 * An X509 certificate (e.g. for SSL).
 *
 * The X509Certificate class represents an X509 certificate. Certificates can be loaded and saved like any other [godot.Resource].
 *
 * They can be used as the server certificate in [godot.StreamPeerSSL.acceptStream] (along with the proper [godot.CryptoKey]), and to specify the only certificate that should be accepted when connecting to an SSL server via [godot.StreamPeerSSL.connectToStream].
 *
 * **Note:** Not available in HTML5 exports.
 */
@GodotBaseType
open class X509Certificate : Resource() {
  override fun __new() {
    callConstructor(ENGINECLASS_X509CERTIFICATE)
  }

  /**
   * Loads a certificate from `path` ("*.crt" file).
   */
  open fun load(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_X509CERTIFICATE_LOAD, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Saves a certificate to the given `path` (should be a "*.crt" file).
   */
  open fun save(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_X509CERTIFICATE_SAVE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }
}
