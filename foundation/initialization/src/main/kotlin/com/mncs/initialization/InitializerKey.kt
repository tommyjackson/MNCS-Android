package com.mncs.initialization

import dagger.MapKey

@MapKey(unwrapValue = true)
annotation class InitializerKey(val type: InitializerType)
