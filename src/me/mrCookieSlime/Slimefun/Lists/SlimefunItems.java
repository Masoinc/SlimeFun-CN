package me.mrCookieSlime.Slimefun.Lists;

import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomArmor;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomPotion;
import me.mrCookieSlime.CSCoreLibPlugin.general.String.Christmas;
import me.mrCookieSlime.CSCoreLibPlugin.general.World.CustomSkull;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.FireworkEffectMeta;
import org.bukkit.material.MaterialData;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

@SuppressWarnings("deprecation")
public class SlimefunItems {

    /*		 Items 		*/
    public static ItemStack PORTABLE_CRAFTER = new CustomItem(Material.BOOK, "&6便携式合成台", 0, new String[]{"&8◇ 可随身进行合成", "", "&8-> &6右键&7 以开启"});
    public static ItemStack PORTABLE_DUSTBIN = null;
    public static ItemStack ENDER_BACKPACK = null;
    public static ItemStack MAGIC_EYE_OF_ENDER = new CustomItem(Material.EYE_OF_ENDER, "&9注魔末影之眼", 0, new String[]{"&8◇ 使用需求: 身穿全套&3末影装备", "", "&8-> &6右键&7 发射末影珍珠"});
    public static ItemStack BROKEN_SPAWNER = new CustomItem(new MaterialData(Material.MOB_SPAWNER), "&c损坏的刷怪笼", "&8◇ 类型: &3<Type>", "", "&8-> &7需要使用&9 远古祭坛 &7进行修复");
    public static ItemStack REPAIRED_SPAWNER = new CustomItem(Material.MOB_SPAWNER, "&b已修复的刷怪笼", 0, new String[]{"&8◇ 类型: &3<Type>"});
    public static ItemStack INFERNAL_BONEMEAL = new CustomItem(new MaterialData(Material.INK_SACK, (byte) 15), "&c地狱骨粉", "&8◇ 可加速地狱疣的生长", "", "&8-> &7需要使用&9 远古祭坛 &7进行制作");

    /*		 Gadgets 		*/
    public static ItemStack GOLD_PAN = new CustomItem(Material.BOWL, "&6淘金盘", 0, new String[]{"&8◇ 可能淘出任何种类的矿物", "", "&8-> &7手持淘金盘 &6右键&7 砂砾即可淘金"});
    public static ItemStack PARACHUTE = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&2降落伞", 0, new String[]{"", "&8-> &7按住&3 Shift &7使用"}), Color.WHITE);
    public static ItemStack GRAPPLING_HOOK = new CustomItem(Material.LEASH, "&2钩爪", 0, new String[]{"&8◇ 可用于攀援", "", "&8-> &6右键 &7使用"});
    public static ItemStack SOLAR_HELMET = new CustomItem(Material.IRON_HELMET, "&6太阳能头盔", 0, new String[]{"", "&8◇ 为你手持的物品和护甲充电"});
    public static ItemStack CLOTH = new CustomItem(Material.PAPER, "&2布", 0);
    public static ItemStack CAN = null;
    public static ItemStack NIGHT_VISION_GOGGLES = new CustomArmor(new CustomItem(Material.LEATHER_HELMET, "&3夜视仪", 0, new String[]{"", "&8◇ 获得夜视能力"}), Color.BLACK);
    public static ItemStack FARMER_SHOES = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&2农用鞋", 0, new String[]{"", "&8◇ 穿上后经过耕地不会破坏作物"}), Color.YELLOW);
    public static ItemStack INFUSED_MAGNET = null;
    public static ItemStack FLASK_OF_KNOWLEDGE = new CustomItem(Material.GLASS_BOTTLE, "&9经验储存装置", 0, new String[]{"&8◇ 可用于储存经验", "", "&8-> &7手持 &6右键&7 使用，每次扣除 &31 &7级经验"});
    public static ItemStack RAG = new CustomItem(Material.PAPER, "&2纱布", 0, new String[]{"&8▽ &3Lv.1 &8级医药补给", "", "&8◇ &7回复 &c❤&7x2", "&8◇ &7熄灭身上的火", "", "&8-> &7手持 &6右键&7 使用"});
    public static ItemStack BANDAGE = new CustomItem(Material.PAPER, "&3绷带", 0, new String[]{"&8▽ &3Lv.2 &8级医药补给", "", "&8◇ &7回复 &c❤&7x4", "&8◇ &7熄灭身上的火", "", "&8-> &7手持 &6右键&7 使用"});
    public static ItemStack SPLINT = new CustomItem(Material.STICK, "&3夹板", 0, new String[]{"&8▽ &3Lv.1 &8级医药补给", "", "&8◇ &7回复 &c❤&7x2", "", "&8-> &7手持 &6右键&7 使用"});
    public static ItemStack VITAMINS = new CustomItem(Material.NETHER_STALK, "&6维生素", 0, new String[]{"&8▽ &3Lv.3 &8级医药补给", "", "&8◇ &7回复 &c❤&7x4", "&8◇ &7熄灭身上的火", "&8◇ &7治愈&3中毒&8/&d凋零&8/&2辐射&7状态", "", "&8-> &7手持 &6右键&7 使用"});
    public static ItemStack MEDICINE = new CustomItem(Material.POTION, "&6伤药", 8229, new String[]{"&8▽ &3Lv.3 &8级医药补给", "", "&8◇ &7回复 &c❤&7x4", "&8◇ &7熄灭身上的火", "&8◇ &7治愈&3中毒&8/&d凋零&8/&2辐射&7状态", "", "&8-> &7手持 &6右键&7 使用"});

    /*		Backpacks		*/
    public static ItemStack BACKPACK_SMALL = null;
    public static ItemStack BACKPACK_MEDIUM = null;
    public static ItemStack BACKPACK_LARGE = null;
    public static ItemStack WOVEN_BACKPACK = null;
    public static ItemStack GILDED_BACKPACK = null;
    public static ItemStack BOUND_BACKPACK = null;
    public static ItemStack COOLER = null;

    public static ItemStack VOIDBAG_SMALL = null;
    public static ItemStack VOIDBAG_MEDIUM = null;
    public static ItemStack VOIDBAG_BIG = null;
    public static ItemStack VOIDBAG_LARGE = null;
    public static ItemStack BOUND_VOIDBAG = null;

