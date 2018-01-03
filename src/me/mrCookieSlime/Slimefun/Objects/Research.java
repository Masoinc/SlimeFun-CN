package me.mrCookieSlime.Slimefun.Objects;

import java.io.File;
import java.util.*;

import api.praya.myitems.main.MyItemsAPI;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Variable;
import me.mrCookieSlime.CSCoreLibPlugin.general.Particles.FireworkShow;
import me.mrCookieSlime.Slimefun.SlimefunStartup;
import me.mrCookieSlime.Slimefun.Events.ResearchUnlockEvent;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.Setup.Messages;
import me.mrCookieSlime.Slimefun.Setup.ResearchSetup;
import me.mrCookieSlime.Slimefun.api.Slimefun;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Sound;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

// 包含粘液物品Research的各种方法

/**
 * Statically handles researches. Represents a research, which is bound to one
 * {@link SlimefunItem} or more and require XP levels to unlock this/these item(s).
 * <p>
 * See {@link Research()} to create a research.
 * <p>
 * See {@link ResearchSetup} for the built-in researches.
 *
 * @author TheBusyBiscuit
 * @since 4.0
 */
public class Research {
    /**
     * Whether researching is enabled or not;
     *
     * @since 4.0
     */
    public static boolean enabled;
    /**
     * Contains all the registered researches;
     *
     * @see ResearchSetup
     * @since 4.0
     */
    public static List<Research> list = new ArrayList<Research>();
    /**
     * Contains all the players (UUIDs) that are currently unlocking a research.
     *
     * @since 4.0
     */
    public static List<UUID> researching = new ArrayList<UUID>();
    /**
     * Whether researching in creative is free.
     *
     * @since 4.0
     */
    public static boolean creative_research = true;

    private int id;
    private String name;
    private List<SlimefunItem> items;
    private int cost;
    private int cost_money;
    private int cost_blueprint_a;
    private int cost_blueprint_b;

    /**
     * The constructor for a Research.
     * <p>
     * Create a new research by calling , then
     * bind this research to the Slimefun items you want by calling
     * {@link #addItems(SlimefunItem...)}. Once you're finished, call {@link #register()}
     * to register it.
     * <p>
     * To speed up, directly setup the research by calling
     * {@link Slimefun#registerResearch(Research, org.bukkit.inventory.ItemStack...)}.
     *
     * @param id   Unique integer ID for this research, used for {@link #getByID(int)} and to
     *             register it in Researches.yml
     * @param name Display name of the research
     * @param args Costs: XP, Money, Blueprint_a, Blueprint_b
     * @since 4.0
     */
    public Research(int id, String name, int... args) {
        this.id = id;
        this.name = name;
        this.items = new ArrayList<SlimefunItem>();


        switch (args.length) {
            // 仅花费经验
            case 1:
                this.cost = args[0];
                this.cost_money = 0;
                this.cost_blueprint_a = 0;
                this.cost_blueprint_b = 0;
                break;
            case 2:
                this.cost = args[0];
                this.cost_money = args[1];
                this.cost_blueprint_a = 0;
                this.cost_blueprint_b = 0;
                break;
            case 3:
                this.cost = args[0];
                this.cost_money = args[1];
                this.cost_blueprint_a = args[2];
                this.cost_blueprint_b = 0;
                break;
            case 4:
                this.cost = args[0];
                this.cost_money = args[1];
                this.cost_blueprint_a = args[2];
                this.cost_blueprint_b = args[3];
                break;
        }
    }


    /**
     * Gets the ID of the research.
     *
     * @return ID of the research
     * @since 4.0
     */
    public int getID() {
        return id;
    }

    /**
     * Gets the display name of the research.
     *
     * @return The display name of the research
     * @since 4.0
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the cost in XP levels to unlock the research.
     *
     * @return The cost in XP levels of the research
     * @since 4.0
     * @deprecated Moved to {@link #getCost()}
     */
    @Deprecated
    public int getLevel() {
        return cost;
    }

    /**
     * Sets the cost in XP levels to unlock the research.
     *
     * @param level Cost in XP levels
     * @since 4.0
     * @deprecated Moved to {@link #setCost(int)}
     */
    @Deprecated
    public void setLevel(int level) {
        this.cost = level;
    }

    /**
     * Gets the cost in XP levels to unlock the research.
     *
     * @return The cost in XP levels of the research
     * @since 4.1.10
     */
    public int getCost_blueprint_a() {
        return cost_blueprint_a;
    }

    public int getCost_blueprint_b() {
        return cost_blueprint_b;
    }

    public int getCost_money() {
        return cost_money;
    }

    /**
     * Sets the cost in XP levels to unlock the research.
     *
     * @since 4.1.10
     */
    public int getCost() {
        return cost;
    }

