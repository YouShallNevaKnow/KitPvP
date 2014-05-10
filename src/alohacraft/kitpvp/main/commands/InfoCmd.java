package alohacraft.kitpvp.main.commands;

import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginDescriptionFile;
import alohacraft.kitpvp.main.Main;

public class InfoCmd extends BaseCmd {
	
	public InfoCmd(Main plugins) {
		super(plugins);
		forcePlayer = true;
		cmdName = "info";
		argLength = 1;
		usage = "";
		desc = ":: Displays Info about KitPvP!";
		noperm = "You do not have permission for /kitpvp " + cmdName;
	}

	@Override
	public boolean run() {
		PluginDescriptionFile pdf = plugins.getDescription();
		player.sendMessage(ChatColor.DARK_GRAY + "-----------------------[" + ChatColor.GREEN + ChatColor.BOLD + "KitPvP" + ChatColor.DARK_GRAY + "]----------------------");
		player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.GREEN + "Author: " + ChatColor.GRAY + "zRA1Nz");
		player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.GREEN + "Version: " + ChatColor.GRAY + pdf.getVersion());
		player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.GREEN + "Players Online: " + ChatColor.GRAY + plugins.getServer().getOnlinePlayers().length + "/" + plugins.getServer().getMaxPlayers());
		player.sendMessage(ChatColor.DARK_GRAY + "-----------------------------------------------------");
		return true;
	}

}
