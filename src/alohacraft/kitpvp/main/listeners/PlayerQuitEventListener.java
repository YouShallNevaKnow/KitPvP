package alohacraft.kitpvp.main.listeners;

import java.util.HashMap;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import alohacraft.kitpvp.main.Main;
import alohacraft.kitpvp.main.managers.DataManager;

public class PlayerQuitEventListener implements Listener {
	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent e) {
		Player player = (Player) e.getPlayer();
		String name = player.getName();
		DataManager datam = DataManager.getInstance();
		FileConfiguration data = datam.getDataFile();
		String id = player.getUniqueId().toString();
		String kit = Main.getKit().get(id);
		String kitlvl = Main.getKitLevel().get(id).toString();
		String kitexp = Main.getKitExp().get(id).toString();
		String kills = Main.getKills().get(id).toString();
		String deaths = Main.getDeaths().get(id).toString();
		String teammate2 = Main.getTeams().get(name);
		String teammate1 = Main.getTeams().get(teammate2);
		HashMap<String, String> teams = Main.getTeams();
		data.set("players." + id, kit + ":" + kitlvl + ":" + kitexp + ":" + kills + ":" + deaths);
		datam.saveDataFile();
		if (kit != null) {
			Main.getKit().remove(id);
			Main.getKitLevel().remove(id);
			Main.getKitExp().remove(id);
			Main.getKills().remove(id);
			Main.getDeaths().remove(id);
		}
		if (teammate2 != null) {
			teams.remove(teammate1);
			teams.remove(teammate2);
		}
	}
}
