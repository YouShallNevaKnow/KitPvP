package alohacraft.kitpvp.main;


import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;


public class Util
{
	private static final Logger log = Logger.getLogger("Minecraft");
	public static String pn = ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "KitPvP" + ChatColor.DARK_GRAY + "] ";
	
	public static void log(String s) {
		log.info(pn + s);
	}

	public static void msg(Player player, String s) {
		player.sendMessage(pn + ChatColor.GRAY + s);
	}
	public static void ksm(Player player, String s) {
		player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_RED + "KillStreak" + ChatColor.DARK_GRAY + "]: " + ChatColor.GRAY + s);
	}
	public static void error(Player player, String s) {
		player.sendMessage(pn + ChatColor.RED + s);
	}
	public static void serror(CommandSender sender, String s) {
		sender.sendMessage(pn + ChatColor.DARK_RED + s);
	}
	public static void snotify(CommandSender sender, String s) {
		sender.sendMessage(pn + ChatColor.GREEN + s);
	}
	public static void notify(Player player, String s) {
		player.sendMessage(pn + ChatColor.GREEN + s);
	}
	public static void killfeed(Player player, String s) {
		player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_RED + "Killfeed" + ChatColor.DARK_GRAY + "]: " + ChatColor.RED + s);
	}
	public static void broadcast(String s) {
		Bukkit.getServer().broadcastMessage(pn + ChatColor.GOLD + ChatColor.BOLD + s);
	}
	public static boolean hp(CommandSender sender, String s) {
		if (sender.hasPermission("kitpvp." + s)) {
			return true;
		}
		return false;
	}
	public static void resetInv(final Player player) {
		for (PotionEffect ef : player.getActivePotionEffects()) {
			player.removePotionEffect(ef.getType());
		}
		player.getInventory().clear();
		remArmor(player);
	}
	@SuppressWarnings("deprecation")
	public static void remArmor(final Player player) {
		player.getInventory().setHelmet(new ItemStack(0));
		player.getInventory().setChestplate(new ItemStack(0));
		player.getInventory().setLeggings(new ItemStack(0));
		player.getInventory().setBoots(new ItemStack(0));
	}
}