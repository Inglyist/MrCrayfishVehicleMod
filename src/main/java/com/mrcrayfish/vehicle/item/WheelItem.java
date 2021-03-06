package com.mrcrayfish.vehicle.item;

import com.mrcrayfish.vehicle.VehicleMod;
import com.mrcrayfish.vehicle.entity.LandVehicleEntity;
import com.mrcrayfish.vehicle.entity.WheelType;
import com.mrcrayfish.vehicle.init.ModItems;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Author: MrCrayfish
 */
public class WheelItem extends PartItem implements IDyeable
{
    private WheelType wheelType;

    public WheelItem(String id, WheelType wheelType)
    {
        super(id, new Item.Properties().group(VehicleMod.CREATIVE_TAB));
        this.wheelType = wheelType;
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
    {
        tooltip.add(new StringTextComponent(TextFormatting.AQUA + I18n.format("vehicle.wheel_type." + this.wheelType.getId() + ".name")));
    }

    public WheelType getWheelType()
    {
        return this.wheelType;
    }
}
