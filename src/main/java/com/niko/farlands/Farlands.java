package com.niko.farlands;

import net.minecraftforge.fml.common.Mod;

@Mod(value = Farlands.MODID)
public class Farlands
{
	public static final String MODID = "farlandsmod";
	
	public Farlands()
	{
		Config.setup();
	}
}
