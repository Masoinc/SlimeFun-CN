package me.mrCookieSlime.Slimefun.Lists;

import ModernXraft.MenuItem;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomArmor;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;

import me.mrCookieSlime.CSCoreLibPlugin.general.World.CustomSkull;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.LockedCategory;
import me.mrCookieSlime.Slimefun.Objects.SeasonCategory;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;

/**
 * Built-in categories.
 *
 * @author TheBusyBiscuit
 * @see Category
 * @since 4.0
 */
public class Categories {
    //粘液主菜单-非头颅
    public static Category WEAPONS = new Category(new MenuItem(Material.GOLD_SWORD, "&8[ &6武器 &8]", 0, "§7开启"), 1);
    public static Category PORTABLE = null;
    public static Category FOOD = new Category(new MenuItem(Material.APPLE, "&8[ &6食物 &8]", 0, "§7开启"), 2);
    public static Category MACHINES_1 = null;
    public static LockedCategory ELECTRICITY = null;
    public static LockedCategory GPS = null;
    public static Category ARMOR = new Category(new MenuItem(Material.IRON_CHESTPLATE, "&8[ &6护甲 &8]", 0, "§7开启"), 2);
    public static Category LUMPS_AND_MAGIC = new Category(new MenuItem(Material.FIREBALL, "&8[ &6魔法原料 &8]", 0, "§7开启"), 2);
    public static Category MAGIC = new Category(new MenuItem(Material.BLAZE_POWDER, "&8[ &6魔法工具 &8]", 0, "§7开启"), 3);
    public static Category MISC = null;

    public static Category TECH = new Category(new CustomArmor(new MenuItem(Material.LEATHER_CHESTPLATE, "&8[ &6科技工具 &8]", 0, "§7开启"), Color.SILVER), 3);
    public static Category RESOURCES = null;
    public static Category CARGO = null;
    public static Category TECH_MISC = new Category(new MenuItem(Material.REDSTONE_COMPARATOR, "&8[ &6科技零件 &8]", 0, "§7开启"), 2);
    public static Category MAGIC_ARMOR = new Category(new MenuItem(Material.GOLD_CHESTPLATE, "&8[ &6科技护甲 &8]", 0, "§7开启"), 2);
    public static Category TALISMANS_1 = new Category(new MenuItem(Material.EMERALD, "&8[ &7护身符-&2I&7级 &8]", 0, "§7开启"), 2);

    public static LockedCategory TALISMANS_2 = new LockedCategory(new MenuItem(Material.EMERALD, "&8[ &7护身符-&3II&7级 &8]", 0, "§7开启"), 3, TALISMANS_1);
    public static Category TOOLS = new Category(new MenuItem(Material.GOLD_PICKAXE, "&8[ &6工具 &8]", 0, "§7开启"), 1);
    public static SeasonCategory CHRISTMAS = new SeasonCategory(12, 1, new MenuItem(Material.NETHER_STAR, "&8[ &a圣&c诞&a节 &8]", 0, ChatColor.translateAlternateColorCodes('&', "&chelp &aSanta")));
    public static SeasonCategory VALENTINES_DAY = new SeasonCategory(2, 2, new MenuItem(Material.RED_ROSE, "&8[ &d情人节 &8]", 0, ChatColor.translateAlternateColorCodes('&', "&c烧死情侣")));
    public static SeasonCategory EASTER = new SeasonCategory(1, 2, new MenuItem(Material.EGG, "&8[ &6复活节 &8]", 0, ChatColor.translateAlternateColorCodes('&', "&a制作复活节彩蛋(?)")));
    public static SeasonCategory BIRTHDAY = new SeasonCategory(10, 1, new MenuItem(Material.FIREWORK, "&8[ &6Mr.Cookie&7的生日 &8]", 0, ChatColor.translateAlternateColorCodes('&', "&a庆祝一下")));

    //菜单-头颅
    static {
        try {
            MISC = new Category(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTRkYTk3ZjA4MGUzOTViODQyYzRjYzgyYTg0MDgyM2Q0ZGJkOGNhNjg4YTIwNjg1M2U1NzgzZTRiZmRjMDEyIn19fQ=="), "&8[ &6食物与农业 &8]", "", "&8-> &7点击以开启"), 2);
            PORTABLE = new Category(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjYjFlNjdiNTEyYWIyZDRiZjNkN2FjZTBlYWFmNjFjMzJjZDQ2ODFkZGMzOTg3Y2ViMzI2NzA2YTMzZmEifX19"), "&8[ &6便携工具 &8]", "", "&8-> &7点击以开启"), 1);
            MACHINES_1 = new Category(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM0M2NlNThkYTU0Yzc5OTI0YTJjOTMzMWNmYzQxN2ZlOGNjYmJlYTliZTQ1YTdhYzg1ODYwYTZjNzMwIn19fQ=="), "&8[ &6基础机械 &8]", "", "&8-> &7点击以开启"), 1);
            ELECTRICITY = new LockedCategory(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTU4NDQzMmFmNmYzODIxNjcxMjAyNThkMWVlZThjODdjNmU3NWQ5ZTQ3OWU3YjBkNGM3YjZhZDQ4Y2ZlZWYifX19"), "&8[ &6电器与电力传输 &8]", "", "&8-> &7点击以开启"), 4, MACHINES_1);
            GPS = new LockedCategory(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBjOWMxYTAyMmY0MGI3M2YxNGI0Y2JhMzdjNzE4YzZhNTMzZjNhMjg2NGI2NTM2ZDVmNDU2OTM0Y2MxZiJ9fX0="), "&8[ &6GPS相关 &8]", "", "&8-> &7点击以开启"), 4, MACHINES_1);
            RESOURCES = new Category(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2U4ZjVhZGIxNGQ2YzlmNmI4MTBkMDI3NTQzZjFhOGMxZjQxN2UyZmVkOTkzYzk3YmNkODljNzRmNWUyZTgifX19"), "&8[ &6矿物与原材料 &8]", "", "&8-> &7点击以开启"), 1);
            CARGO = new LockedCategory(new CustomItem(CustomSkull.getItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTUxMGJjODUzNjJhMTMwYTZmZjlkOTFmZjExZDZmYTQ2ZDdkMTkxMmEzNDMxZjc1MTU1OGVmM2M0ZDljMiJ9fX0="), "&8[ &6物流运输 &8]", "", "&8-> &7点击以开启"), 4, MACHINES_1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
