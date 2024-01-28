package net.mcreator.switchotscraft.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class CustomLVConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<Double> LV_1;
	public static final ForgeConfigSpec.ConfigValue<Double> LV_2;
	public static final ForgeConfigSpec.ConfigValue<Double> LV_3;
	public static final ForgeConfigSpec.ConfigValue<Double> LV_4;
	public static final ForgeConfigSpec.ConfigValue<Double> LV_5;
	public static final ForgeConfigSpec.ConfigValue<Double> LV_6;
	public static final ForgeConfigSpec.ConfigValue<Double> LV_7;
	public static final ForgeConfigSpec.ConfigValue<Double> LV_8;
	public static final ForgeConfigSpec.ConfigValue<Double> LV_9;
	public static final ForgeConfigSpec.ConfigValue<Double> LV_T1;
	public static final ForgeConfigSpec.ConfigValue<Double> LV_T2;
	public static final ForgeConfigSpec.ConfigValue<Double> LV_T3;
	public static final ForgeConfigSpec.ConfigValue<Double> LV_T4;
	public static final ForgeConfigSpec.ConfigValue<Double> LV_T5;
	public static final ForgeConfigSpec.ConfigValue<Double> LV_T6;
	public static final ForgeConfigSpec.ConfigValue<Double> LV_T7;
	public static final ForgeConfigSpec.ConfigValue<Double> LV_T8;
	public static final ForgeConfigSpec.ConfigValue<Double> LV_T9;
	static {
		BUILDER.push("Level");
		LV_1 = BUILDER.comment("the config value in revamped progression config file need to be enabled").define("xp for level 1-2", (double) 1500);
		LV_2 = BUILDER.comment("the config value in revamped progression config file need to be enabled").define("xp for level 2-3", (double) 1847);
		LV_3 = BUILDER.comment("the config value in revamped progression config file need to be enabled").define("xp for level 3-4", (double) 2086);
		LV_4 = BUILDER.comment("the config value in revamped progression config file need to be enabled").define("xp for level 4-5", (double) 2274);
		LV_5 = BUILDER.comment("the config value in revamped progression config file need to be enabled").define("xp for level 5-6", (double) 2431);
		LV_6 = BUILDER.comment("the config value in revamped progression config file need to be enabled").define("xp for level 6-7", (double) 2568);
		LV_7 = BUILDER.comment("the config value in revamped progression config file need to be enabled").define("xp for level; 7-8", (double) 2689);
		LV_8 = BUILDER.comment("the config value in revamped progression config file need to be enabled").define("xp for level 8-9", (double) 2799);
		LV_9 = BUILDER.comment("the config value in revamped progression config file need to be enabled").define("xp for level 9-10", (double) 2900);
		BUILDER.pop();
		BUILDER.push("Tech points per level");
		LV_T1 = BUILDER.define("tech points for level 1-2", (double) 1);
		LV_T2 = BUILDER.define("tech points for level 2-3", (double) 1);
		LV_T3 = BUILDER.define("tech points for level 3-4", (double) 1);
		LV_T4 = BUILDER.define("tech points for level 4-5", (double) 3);
		LV_T5 = BUILDER.define("tech points for level 5-6", (double) 1);
		LV_T6 = BUILDER.define("tech points for level 6-7", (double) 1);
		LV_T7 = BUILDER.define("tech points for level 7-8", (double) 1);
		LV_T8 = BUILDER.define("tech points for level 8-9", (double) 1);
		LV_T9 = BUILDER.define("tech points for level 9-10", (double) 3);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
