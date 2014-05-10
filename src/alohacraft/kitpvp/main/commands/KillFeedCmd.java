package alohacraft.kitpvp.main.commands;

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
		if (Main.getKillfeed().contains(player.getName())) {
			Main.getKillfeed().remove(player.getName());
			Util.error(player, "KillFeed has been Disabled!");
			return true;
		} else {
			Main.getKillfeed().add(player.getName());
			Util.notify(player, "KillFeed has been Enabled!");
			return true;
		}
	}
}
