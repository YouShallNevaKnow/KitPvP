package alohacraft.kitpvp.main.commands;

import alohacraft.kitpvp.main.Main;
import alohacraft.kitpvp.main.Util;

public class DataFixCmd extends BaseCmd {
	
	public DataFixCmd() {
		super(plugins);
		forcePlayer = true;
		cmdName = "datafix";
		argLength = 1;
		usage = "";
		desc = ":: Fixes Corrupted Data";
		noperm = "You do not have permission for /kitpvp " + cmdName;
	}

	@Override
	public boolean run() {
		for (String pp: Main.getKitExp().keySet()) {
			if ((Main.getKitExp().get(pp) >= 0) && (Main.getKitExp().get(pp) < 100)) {
				Main.getKitLevel().put(pp, 1);
			} else if ((Main.getKitExp().get(pp) >= 100) && (Main.getKitExp().get(pp) < 250)) {
				Main.getKitLevel().put(pp, 2);
			} else if ((Main.getKitExp().get(pp) >= 250) && (Main.getKitExp().get(pp) < 500)) {
				Main.getKitLevel().put(pp, 3);
			} else if ((Main.getKitExp().get(pp) >= 500) && (Main.getKitExp().get(pp) < 1000)) {
				Main.getKitLevel().put(pp, 4);
			} else if (Main.getKitExp().get(pp) >= 1000) {
				Main.getKitLevel().put(pp, 5);
			}
		}
		Util.notify(player, "Data Updated!");
		return true;
	}
}
