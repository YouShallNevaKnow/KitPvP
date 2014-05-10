package alohacraft.kitpvp.main.commands;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import alohacraft.kitpvp.main.Main;


public class StatsCmd extends BaseCmd {
	
	public StatsCmd() {
		super(plugins);
		forcePlayer = true;
		cmdName = "stats";
		argLength = 1;
		usage = "";
		desc = ":: Prints your current stats!";
		noperm = "You do not have permission for /kitpvp " + cmdName;
	}

	@Override
	public boolean run() {
		String p = player.getUniqueId().toString();
		player.sendMessage(ChatColor.DARK_GRAY + "-----------------------[" + ChatColor.GREEN + "" + ChatColor.BOLD +"Stats" + ChatColor.DARK_GRAY + "]-----------------------");
		player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.GREEN + "Kit Level: " + ChatColor.GRAY + Main.getKitLevel().get(p));
		player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.GREEN + "Kit Exp: " + ChatColor.GRAY + Main.getKitExp().get(p) + "/" + getTotalNeeded(player));
		player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.GREEN + "Score: " + ChatColor.GRAY + (Main.getKills().get(p) - Main.getDeaths().get(p)));
		player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.GREEN + "K/D: " + ChatColor.GRAY + getKD(player));
		player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.GREEN + "Kills: " + ChatColor.GRAY + Main.getKills().get(p));
		player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.GREEN + "Deaths: " + ChatColor.GRAY + Main.getDeaths().get(p));
		player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.GREEN + "Money: " + ChatColor.GRAY + "$" + Main.economy.getBalance(p));
		player.sendMessage(ChatColor.DARK_GRAY + "-----------------------------------------------------");
		return true;
	}
	private double getKD(Player player) {
		if (Main.getKills().get(player.getName()) == 0) {
			return 0;
		} else {
			if (Main.getDeaths().get(player.getName()) != 0) {
				return Main.getKills().get(player.getName()) / (Main.getDeaths().get(player.getName()));
			} else {
				return Main.getKills().get(player.getName());
			}
		}
	}
	private int getTotalNeeded(Player player) {
		int level = Main.getKitLevel().get(player.getName());
		switch (level) {
		case 1:
			return 100;
		case 2:
			return 250;
		case 3:
			return 500;
		case 4:
			return 1000;
		default:
			return 0;
		}
	}
}