    /*		 Jetpacks		*/
    public static ItemStack DURALUMIN_JETPACK = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_CHESTPLATE), "&9电力喷气背包 &7- &3I", "", "&8\u21E8 &7材质: &3铝合金", "&c&o&8\u21E8 &e\u26A1 &70 / 20 J", "&8\u21E8 &7升力: &c0.35", "", "&8-> &7按住 &6Shift&7 使用"), Color.SILVER);
    public static ItemStack SOLDER_JETPACK = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_CHESTPLATE), "&9电力喷气背包 &7- &3II", "", "&8\u21E8 &7材质: &3秘银", "&c&o&8\u21E8 &e\u26A1 &70 / 30 J", "&8\u21E8 &7升力: &c0.4", "", "&8-> &7按住 &6Shift&7 使用"), Color.SILVER);
    public static ItemStack BILLON_JETPACK = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_CHESTPLATE), "&9电力喷气背包 &7- &3III", "", "&8\u21E8 &7材质: &3比郎合金", "&c&o&8\u21E8 &e\u26A1 &70 / 45 J", "&8\u21E8 &7升力: &c0.45", "", "&8-> &7按住 &6Shift&7 使用"), Color.SILVER);
    public static ItemStack STEEL_JETPACK = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_CHESTPLATE), "&9电力喷气背包 &7- &3IV", "", "&8\u21E8 &7材质: &3锻钢", "&c&o&8\u21E8 &e\u26A1 &70 / 60 J", "&8\u21E8 &7升力: &c0.5", "", "&8-> &7按住 &6Shift&7 使用"), Color.SILVER);
    public static ItemStack DAMASCUS_STEEL_JETPACK = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_CHESTPLATE), "&9电力喷气背包 &7- &3V", "", "&8\u21E8 &7材质: &3大马士革钢", "&c&o&8\u21E8 &e\u26A1 &70 / 75 J", "&8\u21E8 &7升力: &c0.55", "", "&8-> &7按住 &6Shift&7 使用"), Color.SILVER);
    public static ItemStack REINFORCED_ALLOY_JETPACK = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_CHESTPLATE), "&9电力喷气背包 &7- &3VI", "", "&8\u21E8 &7材质: &3复合合金", "&c&o&8\u21E8 &e\u26A1 &70 / 100 J", "&8\u21E8 &7升力: &c0.6", "", "&8-> &7按住 &6Shift&7 使用"), Color.SILVER);
    public static ItemStack CARBONADO_JETPACK = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_CHESTPLATE), "&9电力喷气背包 &7- &3VII", "", "&8\u21E8 &7材质: &3碳纤维", "&c&o&8\u21E8 &e\u26A1 &70 / 150 J", "&8\u21E8 &7升力: &c0.7", "", "&8-> &7按住 &6Shift&7 使用"), Color.BLACK);
    public static ItemStack ARMORED_JETPACK = new CustomItem(new MaterialData(Material.IRON_CHESTPLATE), "&9复合装甲喷气背包", "&8\u21E8 &7材质: &3锻钢", "", "&c&o&8\u21E8 &e\u26A1 &70 / 50 J", "&8\u21E8 &7升力: &c0.45", "", "&8-> &7按住 &6Shift&7 使用");

    /*		 Jetboots		*/
    public static ItemStack DURALUMIN_JETBOOTS = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_BOOTS), "&9电力喷气靴 &7- &3I", "", "&8\u21E8 &7材质: &3铝合金", "&c&o&8\u21E8 &e\u26A1 &70 / 20 J", "&8\u21E8 &7速度: &a0.35", "&8\u21E8 &7准确率: &c50%", "", "&8-> &7按住 &6Shift&7 使用"), Color.SILVER);
    public static ItemStack SOLDER_JETBOOTS = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_BOOTS), "&9电力喷气靴 &7- &3II", "", "&8\u21E8 &7材质: &3秘银", "&c&o&8\u21E8 &e\u26A1 &70 / 30 J", "&8\u21E8 &7速度: &a0.4", "&8\u21E8 &7准确率: &660%", "", "&8-> &7按住 &6Shift&7 使用"), Color.SILVER);
    public static ItemStack BILLON_JETBOOTS = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_BOOTS), "&9电力喷气靴 &7- &3III", "", "&8\u21E8 &7材质: &3比郎合金", "&c&o&8\u21E8 &e\u26A1 &70 / 40 J", "&8\u21E8 &7速度: &a0.45", "&8\u21E8 &7准确率: &665%", "", "&8-> &7按住 &6Shift&7 使用"), Color.SILVER);
    public static ItemStack STEEL_JETBOOTS = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_BOOTS), "&9电力喷气靴 &7- &3IV", "", "&8\u21E8 &7材质: &3锻钢", "&c&o&8\u21E8 &e\u26A1 &70 / 50 J", "&8\u21E8 &7速度: &a0.5", "&8\u21E8 &7准确率: &e70%", "", "&8-> &7按住 &6Shift&7 使用"), Color.SILVER);
    public static ItemStack DAMASCUS_STEEL_JETBOOTS = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_BOOTS), "&9电力喷气靴 &7- &3V", "", "&8\u21E8 &7材质: &3大马士革钢", "&c&o&8\u21E8 &e\u26A1 &70 / 75 J", "&8\u21E8 &7速度: &a0.55", "&8\u21E8 &7准确率: &a75%", "", "&8-> &7按住 &6Shift&7 使用"), Color.SILVER);
    public static ItemStack REINFORCED_ALLOY_JETBOOTS = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_BOOTS), "&9电力喷气靴 &7- &3VI", "", "&8\u21E8 &7材质: &3复合合金", "&c&o&8\u21E8 &e\u26A1 &70 / 100 J", "&8\u21E8 &7速度: &a0.6", "&8\u21E8 &7准确率: &c80%", "", "&8-> &7按住 &6Shift&7 使用"), Color.SILVER);
    public static ItemStack CARBONADO_JETBOOTS = new CustomArmor(new CustomItem(new MaterialData(Material.LEATHER_BOOTS), "&9电力喷气靴 &7- &3VII", "", "&8\u21E8 &7材质: &3碳纤维", "&c&o&8\u21E8 &e\u26A1 &70 / 125 J", "&8\u21E8 &7速度: &a0.7", "&8\u21E8 &7准确率: &c99.9%", "", "&8-> &7按住 &6Shift&7 使用"), Color.BLACK);
    public static ItemStack ARMORED_JETBOOTS = new CustomItem(new MaterialData(Material.IRON_BOOTS), "&9复合装甲喷气靴", "", "&8\u21E8 &7材质: &3锻钢", "&c&o&8\u21E8 &e\u26A1 &70 / 50 J", "&8\u21E8 &7速度: &a0.45", "&8\u21E8 &7准确率: &e70%", "", "&8-> &7按住 &6Shift&7 使用");

    /*		 Multi Tools		*/
    public static ItemStack DURALUMIN_MULTI_TOOL = new CustomItem(new MaterialData(Material.SHEARS), "&9多用工具 &7- &3I", "", "&8\u21E8 &7材质: &3铝合金", "&c&o&8\u21E8 &e\u26A1 &70 / 20 J", "", "&8-> &6右键&7 使用", "&8-> &6Shift &7+ &6右键&7 切换模式");
    public static ItemStack SOLDER_MULTI_TOOL = new CustomItem(new MaterialData(Material.SHEARS), "&9多用工具 &7- &3II", "", "&8\u21E8 &7材质: &3秘银", "&c&o&8\u21E8 &e\u26A1 &70 / 30 J", "", "&8-> &6右键&7 使用", "&8-> &6Shift &7+ &6右键&7 切换模式");
    public static ItemStack BILLON_MULTI_TOOL = new CustomItem(new MaterialData(Material.SHEARS), "&9多用工具 &7- &3III", "", "&8\u21E8 &7材质: &3比郎合金", "&c&o&8\u21E8 &e\u26A1 &70 / 40 J", "", "&8-> &6右键&7 使用", "&8-> &6Shift &7+ &6右键&7 切换模式");
    public static ItemStack STEEL_MULTI_TOOL = new CustomItem(new MaterialData(Material.SHEARS), "&9多用工具 &7- &3IV", "", "&8\u21E8 &7材质: &3锻钢", "&c&o&8\u21E8 &e\u26A1 &70 / 50 J", "", "&8-> &6右键&7 使用", "&8-> &6Shift &7+ &6右键&7 切换模式");
    public static ItemStack DAMASCUS_STEEL_MULTI_TOOL = new CustomItem(new MaterialData(Material.SHEARS), "&9多用工具 &7- &3V", "", "&8\u21E8 &7材质: &3大马士革钢", "&c&o&8\u21E8 &e\u26A1 &70 / 60 J", "", "&8-> &6右键&7 使用", "&8-> &6Shift &7+ &6右键&7 切换模式");
    public static ItemStack REINFORCED_ALLOY_MULTI_TOOL = new CustomItem(new MaterialData(Material.SHEARS), "&9多用工具 &7- &3VI", "", "&8\u21E8 &7材质: &3复合合金", "&c&o&8\u21E8 &e\u26A1 &70 / 75 J", "", "&8-> &6右键&7 使用", "&8-> &6Shift &7+ &6右键&7 切换模式");
    public static ItemStack CARBONADO_MULTI_TOOL = new CustomItem(new MaterialData(Material.SHEARS), "&9多用工具 &7- &3VII", "", "&8\u21E8 &7材质: &3碳纤维", "&c&o&8\u21E8 &e\u26A1 &70 / 100 J", "", "&8-> &6右键&7 使用", "&8-> &6Shift &7+ &6右键&7 切换模式");

    /*		 Food 		*/
    public static ItemStack FORTUNE_COOKIE = new CustomItem(Material.COOKIE, "&6幸运曲奇", 0, new String[]{"", "&8◇ 能够预知未来的神秘饼干(?)"});
    public static ItemStack BEEF_JERKY = new CustomItem(Material.COOKED_BEEF, "&6牛肉干", 0, new String[]{"", "&8◇ 一条吃饱，两条撑死"});
    public static ItemStack MAGIC_SUGAR = new CustomItem(Material.SUGAR, "&6魔法糖果", 0, new String[]{"", "&8◇ 感受赫尔墨斯之力"});
    public static ItemStack MONSTER_JERKY = new CustomItem(Material.ROTTEN_FLESH, "&6怪兽肉干", 0, new String[]{"", "&8◇ 一条撑死"});
    public static ItemStack APPLE_JUICE = new CustomPotion("&c苹果汁", 8197, new String[0], new PotionEffect(PotionEffectType.SATURATION, 10, 0));
    public static ItemStack MELON_JUICE = new CustomPotion("&c甜瓜汁", 8197, new String[0], new PotionEffect(PotionEffectType.SATURATION, 10, 0));
    public static ItemStack CARROT_JUICE = new CustomPotion("&6胡萝卜汁", 8195, new String[0], new PotionEffect(PotionEffectType.SATURATION, 10, 0));
    public static ItemStack PUMPKIN_JUICE = new CustomPotion("&6南瓜汁", 8195, new String[0], new PotionEffect(PotionEffectType.SATURATION, 10, 0));
    public static ItemStack GOLDE_APPLE_JUICE = new CustomPotion("&b金苹果汁", 8195, new String[0], new PotionEffect(PotionEffectType.ABSORPTION, 20 * 20, 0));

    /*		Christmas		*/
    public static ItemStack MILK = new CustomPotion("&6一杯牛奶", 8194, new String[0], new PotionEffect(PotionEffectType.SATURATION, 5, 0));
    public static ItemStack CHOCOLATE_MILK = new CustomPotion("&6巧克力牛奶", 8201, new String[0], new PotionEffect(PotionEffectType.SATURATION, 12, 0));
    public static ItemStack EGG_NOG = new CustomPotion("&6蛋酒", 8194, new String[0], new PotionEffect(PotionEffectType.SATURATION, 7, 0));
    public static ItemStack APPLE_CIDER = new CustomPotion("&c苹果酒", 8197, new String[0], new PotionEffect(PotionEffectType.SATURATION, 14, 0));
    public static ItemStack CHRISTMAS_COOKIE = new CustomItem(Material.COOKIE, Christmas.color("苹果派"), 0);
    public static ItemStack FRUIT_CAKE = new CustomItem(Material.PUMPKIN_PIE, Christmas.color("水果蛋糕"), 0);
    public static ItemStack APPLE_PIE = new CustomItem(Material.PUMPKIN_PIE, "&c苹果派", 0);
    public static ItemStack HOT_CHOCOLATE = new CustomPotion("&热可可", 8201, new String[0], new PotionEffect(PotionEffectType.SATURATION, 14, 0));
    public static ItemStack CHRISTMAS_CAKE = new CustomItem(Material.PUMPKIN_PIE, Christmas.color("圣诞蛋糕"), 0);
    public static ItemStack CARAMEL = new CustomItem(Material.CLAY_BRICK, "&6饴糖", 0);
    public static ItemStack CARAMEL_APPLE = new CustomItem(Material.APPLE, "&6苹果糖", 0);
    public static ItemStack CHOCOLATE_APPLE = new CustomItem(Material.APPLE, "&6巧克力苹果", 0);
    public static ItemStack PRESENT = new CustomItem(Material.CHEST, Christmas.color("圣诞礼物"), 0, new String[]{"&8◇ 惊不惊喜，意不意外?", "", "&8-> &6右键&7 使用"});

    /*		Easter			*/
    public static ItemStack EASTER_EGG = new CustomItem(Material.EGG, "&2复活节彩蛋", 0, new String[]{"", "&8◇ 惊不惊喜，意不意外?", ""});
    public static ItemStack CARROT_PIE = new CustomItem(Material.PUMPKIN_PIE, "&6胡萝卜派", 0);

    /*		 Weapons 		*/
    public static ItemStack GRANDMAS_WALKING_STICK = new CustomItem(Material.STICK, "&2击退手杖", 0, new String[0], new String[]{"KNOCKBACK-2"});
    public static ItemStack GRANDPAS_WALKING_STICK = new CustomItem(Material.STICK, "&2击飞手杖", 0, new String[0], new String[]{"KNOCKBACK-5"});
    public static ItemStack SWORD_OF_BEHEADING = new CustomItem(Material.IRON_SWORD, "&c斩首巨剑", 0, new String[]{"&8◇ &9斩首 II", "", "&8-> &7杀死生物时，有几率获得头", "&8-> &7对凋零骷髅使用效果拔群"});
    public static ItemStack BLADE_OF_VAMPIRES = new CustomItem(Material.GOLD_SWORD, "&c吸血鬼之刃", 0, new String[]{"&8◇ &c生命偷取 I", "", "&8-> &7攻击生物时", "&8-> &7有 &645% &7几率回复 &c❤&7x2"}, new String[]{"FIRE_ASPECT-2", "DURABILITY-4", "DAMAGE_ALL-2"});
    public static ItemStack SEISMIC_AXE = new CustomItem(Material.IRON_AXE, "&c地震巨斧", 0, new String[]{"", "&8◇ &7能够引发地震的神秘巨斧", "", "&8-> &6右键&7 使用"});

    /*		Bows		*/
    public static ItemStack EXPLOSIVE_BOW = new CustomItem(Material.BOW, "&c爆裂之弓", 0, new String[]{"", "&8◇ &7由这把弓射出的箭", "&8◇ &7可以将生物击飞至空中"});
    public static ItemStack ICY_BOW = new CustomItem(Material.BOW, "&3寒冰之弓", 0, new String[]{"", "&8◇ &7由这把弓射出的箭", "&8◇ &7可以使被击中的生物停滞 &32 &7秒"});

    /*		 Tools		*/
    public static ItemStack AUTO_SMELT_PICKAXE = new CustomItem(Material.DIAMOND_PICKAXE, "&6自动冶炼矿稿", 0, new String[]{"", "&8◇ &7可将挖到的矿物自动冶炼", "&8◇ &7可与时运附魔同时生效"});
    public static ItemStack LUMBER_AXE = new CustomItem(Material.DIAMOND_AXE, "&6伐木巨斧", 0, new String[]{"&8◇ &7可以砍倒整棵树木"});
    public static ItemStack PICKAXE_OF_CONTAINMENT = new CustomItem(Material.IRON_PICKAXE, "&c刷怪笼之镐", 0, new String[]{"", "&8◇ &7可以挖掘 &9刷怪笼"});
    public static ItemStack HERCULES_PICKAXE = new CustomItem(Material.IRON_PICKAXE, "&9巨力之镐", 0, new String[]{"", "&8◇ &7蕴含着强大的能量", "&8◇ &7可将挖到的矿物击碎成矿粉"}, new String[]{"DURABILITY-2", "DIG_SPEED-4"});
    public static ItemStack EXPLOSIVE_PICKAXE = new CustomItem(Material.DIAMOND_PICKAXE, "&c爆裂之镐", 0, new String[]{"", "&8◇ &7击碎作用范围内的所有矿物", "&8◇ &7可与时运附魔同时生效"});
    public static ItemStack PICKAXE_OF_THE_SEEKER = new CustomItem(Material.DIAMOND_PICKAXE, "&9探索者之镐", 0, new String[]{"", "&8◇ &7将你指向最近的矿物", "&8◇ &7使用时可能会损耗耐久", "", "&8-> &6右键&7 使用，指向最近的矿物"});
    public static ItemStack COBALT_PICKAXE = new CustomItem(Material.IRON_PICKAXE, "&9钴镐", 0, new String[]{}, new String[]{"DURABILITY-3", "DIG_SPEED-6"});
    public static ItemStack PICKAXE_OF_VEIN_MINING = new CustomItem(Material.DIAMOND_PICKAXE, "&c矿脉之镐", 0, new String[]{"", "&8◇ &7可挖掘整条矿脉的矿物"});

    /*		 Armor 		*/
    public static ItemStack GLOWSTONE_HELMET = new CustomArmor(new CustomItem(Material.LEATHER_HELMET, "&e萤石头盔", 0, new String[]{"", "&8◇ &7像太阳一样闪闪发光(?)", "", "&8◇ &9获得夜视能力"}), Color.YELLOW);
    public static ItemStack GLOWSTONE_CHESTPLATE = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&e萤石胸甲", 0, new String[]{"", "&8◇ &7像太阳一样闪闪发光(?)", "", "&8◇ &9获得夜视能力"}), Color.YELLOW);
    public static ItemStack GLOWSTONE_LEGGINGS = new CustomArmor(new CustomItem(Material.LEATHER_LEGGINGS, "&e萤石护腿", 0, new String[]{"", "&8◇ &7像太阳一样闪闪发光(?)", "", "&8◇ &9获得夜视能力"}), Color.YELLOW);
    public static ItemStack GLOWSTONE_BOOTS = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&e萤石靴子", 0, new String[]{"", "&8◇ &7像太阳一样闪闪发光(?)", "", "&8◇ &9获得夜视能力"}), Color.YELLOW);
    public static ItemStack ENDER_HELMET = new CustomArmor(new CustomItem(Material.LEATHER_HELMET, "&5末影头盔", 0, new String[]{"", "&8◇ &7来去无踪"}), Color.fromRGB(28, 25, 112));
    public static ItemStack ENDER_CHESTPLATE = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&5末影胸甲", 0, new String[]{"", "&8◇ &7来去无踪"}), Color.fromRGB(28, 25, 112));
    public static ItemStack ENDER_LEGGINGS = new CustomArmor(new CustomItem(Material.LEATHER_LEGGINGS, "&5末影护腿", 0, new String[]{"", "&8◇ &7来去无踪"}), Color.fromRGB(28, 25, 112));
    public static ItemStack ENDER_BOOTS = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&5末影靴子", 0, new String[]{"", "&8◇ &7来去无踪", "", "&8◇ &9使用末影珍珠不受摔落伤害"}), Color.fromRGB(28, 25, 112));
    public static ItemStack SLIME_HELMET = new CustomArmor(new CustomItem(Material.LEATHER_HELMET, "&a粘液头盔", 0, new String[]{"", "&8◇ &7弹力十足"}), Color.LIME);
    public static ItemStack SLIME_CHESTPLATE = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&a粘液胸甲", 0, new String[]{"", "&8◇ &7弹力十足"}), Color.LIME);
    public static ItemStack SLIME_LEGGINGS = new CustomArmor(new CustomItem(Material.LEATHER_LEGGINGS, "&a粘液护腿", 0, new String[]{"", "&8◇ &7弹力十足", "", "&8◇ &9提升移动速度"}), Color.LIME);
    public static ItemStack SLIME_BOOTS = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&a粘液靴子", 0, new String[]{"", "&8◇ &7弹力十足", "", "&8◇ &9提升跳跃高度", "&8◇ &9不受摔落伤害"}), Color.LIME);
    public static ItemStack CACTUS_HELMET = new CustomArmor(new CustomItem(Material.LEATHER_HELMET, "&2仙人掌头盔", 0, new String[0], new String[]{"THORNS-3", "DURABILITY-5"}), Color.GREEN);
    public static ItemStack CACTUS_CHESTPLATE = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&2仙人掌胸甲", 0, new String[0], new String[]{"THORNS-3", "DURABILITY-5"}), Color.GREEN);
    public static ItemStack CACTUS_LEGGINGS = new CustomArmor(new CustomItem(Material.LEATHER_LEGGINGS, "&2仙人掌护腿", 0, new String[0], new String[]{"THORNS-3", "DURABILITY-5"}), Color.GREEN);
    public static ItemStack CACTUS_BOOTS = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&2仙人掌靴子", 0, new String[0], new String[]{"THORNS-3", "DURABILITY-5"}), Color.GREEN);
    public static ItemStack DAMASCUS_STEEL_HELMET = new CustomItem(Material.IRON_HELMET, "&6大马士革锻钢头盔", new String[]{"DURABILITY-4", "PROTECTION_ENVIRONMENTAL-4"}, 0);
    public static ItemStack DAMASCUS_STEEL_CHESTPLATE = new CustomItem(Material.IRON_CHESTPLATE, "&6大马士革锻钢胸甲", new String[]{"DURABILITY-4", "PROTECTION_ENVIRONMENTAL-4"}, 0);
    public static ItemStack DAMASCUS_STEEL_LEGGINGS = new CustomItem(Material.IRON_LEGGINGS, "&6大马士革锻钢护腿", new String[]{"DURABILITY-4", "PROTECTION_ENVIRONMENTAL-4"}, 0);
    public static ItemStack DAMASCUS_STEEL_BOOTS = new CustomItem(Material.IRON_BOOTS, "&6大马士革锻钢靴子", new String[]{"DURABILITY-4", "PROTECTION_ENVIRONMENTAL-4"}, 0);
    public static ItemStack REINFORCED_ALLOY_HELMET = new CustomItem(Material.IRON_HELMET, "&b复合合金头盔", new String[]{"DURABILITY-9", "PROTECTION_ENVIRONMENTAL-9"}, 0);
    public static ItemStack REINFORCED_ALLOY_CHESTPLATE = new CustomItem(Material.IRON_CHESTPLATE, "&b复合合金胸甲", new String[]{"DURABILITY-9", "PROTECTION_ENVIRONMENTAL-9"}, 0);
    public static ItemStack REINFORCED_ALLOY_LEGGINGS = new CustomItem(Material.IRON_LEGGINGS, "&b复合合金护腿", new String[]{"DURABILITY-9", "PROTECTION_ENVIRONMENTAL-9"}, 0);
    public static ItemStack REINFORCED_ALLOY_BOOTS = new CustomItem(Material.IRON_BOOTS, "&b复合合金靴子", new String[]{"DURABILITY-9", "PROTECTION_ENVIRONMENTAL-9"}, 0);
    public static ItemStack SCUBA_HELMET = new CustomArmor(new CustomItem(Material.LEATHER_HELMET, "&2防化头盔", 0, new String[]{"", "&8◇ &9可在水下呼吸", "&8◇ &7穿戴整套防化套装可免疫辐射"}), Color.ORANGE);
    public static ItemStack HAZMATSUIT_CHESTPLATE = new CustomArmor(new CustomItem(Material.LEATHER_CHESTPLATE, "&2防化胸甲", 0, new String[]{"", "&8◇ &9可在火焰中行走", "&8◇ &7穿戴整套防化套装可免疫辐射"}), Color.ORANGE);
    public static ItemStack HAZMATSUIT_LEGGINGS = new CustomArmor(new CustomItem(Material.LEATHER_LEGGINGS, "&2防化护腿", 0, new String[]{"", "&8◇ &7穿戴整套防化套装可免疫辐射"}), Color.ORANGE);
    public static ItemStack RUBBER_BOOTS = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&2防化靴子", 0, new String[]{"", "&8◇ &7穿戴整套防化套装可免疫辐射"}), Color.BLACK);
    public static ItemStack GILDED_IRON_HELMET = new CustomItem(Material.GOLD_HELMET, "&6镀金锻钢头盔", new String[]{"DURABILITY-6", "PROTECTION_ENVIRONMENTAL-8"}, 0);
    public static ItemStack GILDED_IRON_CHESTPLATE = new CustomItem(Material.GOLD_CHESTPLATE, "&6镀金锻钢胸甲", new String[]{"DURABILITY-6", "PROTECTION_ENVIRONMENTAL-8"}, 0);
    public static ItemStack GILDED_IRON_LEGGINGS = new CustomItem(Material.GOLD_LEGGINGS, "&6镀金锻钢护腿", new String[]{"DURABILITY-6", "PROTECTION_ENVIRONMENTAL-8"}, 0);
    public static ItemStack GILDED_IRON_BOOTS = new CustomItem(Material.GOLD_BOOTS, "&6镀金锻钢靴子", new String[]{"DURABILITY-6", "PROTECTION_ENVIRONMENTAL-8"}, 0);
    public static ItemStack GOLD_HELMET = new CustomItem(Material.GOLD_HELMET, "&6纯金头盔", 0, new String[]{"&912-Carat"}, new String[]{"DURABILITY-10"});
    public static ItemStack GOLD_CHESTPLATE = new CustomItem(Material.GOLD_CHESTPLATE, "&6纯金胸甲", 0, new String[]{"&912-Carat"}, new String[]{"DURABILITY-10"});
    public static ItemStack GOLD_LEGGINGS = new CustomItem(Material.GOLD_LEGGINGS, "&6纯金护腿", 0, new String[]{"&912-Carat"}, new String[]{"DURABILITY-10"});
    public static ItemStack GOLD_BOOTS = new CustomItem(Material.GOLD_BOOTS, "&6纯金靴子", 0, new String[]{"&912-Carat"}, new String[]{"DURABILITY-10"});
    public static ItemStack SLIME_HELMET_STEEL = new CustomItem(Material.IRON_HELMET, "&a硬化粘液头盔", 0, new String[]{"&8◇ &7防御增强", "", "&8◇ &7弹力十足"}, new String[]{"DURABILITY-4", "PROTECTION_ENVIRONMENTAL-2"});
    public static ItemStack SLIME_CHESTPLATE_STEEL = new CustomItem(Material.IRON_CHESTPLATE, "&a硬化粘液胸甲", 0, new String[]{"&8◇ &7防御增强", "", "&8◇ &7弹力十足"}, new String[]{"DURABILITY-4", "PROTECTION_ENVIRONMENTAL-2"});
    public static ItemStack SLIME_LEGGINGS_STEEL = new CustomItem(Material.IRON_LEGGINGS, "&a硬化粘液护腿", 0, new String[]{"&8◇ &7防御增强", "", "&8◇ &7弹力十足", "", "&8◇ &9提升移动速度"}, new String[]{"DURABILITY-4", "PROTECTION_ENVIRONMENTAL-2"});
    public static ItemStack SLIME_BOOTS_STEEL = new CustomItem(Material.IRON_BOOTS, "&a硬化粘液靴子", 0, new String[]{"&8◇ &7防御增强", "", "&8◇ &7弹力十足", "", "&8◇ &9提升跳跃高度", "&8◇ &9不受摔落伤害"}, new String[]{"DURABILITY-4", "PROTECTION_ENVIRONMENTAL-2"});
    public static ItemStack BOOTS_OF_THE_STOMPER = new CustomArmor(new CustomItem(Material.LEATHER_BOOTS, "&2反弹之靴", 0, new String[]{"", "&8◇ &7受到的所有摔落伤害", "&8◇ &7自动转移至落地点周围生物", "", "&8◇ &9不受摔落伤害"}), Color.AQUA);
    public static ItemStack HEAVY_METAL_HELMET = new CustomItem(Material.IRON_HELMET, "&c重型头盔", 0, new String[]{"", "&8◇ &7防御增强", "&8◇ &7速度减慢"}, new String[]{"DURABILITY-10", "PROTECTION_ENVIRONMENTAL-10"});
    public static ItemStack HEAVY_METAL_CHESTPLATE = new CustomItem(Material.IRON_CHESTPLATE, "&c重型胸甲", 0, new String[]{"", "&8◇ &7防御增强", "&8◇ &7速度减慢"}, new String[]{"DURABILITY-10", "PROTECTION_ENVIRONMENTAL-10"});
    public static ItemStack HEAVY_METAL_LEGGINGS = new CustomItem(Material.IRON_LEGGINGS, "&c重型护腿", 0, new String[]{"", "&8◇ &7防御增强", "&8◇ &7速度减慢"}, new String[]{"DURABILITY-10", "PROTECTION_ENVIRONMENTAL-10"});
    public static ItemStack HEAVY_METAL_BOOTS = new CustomItem(Material.IRON_BOOTS, "&c重型靴子", 0, new String[]{"", "&8◇ &7防御增强", "&8◇ &7速度减慢"}, new String[]{"DURABILITY-10", "PROTECTION_ENVIRONMENTAL-10"});

    /*		 Misc 		*/
    public static ItemStack MAGIC_LUMP_1 = new CustomItem(Material.GOLD_NUGGET, "&6魔法之尘 &7- &3I", 0, new String[]{"", "&8◇ &7品级: &6I"});
    public static ItemStack MAGIC_LUMP_2 = new CustomItem(Material.GOLD_NUGGET, "&6魔法之尘 &7- &3II", 0, new String[]{"", "&8◇ &7品级: &6II"});
    public static ItemStack MAGIC_LUMP_3 = new CustomItem(Material.GOLD_NUGGET, "&6魔法之尘 &7- &3III", 0, new String[]{"", "&8◇ &7品级: &6III"});
    public static ItemStack ENDER_LUMP_1 = new CustomItem(Material.GOLD_NUGGET, "&5末影之尘 &7- &3I", 0, new String[]{"", "&8◇ &7品级: &6I"});
    public static ItemStack ENDER_LUMP_2 = new CustomItem(Material.GOLD_NUGGET, "&5末影之尘 &7- &3II", 0, new String[]{"", "&8◇ &7品级: &6II"});
    public static ItemStack ENDER_LUMP_3 = new CustomItem(Material.GOLD_NUGGET, "&5末影之尘 &7- &3III", 0, new String[]{"", "&8◇ &7品级: &6III"});
    public static ItemStack MAGICAL_BOOK_COVER = new CustomItem(Material.PAPER, "&6魔法书之封面", 0, new String[]{"", "&8◇ &7可用于制作魔法书"});
    public static ItemStack BASIC_CIRCUIT_BOARD = new CustomItem(Material.ACTIVATOR_RAIL, "&2基础电路板", 0);
    public static ItemStack ADVANCED_CIRCUIT_BOARD = new CustomItem(Material.POWERED_RAIL, "&3先进电路板", 0);
    public static ItemStack WHEAT_FLOUR = new CustomItem(Material.SUGAR, "&f面粉", 0);
    public static ItemStack STEEL_PLATE = new CustomItem(Material.PAPER, "&7钢板", 0);
    public static ItemStack COMPRESSED_CARBON = null;
    public static ItemStack BATTERY = null;
    public static ItemStack CARBON_CHUNK = null;
    public static ItemStack STEEL_THRUSTER = new CustomItem(Material.BUCKET, "&7钢制推进器", 0);
    public static ItemStack POWER_CRYSTAL = null;
    public static ItemStack CHAIN = new CustomItem(Material.STRING, "&b链条", 0);
    public static ItemStack HOOK = new CustomItem(Material.FLINT, "&b钩子", 0);
    public static ItemStack SIFTED_ORE = new CustomItem(Material.SULPHUR, "&6筛选过的矿石", 0);
    public static ItemStack STONE_CHUNK = null;
    public static ItemStack LAVA_CRYSTAL = null;
    public static ItemStack SALT = new CustomItem(Material.SUGAR, "&f盐", 0);
    public static ItemStack BUTTER = null;
    public static ItemStack CHEESE = null;
    public static ItemStack HEAVY_CREAM = new CustomItem(Material.SNOW_BALL, "&6厚奶油", 0);
    public static ItemStack CRUSHED_ORE = new CustomItem(Material.SULPHUR, "&6矿石碎块", 0);
    public static ItemStack PULVERIZED_ORE = new CustomItem(Material.SULPHUR, "&6矿石粉末", 0);
    public static ItemStack PURE_ORE_CLUSTER = new CustomItem(Material.SULPHUR, "&6提纯矿簇", 0);
    public static ItemStack TINY_URANIUM = null;
    public static ItemStack SMALL_URANIUM = null;
    public static ItemStack MAGNET = null;
    public static ItemStack NECROTIC_SKULL = new CustomItem(new MaterialData(Material.SKULL_ITEM, (byte) 1).toItemStack(1), "&c坏死的头颅");
    public static ItemStack ESSENCE_OF_AFTERLIFE = new CustomItem(Material.SULPHUR, "&c来世的本质", 0);
    public static ItemStack ELECTRO_MAGNET = null;
    public static ItemStack HEATING_COIL = null;
    public static ItemStack COOLING_UNIT = null;
    public static ItemStack ELECTRIC_MOTOR = null;
    public static ItemStack CARGO_MOTOR = null;
    public static ItemStack SCROLL_OF_DIMENSIONAL_TELEPOSITION = new CustomItem(Material.PAPER, "&6空间跃迁卷轴", 0, new String[]{"", "§8◇ 可容纳任何事物的神秘卷轴", "§8◇ 能够召唤出不稳定的黑洞", "§8◇ 黑洞附近的生物都将被吸入", "§8◇ 并被转换维度", "", "§8◇ 用人话来说就是将生物翻转 &6180°"});
    public static ItemStack TOME_OF_KNOWLEDGE_SHARING = new CustomItem(Material.BOOK, "&6科技共享典籍", 0, new String[]{"&8◇ &7所有者: &3无", "", "&8-> &6右键 &7绑定此卷轴", "", "", "&8-> &6右键 &7获得前任所有者的所有 &6科技解锁进度"});
    public static ItemStack HARDENED_GLASS = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte) 8), "&7防爆玻璃", "", "&8◇ &7能够承受爆炸");
    public static ItemStack WITHER_PROOF_OBSIDIAN = new CustomItem(Material.OBSIDIAN, "&5反凋零黑曜石", 0, new String[]{"", "&8◇ &7能够承受爆炸", "&8◇ &7能够承受凋零袭击"});
    public static ItemStack WITHER_PROOF_GLASS = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte) 15), "&5反凋零玻璃", "", "&8◇ &7能够承受爆炸", "&8◇ &7能够承受凋零袭击");
    public static ItemStack REINFORCED_PLATE = new CustomItem(Material.PAPER, "&7加强板材", 0);
    public static ItemStack ANCIENT_PEDESTAL = new CustomItem(Material.DISPENSER, "&9远古祭坛基座", 0, new String[]{"&8◇ &8远古祭坛的组成部分"});
    public static ItemStack ANCIENT_ALTAR = new CustomItem(Material.ENCHANTMENT_TABLE, "&9远古祭坛", 0, new String[]{"&8◇ &8远古祭坛的组成部分", "&8◇ &5可用于制作多种魔法物品"});
    public static ItemStack DUCT_TAPE = null;

    public static ItemStack RAINBOW_WOOL = new CustomItem(new MaterialData(Material.WOOL), "&5彩虹羊毛", "", "&8◇ &7可在 &616 &7种颜色间切换的彩虹羊毛");
    public static ItemStack RAINBOW_GLASS = new CustomItem(new MaterialData(Material.STAINED_GLASS), "&5彩虹玻璃", "", "&8◇ &7可在 &616 &7种颜色间切换的彩虹玻璃");
    public static ItemStack RAINBOW_CLAY = new CustomItem(new MaterialData(Material.STAINED_CLAY), "&5彩虹黏土", "", "&8◇ &7可在 &616 &7种颜色间切换的彩虹黏土");
    public static ItemStack RAINBOW_GLASS_PANE = new CustomItem(new MaterialData(Material.STAINED_GLASS_PANE), "&5彩虹玻璃板", "", "&8◇ &7可在 &616 &7种颜色间切换的彩虹玻璃板");

    public static ItemStack RAINBOW_WOOL_XMAS = new CustomItem(new MaterialData(Material.WOOL), "&5彩虹羊毛 &7(#圣诞节限定)", "", Christmas.color("< Christmas Edition >"));
    public static ItemStack RAINBOW_GLASS_XMAS = new CustomItem(new MaterialData(Material.STAINED_GLASS), "&5彩虹玻璃 &7(#圣诞节限定)", "", Christmas.color("< Christmas Edition >"));
    public static ItemStack RAINBOW_CLAY_XMAS = new CustomItem(new MaterialData(Material.STAINED_CLAY), "&5彩虹黏土 &7(#圣诞节限定)", "", Christmas.color("< Christmas Edition >"));
    public static ItemStack RAINBOW_GLASS_PANE_XMAS = new CustomItem(new MaterialData(Material.STAINED_GLASS_PANE), "&5彩虹玻璃板 &7(#圣诞节限定)", "", Christmas.color("< Christmas Edition >"));

    public static ItemStack RAINBOW_WOOL_VALENTINE = new CustomItem(new MaterialData(Material.WOOL), "&5彩虹羊毛 &7(#情人节限定)", "", "&d< Valentine's Day Edition >");
    public static ItemStack RAINBOW_GLASS_VALENTINE = new CustomItem(new MaterialData(Material.STAINED_GLASS), "&5彩虹玻璃 &7(#情人节限定)", "", "&d< Valentine's Day Edition >");
    public static ItemStack RAINBOW_CLAY_VALENTINE = new CustomItem(new MaterialData(Material.STAINED_CLAY), "&5彩虹黏土 &7(#情人节限定)", "", "&d< Valentine's Day Edition >");
    public static ItemStack RAINBOW_GLASS_PANE_VALENTINE = new CustomItem(new MaterialData(Material.STAINED_GLASS_PANE), "&5彩虹玻璃板 &7(#情人节限定)", "", "&d< Valentine's Day Edition >");

    /*		 Ingots 		*/
    public static ItemStack COPPER_INGOT = new CustomItem(Material.CLAY_BRICK, "&6铜锭", 0, new String[0]);
    public static ItemStack TIN_INGOT = new CustomItem(Material.IRON_INGOT, "&f锡锭", 0, new String[0]);
    public static ItemStack SILVER_INGOT = new CustomItem(Material.IRON_INGOT, "&b银锭", 0, new String[0]);
    public static ItemStack ALUMINUM_INGOT = new CustomItem(Material.IRON_INGOT, "&b铝锭", 0, new String[0]);
    public static ItemStack LEAD_INGOT = new CustomItem(Material.IRON_INGOT, "&8铅锭", 0, new String[0]);
    public static ItemStack ZINC_INGOT = new CustomItem(Material.IRON_INGOT, "&f锌锭", 0, new String[0]);
    public static ItemStack MAGNESIUM_INGOT = new CustomItem(Material.IRON_INGOT, "&f镁锭", 0, new String[0]);

    /*		Alloy (Carbon + Iron)	*/
    public static ItemStack STEEL_INGOT = new CustomItem(Material.IRON_INGOT, "&b锻钢锭", 0, new String[0]);
    /*		Alloy (Copper + Tin)	*/
    public static ItemStack BRONZE_INGOT = new CustomItem(Material.CLAY_BRICK, "&6青铜锭", 0, new String[0]);
    /*		Alloy (Copper + Aluminum)	*/
    public static ItemStack DURALUMIN_INGOT = new CustomItem(Material.IRON_INGOT, "&b铝合金锭", 0, new String[0]);
    /*		Alloy (Copper + Silver)	*/
    public static ItemStack BILLON_INGOT = new CustomItem(Material.IRON_INGOT, "&b比郎合金锭", 0, new String[0]);
    /*		Alloy (Copper + Zinc)	*/
    public static ItemStack BRASS_INGOT = new CustomItem(Material.GOLD_INGOT, "&6黄铜锭", 0, new String[0]);
    /*		Alloy (Aluminum + Brass)	*/
    public static ItemStack ALUMINUM_BRASS_INGOT = new CustomItem(Material.GOLD_INGOT, "&b铝合黄铜锭", 0, new String[0]);
    /*		Alloy (Aluminum + Bronze)	*/
    public static ItemStack ALUMINUM_BRONZE_INGOT = new CustomItem(Material.GOLD_INGOT, "&b铝合青铜锭", 0, new String[0]);
    /*		Alloy (Gold + Silver + Copper)	*/
    public static ItemStack CORINTHIAN_BRONZE_INGOT = new CustomItem(Material.GOLD_INGOT, "&6哥林多黄铜锭", 0, new String[0]);
    /*		Alloy (Lead + Tin)	*/
    public static ItemStack SOLDER_INGOT = new CustomItem(Material.IRON_INGOT, "&b秘银锭", 0, new String[0]);
    /*		Alloy (Steel + Iron + Carbon)	*/
    public static ItemStack DAMASCUS_STEEL_INGOT = new CustomItem(Material.IRON_INGOT, "&b大马士革锻钢锭", 0, new String[0]);
    /*		Alloy (Damascus Steel + Duralumin + Compressed Carbon + Aluminium Bronze)	*/
    public static ItemStack HARDENED_METAL_INGOT = new CustomItem(Material.IRON_INGOT, "&b硬化金属锭", 0);
    /*		Alloy (Hardened Metal + Corinthian Bronze + Solder + Billon + Damascus Steel)	*/
    public static ItemStack REINFORCED_ALLOY_INGOT = new CustomItem(Material.IRON_INGOT, "&b复合合金锭", 0);
    /*		Alloy (Iron + Silicon)		*/
    public static ItemStack FERROSILICON = new CustomItem(Material.IRON_INGOT, "&b硅铁合金锭", 0);
    /*		Alloy (Iron + Gold)			*/
    public static ItemStack GILDED_IRON = new CustomItem(Material.GOLD_INGOT, "&6镀金锻钢锭", 0);
    /*		Alloy (Redston + Ferrosilicon)	*/
    public static ItemStack REDSTONE_ALLOY = new CustomItem(Material.CLAY_BRICK, "&c红石合金锭", 0);
    /*		Alloy (Iron + Copper)		*/
    public static ItemStack NICKEL_INGOT = new CustomItem(Material.IRON_INGOT, "&b镍锭", 0);
    /*		Alloy (Nickel + Iron + Copper)		*/
    public static ItemStack COBALT_INGOT = new CustomItem(Material.IRON_INGOT, "&9钴锭", 0);

    /*		Gold		*/
    public static ItemStack GOLD_4K = new CustomItem(Material.GOLD_INGOT, "&6金锭 &7(4-K)", 0);
    public static ItemStack GOLD_6K = new CustomItem(Material.GOLD_INGOT, "&6金锭 &7(6-K)", 0);
    public static ItemStack GOLD_8K = new CustomItem(Material.GOLD_INGOT, "&6金锭 &7(8-K)", 0);
    public static ItemStack GOLD_10K = new CustomItem(Material.GOLD_INGOT, "&6金锭 &7(10-K)", 0);
    public static ItemStack GOLD_12K = new CustomItem(Material.GOLD_INGOT, "&6金锭 &7(12-K)", 0);
    public static ItemStack GOLD_14K = new CustomItem(Material.GOLD_INGOT, "&6金锭 &7(14-K)", 0);
    public static ItemStack GOLD_16K = new CustomItem(Material.GOLD_INGOT, "&6金锭 &7(16-K)", 0);
    public static ItemStack GOLD_18K = new CustomItem(Material.GOLD_INGOT, "&6金锭 &7(18-K)", 0);
    public static ItemStack GOLD_20K = new CustomItem(Material.GOLD_INGOT, "&6金锭 &7(20-K)", 0);
    public static ItemStack GOLD_22K = new CustomItem(Material.GOLD_INGOT, "&6金锭 &7(22-K)", 0);
    public static ItemStack GOLD_24K = new CustomItem(Material.GOLD_INGOT, "&6金锭 &7(24-K)", 0);

    /*		 Dusts 		*/
    public static ItemStack IRON_DUST = new CustomItem(Material.SULPHUR, "&6铁粉", 0);
    public static ItemStack GOLD_DUST = new CustomItem(Material.GLOWSTONE_DUST, "&6金粉", 0);
    public static ItemStack TIN_DUST = new CustomItem(Material.SUGAR, "&6锡粉", 0);
    public static ItemStack COPPER_DUST = new CustomItem(Material.GLOWSTONE_DUST, "&6铜粉", 0);
    public static ItemStack SILVER_DUST = new CustomItem(Material.SUGAR, "&6银粉", 0);
    public static ItemStack ALUMINUM_DUST = new CustomItem(Material.SUGAR, "&6铝粉", 0);
    public static ItemStack LEAD_DUST = new CustomItem(Material.SULPHUR, "&6铅粉", 0);
    public static ItemStack SULFATE = new CustomItem(Material.GLOWSTONE_DUST, "&6硫酸盐", 0);
    public static ItemStack ZINC_DUST = new CustomItem(Material.SUGAR, "&6锌粉", 0);
    public static ItemStack MAGNESIUM_DUST = new CustomItem(Material.SUGAR, "&6镁粉", 0);
    public static ItemStack CARBON = null;
    public static ItemStack SILICON = new CustomItem(Material.FIREWORK_CHARGE, "&6硅粉", 0);
    public static ItemStack GOLD_24K_BLOCK = new CustomItem(Material.GOLD_BLOCK, "&6金条 &7(24-K)", 0);

    /*		 Gems 		*/
    public static ItemStack SYNTHETIC_DIAMOND = new CustomItem(Material.DIAMOND, "&3人造钻石", 0);
    public static ItemStack SYNTHETIC_SAPPHIRE = new CustomItem(new MaterialData(Material.INK_SACK, (byte) 4), "&3人造蓝宝石");
    public static ItemStack SYNTHETIC_EMERALD = new CustomItem(Material.EMERALD, "&2人造绿宝石", 0);
    public static ItemStack CARBONADO = null;
    public static ItemStack RAW_CARBONADO = null;
    public static ItemStack URANIUM = null;
    public static ItemStack NEPTUNIUM = null;
    public static ItemStack PLUTONIUM = null;
    public static ItemStack BOOSTED_URANIUM = null;

    /*		Talisman		*/
    public static ItemStack TALISMAN = new CustomItem(Material.EMERALD, "&6护身符基质", 0);
    public static ItemStack TALISMAN_ANVIL = new CustomItem(Material.EMERALD, "&a锻造之护身符", 0, new String[]{"", "&8◇ &7携带此护身符时", "&8◇ &7每个此种护身符可防止 &61 &7个物品损毁", "§8◇ §7生效后此护身符将消失", "", "&8[&4!&8] §7此护身符对于附魔等级过高的物品不适用"});
    public static ItemStack TALISMAN_MINER = new CustomItem(Material.EMERALD, "&a采掘之护身符", 0, new String[]{"", "&8◇ &7携带此护身符时", "§8◇ §7采掘矿物时有 §620% §7几率使获得的矿物翻倍"});
    public static ItemStack TALISMAN_HUNTER = new CustomItem(Material.EMERALD, "&a狩猎之护身符", 0, new String[]{"", "&8◇ &7携带此护身符时", "§8◇ §7击杀生物时有 §620% §7几率使获得的掉落物翻倍"});
    public static ItemStack TALISMAN_LAVA = new CustomItem(Material.EMERALD, "&a熔岩行者护身符", 0, new String[]{"", "&8◇ &7携带此护身符时", "§8◇ §7接触岩浆时立即获得 §6抗火 §7BUFF", "§8◇ §7随后此护身符将消失"});
    public static ItemStack TALISMAN_WATER = new CustomItem(Material.EMERALD, "&a深海行者护身符", 0, new String[]{"", "&8◇ &7携带此护身符时", "§8◇ §7氧气用完时立即获得 §6水下呼吸 §7BUFF", "§8◇ §7随后此护身符将消失"});
    public static ItemStack TALISMAN_ANGEL = new CustomItem(Material.EMERALD, "&a天使之护身符", 0, new String[]{"", "&8◇ &7携带此护身符时", "§8◇ §7摔落时有§675% §7几率不受任何伤害"});
    public static ItemStack TALISMAN_FIRE = new CustomItem(Material.EMERALD, "&a火焰之护身符", 0, new String[]{"", "&8◇ &7携带此护身符时", "§8◇ §7接触火焰时立即获得 §6抗火 §7BUFF", "§8◇ §7随后此护身符将消失"});
    public static ItemStack TALISMAN_MAGICIAN = new CustomItem(Material.EMERALD, "&a魔法之护身符", 0, new String[]{"", "&8◇ &7携带此护身符时", "§8◇ §7附魔时获得 §680% §7幸运加成", "§8◇ §7有时可能额外获得 &61 &7个附魔"});
    public static ItemStack TALISMAN_TRAVELLER = new CustomItem(Material.EMERALD, "&a行者之护身符", 0, new String[]{"", "&8◇ &7携带此护身符时", "§8◇ §7冲刺时有 §660% §7几率获得速度加成"});
    public static ItemStack TALISMAN_WARRIOR = new CustomItem(Material.EMERALD, "&a战士之护身符", 0, new String[]{"", "&8◇ &7携带此护身符时", "§8◇ §7受伤时立即获得 §6力量III §7BUFF", "§8◇ §7随后此护身符将消失"});
    public static ItemStack TALISMAN_KNIGHT = new CustomItem(Material.EMERALD, "&a骑士之护身符", 0, new String[]{"", "&8◇ &7携带此护身符时", "§8◇ §7受伤时有 &630% &7几率获得 §65&7秒&6再生 §7BUFF", "§8◇ §7随后此护身符将消失"});
    public static ItemStack TALISMAN_WHIRLWIND = new CustomItem(Material.EMERALD, "&a疾风之护身符", 0, new String[]{"", "&8◇ &7携带此护身符时", "§8◇ §7射向你的投掷物有 &640% &7几率偏移"});
    public static ItemStack TALISMAN_WIZARD = new CustomItem(Material.EMERALD, "&a奥术之护身符", 0, new String[]{"", "&8◇ &7携带此护身符时", "§8◇ §7提高 &60.8 &7的幸运度", "§8◇ §7但有可能使你物品的附魔降低"});

    /*		Staves		*/
    public static ItemStack STAFF_ELEMENTAL = new CustomItem(Material.STICK, "&6元素法杖", 0);
    public static ItemStack STAFF_WIND = new CustomItem(Material.STICK, "&6元素法杖 &7- &2风", 0, new String[]{"", "&8◇ &7元素: &2风", "", "&8-> &7手持 &6右键 &7向前推进"}, new String[]{"LUCK-1"});
    public static ItemStack STAFF_FIRE = new CustomItem(Material.STICK, "&6元素法杖 &7- &c火", 0, new String[]{"", "&8◇ &7元素: &c火"}, new String[]{"FIRE_ASPECT-5"});
    public static ItemStack STAFF_WATER = new CustomItem(Material.STICK, "&6元素法杖 &7- &3水", 0, new String[]{"", "&8◇ &7元素: &3水", "", "&8-> &7手持 &6右键 &7熄灭身上的火"}, new String[]{"WATER_WORKER-1"});

    /*		 Machines 		*/
    public static ItemStack GRIND_STONE = new CustomItem(Material.DISPENSER, "&2粉碎机", 0, new String[]{"", "&8◇ &7可用于磨碎一些特殊物品"});
    public static ItemStack ARMOR_FORGE = new CustomItem(Material.ANVIL, "&6护甲制作台", 0, new String[]{"", "&8◇ &7可用于制作强力护甲"});
    public static ItemStack SMELTERY = new CustomItem(Material.FURNACE, "&6高炉", 0, new String[]{"", "&8◇ &7可用于熔化金属"});
    public static ItemStack ORE_CRUSHER = new CustomItem(Material.DISPENSER, "&b矿物粉碎机", 0, new String[]{"", "&8◇ &7将矿物打粉以提高产量"});
    public static ItemStack COMPRESSOR = new CustomItem(Material.PISTON_BASE, "&b压缩机", 0, new String[]{"", "&8◇ &7可用于压缩物品"});
    public static ItemStack PRESSURE_CHAMBER = new CustomItem(Material.GLASS, "&b真空压缩机", 0, new String[]{"", "&8◇ &7强化版的压缩机"});
    public static ItemStack MAGIC_WORKBENCH = new CustomItem(Material.WORKBENCH, "&6注魔工作台", 0, new String[]{"", "&8◇ &7为物品注入魔能"});
    public static ItemStack ORE_WASHER = new CustomItem(Material.CAULDRON_ITEM, "&6洗矿机", 0, new String[]{"", "&8◇ &7可用于筛选矿粉", "&8◇ &7筛选的同时会获得一些石块"});
    public static ItemStack SAW_MILL = new CustomItem(Material.IRON_FENCE, "&6锯木机", 0, new String[]{"", "&8◇ &7可从&6 1 &7个原木中切割出 &68 &7个木板"});
    public static ItemStack COMPOSTER = new CustomItem(Material.CAULDRON_ITEM, "&a堆肥箱", 0, new String[]{"", "&8◇ &7进行有机物与无机物间的转换"});
    public static ItemStack ENHANCED_CRAFTING_TABLE = new CustomItem(Material.WORKBENCH, "&e强化工作台", 0, new String[]{"", "&8◇ &7能够合成普通工作台无法制作的物品"});
    public static ItemStack CRUCIBLE = new CustomItem(Material.CAULDRON_ITEM, "&c坩埚", 0, new String[]{"", "&8◇ &7可将物品转为液态"});
    public static ItemStack JUICER = new CustomItem(Material.GLASS_BOTTLE, "&a榨汁机", 0, new String[]{"", "&8◇ &7可用于制作果汁"});

    public static ItemStack SOLAR_PANEL = new CustomItem(Material.DAYLIGHT_DETECTOR, "&6光伏电池板", 0, new String[]{"", "&8◇ &7可将光能转化为电能"});
    public static ItemStack SOLAR_ARRAY = new CustomItem(Material.DAYLIGHT_DETECTOR, "&b光伏电池阵列", 0, new String[]{"", "&8◇ &7可将光能转化为电能"});
    public static ItemStack DIGITAL_MINER = new CustomItem(Material.IRON_PICKAXE, "&b挖矿机", 0, new String[]{"", "&8◇ &7自动挖掘矿物"});
    public static ItemStack ADVANCED_DIGITAL_MINER = new CustomItem(Material.DIAMOND_PICKAXE, "&6先进挖矿机", 0, new String[]{"", "&8◇ &7自动挖掘矿物", "&8◇ &7自动粉碎矿物"});
    public static ItemStack AUTOMATED_PANNING_MACHINE = new CustomItem(Material.BOWL, "&a自动淘金机", 0, new String[]{"", "&8◇ &7改良版淘金盘"});

    public static ItemStack HOLOGRAM_PROJECTOR = new CustomItem(new MaterialData(Material.STEP, (byte) 7), "&b全息投影仪", "", "&8◇ &7可投射全息投影");

    /*		 Enhanced Furnaces 		*/
    public static ItemStack ENHANCED_FURNACE = new CustomItem(Material.FURNACE, "&2强化熔炉 &7- &6I", 0, new String[]{"", "&8◇ &7冶炼效率: &61x", "&8◇ &7燃料利用效率: &61x", "&8◇ &7产出加成: &91x"});
    public static ItemStack ENHANCED_FURNACE_2 = new CustomItem(Material.FURNACE, "&2强化熔炉 &7- &6II", 0, new String[]{"", "&8◇ &7冶炼效率: &62x", "&8◇ &7燃料利用效率: &61x", "&8◇ &7产出加成: &91x"});
    public static ItemStack ENHANCED_FURNACE_3 = new CustomItem(Material.FURNACE, "&2强化熔炉 &7- &6III", 0, new String[]{"", "&8◇ &7冶炼效率: &62x", "&8◇ &7燃料利用效率: &62x", "&8◇ &7产出加成: &91x"});
    public static ItemStack ENHANCED_FURNACE_4 = new CustomItem(Material.FURNACE, "&2强化熔炉 &7- &6IV", 0, new String[]{"", "&8◇ &7冶炼效率: &63x", "&8◇ &7燃料利用效率: &62x", "&8◇ &7产出加成: &91x"});
    public static ItemStack ENHANCED_FURNACE_5 = new CustomItem(Material.FURNACE, "&2强化熔炉 &7- &6V", 0, new String[]{"", "&8◇ &7冶炼效率: &63x", "&8◇ &7燃料利用效率: &62x", "&8◇ &7产出加成: &92x"});
    public static ItemStack ENHANCED_FURNACE_6 = new CustomItem(Material.FURNACE, "&2强化熔炉 &7- &6VI", 0, new String[]{"", "&8◇ &7冶炼效率: &63x", "&8◇ &7燃料利用效率: &63x", "&8◇ &7产出加成: &92x"});
    public static ItemStack ENHANCED_FURNACE_7 = new CustomItem(Material.FURNACE, "&2强化熔炉 &7- &6VII", 0, new String[]{"", "&8◇ &7冶炼效率: &64x", "&8◇ &7燃料利用效率: &63x", "&8◇ &7产出加成: &92x"});
    public static ItemStack ENHANCED_FURNACE_8 = new CustomItem(Material.FURNACE, "&2强化熔炉 &7- &6VIII", 0, new String[]{"", "&8◇ &7冶炼效率: &64x", "&8◇ &7燃料利用效率: &64x", "&8◇ &7产出加成: &92x"});
    public static ItemStack ENHANCED_FURNACE_9 = new CustomItem(Material.FURNACE, "&2强化熔炉 &7- &6IX", 0, new String[]{"", "&8◇ &7冶炼效率: &65x", "&8◇ &7燃料利用效率: &64x", "&8◇ &7产出加成: &92x"});
    public static ItemStack ENHANCED_FURNACE_10 = new CustomItem(Material.FURNACE, "&2强化熔炉 &7- &6X", 0, new String[]{"", "&8◇ &7冶炼效率: &65x", "&8◇ &7燃料利用效率: &65x", "&8◇ &7产出加成: &92x"});
    public static ItemStack ENHANCED_FURNACE_11 = new CustomItem(Material.FURNACE, "&2强化熔炉 &7- &6XI", 0, new String[]{"", "&8◇ &7冶炼效率: &65x", "&8◇ &7燃料利用效率: &65x", "&8◇ &7产出加成: &93x"});
    public static ItemStack REINFORCED_FURNACE = new CustomItem(Material.FURNACE, "&6复合合金强化熔炉", 0, new String[]{"", "&8◇ &7冶炼效率: &610x", "&8◇ &7燃料利用效率: &610x", "&8◇ &7产出加成: &93x"});
    public static ItemStack CARBONADO_EDGED_FURNACE = new CustomItem(Material.FURNACE, "&6碳纤维强化熔炉", 0, new String[]{"", "&8◇ &7冶炼效率: &620x", "&8◇ &7燃料利用效率: &610x", "&8◇ &7产出加成: &93x"});

    public static ItemStack BLOCK_PLACER = new CustomItem(Material.DISPENSER, "&2方块放置机", 0, new String[]{"", "&8◇ &7发射器内的方块会被自动放置"});

    /*		Soulbound Items		*/
    public static ItemStack SOULBOUND_SWORD = new CustomItem(Material.DIAMOND_SWORD, "&9灵魂之剑", 0);
    public static ItemStack SOULBOUND_BOW = new CustomItem(Material.BOW, "&9灵魂之弓", 0);
    public static ItemStack SOULBOUND_PICKAXE = new CustomItem(Material.DIAMOND_PICKAXE, "&9灵魂之镐", 0);
    public static ItemStack SOULBOUND_AXE = new CustomItem(Material.DIAMOND_AXE, "&9灵魂之斧", 0);
    public static ItemStack SOULBOUND_SHOVEL = new CustomItem(Material.DIAMOND_SPADE, "&9灵魂之锹", 0);
    public static ItemStack SOULBOUND_HOE = new CustomItem(Material.DIAMOND_HOE, "&9灵魂之锄", 0);

    public static ItemStack SOULBOUND_HELMET = new CustomItem(Material.DIAMOND_HELMET, "&9灵魂头盔", 0);
    public static ItemStack SOULBOUND_CHESTPLATE = new CustomItem(Material.DIAMOND_CHESTPLATE, "&9灵魂胸甲", 0);
    public static ItemStack SOULBOUND_LEGGINGS = new CustomItem(Material.DIAMOND_LEGGINGS, "&9灵魂护腿", 0);
    public static ItemStack SOULBOUND_BOOTS = new CustomItem(Material.DIAMOND_BOOTS, "&9灵魂靴子", 0);

    /*		Runes				*/
    public static ItemStack BLANK_RUNE = null;
    public static ItemStack RUNE_AIR = null;
    public static ItemStack RUNE_WATER = null;
    public static ItemStack RUNE_FIRE = null;
    public static ItemStack RUNE_EARTH = null;
    public static ItemStack RUNE_ENDER = null;
    public static ItemStack RUNE_RAINBOW = null;

    static {
        ItemStack itemB = new ItemStack(Material.FIREWORK_CHARGE);
        FireworkEffectMeta imB = (FireworkEffectMeta) itemB.getItemMeta();
        imB.setEffect(FireworkEffect.builder().with(Type.BURST).with(Type.BURST).withColor(Color.BLACK).build());
        imB.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&8符文基质"));
        itemB.setItemMeta(imB);
        BLANK_RUNE = itemB;

        ItemStack itemA = new ItemStack(Material.FIREWORK_CHARGE);
        FireworkEffectMeta imA = (FireworkEffectMeta) itemA.getItemMeta();
        imA.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.AQUA).build());
        imA.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7远古符文 &8[&2风&8]"));
        itemA.setItemMeta(imA);
        RUNE_AIR = itemA;

        ItemStack itemW = new ItemStack(Material.FIREWORK_CHARGE);
        FireworkEffectMeta imW = (FireworkEffectMeta) itemW.getItemMeta();
        imW.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.BLUE).build());
        imW.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7远古符文 &8[&3水&8]"));
        itemW.setItemMeta(imW);
        RUNE_WATER = itemW;

        ItemStack itemF = new ItemStack(Material.FIREWORK_CHARGE);
        FireworkEffectMeta imF = (FireworkEffectMeta) itemF.getItemMeta();
        imF.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.RED).build());
        imF.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7远古符文 &8[&c火&8]"));
        itemF.setItemMeta(imF);
        RUNE_FIRE = itemF;

        ItemStack itemE = new ItemStack(Material.FIREWORK_CHARGE);
        FireworkEffectMeta imE = (FireworkEffectMeta) itemE.getItemMeta();
        imE.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.ORANGE).build());
        imE.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7远古符文 &8[&6土&8]"));
        itemE.setItemMeta(imE);
        RUNE_EARTH = itemE;

        ItemStack itemN = new ItemStack(Material.FIREWORK_CHARGE);
        FireworkEffectMeta imN = (FireworkEffectMeta) itemN.getItemMeta();
        imN.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.PURPLE).build());
        imN.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7远古符文 &8[&5影&8]"));
        itemN.setItemMeta(imN);
        RUNE_ENDER = itemN;

        ItemStack itemR = new ItemStack(Material.FIREWORK_CHARGE);
        FireworkEffectMeta imR = (FireworkEffectMeta) itemR.getItemMeta();
        imR.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.PURPLE).build());
        imR.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7远古符文 &8[&d虹&8]"));
        itemR.setItemMeta(imR);
        RUNE_RAINBOW = itemR;
    }

    /*		Electricity			*/
    public static ItemStack SOLAR_GENERATOR = new CustomItem(new ItemStack(Material.DAYLIGHT_DETECTOR), "&2光伏发电机", "", "&8◇ &7初级发电设备", "&8\u21E8 &e\u26A1 &70 J &8(可储存的电能)", "&8\u21E8 &e\u26A1 &74 J/s");
    public static ItemStack SOLAR_GENERATOR_2 = new CustomItem(new ItemStack(Material.DAYLIGHT_DETECTOR), "&3先进光伏发电机", "", "&8◇ &7中级发电设备", "&8\u21E8 &e\u26A1 &70 J &8(可储存的电能)", "&8\u21E8 &e\u26A1 &716 J/s");
    public static ItemStack SOLAR_GENERATOR_3 = new CustomItem(new ItemStack(Material.DAYLIGHT_DETECTOR), "&6碳纤维光伏发电机", "", "&8◇ &7先进发电设备", "&8\u21E8 &e\u26A1 &70 J &8(可储存的电能)", "&8\u21E8 &e\u26A1 &764 J/s");
    public static ItemStack SOLAR_GENERATOR_4 = new CustomItem(new ItemStack(Material.DAYLIGHT_DETECTOR), "&c全时碳纤维光伏发电机", "", "&8◇ &9日间/夜间均可工作", "", "&8◇ &7顶级发电设备", "&8\u21E8 &e\u26A1 &70 J &8(可储存的电能)", "&8\u21E8 &e\u26A1 &7256 J/s &8(日间)", "&8\u21E8 &e\u26A1 &7128 J/s &8(夜间)");

    public static ItemStack COAL_GENERATOR = null;
    public static ItemStack LAVA_GENERATOR = null;

    public static ItemStack ELECTRIC_FURNACE = new CustomItem(new ItemStack(Material.FURNACE), "&2电炉 &7- &6I", "", "&8◇ &7初级用电设备", "&8\u21E8 &7冶炼速度: 1x", "&8\u21E8 &e\u26A1 &74 J/s");
    public static ItemStack ELECTRIC_FURNACE_2 = new CustomItem(new ItemStack(Material.FURNACE), "&2电炉 &7- &6II", "", "&8◇ &7中级用电设备", "&8\u21E8 &7冶炼速度: 2x", "&8\u21E8 &e\u26A1 &76 J/s");
    public static ItemStack ELECTRIC_FURNACE_3 = new CustomItem(new ItemStack(Material.FURNACE), "&2电炉 &7- &6III", "", "&8◇ &7中级用电设备", "&8\u21E8 &7冶炼速度: 4x", "&8\u21E8 &e\u26A1 &710 J/s");

    public static ItemStack ELECTRIC_ORE_GRINDER = new CustomItem(new ItemStack(Material.FURNACE), "&c电动磨粉机 &7- &6I", "", "&8◇ &7兼备粉碎机和矿物粉碎机的功能", "", "&8◇ &7先进用电设备", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &712 J/s");
    public static ItemStack ELECTRIC_ORE_GRINDER_2 = new CustomItem(new ItemStack(Material.FURNACE), "&c电动磨粉机 &7- &6II", "", "&8◇ &7兼备粉碎机和矿物粉碎机的功能", "", "&8◇ &7顶级用电设备", "&8\u21E8 &7速度: 4x", "&8\u21E8 &e\u26A1 &730 J/s");
    public static ItemStack ELECTRIC_INGOT_PULVERIZER = new CustomItem(new ItemStack(Material.FURNACE), "&c金属锭磨粉机", "", "&8◇ &7可将金属锭磨成粉", "", "&8◇ &7中级用电设备", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &714 J/s");
    public static ItemStack AUTO_ENCHANTER = new CustomItem(new ItemStack(Material.ENCHANTMENT_TABLE), "&5自动附魔机", "", "&8◇ &7中级用电设备", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &718 J/s");
    public static ItemStack AUTO_DISENCHANTER = new CustomItem(new ItemStack(Material.ENCHANTMENT_TABLE), "&5自动去附魔机", "", "&8◇ &7中级用电设备", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &718 J/s");
    public static ItemStack AUTO_ANVIL = new CustomItem(new ItemStack(Material.IRON_BLOCK), "&7自动铁砧 &7- &6Mark.I", "", "&8◇ &7先进用电设备", "&8\u21E8 &7修复因数: 10%", "&8\u21E8 &e\u26A1 &724 J/s");
    public static ItemStack AUTO_ANVIL_2 = new CustomItem(new ItemStack(Material.IRON_BLOCK), "&7自动铁砧 &7- &6Mark.II", "", "&8◇ &7顶级用电设备", "&8\u21E8 &7修复因数: 25%", "&8\u21E8 &e\u26A1 &732 J/s");

    public static ItemStack BIO_REACTOR = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte) 5), "&2生物质能发电机", "", "&8◇ &7中级发电设备", "&8\u21E8 &e\u26A1 &7128 J &8(可储存的电能)", "&8\u21E8 &e\u26A1 &78 J/s");
    public static ItemStack MULTIMETER = new CustomItem(new MaterialData(Material.WATCH), "&6万用表", "", "&8◇ &7可用于测量设备中存储的电能");
    public static ItemStack SMALL_CAPACITOR = null, MEDIUM_CAPACITOR = null, BIG_CAPACITOR = null, LARGE_CAPACITOR = null, CARBONADO_EDGED_CAPACITOR = null;

    /*		Robots				*/
    public static ItemStack PROGRAMMABLE_ANDROID = null;
    public static ItemStack PROGRAMMABLE_ANDROID_MINER = null;
    public static ItemStack PROGRAMMABLE_ANDROID_BUTCHER = null;
    public static ItemStack PROGRAMMABLE_ANDROID_FARMER = null;
    public static ItemStack PROGRAMMABLE_ANDROID_WOODCUTTER = null;
    public static ItemStack PROGRAMMABLE_ANDROID_FISHERMAN = null;

    public static ItemStack PROGRAMMABLE_ANDROID_2 = null;
    public static ItemStack PROGRAMMABLE_ANDROID_2_FISHERMAN = null;
    public static ItemStack PROGRAMMABLE_ANDROID_2_FARMER = null;
    public static ItemStack PROGRAMMABLE_ANDROID_2_BUTCHER = null;

    public static ItemStack PROGRAMMABLE_ANDROID_3 = null;
    public static ItemStack PROGRAMMABLE_ANDROID_3_FISHERMAN = null;
    public static ItemStack PROGRAMMABLE_ANDROID_3_BUTCHER = null;

    /*		GPS					*/
    public static ItemStack GPS_TRANSMITTER = null;
    public static ItemStack GPS_TRANSMITTER_2 = null;
    public static ItemStack GPS_TRANSMITTER_3 = null;
    public static ItemStack GPS_TRANSMITTER_4 = null;

    public static ItemStack GPS_CONTROL_PANEL = null;
    public static ItemStack GPS_MARKER_TOOL = new CustomItem(new MaterialData(Material.REDSTONE_TORCH_ON), "&8[&7GPS&8] &6传送点标记工具", "", "&8-> &7手持此物品 &6右键 &7设定当前位置为传送点");
    public static ItemStack GPS_EMERGENCY_TRANSMITTER = null;
    public static ItemStack GPS_GEO_SCANNER = null;

    public static ItemStack ANDROID_INTERFACE_FUEL = new CustomItem(new ItemStack(Material.DISPENSER), "&7机器人扩展组件 &7(&c燃料&7)", "", "&8◇ &7设定好程序后，存储在此组件内的燃料", "&8◇ &7将被自动填入机器人的燃料空槽");
    public static ItemStack ANDROID_INTERFACE_ITEMS = new CustomItem(new ItemStack(Material.DISPENSER), "&7机器人扩展组件 &7(&9物品&7)", "", "&8◇ &7设定好程序后，存放在机器人内的物品", "&8◇ &7将被自动填入此组件");

    public static ItemStack BUCKET_OF_OIL = null;
    public static ItemStack BUCKET_OF_FUEL = null;
    public static ItemStack OIL_PUMP = null;

    public static ItemStack REFINERY = new CustomItem(new ItemStack(Material.PISTON_BASE), "&6原油提炼设备", "", "&8◇ &7可从原油中提炼燃料");
    public static ItemStack COMBUSTION_REACTOR = null;
    public static ItemStack ANDROID_MEMORY_CORE = null;

    public static ItemStack GPS_TELEPORTER_PYLON = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte) 10), "&8[&7GPS&8] &5传送器电缆塔", "", "&8◇ &7传送器组件");
    public static ItemStack GPS_TELEPORTATION_MATRIX = new CustomItem(new MaterialData(Material.IRON_BLOCK), "&8[&7GPS&8] &2传送器矩阵", "", "&8◇ &7传送器核心组件", "&8◇ &7可列出放置此设备者标记过的所有传送点");
    public static ItemStack GPS_ACTIVATION_DEVICE_SHARED = new CustomItem(new MaterialData(Material.STONE_PLATE), "&8[&7GPS&8] &7激活装置 &7(&3共享&7)", "", "&8◇ &7将此装置放在传送器矩阵上方", "&8◇ &7踩上压力板进行传送");
    public static ItemStack GPS_ACTIVATION_DEVICE_PERSONAL = new CustomItem(new MaterialData(Material.STONE_PLATE), "&8[&7GPS&8] &7激活装置 &7(&a私有&7)", "", "&8◇ &7将此装置放在传送器矩阵上方", "&8◇ &7踩上压力板进行传送","", "&8◇ &c仅放置者可使用");

    public static ItemStack ELEVATOR = new CustomItem(new MaterialData(Material.STONE_PLATE), "&2电梯楼层定位装置", "", "&8◇ &7每个楼层都放置一个此种装置", "&8◇ &7随后可以在楼层之间传送", "", "&8-> &6右键 &7此装置命名楼层");

    public static ItemStack INFUSED_HOPPER = new CustomItem(new MaterialData(Material.HOPPER), "&5注魔漏斗", "", "&8◇ &7可自动拾起附近 &67x7x7 &7格范围的物品");

    public static ItemStack PLASTIC_SHEET = new CustomItem(new MaterialData(Material.PAPER), "&7塑料膜");
    public static ItemStack HEATED_PRESSURE_CHAMBER = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte) 8), "&c电热压缩机 &7- &6I", "", "&8◇ &7顶级用电设备", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &710 J/s");
    public static ItemStack HEATED_PRESSURE_CHAMBER_2 = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte) 8), "&c电热压缩机 &7- &6II", "", "&8◇ &7顶级用电设备", "&8\u21E8 &7速度: 5x", "&8\u21E8 &e\u26A1 &744 J/s");

    public static ItemStack ELECTRIC_SMELTERY = new CustomItem(new MaterialData(Material.FURNACE), "&c电热高炉 &7- &6I", "", "&8◇ &7仅可用于制造合金", "&8◇ &7不可用于将金属粉冶炼为金属锭", "", "&8◇ &7顶级用电设备", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &720 J/s");
    public static ItemStack ELECTRIC_SMELTERY_2 = new CustomItem(new MaterialData(Material.FURNACE), "&c电热高炉 &7- &6II", "", "&8◇ &7仅可用于制造合金", "&8◇ &7不可用于将金属粉冶炼为金属锭", "", "&8◇ &7顶级用电设备", "&8\u21E8 &7速度: 3x", "&8\u21E8 &e\u26A1 &740 J/s");

    public static ItemStack ELECTRIFIED_CRUCIBLE = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte) 14), "&c电热坩埚 &7- &6I", "", "&8◇ &7顶级用电设备", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &748 J/s");
    public static ItemStack ELECTRIFIED_CRUCIBLE_2 = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte) 14), "&c电热坩埚 &7- &6II", "", "&8◇ &7顶级用电设备", "&8\u21E8 &7速度: 2x", "&8\u21E8 &e\u26A1 &780 J/s");
    public static ItemStack ELECTRIFIED_CRUCIBLE_3 = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte) 14), "&c电热坩埚 &7- &6III", "", "&8◇ &7顶级用电设备", "&8\u21E8 &7速度: 4x", "&8\u21E8 &e\u26A1 &7120 J/s");

    public static ItemStack CARBON_PRESS = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte) 15), "&c碳压缩机 &7- &6I", "", "&8◇ &7顶级用电设备", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &720 J/s");
    public static ItemStack CARBON_PRESS_2 = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte) 15), "&c碳压缩机 &7- &6II", "", "&8◇ &7顶级用电设备", "&8\u21E8 &7速度: 3x", "&8\u21E8 &e\u26A1 &750 J/s");
    public static ItemStack CARBON_PRESS_3 = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte) 15), "&c碳压缩机 &7- &6III", "", "&8◇ &7顶级用电设备", "&8\u21E8 &7速度: 15x", "&8\u21E8 &e\u26A1 &7180 J/s");

    public static ItemStack BLISTERING_INGOT = new CustomItem(new MaterialData(Material.GOLD_INGOT), "&6裂变金属锭 &7(33%)", "", "&8◇ &7辐射等级: &c高", "&8◇ &7建议穿戴防化套装");
    public static ItemStack BLISTERING_INGOT_2 = new CustomItem(new MaterialData(Material.GOLD_INGOT), "&6裂变金属锭 &7(66%)", "", "&8◇ &7辐射等级: &c高", "&8◇ &7建议穿戴防化套装");
    public static ItemStack BLISTERING_INGOT_3 = new CustomItem(new MaterialData(Material.GOLD_INGOT), "&6裂变金属锭", "", "&8◇ &7辐射等级: &c高", "&8◇ &7建议穿戴防化套装");

    public static ItemStack ENERGY_REGULATOR = null;
    public static ItemStack DEBUG_FISH = new CustomItem(new MaterialData(Material.RAW_FISH), "&3How much is the Fish?", "", "&eRight Click &rany Block to view it's BlockData", "&eLeft Click &rto break a Block", "&eShift + Left Click &rany Block to erase it's BlockData", "&eShift + Right Click &rto place a Placeholder Block");


    public static ItemStack NETHER_ICE = null;
    public static ItemStack ENRICHED_NETHER_ICE = null;
    public static ItemStack NETHER_ICE_COOLANT_CELL = null;
    public static ItemStack NETHER_DRILL = new CustomItem(new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte) 14), "&c地狱钻头", "", "&8◇ &7可用于挖掘地狱玄冰", "", "&8◇ &7顶级用电设备", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &7102 J/s", "", "&8◇ &c仅可在地狱使用", "&8◇ &c使用前请先使用区块扫描装置"));

    // Cargo
    public static ItemStack CARGO_MANAGER = null;
    public static ItemStack CARGO_NODE = null;
    public static ItemStack CARGO_INPUT = null;
    public static ItemStack CARGO_OUTPUT = null;
    public static ItemStack CARGO_OUTPUT_ADVANCED = null;

    public static ItemStack AUTO_BREEDER = null;

    public static ItemStack ORGANIC_FOOD = null;
    public static ItemStack ORGANIC_FOOD2 = null;
    public static ItemStack ORGANIC_FOOD3 = null;
    public static ItemStack ORGANIC_FOOD4 = null;
    public static ItemStack ORGANIC_FOOD5 = null;
    public static ItemStack ORGANIC_FOOD6 = null;
    public static ItemStack ORGANIC_FOOD7 = null;
    public static ItemStack ORGANIC_FOOD8 = null;

    public static ItemStack FERTILIZER = null;
    public static ItemStack FERTILIZER2 = null;
    public static ItemStack FERTILIZER3 = null;
    public static ItemStack FERTILIZER4 = null;
    public static ItemStack FERTILIZER5 = null;
    public static ItemStack FERTILIZER6 = null;
    public static ItemStack FERTILIZER7 = null;
    public static ItemStack FERTILIZER8 = null;

    public static ItemStack ANIMAL_GROWTH_ACCELERATOR = null;
    public static ItemStack CROP_GROWTH_ACCELERATOR = null;
    public static ItemStack CROP_GROWTH_ACCELERATOR_2 = null;

    public static ItemStack FOOD_FABRICATOR = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte) 13), "&2有机食物制造机 &7- &6I", "", "&8◇ &7可用于制造有机食物", "", "&8◇ &7先进用电设备", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &7256 J &8(可储存的电能)", "&8\u21E8 &e\u26A1 &714 J/s");
    public static ItemStack FOOD_FABRICATOR_2 = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte) 13), "&2有机食物制造机 &7- &6II", "", "&8◇ &7可用于制造有机食物", "", "&8◇ &7顶级用电设备", "&8\u21E8 &7速度: 6x", "&8\u21E8 &e\u26A1 &7512 J &8(可储存的电能)", "&8\u21E8 &e\u26A1 &748 J/s");

    public static ItemStack FOOD_COMPOSTER = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte) 13), "&2有机肥料制造机 &7- &6I", "", "&8◇ &7可用于制造有机肥料", "", "&8◇ &7先进用电设备", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &7256 J &8(可储存的电能)", "&8\u21E8 &e\u26A1 &716 J/s");
    public static ItemStack FOOD_COMPOSTER_2 = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte) 13), "&2有机肥料制造机 &7- &6II", "", "&8◇ &7可用于制造有机肥料", "", "&8◇ &7顶级用电设备", "&8\u21E8 &7速度: 10x", "&8\u21E8 &e\u26A1 &7512 J &8(可储存的电能)", "&8\u21E8 &e\u26A1 &752 J/s");

    public static ItemStack XP_COLLECTOR = null;
    public static ItemStack REACTOR_COOLANT_CELL = null;

    public static ItemStack NUCLEAR_REACTOR = null;
    public static ItemStack NETHERSTAR_REACTOR = null;
    public static ItemStack REACTOR_ACCESS_PORT = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte) 9), "&2反应堆交互节点", "", "&8◇ &7可用于与反应堆交互", "&8◇ &7与物流节点连接后", "&8◇ &7也可作为物品暂存装置", "", "&8\u21E8 &6应当被放置于反应堆上方 &c3 &6格处");

    public static ItemStack FREEZER = null;
    public static ItemStack FREEZER_2 = null;

    public static ItemStack ELECTRIC_GOLD_PAN = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte) 12), "&6电动淘金盘 &7- &3I", "", "&8◇ &7初级用电设备", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &72 J/s");
    public static ItemStack ELECTRIC_GOLD_PAN_2 = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte) 12), "&6电动淘金盘 &7- &3II", "", "&8◇ &7初级用电设备", "&8\u21E8 &7速度: 3x", "&8\u21E8 &e\u26A1 &74 J/s");
    public static ItemStack ELECTRIC_GOLD_PAN_3 = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte) 12), "&6电动淘金盘 &7- &3III", "", "&8◇ &7顶级用电设备", "&8\u21E8 &7速度: 10x", "&8\u21E8 &e\u26A1 &714 J/s");

    public static ItemStack ELECTRIC_DUST_WASHER = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte) 11), "&6电动洗矿机 &7- &3I", "", "&8◇ &7初级用电设备", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &76 J/s");
    public static ItemStack ELECTRIC_DUST_WASHER_2 = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte) 11), "&6电动洗矿机 &7- &3II", "", "&8◇ &7初级用电设备", "&8\u21E8 &7速度: 2x", "&8\u21E8 &e\u26A1 &710 J/s");
    public static ItemStack ELECTRIC_DUST_WASHER_3 = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte) 11), "&6电动洗矿机 &7- &3III", "", "&8◇ &7顶级用电设备", "&8\u21E8 &7速度: 10x", "&8\u21E8 &e\u26A1 &730 J/s");

    public static ItemStack ELECTRIC_INGOT_FACTORY = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte) 14), "&c电力铸锭设备 &7- &3I", "", "&8◇ &7初级用电设备", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &78 J/s");
    public static ItemStack ELECTRIC_INGOT_FACTORY_2 = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte) 14), "&c电力铸锭设备 &7- &3II", "", "&8◇ &7初级用电设备", "&8\u21E8 &7速度: 2x", "&8\u21E8 &e\u26A1 &714 J/s");
    public static ItemStack ELECTRIC_INGOT_FACTORY_3 = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte) 14), "&c电力铸锭设备 &7- &3III", "", "&8◇ &7顶级用电设备", "&8\u21E8 &7速度: 8x", "&8\u21E8 &e\u26A1 &740 J/s");

    public static ItemStack AUTOMATED_CRAFTING_CHAMBER = new CustomItem(new MaterialData(Material.WORKBENCH), "&6自动合成台", "", "&8◇ &7先进用电设备", "&8\u21E8 &e\u26A1 &710 J/物品");
    public static ItemStack FLUID_PUMP = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte) 11), "&6水泵", "", "&8◇ &7先进用电设备", "&8\u21E8 &e\u26A1 &732 J/方块");
    public static ItemStack CHARGING_BENCH = new CustomItem(new MaterialData(Material.WORKBENCH), "&6充电工作台", "", "&8◇ &7可为喷气背包等用电设备充电", "", "&8◇ &7初级用电设备", "&8\u21E8 &e\u26A1 &7128 J &8(可储存的电能)", "&8\u21E8 &e\u26A1 &7能量损失: &c50%");

    public static ItemStack WITHER_ASSEMBLER = new CustomItem(new MaterialData(Material.OBSIDIAN), "&5凋零复制设备", "", "&8◇ &7顶级用电设备", "&8\u21E8 &7冷却: &b30 &7秒", "&8\u21E8 &e\u26A1 &74096 J &8(可储存的电能)", "&8\u21E8 &e\u26A1 &74096 J/凋零");

    public static ItemStack TRASH_CAN = null;

    public static ItemStack ELYTRA = new ItemStack(Material.ELYTRA);
    public static ItemStack ELYTRA_SCALE = new CustomItem(new ItemStack(Material.FEATHER), "&3鞘翅鳞片");
    public static ItemStack INFUSED_ELYTRA = new CustomItem(new CustomItem(ELYTRA, "&5注魔鞘翅"), new String[]{"MENDING-1"});
    public static ItemStack SOULBOUND_ELYTRA = new CustomItem(ELYTRA, "&c灵魂鞘翅");

    // ChestTerminal Addon

    public static ItemStack CHEST_TERMINAL = null;
    public static ItemStack CT_IMPORT_BUS = null;
    public static ItemStack CT_EXPORT_BUS = null;

    static {
        try {
            PORTABLE_DUSTBIN = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzJkNDEwNDJjZTk5MTQ3Y2MzOGNhYzllNDY3NDE1NzZlN2VlNzkxMjgzZTZmYWM4ZDMyOTJjYWUyOTM1ZjFmIn19fQ=="), "&6便携式垃圾桶", "&8◇ &7干脆利落地销毁物品", "", "&8-> &6右键 &7使用");
            TRASH_CAN = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzJkNDEwNDJjZTk5MTQ3Y2MzOGNhYzllNDY3NDE1NzZlN2VlNzkxMjgzZTZmYWM4ZDMyOTJjYWUyOTM1ZjFmIn19fQ=="), "&3垃圾桶", "", "&8◇ &7干脆利落地销毁物品");
            CAN = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTRkYTk3ZjA4MGUzOTViODQyYzRjYzgyYTg0MDgyM2Q0ZGJkOGNhNjg4YTIwNjg1M2U1NzgzZTRiZmRjMDEyIn19fQ=="), "&f锡罐");

            STONE_CHUNK = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2U4ZjVhZGIxNGQ2YzlmNmI4MTBkMDI3NTQzZjFhOGMxZjQxN2UyZmVkOTkzYzk3YmNkODljNzRmNWUyZTgifX19"), "&8石块");

            INFUSED_MAGNET = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWJhOGViYzRjNmE4MTczMDk0NzQ5OWJmN2UxZDVlNzNmZWQ2YzFiYjJjMDUxZTk2ZDM1ZWIxNmQyNDYxMGU3In19fQ=="), "&5注魔磁铁", "", "&8◇ &7放在背包里即可生效", "&8◇ &7自动吸附周围的物品", "", "&8-> &7按住 &6Shift &7捡起周围的物品");
            MAGNET = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWJhOGViYzRjNmE4MTczMDk0NzQ5OWJmN2UxZDVlNzNmZWQ2YzFiYjJjMDUxZTk2ZDM1ZWIxNmQyNDYxMGU3In19fQ=="), "&6磁铁");
            ELECTRO_MAGNET = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWJhOGViYzRjNmE4MTczMDk0NzQ5OWJmN2UxZDVlNzNmZWQ2YzFiYjJjMDUxZTk2ZDM1ZWIxNmQyNDYxMGU3In19fQ=="), "&3电磁铁");
            ELECTRIC_MOTOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGNiY2EwMTJmNjdlNTRkZTlhZWU3MmZmNDI0ZTA1NmMyYWU1OGRlNWVhY2M5NDlhYjJiY2Q5NjgzY2VjIn19fQ=="), "&c电动马达");
            CARGO_MOTOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGNiY2EwMTJmNjdlNTRkZTlhZWU3MmZmNDI0ZTA1NmMyYWU1OGRlNWVhY2M5NDlhYjJiY2Q5NjgzY2VjIn19fQ=="), "&3物流引擎");

            BACKPACK_SMALL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjYjFlNjdiNTEyYWIyZDRiZjNkN2FjZTBlYWFmNjFjMzJjZDQ2ODFkZGMzOTg3Y2ViMzI2NzA2YTMzZmEifX19"), "&2小型背包", new String[]{"", "&7容量: &69", "&7ID: <ID>", "", "&8-> &6右键 &7打开"});
            BACKPACK_MEDIUM = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjYjFlNjdiNTEyYWIyZDRiZjNkN2FjZTBlYWFmNjFjMzJjZDQ2ODFkZGMzOTg3Y2ViMzI2NzA2YTMzZmEifX19"), "&3中型背包", new String[]{"", "&7容量: &618", "&7ID: <ID>", "", "&8-> &6右键 &7打开"});
            BACKPACK_LARGE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjYjFlNjdiNTEyYWIyZDRiZjNkN2FjZTBlYWFmNjFjMzJjZDQ2ODFkZGMzOTg3Y2ViMzI2NzA2YTMzZmEifX19"), "&6大型背包", new String[]{"", "&7容量: &627", "&7ID: <ID>", "", "&8-> &6右键 &7打开"});
            WOVEN_BACKPACK = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjYjFlNjdiNTEyYWIyZDRiZjNkN2FjZTBlYWFmNjFjMzJjZDQ2ODFkZGMzOTg3Y2ViMzI2NzA2YTMzZmEifX19"), "&d尼龙背包", new String[]{"", "&7容量: &636", "&7ID: <ID>", "", "&8-> &6右键 &7打开"});
            GILDED_BACKPACK = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjYjFlNjdiNTEyYWIyZDRiZjNkN2FjZTBlYWFmNjFjMzJjZDQ2ODFkZGMzOTg3Y2ViMzI2NzA2YTMzZmEifX19"), "&5镀金背包", new String[]{"", "&7容量: &645", "&7ID: <ID>", "", "&8-> &6右键 &7打开"});
            BOUND_BACKPACK = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&c灵魂背包", new String[]{"", "&7容量: &636", "&7ID: <ID>", "", "&8-> &6右键 &7打开"});
            COOLER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDRjMTU3MjU4NGViNWRlMjI5ZGU5ZjVhNGY3NzlkMGFhY2JhZmZkMzNiY2IzM2ViNDUzNmE2YTJiYzZhMSJ9fX0="), "&3冰箱", new String[]{"&8◇ &7可用于存储果汁和冰沙", "&8◇ &7冰箱在你物品栏内时，冰箱内的食物会自动消耗", "&8◇ &7并为你回复饱食度", "", "&7容量: &627", "&7ID: <ID>", "", "&8-> &6右键 &7打开"});
            ENDER_BACKPACK = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&9末影背包", new String[]{"&8◇ &7便携式末影箱", "", "&8-> &6右键 &7打开"});

            VOIDBAG_SMALL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&2小型储物袋", new String[]{"", "&7容量: &69", "&7ID: <ID>", "", "&8-> &6左键 &7捡起附近的物品", "&8-> &6右键 &7打开"});
            VOIDBAG_MEDIUM = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&3中型储物袋", new String[]{"", "&7容量: &618", "&7ID: <ID>", "", "&8-> &6左键 &7捡起附近的物品", "&8-> &6右键 &7打开"});
            VOIDBAG_BIG = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&6大型储物袋", new String[]{"", "&7容量: &627", "&7ID: <ID>", "", "&8-> &6左键 &7捡起附近的物品", "&8-> &6右键 &7打开"});
            VOIDBAG_LARGE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&d巨型储物袋", new String[]{"", "&7容量: &636", "&7ID: <ID>", "", "&8-> &6左键 &7捡起附近的物品", "&8-> &6右键 &7打开"});
            BOUND_VOIDBAG = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ=="), "&c灵魂储物袋", new String[]{"", "&7容量: &636", "&7ID: <ID>", "", "&8-> &6左键 &7捡起附近的物品", "&8-> &6右键 &7打开"});

            COAL_GENERATOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM0M2NlNThkYTU0Yzc5OTI0YTJjOTMzMWNmYzQxN2ZlOGNjYmJlYTliZTQ1YTdhYzg1ODYwYTZjNzMwIn19fQ=="), "&c煤炭发电机", "", "&8◇ &7中级发电设备", "&8\u21E8 &e\u26A1 &764 J &8(可储存的电能)", "&8\u21E8 &e\u26A1 &716 J/s");
            LAVA_GENERATOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM0M2NlNThkYTU0Yzc5OTI0YTJjOTMzMWNmYzQxN2ZlOGNjYmJlYTliZTQ1YTdhYzg1ODYwYTZjNzMwIn19fQ=="), "&c岩浆发电机", "", "&8◇ &7中级发电设备", "&8\u21E8 &e\u26A1 &7512 J &8(可储存的电能)", "&8\u21E8 &e\u26A1 &720 J/s");
            COMBUSTION_REACTOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM0M2NlNThkYTU0Yzc5OTI0YTJjOTMzMWNmYzQxN2ZlOGNjYmJlYTliZTQ1YTdhYzg1ODYwYTZjNzMwIn19fQ=="), "&c火力发电机", "", "&8◇ &7先进发电设备", "&8\u21E8 &e\u26A1 &7256 J &8(可储存的电能)", "&8\u21E8 &e\u26A1 &724 J/s");

            NUCLEAR_REACTOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM0M2NlNThkYTU0Yzc5OTI0YTJjOTMzMWNmYzQxN2ZlOGNjYmJlYTliZTQ1YTdhYzg1ODYwYTZjNzMwIn19fQ=="), "&2核反应堆", "", "&8◇ &7以核燃料驱动的顶级反应堆", "&8\u21E8 &7需要使用水冷却", "&8\u21E8 &7需要使用反应堆冷却舱室冷却", "", "&8\u21E8 &e\u26A1 &716384 J &8(可储存的电能)", "&8\u21E8 &e\u26A1 &7500 J/s");
            NETHERSTAR_REACTOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM0M2NlNThkYTU0Yzc5OTI0YTJjOTMzMWNmYzQxN2ZlOGNjYmJlYTliZTQ1YTdhYzg1ODYwYTZjNzMwIn19fQ=="), "&9下界之星反应堆", "", "&8◇ &7以下界之星驱动的顶级反应堆", "&8\u21E8 &7需要使用水冷却", "&8\u21E8 &7需要使用地狱玄冰冷却舱室冷却", "", "&8\u21E8 &e\u26A1 &732768 J &8(可储存的电能)", "&8\u21E8 &e\u26A1 &71024 J/s", "&8\u21E8 &8◇ &c可能导致周围生物获得凋零效果");

            SMALL_CAPACITOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTEzNjFlNTc2YjQ5M2NiZmRmYWUzMjg2NjFjZWRkMWFkZDU1ZmFiNGU1ZWI0MThiOTJjZWJmNjI3NWY4YmI0In19fQ=="), "&2小型电容器", "", "&8\u21E8 &e\u26A1 &7128 J 电容量");
            MEDIUM_CAPACITOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTEzNjFlNTc2YjQ5M2NiZmRmYWUzMjg2NjFjZWRkMWFkZDU1ZmFiNGU1ZWI0MThiOTJjZWJmNjI3NWY4YmI0In19fQ=="), "&3中型电容器", "", "&8\u21E8 &e\u26A1 &7512 J 电容量");
            BIG_CAPACITOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTEzNjFlNTc2YjQ5M2NiZmRmYWUzMjg2NjFjZWRkMWFkZDU1ZmFiNGU1ZWI0MThiOTJjZWJmNjI3NWY4YmI0In19fQ=="), "&6大型电容器", "", "&8\u21E8 &e\u26A1 &71024 J 电容量");
            LARGE_CAPACITOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTEzNjFlNTc2YjQ5M2NiZmRmYWUzMjg2NjFjZWRkMWFkZDU1ZmFiNGU1ZWI0MThiOTJjZWJmNjI3NWY4YmI0In19fQ=="), "&d巨型电容器", "", "&8\u21E8 &e\u26A1 &78192 J 电容量");
            CARBONADO_EDGED_CAPACITOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTEzNjFlNTc2YjQ5M2NiZmRmYWUzMjg2NjFjZWRkMWFkZDU1ZmFiNGU1ZWI0MThiOTJjZWJmNjI3NWY4YmI0In19fQ=="), "&c碳纤维电容器", "", "&8\u21E8 &e\u26A1 &765536 J 电容量");
            CHEESE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzRmZWJiYzE1ZDFkNGNjNjJiZWRjNWQ3YTJiNmYwZjQ2Y2Q1YjA2OTZhODg0ZGU3NWUyODllMzVjYmI1M2EwIn19fQ=="), "&6芝士");
            BUTTER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjY2YjE5ZjdkNjM1ZDAzNDczODkxZGYzMzAxN2M1NDkzNjMyMDlhOGY2MzI4YTg1NDJjMjEzZDA4NTI1ZSJ9fX0="), "&6黄油");
            DUCT_TAPE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjJmYWFjZWFiNjM4NGZmZjVlZDI0YmI0NGE0YWYyZjU4NGViMTM4MjcyOWVjZDkzYTUzNjlhY2ZkNjY1NCJ9fX0="), "&8胶布", "", "&8◇ &7可在自动铁砧内作为原料修理物品");

            URANIUM = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzhiMjlhZmE2ZDZkYzkyM2UyZTEzMjRiZjgxOTI3NTBmN2JkYmRkYzY4OTYzMmEyYjZjMThkOWZlN2E1ZSJ9fX0="), "&2铀", "", "&8◇ &7辐射等级: &c高", "&8◇ &7建议穿戴防化套装");
            SMALL_URANIUM = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzhiMjlhZmE2ZDZkYzkyM2UyZTEzMjRiZjgxOTI3NTBmN2JkYmRkYzY4OTYzMmEyYjZjMThkOWZlN2E1ZSJ9fX0="), "&2块状铀", "", "&8◇ &7辐射等级: &6中", "&8◇ &7建议穿戴防化套装");
            TINY_URANIUM = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzhiMjlhZmE2ZDZkYzkyM2UyZTEzMjRiZjgxOTI3NTBmN2JkYmRkYzY4OTYzMmEyYjZjMThkOWZlN2E1ZSJ9fX0="), "&2粉末状铀", "", "&8◇ &7辐射等级: &2低", "&8◇ &7建议穿戴防化套装");

            NEPTUNIUM = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGVkZWE2YmZkMzdlNDlkZTQzZjE1NGZlNmZjYTYxN2Q0MTI5ZTYxYjk1NzU5YTNkNDlhMTU5MzVhMWMyZGNmMCJ9fX0="), "&c镎", "", "&8◇ &7辐射等级: &c高", "&8◇ &7建议穿戴防化套装");
            PLUTONIUM = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjVjZjkxYjczODg2NjVhNmQ3YzFiNjAyNmJkYjIzMjJjNmQyNzg5OTdhNDQ0Nzg2NzdjYmNjMTVmNzYxMjRmIn19fQ=="), "&f钚", "", "&8◇ &7辐射等级: &c高", "&8◇ &7建议穿戴防化套装");
            BOOSTED_URANIUM = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjgzN2NhMTJmMjIyZjQ3ODcxOTZhMTdiOGFiNjU2OTg1Zjg0MDRjNTA3NjdhZGJjYjZlN2YxNDI1NGZlZSJ9fX0="), "&2浓缩铀", "", "&8◇ &7辐射等级: &c高", "&8◇ &7建议穿戴防化套装");

            PROGRAMMABLE_ANDROID = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzUwM2NiN2VkODQ1ZTdhNTA3ZjU2OWFmYzY0N2M0N2FjNDgzNzcxNDY1YzlhNjc5YTU0NTk0Yzc2YWZiYSJ9fX0="), "&7可编程机器人 &7(&6普通&7)", "", "&8\u21E8 &7功能: 无", "&8\u21E8 &7燃料效率: 1.0x");
            PROGRAMMABLE_ANDROID_FARMER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjlkMzMzNTdlODQxODgyM2JmNzgzZGU5MmRlODAyOTFiNGViZDM5MmFlYzg3MDY2OThlMDY4OTZkNDk4ZjYifX19"), "&7可编程机器人 &7(&6种植用&7)", "", "&8\u21E8 &7功能: 种植作物", "&8\u21E8 &7燃料效率: 1.0x");
            PROGRAMMABLE_ANDROID_MINER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTYzOGEyODU0MWFiM2FlMGE3MjNkNTU3ODczOGUwODc1ODM4OGVjNGMzMzI0N2JkNGNhMTM0ODJhZWYzMzQifX19"), "&7可编程机器人 &7(&6采矿用&7)", "", "&8\u21E8 &7功能: 开采矿物", "&8\u21E8 &7燃料效率: 1.0x");
            PROGRAMMABLE_ANDROID_WOODCUTTER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDMyYTgxNDUxMDE0MjIwNTE2OWExYWQzMmYwYTc0NWYxOGU5Y2I2YzY2ZWU2NGVjYTJlNjViYWJkZWY5ZmYifX19"), "&7可编程机器人 &7(&6伐木用&7)", "", "&8\u21E8 &7功能: 伐木", "&8\u21E8 &7燃料效率: 1.0x");
            PROGRAMMABLE_ANDROID_BUTCHER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2I0NzJkZjBhZDlhM2JlODhmMmU1ZDVkNDIyZDAyYjExNmQ2NGQ4ZGYxNDc1ZWQzMmU1NDZhZmM4NGIzMSJ9fX0="), "&7可编程机器人 &7(&6屠宰用&7)", "", "&8\u21E8 &7功能: 屠宰动物", "&8\u21E8 &7伤害: 4", "&8\u21E8 &7燃料效率: 1.0x");
            PROGRAMMABLE_ANDROID_FISHERMAN = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzQ1ZTg3MzNhNzMxMTQzMzNiOThiMzYwMTc1MTI0MTcyMmY0NzEzZTFhMWE1ZDM2ZmJiMTMyNDkzZjFjNyJ9fX0="), "&7可编程机器人 &7(&6钓鱼用&7)", "", "&8\u21E8 &7功能: 钓鱼", "&8\u21E8 &7成功率: 10%", "&8\u21E8 &7燃料效率: 1.0x");

            PROGRAMMABLE_ANDROID_2 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzUwM2NiN2VkODQ1ZTdhNTA3ZjU2OWFmYzY0N2M0N2FjNDgzNzcxNDY1YzlhNjc5YTU0NTk0Yzc2YWZiYSJ9fX0="), "&7先进可编程机器人 &7(&6普通&7)", "", "&8\u21E8 &7功能: 无", "&8\u21E8 &7燃料效率: 1.5x");
            PROGRAMMABLE_ANDROID_2_FISHERMAN = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzQ1ZTg3MzNhNzMxMTQzMzNiOThiMzYwMTc1MTI0MTcyMmY0NzEzZTFhMWE1ZDM2ZmJiMTMyNDkzZjFjNyJ9fX0="), "&7先进可编程机器人 &7(&6钓鱼用&7)", "", "&8\u21E8 &7功能: 钓鱼", "&8\u21E8 &7成功率: 20%", "&8\u21E8 &7燃料效率: 1.5x");
            PROGRAMMABLE_ANDROID_2_FARMER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjlkMzMzNTdlODQxODgyM2JmNzgzZGU5MmRlODAyOTFiNGViZDM5MmFlYzg3MDY2OThlMDY4OTZkNDk4ZjYifX19"), "&7先进可编程机器人 &7(&6种植用&7)", "", "&8\u21E8 &7功能: 种植作物", "&8\u21E8 &7燃料效率: 1.5x", "&8\u21E8 &7可种植转基因作物");
            PROGRAMMABLE_ANDROID_2_BUTCHER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2I0NzJkZjBhZDlhM2JlODhmMmU1ZDVkNDIyZDAyYjExNmQ2NGQ4ZGYxNDc1ZWQzMmU1NDZhZmM4NGIzMSJ9fX0="), "&7先进可编程机器人 &7(&6屠宰用&7)", "", "&8\u21E8 &7功能: 屠宰动物", "&8\u21E8 &7伤害: 8", "&8\u21E8 &7燃料效率: 1.5x");

            PROGRAMMABLE_ANDROID_3 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzUwM2NiN2VkODQ1ZTdhNTA3ZjU2OWFmYzY0N2M0N2FjNDgzNzcxNDY1YzlhNjc5YTU0NTk0Yzc2YWZiYSJ9fX0="), "&7充能可编程机器人 &7(&6普通&7)", "", "&8\u21E8 &7功能: 无", "&8\u21E8 &7燃料效率: 3.0x");
            PROGRAMMABLE_ANDROID_3_FISHERMAN = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzQ1ZTg3MzNhNzMxMTQzMzNiOThiMzYwMTc1MTI0MTcyMmY0NzEzZTFhMWE1ZDM2ZmJiMTMyNDkzZjFjNyJ9fX0="), "&7充能可编程机器人 &7(&6钓鱼用&7)", "", "&8\u21E8 &7功能: 钓鱼", "&8\u21E8 &7成功率: 30%", "&8\u21E8 &7燃料效率: 8.0x");
            PROGRAMMABLE_ANDROID_3_BUTCHER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2I0NzJkZjBhZDlhM2JlODhmMmU1ZDVkNDIyZDAyYjExNmQ2NGQ4ZGYxNDc1ZWQzMmU1NDZhZmM4NGIzMSJ9fX0="), "&7充能可编程机器人 &7(&6屠宰用&7)", "", "&8\u21E8 &7功能: 屠宰动物", "&8\u21E8 &7伤害: 20", "&8\u21E8 &7燃料效率: 8.0x");

            GPS_TRANSMITTER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBjOWMxYTAyMmY0MGI3M2YxNGI0Y2JhMzdjNzE4YzZhNTMzZjNhMjg2NGI2NTM2ZDVmNDU2OTM0Y2MxZiJ9fX0="), "&8[&7GPS&8] &6传送器", "", "&8\u21E8 &e\u26A1 &716 J &8(可储存的电能)", "&8\u21E8 &e\u26A1 &72 J/s");
            GPS_TRANSMITTER_2 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBjOWMxYTAyMmY0MGI3M2YxNGI0Y2JhMzdjNzE4YzZhNTMzZjNhMjg2NGI2NTM2ZDVmNDU2OTM0Y2MxZiJ9fX0="), "&8[&7GPS&8] &6先进传送器", "", "&8\u21E8 &e\u26A1 &764 J &8(可储存的电能)", "&8\u21E8 &e\u26A1 &76 J/s");
            GPS_TRANSMITTER_3 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBjOWMxYTAyMmY0MGI3M2YxNGI0Y2JhMzdjNzE4YzZhNTMzZjNhMjg2NGI2NTM2ZDVmNDU2OTM0Y2MxZiJ9fX0="), "&8[&7GPS&8] &6碳纤维传送器", "", "&8\u21E8 &e\u26A1 &7256 J &8(可储存的电能)", "&8\u21E8 &e\u26A1 &722 J/s");
            GPS_TRANSMITTER_4 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBjOWMxYTAyMmY0MGI3M2YxNGI0Y2JhMzdjNzE4YzZhNTMzZjNhMjg2NGI2NTM2ZDVmNDU2OTM0Y2MxZiJ9fX0="), "&8[&7GPS&8] &6聚能传送器", "", "&8\u21E8 &e\u26A1 &71024 J &8(可储存的电能)", "&8\u21E8 &e\u26A1 &792 J/s");

            GPS_CONTROL_PANEL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGRjZmJhNThmYWYxZjY0ODQ3ODg0MTExODIyYjY0YWZhMjFkN2ZjNjJkNDQ4MWYxNGYzZjNiY2I2MzMwIn19fQ=="), "&8[&7GPS&8] &6控制中枢", "", "&8◇ &7可用于管理传送点");
            GPS_EMERGENCY_TRANSMITTER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBjOWMxYTAyMmY0MGI3M2YxNGI0Y2JhMzdjNzE4YzZhNTMzZjNhMjg2NGI2NTM2ZDVmNDU2OTM0Y2MxZiJ9fX0="), "&8[&7GPS&8] &c紧急传送点", "", "&8◇ &7携带此物品死亡时自动设定死亡点为传送点");

            GPS_GEO_SCANNER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmFkOGNmZWIzODdhNTZlM2U1YmNmODUzNDVkNmE0MTdiMjQyMjkzODg3ZGIzY2UzYmE5MWZhNDA5YjI1NGI4NiJ9fX0="), "&8[&7GPS&8] &6区块扫描装置", "", "&8◇ &7可用于扫描区块内的自然资源", "&8◇ &7比如&3原油");
            OIL_PUMP = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWZlMWEwNDBhNDI1ZTMxYTQ2ZDRmOWE5Yjk4MDZmYTJmMGM0N2VlODQ3MTFjYzE5MzJmZDhhYjMyYjJkMDM4In19fQ=="), "&7油泵", "", "&8◇ &7将原油泵出并灌装入油桶", "", "&8◇ &c使用前请先使用区块扫描装置扫描");
            BUCKET_OF_OIL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmNlMDRiNDFkMTllYzc5MjdmOTgyYTYzYTk0YTNkNzlmNzhlY2VjMzMzNjMwNTFmZGUwODMxYmZhYmRiZCJ9fX0="), "&8桶装原油");
            BUCKET_OF_FUEL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTg0ZGRjYTc2NjcyNWI4Yjk3NDEzZjI1OWMzZjc2NjgwNzBmNmFlNTU0ODNhOTBjOGU1NTI1Mzk0ZjljMDk5In19fQ=="), "&8桶装燃料");

            NETHER_ICE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2NlMmRhZDliYWY3ZWFiYTdlODBkNGQwZjlmYWMwYWFiMDFhNzZiMTJmYjcxYzNkMmFmMmExNmZkZDRjNzM4MyJ9fX0="), "&c地狱玄冰", "", "&8◇ &7辐射等级: &6中", "&8◇ &7建议穿戴防化套装");
            ENRICHED_NETHER_ICE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2M4MThhYTEzYWFiYzcyOTQ4MzhkMjFjYWFjMDU3ZTk3YmQ4Yzg5NjQxYTBjMGY4YTU1NDQyZmY0ZTI3In19fQ=="), "&c富集地狱玄冰", "", "&8◇ &7辐射等级: &c&l极高", "&8◇ &7建议穿戴防化套装");

            LAVA_CRYSTAL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTNhZDhlZTg0OWVkZjA0ZWQ5YTI2Y2EzMzQxZjYwMzNiZDc2ZGNjNDIzMWVkMWVhNjNiNzU2NTc1MWIyN2FjIn19fQ=="), "&c熔岩晶体");
            ANDROID_MEMORY_CORE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDc4ZjJiN2U1ZTc1NjM5ZWE3ZmI3OTZjMzVkMzY0YzRkZjI4YjQyNDNlNjZiNzYyNzdhYWRjZDYyNjEzMzcifX19"), "&2机器人存储核心");

            CARBON = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGIzYTA5NWI2YjgxZTZiOTg1M2ExOTMyNGVlZGYwYmI5MzQ5NDE3MjU4ZGQxNzNiOGVmZjg3YTA4N2FhIn19fQ=="), "&7碳");
            COMPRESSED_CARBON = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzIxZDQ5NTE2NTc0OGQzMTE2Zjk5ZDZiNWJkNWQ0MmViOGJhNTkyYmNkZmFkMzdmZDk1ZjliNmMwNGEzYiJ9fX0="), "&7压缩碳块");
            CARBON_CHUNK = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzIxZDQ5NTE2NTc0OGQzMTE2Zjk5ZDZiNWJkNWQ0MmViOGJhNTkyYmNkZmFkMzdmZDk1ZjliNmMwNGEzYiJ9fX0="), "&6高密度碳块");

            CARBONADO = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTJmNGIxNTc3ZjUxNjBjNjg5MzE3MjU3MWM0YTcxZDhiMzIxY2RjZWFhMDMyYzZlMGUzYjYwZTBiMzI4ZmEifX19"), "&3碳纤维晶体", "", "&8◇ &7黑色钻石");
            RAW_CARBONADO = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWI0OWU2ZWMxMDc3MWU4OTkyMjVhZWE3M2NkOGNmMDM2ODRmNDExZDE0MTVjNzMyM2M5M2NiOTQ3NjIzMCJ9fX0="), "&3碳纤维板材");

            ENERGY_REGULATOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDc4ZjJiN2U1ZTc1NjM5ZWE3ZmI3OTZjMzVkMzY0YzRkZjI4YjQyNDNlNjZiNzYyNzdhYWRjZDYyNjEzMzcifX19"), "&3电力传输装置", "", "&8◇ &7电力传输系统的核心组件");

            CARGO_MANAGER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTUxMGJjODUzNjJhMTMwYTZmZjlkOTFmZjExZDZmYTQ2ZDdkMTkxMmEzNDMxZjc1MTU1OGVmM2M0ZDljMiJ9fX0="), "&6物流运输装置", "", "&8◇ &7物流运输系统的核心组件");
            CARGO_NODE = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMDdiN2VmNmZkNzg2NDg2NWMzMWMxZGM4N2JlZDI0YWI1OTczNTc5ZjVjNjYzOGZlY2I4ZGVkZWI0NDNmZjAifX19"), "&7物流节点 &7(&6连接&7)", "", "&8◇ &7物流连接节点");
            CARGO_INPUT = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTZkMWMxYTY5YTNkZTlmZWM5NjJhNzdiZjNiMmUzNzZkZDI1Yzg3M2EzZDhmMTRmMWRkMzQ1ZGFlNGM0In19fQ=="), "&7物流节点 &7(&6输入&7)", "", "&8◇ &7物流输入节点");
            CARGO_OUTPUT = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTViMjFmZDQ4MGMxYzQzYmYzYjlmODQyYzg2OWJkYzNiYzVhY2MyNTk5YmYyZWI2YjhhMWM5NWRjZTk3OGYifX19"), "&7物流节点 &7(&6输出&7)", "", "&8◇ &7物流输出节点");
            CARGO_OUTPUT_ADVANCED = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTViMjFmZDQ4MGMxYzQzYmYzYjlmODQyYzg2OWJkYzNiYzVhY2MyNTk5YmYyZWI2YjhhMWM5NWRjZTk3OGYifX19"), "&7先进物流节点 &7(&6输出&7)", "", "&8◇ &7物流输出节点");

            AUTO_BREEDER = new CustomItem(new MaterialData(Material.HAY_BLOCK), "&2动物饲养机", "", "&8◇ &7以有机食物为原料", "", "&8◇ &7顶级用电设备", "&8\u21E8 &e\u26A1 &71024 J &8(可储存的电能)", "&8\u21E8 &e\u26A1 &760 J/动物");
            ANIMAL_GROWTH_ACCELERATOR = new CustomItem(new MaterialData(Material.HAY_BLOCK), "&2动物催熟机", "", "&8◇ &7以有机食物为原料", "", "&8◇ &7顶级用电设备", "&8\u21E8 &e\u26A1 &71024 J &8(可储存的电能)", "&8\u21E8 &e\u26A1 &728 J/s");
            CROP_GROWTH_ACCELERATOR = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte) 5), "&2作物催熟机 &7- &6I", "", "&8◇ &7以有机肥料为原料", "", "&8◇ &7顶级用电设备", "&8\u21E8 &7范围: &67x7", "&8\u21E8 &7速度: &a3/次", "&8\u21E8 &e\u26A1 &71024 J &8(可储存的电能)", "&8\u21E8 &e\u26A1 &750 J/s");
            CROP_GROWTH_ACCELERATOR_2 = new CustomItem(new MaterialData(Material.STAINED_CLAY, (byte) 5), "&2作物催熟机 &7- &6II", "", "&8◇ &7以有机肥料为原料", "", "&8◇ &7顶级用电设备", "&8\u21E8 &7范围: &69x9", "&8\u21E8 &7速度: &a4/次", "&8\u21E8 &e\u26A1 &71024 J &8(可储存的电能)", "&8\u21E8 &e\u26A1 &760 J/s");
            XP_COLLECTOR = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTc2MmExNWIwNDY5MmEyZTRiM2ZiMzY2M2JkNGI3ODQzNGRjZTE3MzJiOGViMWM3YTlmN2MwZmJmNmYifX19"), "&2经验收集器", "", "&8◇ &7自动吸收并存储附近的经验", "", "&8◇ &7顶级用电设备", "&8\u21E8 &e\u26A1 &71024 J &8(可储存的电能)", "&8\u21E8 &e\u26A1 &720 J/s");

            ORGANIC_FOOD = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&2有机食物", "&7成分: &9X");
            ORGANIC_FOOD2 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&2有机食物", "&7成分: &9小麦");
            ORGANIC_FOOD3 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&2有机食物", "&7成分: &9胡萝卜");
            ORGANIC_FOOD4 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&2有机食物", "&7成分: &9胡萝卜");
            ORGANIC_FOOD5 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&2有机食物", "&7成分: &9小麦种子");
            ORGANIC_FOOD6 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&2有机食物", "&7成分: &9甜菜根");
            ORGANIC_FOOD7 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&2有机食物", "&7成分: &9西瓜");
            ORGANIC_FOOD8 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&2有机食物", "&7成分: &9苹果");

            FERTILIZER = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&2有机肥料", "&7成分: &9X");
            FERTILIZER2 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&2有机肥料", "&7成分: &9小麦");
            FERTILIZER3 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&2有机肥料", "&7成分: &9胡萝卜");
            FERTILIZER4 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&2有机肥料", "&7成分: &9胡萝卜");
            FERTILIZER5 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&2有机肥料", "&7成分: &9小麦种子");
            FERTILIZER6 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&2有机肥料", "&7成分: &9甜菜根");
            FERTILIZER7 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&2有机肥料", "&7成分: &9西瓜");
            FERTILIZER8 = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&2有机肥料", "&7成分: &9苹果");

            NETHER_ICE_COOLANT_CELL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGQzY2Q0MTI1NTVmODk3MDE2MjEzZTVkNmM3NDMxYjQ0OGI5ZTU2NDRlMWIxOWVjNTFiNTMxNmYzNTg0MGUwIn19fQ=="), "&b地狱玄冰冷却元件");
            REACTOR_COOLANT_CELL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGU0MDczYmU0MGNiM2RlYjMxMGEwYmU5NTliNGNhYzY4ZTgyNTM3MjcyOGZhZmI2YzI5NzNlNGU3YzMzIn19fQ=="), "&b核反应堆冷却元件");

            CHEST_TERMINAL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2E0NGZmM2E1ZjQ5YzY5Y2FiNjc2YmFkOGQ5OGEwNjNmYTc4Y2ZhNjE5MTZmZGVmM2UyNjc1NTdmZWMxODI4MyJ9fX0="), "&3物流终端", "&7If this Block is connected to a", "&7Cargo Network, it will allow you to remotely", "&7interact with any Items supplied by", "&7Nodes tuned into the ChestTerminal Channel");
            CT_IMPORT_BUS = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTEzZGIyZTdlNzJlYTQ0MzJlZWZiZDZlNThhODVlYWEyNDIzZjgzZTY0MmNhNDFhYmM2YTkzMTc3NTdiODg5In19fQ=="), "&3物流输入终端", "&7If this Block is connected to a", "&7Cargo Network, it will pull any Items from", "&7the Inventory it is attached to and place it", "&7into the CT Network Channel");
            CT_EXPORT_BUS = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTEzZGIyZTdlNzJlYTQ0MzJlZWZiZDZlNThhODVlYWEyNDIzZjgzZTY0MmNhNDFhYmM2YTkzMTc3NTdiODg5In19fQ=="), "&3物流输出终端", "&7If this Block is connected to a", "&7Cargo Network, it will pull any Items from", "&7the CT Network Channel and place these", "&7into the Inventory it is attached to");

            FREEZER = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte) 3), "&3冷冻机 &7- &2I", "", "&8◇ &7先进用电设备", "&8\u21E8 &7速度: 1x", "&8\u21E8 &e\u26A1 &7256 J &8(可储存的电能)", "&8\u21E8 &e\u26A1 &718 J/s");
            FREEZER_2 = new CustomItem(new MaterialData(Material.STAINED_GLASS, (byte) 3), "&3冷冻机 &7- &2II", "", "&8◇ &7顶级用电设备", "&8\u21E8 &7速度: 2x", "&8\u21E8 &e\u26A1 &7256 J &8(可储存的电能)", "&8\u21E8 &e\u26A1 &730 J/s");

            BATTERY = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmUyZGRhNmVmNjE4NWQ0ZGQ2ZWE4Njg0ZTk3ZDM5YmE4YWIwMzdlMjVmNzVjZGVhNmJkMjlkZjhlYjM0ZWUifX19"), "&6电池");

            HEATING_COIL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2UzYmM0ODkzYmE0MWEzZjczZWUyODE3NGNkZjRmZWY2YjE0NWU0MWZlNmM4MmNiN2JlOGQ4ZTk3NzFhNSJ9fX0="), "&c电热管");
            COOLING_UNIT = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzU0YmFkODZjOTlkZjc4MGM4ODlhMTA5OGY3NzY0OGVhZDczODVjYzFkZGIwOTNkYTVhN2Q4YzRjMmFlNTRkIn19fQ=="), "&3冷却单元");
            POWER_CRYSTAL = new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTNjMWIwMzZiNmUwMzUxN2IyODVhODExYmQ4NWU3M2Y1YWJmZGFjYzFkZGY5MGRmZjk2MmUxODA5MzRlMyJ9fX0="), "&c能量水晶");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
