package alohacraft.kitpvp.main.commands;

import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;

import alohacraft.kitpvp.main.Util;
import alohacraft.kitpvp.main.managers.DataManager;


public class SetFSCmd extends BaseCmd {
	
	public SetFSCmd() {
		super(plugins);
		forcePlayer = true;
		cmdName = "setfs";
		argLength = 1;
		usage = "";
		desc = ":: Sets FastRespawn Location";
		noperm = "You do not have permission for /kitpvp " + cmdName;
	}

	@Override
	public boolean run() {
		DataManager datam = DataManager.getInstance();
		Location l = player.getLocation();
		FileConfiguration con = datam.getConfig();
		con.set("fs.world", l.getWorld().getName());
		con.set("fs.x", l.getX());
		con.set("fs.y", l.getY());
		con.set("fs.z", l.getZ());
		datam.saveConfig();
		datam.reloadConfig();
		Util.notify(player, "You have set the Fast Respawn Location!");
		return true;
	}

}
