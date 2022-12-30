package com.ordana.dont_drop_your_compass;

import net.minecraft.core.Registry;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {

    //items
    public static final TagKey<Item> KEEP_ON_DEATH = registerItemTag("keep_on_death");

    private ModTags() {
    }

    private static TagKey<Item> registerItemTag(String id) {
        return TagKey.create(Registry.ITEM_REGISTRY, DontDropYourCompass.res(id));
    }

}
