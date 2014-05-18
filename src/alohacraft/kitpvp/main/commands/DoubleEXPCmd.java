package alohacraft.kitpvp.main.commands;

import alohacraft.kitpvp.main.Main;
import alohacraft.kitpvp.main.Util;

public class DoubleEXPCmd extends BaseCmd {
	
	public DoubleEXPCmd() {
		super(plugins);
		forcePlayer = false;
		cmdName = "doubleexp";
		argLength = 1;
		usage = "";
		desc = ":: Enables or Disables Double EXP!";
		noperm = "You do not have permission for /kitpvp " + cmdName;
	}

	@Override
	public boolean run() {
		Boolean doubleexp = Main.getSettings().get("DoubleEXP");
		if(doubleexp != true) {
			Util.snotify(sender, "You have enabled Double EXP!");
			Util.broadcast("Double EXP is Enabled!");
			Main.getSettings().put("DoubleEXP", true);
			return true;
		} else {
			Util.serror(sender, "You have disabled Double EXP!");
			Util.broadcast("Double EXP is now Disabled!!");
			Main.getSettings().put("DoubleEXP", true);
			return true;
		}
	}
}
