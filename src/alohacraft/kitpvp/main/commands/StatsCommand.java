package alohacraft.kitpvp.main.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import alohacraft.kitpvp.main.Main;

public class StatsCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if ((cmd.getName().equalsIgnoreCase("stats")) && (args.length == 0)) {
			Player player = (Player) sender;
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
		return false;
	}
	private double getKD(Player player) {
		if (Main.getKills().get(player.getUniqueId().toString()) == 0) {
			return 0;
		} else {
			if (Main.getDeaths().get(player.getUniqueId().toString()) != 0) {
				return Main.getKills().get(player.getUniqueId().toString()) / (Main.getDeaths().get(player.getUniqueId().toString()));
			} else {
				return Main.getKills().get(player.getUniqueId().toString());
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