    /**
     * Sets the cost in XP levels to unlock the research.
     *
     * @param cost Cost in XP levels
     * @since 4.1.10
     */
    public void setCost(int cost) {
        this.cost = cost;
    }

    /**
     * Bind the specified Slimefun items to the research.
     *
     * @param items {@link SlimefunItem} to bind to the research
     * @since 4.0
     */
    public void addItems(SlimefunItem... items) {
        for (SlimefunItem item : items) {
            if (item != null) item.bindToResearch(this);
        }
    }

    /**
     * Gets the list of the Slimefun items bound to the research.
     *
     * @return the Slimefun items bound to the research
     * @since 4.0
     */
    public List<SlimefunItem> getEffectedItems() {
        return items;
    }

    /**
     * Convenience method to check if the player unlocked this research.
     *
     * @param p Player to check
     * @return true if he unlocked the research, otherwise false
     * @see #hasUnlocked(UUID)
     * @since 4.0
     */
    public boolean hasUnlocked(Player p) {
        return hasUnlocked(p.getUniqueId());
    }

    /**
     * Checks if the player unlocked this research.
     *
     * @param uuid UUID of the player to check
     * @return true if he unlocked the research, otherwise false
     * @see #hasUnlocked(Player)
     * @since 4.0
     */
    public boolean hasUnlocked(UUID uuid) {
        if (!enabled) return true;
        if (!SlimefunStartup.getResearchCfg().getBoolean(this.id + ".enabled")) return true;
        return new Config(new File("data-storage/Slimefun/Players/" + uuid.toString() + ".yml")).contains("researches." + this.id);
    }

    /**
     * Checks if the player can unlock this research.
     *
     * @param p Player to check
     * @return true if he can unlock the research, otherwise false
     * @since 4.1.10
     */
    public boolean canUnlock(Player p) {
        if (!enabled) return true;
        if (!SlimefunStartup.getResearchCfg().getBoolean(this.id + ".enabled")) return true;
        if (p.getGameMode() == GameMode.CREATIVE && creative_research) return true;

        MyItemsAPI mapi = MyItemsAPI.getInstance();
        ItemStack bp_a = mapi.getGameManagerAPI().getItemManagerAPI().getItem("sf1");
        ItemStack bp_b = mapi.getGameManagerAPI().getItemManagerAPI().getItem("sf2");
        return (p.getLevel() >= this.cost
                && SlimefunStartup.getEconomy().getBalance(p) >= this.cost_money
                && p.getInventory().containsAtLeast(bp_a, this.cost_blueprint_a)
                && p.getInventory().containsAtLeast(bp_b, this.cost_blueprint_b));

    }

    /**
     * Checks if the player can unlock this research.
     *
     * @param p Player to check
     * @return 3 if XP is not enough, 4 if money is not enough
     * @since 4.1.10
     */
    public int canUnlockCondition(Player p) {
        if (p.getLevel() < this.cost) return 3;
        if (SlimefunStartup.getEconomy().getBalance(p) < this.cost_money) return 4;

        MyItemsAPI mapi = MyItemsAPI.getInstance();
        ItemStack bp_a = mapi.getGameManagerAPI().getItemManagerAPI().getItem("sf1");
        ItemStack bp_b = mapi.getGameManagerAPI().getItemManagerAPI().getItem("sf2");

        if (!p.getInventory().containsAtLeast(bp_a, this.cost_blueprint_a)) return 5;
        if (!p.getInventory().containsAtLeast(bp_b, this.cost_blueprint_b)) return 6;
        return 0;
    }

    /**
     * Locks the research for the specified player.
     *
     * @param p Player to lock the research
     * @since 4.0
     */
    public void lock(Player p) {
        Config cfg = new Config(new File("data-storage/Slimefun/Players/" + p.getUniqueId() + ".yml"));
        cfg.setValue("researches." + id, null);
        cfg.save();
        Messages.local.sendTranslation(p, "commands.research.reset-target", true);
    }

