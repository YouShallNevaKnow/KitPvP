package alohacraft.kitpvp.main.threads;

import alohacraft.kitpvp.main.Main;
import alohacraft.kitpvp.main.managers.DataManager;

public class SaveThread implements Runnable {	
	public void run() {
		try {
			DataManager datam = DataManager.getInstance();
			for (String id : Main.getKit().keySet()) {
				String kit = Main.getKit().get(id);
				String kitlvl = Main.getKitLevel().get(id).toString();
				String kitexp = Main.getKitExp().get(id).toString();
				String kills = Main.getKills().get(id).toString();
				String deaths = Main.getDeaths().get(id).toString();
				datam.getDataFile().set("players." + id, kit + ":" + kitlvl + ":" + kitexp + ":" + kills + ":" + deaths);
			}
			datam.saveDataFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
