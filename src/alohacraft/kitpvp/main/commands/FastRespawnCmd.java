package alohacraft.kitpvp.main.commands;

import alohacraft.kitpvp.main.Main;
import alohacraft.kitpvp.main.Util;

public class FastRespawnCmd extends BaseCmd {
	
	public FastRespawnCmd() {
		super(plugins);
		forcePlayer = true;
		cmdName = "fastrespawn";
		argLength = 1;
		usage = "";
		desc = ":: Toggles Fast Respawn!";
		noperm = "You do not have permission for /kitpvp " + cmdName;
	}

	@Override
	public boolean run() {
		if (Main.getFRS().contains(player.getName())) {
			Main.getFRS().remove(player.getName());
			Util.error(player, "Fast Respawn has been Disabled!");
			return true;
		} else {
			Main.getFRS().add(player.getName());
			Util.notify(player, "Fast Respawn has been Enabled!");
			return true;
		}
	}
}
