
package ca.skynetcloud.alloutpower.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import ca.skynetcloud.alloutpower.procedures.ToolCallingProcedure;
import ca.skynetcloud.alloutpower.init.AllOutPowerModItems;

public class HolySwordItem extends SwordItem {
	public HolySwordItem() {
		super(new Tier() {
			public int getUses() {
				return 250;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AllOutPowerModItems.HOLY_INGOT_INGOT));
			}
		}, 3, -3f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		setRegistryName("holy_sword");
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ToolCallingProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
		return ar;
	}
}
