package alohacraft.kitpvp.main.listeners;

import java.util.HashMap;

import net.milkbowl.vault.economy.Economy;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import alohacraft.kitpvp.main.Main;
import alohacraft.kitpvp.main.Util;

public class PlayerDeathEventListener implements Listener {	
	HashMap<String, Integer> hexp = Main.getKitExp();
	HashMap<String, Integer> hlvl = Main.getKitLevel();
	HashMap<String, Integer> hkills = Main.getKills();
	HashMap<String, Integer> hdeaths = Main.getDeaths();
	HashMap<String, Integer> hksc = Main.getKSC();
	@EventHandler
	public void onDeathinkitpvp(PlayerDeathEvent e) {
		Entity ekiller = (Entity) e.getEntity().getKiller();
		Entity eplayer = (Entity) e.getEntity().getPlayer();
		if((eplayer instanceof Player ) && (ekiller instanceof Player)) {
			Player killer = (Player) ekiller;
			Player player = (Player) eplayer;
			String pn = player.getName();
			onExpGain(killer, player);
			Util.ksm(player, "You died with a killstreak of '" + ChatColor.RED + hksc.get(pn) + ChatColor.GRAY + "'!");
			addtokillstreak(killer);
			killer.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP, 1));
			hksc.remove(pn);
			for (Player pp: Bukkit.getOnlinePlayers()) {
				String ppn = pp.getName();
				Boolean kf = Main.getKillfeed().contains(ppn);
				if (kf) {
					Util.killfeed(pp, killer.getName() + ChatColor.GRAY + " has killed " + ChatColor.RED + pn + ChatColor.GRAY + "!");
				}
			}
		}
	}
	public void onExpGain(final Player killer, final Player player) {
		String ukiller = killer.getUniqueId().toString();
		String uplayer = player.getUniqueId().toString();
		String kn = killer.getName();
		String pn = player.getName();
		int kexp = hexp.get(ukiller);
		int kills = hkills.get(ukiller);
		int deaths = hdeaths.get(uplayer);
		int lvl1 = 0;
		int lvl2 = 100;
		int lvl3 = 250;
		int lvl4 = 500;
		int lvl5 = 1000;
		Boolean doubleexp = Main.getSettings().get("DoubleEXP");
		String group = Main.permission.getPrimaryGroup(killer);
		Economy eco = Main.economy;
		//Code for Kills and Deaths
		kills++;
		deaths++;
		hkills.put(ukiller, kills);
		hdeaths.put(uplayer, deaths);
		//Level Check Method
		if (kexp >= lvl1 && kexp < lvl2) {
			if (doubleexp || group.equalsIgnoreCase("mega")) {
				eco.depositPlayer(kn, 2);
				Util.notify(killer, "You have been given $2 for killing " + pn + "!");
				hexp.put(ukiller, (kexp + 2));
				if (kexp >= lvl2) {
					Util.notify(killer, "You have leveled up! Your kits are now slightly better.");
					hlvl.put(ukiller, 2);
				}
			} else {
				eco.depositPlayer(kn, 1);
				Util.notify(killer, "You have been given $1 for killing " + pn + "!");
				hexp.put(ukiller, (kexp + 1));
				if (kexp >= lvl2) {
					Util.notify(killer, "You have leveled up! Your kits are now slightly better.");
					hlvl.put(ukiller, 2);
				}
			}
		} else if (kexp >= lvl2 && kexp < lvl3) {
			if (doubleexp || group.equalsIgnoreCase("mega")) {
				eco.depositPlayer(kn, 2);
				Util.notify(killer, "You have been given $2 for killing " + pn + "!");
				hexp.put(ukiller, (kexp + 2));
				if (kexp >= lvl3) {
					Util.notify(killer, "You have leveled up! Your kits are now slightly better.");
					hlvl.put(ukiller, 3);
				}
			} else {
				eco.depositPlayer(kn, 1);
				Util.notify(killer, "You have been given $1 for killing " + pn + "!");
				hexp.put(ukiller, (kexp + 1));
				if (kexp >= lvl3) {
					Util.notify(killer, "You have leveled up! Your kits are now slightly better.");
					hlvl.put(ukiller, 3);
				}
			}
		} else if (kexp >= lvl3 && kexp < lvl4) {
			if (doubleexp || group.equalsIgnoreCase("mega")) {
				eco.depositPlayer(kn, 2);
				Util.notify(killer, "You have been given $2 for killing " + pn + "!");
				hexp.put(ukiller, (kexp + 2));
				if (kexp >= lvl4) {
					Util.notify(killer, "You have leveled up! Your kits are now slightly better.");
					hlvl.put(ukiller, 4);
				}
			} else {
				eco.depositPlayer(kn, 1);
				Util.notify(killer, "You have been given $1 for killing " + pn + "!");
				hexp.put(ukiller, (kexp + 1));
				if (kexp >= lvl4) {
					Util.notify(killer, "You have leveled up! Your kits are now slightly better.");
					hlvl.put(ukiller, 4);
				}
			}
		} else if (kexp >= lvl4 && kexp < lvl5) {
			if (doubleexp || group.equalsIgnoreCase("mega")) {
				eco.depositPlayer(kn, 2);
				Util.notify(killer, "You have been given $2 for killing " + pn + "!");
				hexp.put(ukiller, (kexp + 2));
				if (kexp >= lvl5) {
					Util.notify(killer, "Congradulations! You have beaten Alohacraft's KitPvP! Your kits are now at Maxed Level!");
					Util.broadcast(ChatColor.GREEN + "" + ChatColor.BOLD + "Player " + kn + " has just reached level 5!");
					Util.notify(killer, "Please give us some feedback on how we can improve the expirience on KitPvP!");
					Util.notify(killer, "" + ChatColor.YELLOW + "" + ChatColor.UNDERLINE + "http://alohacraft.net/kitpvp");
					hlvl.put(ukiller, 5);
				}
			} else {
				eco.depositPlayer(kn, 1);
				Util.notify(killer, "You have been given $1 for killing " + pn + "!");
				hexp.put(ukiller, (kexp + 1));
				if (kexp >= lvl5) {
					Util.notify(killer, "Congradulations! You have beaten Alohacraft's KitPvP! Your kits are now at Maxed Level!");
					Util.broadcast(ChatColor.GREEN + "" + ChatColor.BOLD + "Player " + kn + " has just reached level 5!");
					Util.notify(killer, "Please give us some feedback on how we can improve the expirience on KitPvP!");
					Util.notify(killer, "" + ChatColor.YELLOW + "" + ChatColor.UNDERLINE + "http://alohacraft.net/kitpvp");
					hlvl.put(ukiller, 5);
				}
			}
		} else if (kexp >= lvl5) {
			if (doubleexp || group.equalsIgnoreCase("mega")) {
				eco.depositPlayer(kn, 2);
				Util.notify(killer, "You have been given $2 for killing " + pn + "!");
			} else {
				eco.depositPlayer(kn, 1);
				Util.notify(killer, "You have been given $1 for killing " + pn + "!");
			}
		}
	}
	public void addtokillstreak(Player killer) {
		String kn = killer.getName();
		if (hksc.containsKey(kn)) {
			//Adding onto existing killstreak
			int killstreak = hksc.get(kn);
			killstreak++;
			hksc.put(kn, killstreak);
			killstreak(killer);
		} else {
			//first kill of the killstreak
			hksc.put(kn, 1);
			killstreak(killer);
		}
	}
	public void killstreak(Player killer) {
		int killz = hksc.get(killer.getName());
		switch (killz) {
		case 2:
			killer.setHealth(20);
			killer.setFoodLevel(20);
			Util.ksm(killer, "You have been" + ChatColor.RED + " Healed " + ChatColor.GRAY + "for being on a 3 killstreak!");
			break;
		case 6:
			killer.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100000, 0));
			Util.ksm(killer, "You have been given" + ChatColor.RED + " Swiftness " + ChatColor.GRAY + "for being on a 7 killstreak!");
			break;
		case 9:
			ItemStack god = new ItemStack(Material.GOLDEN_APPLE, 1, (byte)1);
			killer.getInventory().addItem(god);
			Util.ksm(killer, "You have been given" + ChatColor.RED + " 1 God Apple " + ChatColor.GRAY + "for being on a 10 killstreak!");
			break;
		case 19:
			killer.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 100000, 0));
			Util.ksm(killer, "You have been given" + ChatColor.RED + " Extra Strength " + ChatColor.GRAY + "for being on a 20 killstreak!");
			break;
		default:
			break;
		}
	}
}