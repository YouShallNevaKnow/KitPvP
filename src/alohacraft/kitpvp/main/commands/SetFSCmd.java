package alohacraft.kitpvp.main.commands;

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
		datam.getConfig().set("fs.world", player.getLocation().getWorld().getName());
		datam.getConfig().set("fs.x", player.getLocation().getX());
		datam.getConfig().set("fs.y", player.getLocation().getY());
		datam.getConfig().set("fs.z", player.getLocation().getZ());
		datam.saveConfig();
		datam.reloadConfig();
		Util.notify(player, "You have set the Fast Respawn Location!");
		return true;
	}

}