    /**
     * Unlocks the research for the specified player.
     *
     * @param p       Player to unlock the research
     * @param instant Whether to unlock the research instantly
     * @since 4.0
     */
    public void unlock(final Player p, boolean instant) {
        if (!hasUnlocked(p)) {
            ResearchUnlockEvent event = new ResearchUnlockEvent(p, this);
            Bukkit.getPluginManager().callEvent(event);
            if (!event.isCancelled()) {
                final int research = this.id;
                if (instant) {
                    Config cfg = new Config(new File("data-storage/Slimefun/Players/" + p.getUniqueId() + ".yml"));
                    cfg.setValue("researches." + research, true);
                    cfg.save();
                    Messages.local.sendTranslation(p, "messages.unlocked", true, new Variable("%research%", getName()));
                    if (SlimefunStartup.getCfg().getBoolean("options.research-give-fireworks"))
                        FireworkShow.launchRandom(p, 1);
                } else if (!researching.contains(p.getUniqueId())) {
                    researching.add(p.getUniqueId());
                    Messages.local.sendTranslation(p, "messages.research.start", true, new Variable("%research%", getName()));
                    Bukkit.getScheduler().scheduleSyncDelayedTask(SlimefunStartup.instance, new Runnable() {

                        @Override
                        public void run() {
                            p.playSound(p.getLocation(), Sound.ENTITY_BAT_TAKEOFF, 0.7F, 1F);
                            Messages.local.sendTranslation(p, "messages.research.progress", true, new Variable("%research%", getName()), new Variable("%progress%", "23%"));
                            Bukkit.getScheduler().scheduleSyncDelayedTask(SlimefunStartup.instance, new Runnable() {

                                @Override
                                public void run() {
                                    p.playSound(p.getLocation(), Sound.ENTITY_BAT_TAKEOFF, 0.7F, 1F);
                                    Messages.local.sendTranslation(p, "messages.research.progress", true, new Variable("%research%", getName()), new Variable("%progress%", "44%"));
                                    Bukkit.getScheduler().scheduleSyncDelayedTask(SlimefunStartup.instance, new Runnable() {

                                        @Override
                                        public void run() {
                                            p.playSound(p.getLocation(), Sound.ENTITY_BAT_TAKEOFF, 0.7F, 1F);
                                            Messages.local.sendTranslation(p, "messages.research.progress", true, new Variable("%research%", getName()), new Variable("%progress%", "57%"));
                                            Bukkit.getScheduler().scheduleSyncDelayedTask(SlimefunStartup.instance, new Runnable() {

                                                @Override
                                                public void run() {
                                                    p.playSound(p.getLocation(), Sound.ENTITY_BAT_TAKEOFF, 0.7F, 1F);
                                                    Messages.local.sendTranslation(p, "messages.research.progress", true, new Variable("%research%", getName()), new Variable("%progress%", "92%"));
                                                    Bukkit.getScheduler().scheduleSyncDelayedTask(SlimefunStartup.instance, new Runnable() {

                                                        @Override
                                                        public void run() {
                                                            Config cfg = new Config(new File("data-storage/Slimefun/Players/" + p.getUniqueId() + ".yml"));
                                                            cfg.setValue("researches." + research, true);
                                                            cfg.save();
                                                            Messages.local.sendTranslation(p, "messages.unlocked", true, new Variable("%research%", getName()));
                                                            if (SlimefunStartup.getCfg().getBoolean("options.research-unlock-fireworks"))
                                                                FireworkShow.launchRandom(p, 1);
                                                            researching.remove(p.getUniqueId());
                                                        }
                                                    }, 20L);
                                                }
                                            }, 20L);
                                        }
                                    }, 20L);
                                }
                            }, 20L);
                        }
                    }, 20L);
                }
            }
        }
    }

    /**
     * Registers the research.
     *
     * @since 4.0
     */
    public void register() {
        SlimefunStartup.getResearchCfg().setDefaultValue("enable-researching", true);

        if (SlimefunStartup.getResearchCfg().contains(this.getID() + ".enabled") && !SlimefunStartup.getResearchCfg().getBoolean(this.getID() + ".enabled")) {
            Iterator<SlimefunItem> iterator = items.iterator();
            while (iterator.hasNext()) {
                SlimefunItem item = iterator.next();
                if (item != null) item.bindToResearch(null);
                iterator.remove();
            }
            return;
        }

        SlimefunStartup.getResearchCfg().setDefaultValue(this.getID() + ".name", this.getName());
        SlimefunStartup.getResearchCfg().setDefaultValue(this.getID() + ".cost", this.getCost());
        SlimefunStartup.getResearchCfg().setDefaultValue(this.getID() + ".cost_money", this.getCost_money());
        SlimefunStartup.getResearchCfg().setDefaultValue(this.getID() + ".cost_blueprint_a", this.getCost_blueprint_a());
        SlimefunStartup.getResearchCfg().setDefaultValue(this.getID() + ".cost_blueprint_b", this.getCost_blueprint_b());
        SlimefunStartup.getResearchCfg().setDefaultValue(this.getID() + ".enabled", true);

        this.name = SlimefunStartup.getResearchCfg().getString(this.getID() + ".name");
        this.cost = SlimefunStartup.getResearchCfg().getInt(this.getID() + ".cost");

        list.add(this);
        if (SlimefunStartup.getCfg().getBoolean("options.print-out-loading"))
            System.out.println("[Slimefun] Loaded Research \"" + this.getName() + "\"");
    }

    /**
     * Gets the list of all registered researches.
     *
     * @return The list of registered researches
     * @see ResearchSetup
     * @since 4.0
     */
    public static List<Research> list() {
        return list;
    }

