package com.ordana.dont_drop_your_compass.mixins;


import com.ordana.dont_drop_your_compass.ModTags;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

@Mixin(Item.class)
public class KeepOnDeathTooltipMixin {

    @Inject(method = "appendHoverText", at = @At("HEAD"))
    private void recoveryCompassTooltip(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag isAdvanced, CallbackInfo ci) {
        if (stack.is(ModTags.KEEP_ON_DEATH)) {
            tooltip.add(Component.translatable("tooltip.dont_drop_your_compass.keep_on_death").setStyle(Style.EMPTY.applyFormat(ChatFormatting.DARK_AQUA)));
        }
    }
}
