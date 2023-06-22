package net.bomario.elementalmod.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class WaterTridentItem extends Item {
    public WaterTridentItem(Properties properties) {
        super(properties);
    }

    @Override


    public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
        tooltip.add(Component.literal("The ultimate water item!"));

        super.appendHoverText(stack, worldIn, tooltip, flagIn);
    };

    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if(!level.isClientSide() && hand == InteractionHand.MAIN_HAND) {

            // Output a Random Number
            outputStupidMessage(player);

            // Set a Cooldown
            player.getCooldowns().addCooldown(this, 20);

        }

        return super.use(level, player, hand);
    };

    private void outputStupidMessage(Player player) {
        player.sendSystemMessage(Component.literal("Je hebt er net voor gezorgt dat alle mensen voor 70% uit water bestaan. Wat ben jij een slecht mens."));
    }

}
