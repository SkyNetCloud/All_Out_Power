package ca.skynetcloud.alloutpower.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class ToolCallingProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return false;
		return OpenGuiProcedure.execute(world, x, y, z, entity);
	}
}
