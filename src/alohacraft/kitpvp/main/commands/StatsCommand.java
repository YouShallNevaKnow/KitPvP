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
			String pn = player.getName();
			String uuid = player.getUniqueId().toString();
			Integer kills = Main.getKills().get(uuid);
			Integer deaths = Main.getDeaths().get(uuid);
			Integer kitlvl = Main.getKitLevel().get(uuid);
			player.sendMessage(ChatColor.DARK_GRAY + "-----------------------[" + ChatColor.GREEN + "" + ChatColor.BOLD +"Stats" + ChatColor.DARK_GRAY + "]-----------------------");
			player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.GREEN + "Kit Level: " + ChatColor.GRAY + kitlvl);
			player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.GREEN + "Kit Exp: " + ChatColor.GRAY + Main.getKitExp().get(uuid) + "/" + getTotalNeeded(player, kitlvl));
			player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.GREEN + "Score: " + ChatColor.GRAY + (kills - deaths));
			player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.GREEN + "K/D: " + ChatColor.GRAY + getKD(player, kills, deaths));
			player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.GREEN + "Kills: " + ChatColor.GRAY + kills);
			player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.GREEN + "Deaths: " + ChatColor.GRAY + deaths);
			player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.GREEN + "Money: " + ChatColor.GRAY + "$" + Main.economy.getBalance(pn));
			player.sendMessage(ChatColor.DARK_GRAY + "-----------------------------------------------------");
			return true;
		}
		return false;
	}
	private double getKD(Player player, int kills, int deaths) {
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
	private int getTotalNeeded(Player player, int kitlvl) {
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
