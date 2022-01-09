package com.mncs.dev.tools.impl

import android.content.Context
import com.mncs.initialization.Initializer
import com.mncs.buildconfig.BuildConfig
import com.facebook.flipper.android.AndroidFlipperClient
import com.facebook.flipper.android.utils.FlipperUtils
import com.facebook.flipper.plugins.inspector.DescriptorMapping
import com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin
import com.facebook.flipper.plugins.network.NetworkFlipperPlugin
import com.facebook.soloader.SoLoader
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FlipperInitializer @Inject constructor(
    @ApplicationContext private val context: Context,
    private val networkFlipperPlugin: NetworkFlipperPlugin,
    private val buildConfig: BuildConfig,
) : Initializer() {

    override fun invoke() {
        if (buildConfig.debug && FlipperUtils.shouldEnableFlipper(context)) {
            SoLoader.init(context, false)

            val client = AndroidFlipperClient.getInstance(context)

            // layout
            client.addPlugin(InspectorFlipperPlugin(context, DescriptorMapping.withDefaults()))

            // network
            client.addPlugin(networkFlipperPlugin)
            client.start()
        }
    }
}
