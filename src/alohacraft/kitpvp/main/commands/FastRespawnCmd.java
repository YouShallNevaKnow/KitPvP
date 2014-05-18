package alohacraft.kitpvp.main.commands;

import java.util.ArrayList;

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
		ArrayList<String> frs = Main.getFRS();
		String pn = player.getName();
		if (frs.contains(pn)) {
			frs.remove(pn);
			Util.error(player, "Fast Respawn has been Disabled!");
			return true;
		} else {
			frs.add(pn);
			Util.notify(player, "Fast Respawn has been Enabled!");
			return true;
		}
	}
}
