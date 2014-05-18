package alohacraft.kitpvp.main;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.permission.Permission;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;
import alohacraft.kitpvp.main.commands.StatsCommand;
import alohacraft.kitpvp.main.listeners.EntityDamageByEntityEventListener;
import alohacraft.kitpvp.main.listeners.PlayerInteractEventListener;
import alohacraft.kitpvp.main.listeners.PlayerDeathEventListener;
import alohacraft.kitpvp.main.listeners.FeatureListeners;
import alohacraft.kitpvp.main.listeners.PlayerJoinEventListener;
import alohacraft.kitpvp.main.listeners.PlayerRespawnEventListener;
import alohacraft.kitpvp.main.listeners.SignChangeEventListener;
import alohacraft.kitpvp.main.managers.CommandManager;
import alohacraft.kitpvp.main.managers.DataManager;

public class Main extends JavaPlugin {
	private static Plugin plugin;
	private static HashMap<String, Boolean> settings = new HashMap<String, Boolean>();
	private static HashMap<String, String> kit = new HashMap<String, String>();
	private static HashMap<String, String> teams = new HashMap<String, String>();
	private static HashMap<String, Integer> kitlevel = new HashMap<String, Integer>();
	private static HashMap<String, Integer> ksc = new HashMap<String, Integer>();
	private static HashMap<String, Integer> kitexp = new HashMap<String, Integer>();
	private static HashMap<String, Integer> kills = new HashMap<String, Integer>();
	private static HashMap<String, Integer> deaths = new HashMap<String, Integer>();
	private static ArrayList<String> killfeed = new ArrayList<String>();
	private static ArrayList<String> frs = new ArrayList<String>();
	DataManager datam = DataManager.getInstance();
	public static Economy economy = null;
	public static Permission permission = null;

	@Override
	public void onEnable() {
		Util.log("has been Enabled!");
		plugin = this;
		PluginManager pm = Bukkit.getServer().getPluginManager();
		pm.registerEvents(new SignChangeEventListener(), this);
		pm.registerEvents(new PlayerInteractEventListener(this), this);
		pm.registerEvents(new PlayerRespawnEventListener(this), this);
		pm.registerEvents(new PlayerDeathEventListener(), this);
		pm.registerEvents(new EntityDamageByEntityEventListener(), this);
		pm.registerEvents(new FeatureListeners(), this);
		pm.registerEvents(new PlayerJoinEventListener(), this);
		if (!new File(this.getDataFolder(), "config.yml").exists()) {
			this.saveDefaultConfig();
		}
		datam.setup(this);
		setupEconomy();
		setupPermissions();
		getCommand("kitpvp").setExecutor(new CommandManager(this));
		getCommand("stats").setExecutor(new StatsCommand());
		autoSave();
		settings.put("DoubleEXP", false);
	}
	@Override
	public void onDisable() {
		Util.log("has been Disabled!");
		datam.saveAllData();
		plugin = null;
		kit.clear();
		teams.clear();
		kitlevel.clear();
		ksc.clear();
		kitexp.clear();
		kills.clear();
		deaths.clear();
		killfeed.clear();
		frs.clear();
	}
	public void autoSave() {
		getServer().getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
			public void run() {
				Bukkit.getServer().broadcastMessage(Util.pn + ChatColor.DARK_RED + "Saving KitPvP Data! May lag for a bit!");
				datam.saveAllData();
				Bukkit.getServer().broadcastMessage(Util.pn + ChatColor.RED + "Done! :D");
			}
		}, 0, 1000 * 20);
	}
	public static Plugin getPlugin() {
		return plugin;
	}
	private boolean setupEconomy() {
		RegisteredServiceProvider<Economy> economyProvider = getServer().getServicesManager().getRegistration(net.milkbowl.vault.economy.Economy.class);
		if (economyProvider != null) {
			economy = economyProvider.getProvider();
		}
		return (economy != null);
	}
	private boolean setupPermissions()
	{
		RegisteredServiceProvider<Permission> permissionProvider = getServer().getServicesManager().getRegistration(net.milkbowl.vault.permission.Permission.class);
		if (permissionProvider != null) {
			permission = permissionProvider.getProvider();
		}
		return (permission != null);
	}
	public static ArrayList<String> getFRS() {
		return frs;
	}
	public static ArrayList<String> getKillfeed() {
		return killfeed;
	}
	public static HashMap<String, Boolean> getSettings() {
		return settings;
	}
	public static HashMap<String, String> getKit() {
		return kit;
	}
	public static HashMap<String, String> getTeams() {
		return teams;
	}
	public static HashMap<String, Integer> getKitLevel() {
		return kitlevel;
	}
	public static HashMap<String, Integer> getKSC() {
		return ksc;
	}
	public static HashMap<String, Integer> getKitExp() {
		return kitexp;
	}
	public static HashMap<String, Integer> getKills() {
		return kills;
	}
	public static HashMap<String, Integer> getDeaths() {
		return deaths;
	}
}
