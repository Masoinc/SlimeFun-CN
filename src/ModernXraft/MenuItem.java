package ModernXraft;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

/**
 * Mason Project
 * 2017-6-28-0028
 */
public class MenuItem extends ItemStack {

    public MenuItem(Material type, String name, int amount, int durability, String action) {
        super(type, amount);
        ItemMeta im = getItemMeta();
        im.setDisplayName(ChatColor.translateAlternateColorCodes('&', name));
        List<String> lore = new ArrayList<String>();
        lore.add("");
        lore.add(ChatColor.GREEN + "§8-> §7点击以" + action);
        im.setLore(lore);
        setItemMeta(im);
        setDurability((short) durability);
    }

    public MenuItem(Material type, String name, int durability, String action) {
        super(type);
        ItemMeta im = getItemMeta();
        im.setDisplayName(ChatColor.translateAlternateColorCodes('&', name));
        List<String> lore = new ArrayList<String>();
        lore.add("");
        lore.add(ChatColor.GREEN + "§8-> §7点击以" + action);
        im.setLore(lore);
        setItemMeta(im);
        setDurability((short) durability);
    }

}