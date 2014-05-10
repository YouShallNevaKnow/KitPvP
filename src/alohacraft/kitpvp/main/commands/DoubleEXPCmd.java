package alohacraft.kitpvp.main.commands;

import alohacraft.kitpvp.main.Util;
import alohacraft.kitpvp.main.managers.DataManager;


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
		DataManager datam = DataManager.getInstance();
		if(datam.getConfig().getBoolean("DoubleEXP") == false) {
			Util.snotify(sender, "You have enabled Double EXP!");
			Util.broadcast("Double EXP is Enabled!");
			datam.getConfig().set("DoubleEXP", true);
			datam.saveConfig();
			datam.reloadConfig();
			return true;
		} else {
			Util.serror(sender, "You have disabled Double EXP!");
			Util.broadcast("Double EXP is now Disabled!!");
			datam.getConfig().set("DoubleEXP", false);
			datam.saveConfig();
			datam.reloadConfig();
			return true;
		}
	}
}