    /**
     * Gets if the specified player is currently unlocking a research.
     *
     * @param p Player to check
     * @return true if the player is unlocking a research, otherwise false
     * @since 4.0
     */
    public static boolean isResearching(Player p) {
        return researching.contains(p.getUniqueId());
    }

    /**
     * Sends the research statistics and title of the specified player to the command sender.
     *
     * @param sender CommandSender to send the statistics
     * @param p      Player to get the statistics
     * @see #getTitle(Player, List)
     * @since 4.0
     */
    public static void sendStats(CommandSender sender, Player p) {
        List<Research> researched = new ArrayList<Research>();
        int levels = 0;
        for (Research r : list()) {
            if (r.hasUnlocked(p)) {
                researched.add(r);
                levels = levels + r.getLevel();
            }
        }
        String progress = String.valueOf(Math.round(((researched.size() * 100.0f) / list().size()) * 100.0f) / 100.0f);
        if (Float.parseFloat(progress) < 16.0F) progress = "&4" + progress + " &r% ";
        else if (Float.parseFloat(progress) < 32.0F) progress = "&c" + progress + " &r% ";
        else if (Float.parseFloat(progress) < 48.0F) progress = "&6" + progress + " &r% ";
        else if (Float.parseFloat(progress) < 64.0F) progress = "&e" + progress + " &r% ";
        else if (Float.parseFloat(progress) < 80.0F) progress = "&2" + progress + " &r% ";
        else progress = "&a" + progress + " &r% ";

        sender.sendMessage("");
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Statistics for Player: &b" + p.getName()));
        sender.sendMessage("");
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Title: &b" + getTitle(p, researched)));
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Research Progress: " + progress + "&e(" + researched.size() + " / " + list().size() + ")"));
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Total XP Levels spent: &b" + levels));
    }

    /**
     * Gets the title of the specified player.
     *
     * @param p          Player to get the rank
     * @param researched List of the player's unlocked researches
     * @return the title of the specified player
     * @see #sendStats(CommandSender, Player)
     * @since 4.0
     */
    public static String getTitle(Player p, List<Research> researched) {
        int index = Math.round(Float.valueOf(String.valueOf(Math.round(((researched.size() * 100.0f) / list().size()) * 100.0f) / 100.0f)) / 100.0F) * SlimefunStartup.getCfg().getStringList("research-ranks").size();
        if (index > 0) index--;
        return SlimefunStartup.getCfg().getStringList("research-ranks").get(index);
    }

    /**
     * Attempts to get the research with the given ID.
     *
     * @param id ID of the research to get
     * @return Research if found, or null
     * @since 4.0
     */
    public static Research getByID(int id) {
        for (Research research : list) {
            if (research.getID() == id) return research;
        }
        return null;
    }

    /**
     * Gets the list of unlocked researches for a player using his UUID.
     *
     * @param uuid UUID of the player
     * @return the list of unlocked researches for the player
     * @see #getResearches(String)
     * @since 4.0
     */
    public static List<Research> getResearches(UUID uuid) {
        List<Research> researched = new ArrayList<Research>();
        for (Research r : list()) {
            if (r.hasUnlocked(uuid)) researched.add(r);
        }
        return researched;
    }

    /**
     * Convenience method to get the list of unlocked researches
     * for a player using his UUID (specified as a String).
     *
     * @param uuid String representing the UUID of the player
     * @return the list of unlocked researches for the player
     * @see #getResearches(UUID)
     * @since 4.0
     */
    public static List<Research> getResearches(String uuid) {
        return getResearches(UUID.fromString(uuid));
    }

    public String[] getResearchLore() {
        List<String> lores = new ArrayList<>();
        lores.add("&8[ &4&l已锁定 &8]");
        lores.add("");
        lores.add("&8> &6点击以解锁");
        lores.add("");
        lores.add("&8◇ &7消耗: &6" + this.cost + " &7级经验");
        if (getCost_money() != 0) {
            lores.add("&8◇ &7消耗: &3" + this.cost_money + " &7黑币");
        }
        if (getCost_blueprint_a() != 0) {
            lores.add("&8◇ &7消耗: &8[ §8[§2通用§8] §6科技蓝图 &8] &7x &6" + this.cost_blueprint_a);
        }
        if (getCost_blueprint_b() != 0) {
            lores.add("&8◇ &7消耗: &8[ §8[§d核心§8] §6科技蓝图 &8] &7x &6" + this.cost_blueprint_b);
        }
        lores.add("");
        lores.add("&8[ModernSky] research");
        String[] lore = new String[lores.size()];
        for (int i =0; i<lores.size(); i++) {
            lore[i] = lores.get(i);
        }
        return lore;
    }
}