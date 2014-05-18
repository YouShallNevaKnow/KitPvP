package alohacraft.kitpvp.main.listeners;

import org.bukkit.ChatColor;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;

import alohacraft.kitpvp.main.Util;

public class SignChangeEventListener implements Listener {
	@EventHandler
	public void onKitCreate(SignChangeEvent e) {
		Player player = (Player) e.getPlayer();
		Block b = e.getBlock();
		String line = ChatColor.DARK_RED + "" + ChatColor.BOLD + "[Kit]";
		BlockState bs = b.getState();
		String line1 = e.getLine(0);
		if ((bs instanceof Sign) && (line1.equalsIgnoreCase("[kits]"))) {
			if (!player.hasPermission("ac.makekitsigns")) {
				b.breakNaturally();
				Util.error(player, "You can't make a kit sign!");
				return;
			} else {
				e.setLine(0, line);
				Util.msg(player, "You have made a kit sign! :) ");
				return;
			}
		} else if ((bs instanceof Sign) && (line1.equalsIgnoreCase("[buy-kit]"))) {
			if (!player.hasPermission("ac.makekitsigns")) {
				b.breakNaturally();
				Util.error(player, "You can't make a kit sign!");
				return;
			} else {
				e.setLine(0, ChatColor.DARK_BLUE + "[Buy-Kit]");
				Util.msg(player, "You have made a buy-kit sign!");
				return;
			}
		}
	}
}
