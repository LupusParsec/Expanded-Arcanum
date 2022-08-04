package com.mr208.ea.modules.chococraft;

import net.chococraft.common.CCContent;
import net.chococraft.common.util.ItemNBTHelper;
import com.google.common.collect.ImmutableSet;
import com.mr208.ea.ExpandedArcanum;
import com.mr208.ea.modules.EAModule;
import com.mr208.ea.modules.IEAModule;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.CrucibleRecipe;
import thaumcraft.api.crafting.ShapedArcaneRecipe;
import thaumcraft.api.items.ItemsTC;

import java.util.ArrayList;

@EAModule(dependency ="chococraft")
public class ModuleCC implements IEAModule
{
	protected static ArrayList<ItemAFrut> afruit = new ArrayList<>();
	
	static ItemAFrut aFruitSpike;
	static ItemAFrut aFruitAero;
  static ItemAFrut aFruitBerry;
  static ItemAFrut aFruitPepper;
  
	@Override
	public void onPreInit()
	{
		if(FMLCommonHandler.instance().getEffectiveSide().isClient())
			MinecraftForge.EVENT_BUS.register(ClientEventsCC.INSTANCE);
		
		MinecraftForge.EVENT_BUS.register(EventsCC.INSTANCE);
		
		aFruitSpike = new ItemStack("SpikeFruit","EA_CHOCOCRAFT", new ItemStack(CCContent.itemAF, 2,1), new ItemStack(CCContent.itemAF, 1, 21), 0.01F, 0xbcbcbc);
		aFruitAero = new ItemStack("Aeroshroom","EA_CHOCOCRAFT", new ItemStack(CCContent.itemAF, 2,4), new ItemStack(CCContent.itemAF, 1, 23), 0.01F, 0xbcbcbc);
    aFruitBerry = new ItemStack("AquaBerry","EA_CHOCOCRAFT", new ItemStack(CCContent.itemAF, 2,7), new ItemStack(CCContent.itemAF, 1, 25), 0.01F, 0xbcbcbc);
    aFruitPepper = new ItemStack("DeadPepper","EA_CHOCOCRAFT", new ItemStack(CCContent.itemAF, 2,10), new ItemStack(CCContent.itemAF, 1, 27), 0.01F, 0xbcbcbc);
    
	}
	
	@Override
	public void onInit()
	{
		ThaumcraftApi.registerResearchLocation(new ResourceLocation(ExpandedArcanum.MOD_ID,"research/chococraft_module"));
	}
	
	@Override
	public void onPostInit()
	{
		ThaumcraftApi.addCrucibleCraftingRecipe(new ResourceLocation(ExpandedArcanum.MOD_ID,"afruit"), new CrucibleRecipe("EA_CHOCOCRAFT", new ItemStack(SpikeFruit), 1);
    ThaumcraftApi.addCrucibleCraftingRecipe(new ResourceLocation(ExpandedArcanum.MOD_ID,"afruit"), new CrucibleRecipe("EA_CHOCOCRAFT", new ItemStack(Aeroshroom), 1);
    ThaumcraftApi.addCrucibleCraftingRecipe(new ResourceLocation(ExpandedArcanum.MOD_ID,"afruit"), new CrucibleRecipe("EA_CHOCOCRAFT", new ItemStack(AquaBerry), 1);
    ThaumcraftApi.addCrucibleCraftingRecipe(new ResourceLocation(ExpandedArcanum.MOD_ID,"afruit"), new CrucibleRecipe("EA_CHOCOCRAFT", new ItemStack(DeadPepper), 1);
	}
}
