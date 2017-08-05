package me.mrCookieSlime.Slimefun.Lists;

import java.util.ArrayList;
import java.util.List;

import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunGadget;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunMachine;
import me.mrCookieSlime.Slimefun.api.SlimefunRecipes;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
//合成方式
public class RecipeType {
	
	public static final RecipeType MULTIBLOCK = new RecipeType(new CustomItem(Material.BRICK, "&6多方块", 0, new String[] {"", "&8-> &7使用多种方块直接在地图中&8(地上)&7建造"}));
	public static final RecipeType ARMOR_FORGE = new RecipeType(new CustomItem(Material.ANVIL, "&6护甲制作台", 0, new String[] {"", "&8-> &7在&6护甲制作台&7的发射器中","&8-> &7放入指定原料，并右键发射器上的铁砧制作"}), "ARMOR_FORGE");
	public static final RecipeType GRIND_STONE = new RecipeType(new CustomItem(Material.DISPENSER, "&6粉碎机", 0, new String[] {"", "&8-> &7在&6粉碎机&7的发射器中","&8-> &7放入指定原料，并右键发射器上的栅栏制作"}), "GRIND_STONE");
	public static final RecipeType MOB_DROP = new RecipeType(new CustomItem(Material.MONSTER_EGG, "&6杀死生物", 0, new String[] {"", "&8-> &7杀死特定怪物获得"}));
	public static final RecipeType SMELTERY = new RecipeType(new CustomItem(Material.FURNACE, "&6高炉", 0, new String[] {"", "&8-> &7在&6高炉&7的发射器中","&8-> &7放入指定原料，并右键发射器上的栅栏制作"}), "SMELTERY");
	public static final RecipeType ORE_CRUSHER = new RecipeType(new CustomItem(Material.DISPENSER, "&6矿物粉碎机", 0, new String[] {"", "&8-> &7在&6矿物粉碎机&7的发射器中","&8-> &7放入指定原料，并右键发射器上的栅栏制作"}), "ORE_CRUSHER");
	public static final RecipeType GOLD_PAN = new RecipeType(new CustomItem(Material.BOWL, "&6淘金盘", 0, new String[] {"", "&8-> &7手持&6淘金盘&7右键砂砾获得"}));
	public static final RecipeType COMPRESSOR = new RecipeType(new CustomItem(Material.PISTON_BASE, "&6压缩机", 0, new String[] {"", "&8-> &7在&6压缩机&7的发射器中","&8-> &7放入指定原料，并右键发射器上的栅栏制作"}), "COMPRESSOR");
	public static final RecipeType PRESSURE_CHAMBER = new RecipeType(new CustomItem(Material.GLASS, "&6真空压缩机", 0, new String[] {"", "&8-> &7在&6真空压缩机&7的发射器中","&8-> &7放入指定原料，并右键发射器下方的炼药锅制作"}), "PRESSURE_CHAMBER");
	public static final RecipeType OVEN = new RecipeType(new CustomItem(Material.FURNACE, "&2烤箱", 0, new String[] {"", "&8-> &7在&6烤箱&7中制作"}), "OVEN");
	public static final RecipeType MAGIC_WORKBENCH = new RecipeType(new CustomItem(Material.BOOKSHELF, "&6注魔工作台", 0, new String[] {"", "&8-> &7在&6注魔工作台&7的发射器中","&8-> &7放入指定原料，并右键工作台制作"}), "MAGIC_WORKBENCH");
	public static final RecipeType ORE_WASHER = new RecipeType(new CustomItem(Material.CAULDRON_ITEM, "&6洗矿机", 0, new String[] {"", "&8-> &7在&6洗矿机&7的发射器中","&8-> &7放入指定原料，并右键发射器下的栅栏制作"}), "ORE_WASHER");
	public static final RecipeType ENHANCED_CRAFTING_TABLE = new RecipeType(new CustomItem(Material.WORKBENCH, "&c强化工作台", 0, new String[] {"", "&8-> &7在&c强化工作台&7的发射器中","&8-> &7放入指定原料，并右键工作台制作"}), "ENHANCED_CRAFTING_TABLE");
	public static final RecipeType JUICER = new RecipeType(new CustomItem(Material.GLASS_BOTTLE, "&6榨汁机", 0, new String[] {"", "&8-> &7在&6榨汁机&7的发射器中","&8-> &7放入指定原料，并右键栅栏制作"}), "JUICER");
	public static final RecipeType ANCIENT_ALTAR = new RecipeType(new CustomItem(Material.ENCHANTMENT_TABLE, "&9远古祭坛", 0, new String[] {"", "&8-> &7使用&9远古祭坛&7进行祭祀仪式以获得"}));
	public static final RecipeType HEATED_PRESSURE_CHAMBER = new RecipeType(new CustomItem(Material.STAINED_GLASS, "&c电热压缩机", 8, new String[] {"", "&8-> &7在&c电热压缩机&7中制作"}), "HEATED_PRESSURE_CHAMBER");
	
