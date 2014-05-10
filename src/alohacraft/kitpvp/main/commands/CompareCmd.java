package alohacraft.kitpvp.main.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import alohacraft.kitpvp.main.Main;
import alohacraft.kitpvp.main.Util;


public class CompareCmd extends BaseCmd {
	
	public CompareCmd() {
		super(plugins);
		forcePlayer = true;
		cmdName = "compare";
		argLength = 2;
		usage = "<player>";
		desc = ":: Compare Stats!";
		noperm = "You do not have permission for /kitpvp " + cmdName;
	}

	@Override
	public boolean run() {
		String t = args[1];
		String p = player.getUniqueId().toString();
		Player tar = (Player) Bukkit.getServer().getPlayer(t);
		String target = tar.getUniqueId().toString();
		if (Main.getKitLevel().containsKey(target)) {
			player.sendMessage(ChatColor.DARK_GRAY + "-----------------------[" + ChatColor.GREEN + "" + ChatColor.BOLD +"Stats" + ChatColor.DARK_GRAY + "]-----------------------");
			player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.GREEN + "Key: " + ChatColor.YELLOW + "Yellow = You" + ChatColor.GRAY + " : " + ChatColor.RED + "Red = " + target);
			player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.GREEN + "Kit Level: " + ChatColor.YELLOW + Main.getKitLevel().get(player.getName()) + ChatColor.GRAY + " : " + ChatColor.RED + Main.getKitLevel().get(target));
			player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.GREEN + "Kit Exp: " + ChatColor.YELLOW + Main.getKitExp().get(p) + "/" + getTotalNeeded(player) + ChatColor.GRAY + " : " + ChatColor.RED + Main.getKitExp().get(target) + "/" + getTotalNeeded(tar));
			player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.GREEN + "Score: " + ChatColor.YELLOW + (Main.getKills().get(p) - Main.getDeaths().get(p)) + ChatColor.GRAY + " : " + ChatColor.RED + (Main.getKills().get(target) - Main.getDeaths().get(target))); 
			player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.GREEN + "K/D: " + ChatColor.YELLOW + getKD(p) + ChatColor.GRAY + " : " + ChatColor.RED + getKD(target));
			player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.GREEN + "Kills: " + ChatColor.YELLOW + Main.getKills().get(p) + ChatColor.GRAY + " : " + ChatColor.RED + Main.getKills().get(target));
			player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.GREEN + "Deaths: " + ChatColor.YELLOW + Main.getDeaths().get(p) + ChatColor.GRAY + " : " + ChatColor.RED + Main.getDeaths().get(target));
			player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.GREEN + "Money: " + ChatColor.YELLOW + "$" + Main.economy.getBalance(p) + ChatColor.GRAY + " : " + ChatColor.RED + "$" + Main.economy.getBalance(target));
			player.sendMessage(ChatColor.DARK_GRAY + "-----------------------------------------------------");
			return true;
		} else {
			Util.error(player, "That player does not exist!");
			return true;
		}
	}
	private double getKD(String player) {
		if (Main.getKills().get(player) == 0) {
			return 0;
		} else {
			if (Main.getDeaths().get(player) != 0) {
				return Main.getKills().get(player) / (Main.getDeaths().get(player));
			} else {
				return Main.getKills().get(player);
			}
		}
	}
	private int getTotalNeeded(Player player) {
		int level = Main.getKitLevel().get(player.getUniqueId().toString());
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
