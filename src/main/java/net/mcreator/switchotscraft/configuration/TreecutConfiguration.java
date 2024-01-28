package net.mcreator.switchotscraft.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class TreecutConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<Boolean> ACTIVATE_DROP;
	public static final ForgeConfigSpec.ConfigValue<Boolean> DAMAGE_LOG;
	public static final ForgeConfigSpec.ConfigValue<Double> XP_MULTI_PER_LV;
	public static final ForgeConfigSpec.ConfigValue<Boolean> CONFIG_XP;
	public static final ForgeConfigSpec.ConfigValue<Double> BASE_XP;
	static {
		BUILDER.push("Can players are able to cut tree with hands");
		ACTIVATE_DROP = BUILDER.comment("If enabled the log will drop when break with hands").define("Drop log", false);
		DAMAGE_LOG = BUILDER.comment("If enabled cutting logs with hands deal damage to the player").define("Does cutting tree with hands deal damage", true);
		BUILDER.pop();
		BUILDER.push("Level related");
		XP_MULTI_PER_LV = BUILDER.comment("This is the variable that is multiplied by the level to get the number of xp needed").define("Multi XP per level", (double) 0.3);
		CONFIG_XP = BUILDER.comment("If enabled the game will take the value for the xp of each level").define("I want to configure the xd", false);
		BASE_XP = BUILDER.comment("The number of xp for level 1 only if config xp is enabeld").define("Base xp", (double) 1500);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
