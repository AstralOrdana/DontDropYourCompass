package com.ordana.dont_drop_your_compass;

import net.minecraft.resources.ResourceLocation;

public class DontDropYourCompass {

    public static final String MOD_ID = "dont_drop_your_compass";

    public static ResourceLocation res(String name) {
        return new ResourceLocation(MOD_ID, name);
    }

    public static void commonInit() {
    }

}