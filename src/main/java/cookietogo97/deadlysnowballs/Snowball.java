package cookietogo97.deadlysnowballs;

import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.entity.projectile.EntitySnowball;
import net.minecraft.core.item.IDispensable;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

import java.util.Random;

public class Snowball extends Item implements IDispensable {
	public Snowball(String name, int id) {
		super(name, id);
	}

	@Override
	public ItemStack onUseItem(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		itemstack.consumeItem(entityplayer);
		world.playSoundAtEntity(entityplayer, entityplayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
		if (!world.isClientSide) {
			EntitySnowball entitySnowball = new EntitySnowball(world, entityplayer);
			entitySnowball.damage = 2;
			world.entityJoinedWorld(entitySnowball);
		}

		return itemstack;
	}

	@Override
	public void onDispensed(ItemStack itemStack, World world, double x, double y, double z, int xOffset, int zOffset, Random random) {
		EntitySnowball entitysnowball = new EntitySnowball(world, x, y, z);
		entitysnowball.damage = 2;
		entitysnowball.setHeading(xOffset, 0.1, zOffset, 1.1F, 6.0F);
		world.entityJoinedWorld(entitysnowball);
	}
}
