package alohacraft.kitpvp.main.commands;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import alohacraft.kitpvp.main.Main;


public class StatsCmd extends BaseCmd {
	String uuid = player.getUniqueId().toString();
	Integer kills = Main.getKills().get(uuid);
	Integer deaths = Main.getDeaths().get(uuid);
	Integer kitlvl = Main.getKitLevel().get(uuid);
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
		String pn = player.getName();
		player.sendMessage(ChatColor.DARK_GRAY + "-----------------------[" + ChatColor.GREEN + "" + ChatColor.BOLD +"Stats" + ChatColor.DARK_GRAY + "]-----------------------");
		player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.GREEN + "Kit Level: " + ChatColor.GRAY + kitlvl);
		player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.GREEN + "Kit Exp: " + ChatColor.GRAY + Main.getKitExp().get(uuid) + "/" + getTotalNeeded(player));
		player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.GREEN + "Score: " + ChatColor.GRAY + (kills - deaths));
		player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.GREEN + "K/D: " + ChatColor.GRAY + getKD(player));
		player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.GREEN + "Kills: " + ChatColor.GRAY + kills);
		player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.GREEN + "Deaths: " + ChatColor.GRAY + deaths);
		player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.GREEN + "Money: " + ChatColor.GRAY + "$" + Main.economy.getBalance(pn));
		player.sendMessage(ChatColor.DARK_GRAY + "-----------------------------------------------------");
		return true;
	}
	private double getKD(Player player) {
		if (kills == 0) {
			return 0;
		} else {
			if (deaths != 0) {
				return (kills/deaths);
			} else {
				return kills;
			}
		}
	}
	private int getTotalNeeded(Player player) {
		int level = kitlvl;
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
