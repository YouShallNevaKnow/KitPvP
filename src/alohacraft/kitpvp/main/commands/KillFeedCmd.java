package alohacraft.kitpvp.main.commands;

import java.util.ArrayList;

import alohacraft.kitpvp.main.Main;
import alohacraft.kitpvp.main.Util;

public class KillFeedCmd extends BaseCmd {
	
	public KillFeedCmd() {
		super(plugins);
		forcePlayer = true;
		cmdName = "killfeed";
		argLength = 1;
		usage = "";
		desc = ":: Toggles KillFeed!";
		noperm = "You do not have permission for /kitpvp " + cmdName;
	}

	@Override
	public boolean run() {
		ArrayList<String> kf = Main.getKillfeed();
		String pn = player.getName();
		if (kf.contains(pn)) {
			kf.remove(pn);
			Util.error(player, "KillFeed has been Disabled!");
			return true;
		} else {
			kf.add(pn);
			Util.notify(player, "KillFeed has been Enabled!");
			return true;
		}
	}
}
