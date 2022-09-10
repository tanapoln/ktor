/*
 * Copyright 2014-2022 JetBrains s.r.o and contributors. Use of this source code is governed by the Apache 2.0 license.
 */

package io.ktor.utils.io

import org.slf4j.*

internal fun Logger.traceFn(instance: Any, method: String, msg: String, vararg args: Any) {
    if (!this.isTraceEnabled) return
    this.trace("[@" + System.identityHashCode(instance) + "] " + method + "(): " + msg, *args)
}

internal fun Logger.debugFn(instance: Any, method: String, msg: String, vararg args: Any) {
    if (!this.isDebugEnabled) return
    this.debug("[@" + System.identityHashCode(instance) + "] " + method + "(): " + msg, *args)
}
