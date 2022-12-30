package com.ordana.dont_drop_your_compass.fabric;

import net.fabricmc.api.ModInitializer;
import com.ordana.dont_drop_your_compass.DontDropYourCompass;

public class DontDropYourCompassFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        DontDropYourCompass.commonInit();
    }
}