	public static final RecipeType SHAPED_RECIPE = new RecipeType(new CustomItem(Material.WORKBENCH, "&2有序合成", 0, new String[] {"", "&8-> &7在普通的工作台中即可直接合成"}));
	public static final RecipeType SHAPELESS_RECIPE = new RecipeType(new CustomItem(Material.WORKBENCH, "&2无序合成", 0, new String[] {"", "&8-> &7在普通的工作台中即可直接合成"}));
	public static final RecipeType FURNACE = new RecipeType(new CustomItem(Material.FURNACE, "&2熔炉熔炼", 0, new String[] {"", "&8-> &7在普通的熔炉中即可直接冶炼"}));
	public static final RecipeType NULL = new RecipeType(null);
	
	ItemStack item;
	String machine;
	
	public RecipeType(ItemStack item) {
		this.item = item;
		this.machine = "";
	}
	
	public RecipeType(ItemStack item, String machine) {
		this.item = item;
		this.machine = machine;
	}
	
	public RecipeType(String machine, int seconds, ItemStack[] input, ItemStack[] output) {
		this.machine = machine;
		SlimefunItem item = getMachine();
		this.item = item.getItem();
		
		SlimefunRecipes.registerMachineRecipe(machine, seconds, input, output);
	}
	
	public ItemStack toItem() {
		return this.item;
	}
	
	public SlimefunItem getMachine() {
		return SlimefunItem.getByName(machine);
	}
	
	public static List<ItemStack> getRecipeInputs(SlimefunItem machine) {
		if (machine == null) return new ArrayList<ItemStack>();
		List<ItemStack[]> recipes = (machine instanceof SlimefunMachine ? ((SlimefunMachine) machine).getRecipes(): ((SlimefunGadget) machine).getRecipes());
		List<ItemStack> convertable = new ArrayList<ItemStack>();
		for (int i = 0; i < recipes.size(); i++) {
			if (i % 2 == 0) convertable.add(recipes.get(i)[0]);
		}
		return convertable;
	}
	
	public static List<ItemStack[]> getRecipeInputList(SlimefunItem machine) {
		if (machine == null) return new ArrayList<ItemStack[]>();
		List<ItemStack[]> recipes = (machine instanceof SlimefunMachine ? ((SlimefunMachine) machine).getRecipes(): ((SlimefunGadget) machine).getRecipes());
		List<ItemStack[]> convertable = new ArrayList<ItemStack[]>();
		for (int i = 0; i < recipes.size(); i++) {
			if (i % 2 == 0) convertable.add(recipes.get(i));
		}
		return convertable;
	}
	
	public static ItemStack getRecipeOutput(SlimefunItem machine, ItemStack input) {
		List<ItemStack[]> recipes = (machine instanceof SlimefunMachine ? ((SlimefunMachine) machine).getRecipes(): ((SlimefunGadget) machine).getRecipes());
		return recipes.get(((getRecipeInputs(machine).indexOf(input) * 2) + 1))[0];
	}
	
	public static ItemStack getRecipeOutputList(SlimefunItem machine, ItemStack[] input) {
		List<ItemStack[]> recipes = (machine instanceof SlimefunMachine ? ((SlimefunMachine) machine).getRecipes(): ((SlimefunGadget) machine).getRecipes());
		return recipes.get(((getRecipeInputList(machine).indexOf(input) * 2) + 1))[0];
	}
}
