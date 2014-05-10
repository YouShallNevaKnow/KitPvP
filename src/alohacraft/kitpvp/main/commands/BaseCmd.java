package alohacraft.kitpvp.main.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import alohacraft.kitpvp.main.Main;
import alohacraft.kitpvp.main.Util;

public abstract class BaseCmd {
	public static Main plugins;
	public BaseCmd(Main plugin) {
		plugins = plugin;
	}
	public CommandSender sender;
	public String[] args;
	public String cmdName;
	public int argLength = 0;
	public boolean forcePlayer = true;
	public String usage = "";
	public Player player;
	public String desc = "";
	public String noperm = "";


	public boolean processCmd(CommandSender s, String[] arg) {
		sender = s;
		args = arg;

		if (forcePlayer) {
			if (!(s instanceof Player)) return false;
			else player = (Player) s;
		}
		if (!Util.hp(sender, cmdName))
			sender.sendMessage(ChatColor.DARK_RED + noperm);
		else if (argLength > arg.length)
			s.sendMessage(ChatColor.DARK_RED + "Wrong usage: " + ChatColor.GREEN +"/kitpvp " + helper());
		else return run();
		return true;
	}

	public abstract boolean run();

	public String helper() {
		return ChatColor.GREEN + cmdName + " " + usage + " "+ ChatColor.GRAY + desc;
	}
}