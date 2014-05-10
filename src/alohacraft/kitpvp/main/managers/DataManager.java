package alohacraft.kitpvp.main.managers;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import alohacraft.kitpvp.main.Main;


public class DataManager {
	private DataManager() {}
	static DataManager instance = new DataManager();
	public static DataManager getInstance() {
		return instance;
	}
	Plugin p;
	FileConfiguration config;
	File con;
	FileConfiguration playerdata;
	File pdata;

	public void setup(Main p) {
		con = new File(p.getDataFolder(), "config.yml");
		config = p.getConfig();
		if (!p.getDataFolder().exists()) {
			p.getDataFolder().mkdir();
		}	
		pdata = new File(p.getDataFolder(), "playerdata.yml");

		if (!pdata.exists()) {
			try {
				pdata.createNewFile();
			}
			catch (IOException e) {
				Bukkit.getServer().getLogger().severe(ChatColor.RED + "Could not create playerdata.yml!");
			}
		}

		playerdata = YamlConfiguration.loadConfiguration(pdata);
	}
	//PLAYER DATA METHODS
	public FileConfiguration getPlayerData() {
		return playerdata;
	}
	public void savePlayerData() {
		try {
			playerdata.save(pdata);
		}
		catch (IOException e) {
			Bukkit.getServer().getLogger().severe(ChatColor.RED + "Could not save playerdata.yml!");
		}
	}
	public void reloadPlayerData() {
		playerdata = YamlConfiguration.loadConfiguration(pdata);
	}
	//Get the name!
	public void loadData() {
		List<String> s = playerdata.getStringList("players");
		for (String str : s) {
			String[] words = str.split(":");
			Main.getKit().put(words[0], words[1]);
			Main.getKitLevel().put(words[0], Integer.parseInt(words[2]));
			Main.getKills().put(words[0], Integer.parseInt(words[3]));
			Main.getDeaths().put(words[0], Integer.parseInt(words[4]));
			Main.getKitExp().put(words[0], Integer.parseInt(words[5]));
		}
	}
	//I never got the name
	//Can't do those for's
	public void saveData() {
		List<String> s = playerdata.getStringList("players");
		for (String id : Main.getKit().keySet()) {
			s.add(id + ":" + Main.getKit().get(id) + ":" + Main.getKitLevel().get(id).toString() + ":" + Main.getKills().get(id).toString() + ":" + Main.getDeaths().get(id).toString() + ":" + Main.getKitExp().get(id).toString());
		}
		playerdata.set("players", s);
		savePlayerData();
	}
	public FileConfiguration getConfig() {
		return config;
	}

	public void saveConfig() {
		try {
			config.save(con);
		}
		catch (IOException e) {
			Bukkit.getServer().getLogger().severe(ChatColor.RED + "Could not save config.yml!");
		}
	}

	public void reloadConfig() {
		config = YamlConfiguration.loadConfiguration(con);
	}

	public PluginDescriptionFile getDesc() {
		return p.getDescription();
	}
}
