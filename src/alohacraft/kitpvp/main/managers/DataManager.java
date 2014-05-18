package alohacraft.kitpvp.main.managers;

import java.io.File;
import java.io.IOException;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import alohacraft.kitpvp.main.Main;
import alohacraft.kitpvp.main.threads.SaveThread;


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
	public FileConfiguration getDataFile() {
		return playerdata;
	}
	public void saveDataFile() {
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
	public void saveAllData() {
		Thread save = new Thread(new SaveThread());
		save.start();
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
