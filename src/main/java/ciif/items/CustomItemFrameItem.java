package ciif.items;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.decoration.AbstractDecorationEntity;
import net.minecraft.item.ItemFrameItem;
import net.minecraft.item.ItemStack;

public class CustomItemFrameItem extends ItemFrameItem {

    public CustomItemFrameItem(EntityType<? extends AbstractDecorationEntity> entityType, Settings settings) {
        super(entityType, settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
