package com.mncs.initialization

internal class AggregateInitializer(
    private val initializers: Set<Initializer>,
) : Initializer() {

    override fun invoke() {
        initializers.forEach { initializer ->
            initializer.invoke()
        }
    }
}