package com.mncs.initialization

import javax.inject.Inject

/**
 * This is only necessary while we have no other typed initializers that
 * are necessary for a release build
 */
class StubInitializer @Inject constructor() : Initializer() {
    override fun invoke() {
        // do nothing
    }
}