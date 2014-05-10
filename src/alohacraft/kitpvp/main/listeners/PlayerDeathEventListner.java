package alohacraft.kitpvp.main.listeners;

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
import ca.wacos.nametagedit.NametagAPI;

public class PlayerDeathEventListner implements Listener {	
	@EventHandler
	public void onDeathinkitpvp(PlayerDeathEvent e) {
		Entity ekiller = (Entity) e.getEntity().getKiller();
		Entity eplayer = (Entity) e.getEntity().getPlayer();
		if((eplayer instanceof Player ) && (ekiller instanceof Player)) {
			Player killer = (Player) ekiller;
			Player player = (Player) eplayer;
			String killeruuid = killer.getUniqueId().toString();
			String playeruuid = player.getUniqueId().toString();
//			if((Main.getPlugin().getConfig().getBoolean("DoubleEXP") == true) || (Main.permission.getPrimaryGroup(killer).equalsIgnoreCase("mega"))) {
//				Main.economy.depositPlayer(killer.getName(), 2);
//				Util.notify(killer, "You have been given $2 for killing " + player.getName() + "!");
//				Main.getKitExp().put(killeruuid, (Main.getKitExp().get(killeruuid) + 2));
//				KitLevelUpCheckDouble(killer);
//			} else {
//				Main.economy.depositPlayer(killer.getName(), 1);
//				Util.notify(killer, "You have been given $1 for killing " + player.getName() + "!");
//				Main.getKitExp().put(killeruuid, (Main.getKitExp().get(killeruuid) + 1));
//				KitLevelUpCheck(killer);
//			}
//			Main.getKills().put(killeruuid, (Main.getKills().get(killeruuid) + 1));
//			Main.getDeaths().put(playeruuid, (Main.getDeaths().get(playeruuid) + 1));
			Util.ksm(player, "You died with a killstreak of '" + ChatColor.RED + Main.getKSC().get(playeruuid) + ChatColor.GRAY + "'!");
			killer.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP, 1));
			if(!Main.getKSC().containsKey(killeruuid)) {
				Main.getKSC().put(killeruuid, 0);
				killstreak(killer, player);
			} else {
				killstreak(killer, player);
			}
			for (Player pp: Bukkit.getOnlinePlayers()) {
				if (Main.getKillfeed().contains(pp.getName())) {
					Util.killfeed(pp, killer.getName() + ChatColor.GRAY + " has killed " + ChatColor.RED + player.getName() + ChatColor.GRAY + "!");
				}
			}
		}
	}
	public void onExpGain(final Player killer, final Player player) {
		if (killers exp >= lvl1 && killers exp < lvl2) {
			if ( its double exp || player is mega) {
				//add 2x exp to killer
				//add 2x cash to killer
				//add kill to killer
				//add death to player
				if (killers exp is >= lvl2) {
					//Promotion Message
					//Set killers level to 2
				}
			} else {
				//add exp to killer
				//add cash to killer
				//add kill to killer
				//add death to player
				if (killers exp is >= lvl2) {
					//Promotion Message
					//Set killers level to 2
				}
			}
		} else if (killers exp >= lvl2 && killers exp < lvl3) {
			if ( its double exp || player is mega) {
				//add 2x exp to killer
				//add 2x cash to killer
				//add kill to killer
				//add death to player
				if (killers exp is >= lvl3) {
					//Promotion Message
					//Set killers level to 3
				}
			} else {
				//add exp to killer
				//add cash to killer
				//add kill to killer
				//add death to player
				if (killers exp is >= lvl3) {
					//Promotion Message
					//Set killers level to 3
				}
			}
		} else if (killers exp >= lvl3 && killers exp < lvl4) {
			if ( its double exp || player is mega) {
				//add 2x exp to killer
				//add 2x cash to killer
				//add kill to killer
				//add death to player
				if (killers exp is >= lvl4) {
					//Promotion Message
					//Set killers level to 4
				}
			} else {
				//add exp to killer
				//add cash to killer
				//add kill to killer
				//add death to player
				if (killers exp is >= lvl4) {
					//Promotion Message
					//Set killers level to 4
				}
			}
		} else if (killers exp >= lvl4 && killers exp < lvl5) {
			if ( its double exp || player is mega) {
				//add 2x exp to killer
				//add 2x cash to killer
				//add kill to killer
				//add death to player
				if (killers exp is >= lvl5) {
					//Promotion Message
					//Set killers level to 5
				}
			} else {
				//add exp to killer
				//add cash to killer
				//add kill to killer
				//add death to player
				if (killers exp is >= lvl5) {
					//Promotion Message
					//Set killers level to 5
				}
			}
		} else if (killers exp >= lvl5) {
			if ( its double exp || player is mega) {
				//add 2x cash to killer
				//add kill to killer
				//add death to player
			} else {
				//add cash to killer
				//add kill to killer
				//add death to player
			}
		}
	}
	public void KitLevelUpCheck(Player killer) {
		String killeruuid = killer.getUniqueId().toString();
		int exp = Main.getKitExp().get(killeruuid);
		switch (exp) {
		case 100:
			Util.notify(killer, "You have leveled! You are now Level 2!");
			Main.getKitLevel().put(killeruuid, 2);
			NametagAPI.setPrefix(killer.getName(), ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Lvl:" + Main.getKitLevel().get(killer.getName()) + ChatColor.DARK_GRAY + "] " + ChatColor.WHITE);
			break;
		case 250:
			Util.notify(killer, "You have leveled! You are now Level 3!");
			Main.getKitLevel().put(killeruuid, 3);
			NametagAPI.setPrefix(killer.getName(), ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Lvl:" + Main.getKitLevel().get(killer.getName()) + ChatColor.DARK_GRAY + "] " + ChatColor.WHITE);
			break;
		case 500:
			Util.notify(killer, "You have leveled! You are now Level 4!");
			Main.getKitLevel().put(killeruuid, 4);
			NametagAPI.setPrefix(killer.getName(), ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Lvl:" + Main.getKitLevel().get(killer.getName()) + ChatColor.DARK_GRAY + "] " + ChatColor.WHITE);
			break;
		case 1000:
			Main.getKitLevel().put(killeruuid, 5);
			Util.notify(killer, "You have leveled! You are now Level 5!");
			Util.broadcast("Congradulations '" + ChatColor.GREEN + ChatColor.BOLD + killer.getName() + ChatColor.GOLD + ChatColor.BOLD + "'! You have reached the max kit level!");
			Util.notify(killer, "Please give us some feedback on how we can improve the expirience on KitPvP!");
			Util.notify(killer, "" + ChatColor.YELLOW + "" + ChatColor.UNDERLINE + "http://alohacraft.net/kitpvp");
			NametagAPI.setPrefix(killer.getName(), ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Lvl:" + Main.getKitLevel().get(killer.getName()) + ChatColor.DARK_GRAY + "] " + ChatColor.WHITE);
			break;
		default:
			return;
		}
	}
	public void KitLevelUpCheckDouble(Player killer) {
		String killeruuid = killer.getUniqueId().toString();
		int exp = Main.getKitExp().get(killeruuid);
		switch (exp) {
		case 100:
			Util.notify(killer, "You have leveled! You are now Level 2!");
			Main.getKitLevel().put(killeruuid, 2);
			NametagAPI.setPrefix(killer.getName(), ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Lvl:" + Main.getKitLevel().get(killer.getName()) + ChatColor.DARK_GRAY + "] " + ChatColor.WHITE);
			break;
		case 101:
			Util.notify(killer, "You have leveled! You are now Level 2!");
			Main.getKitLevel().put(killeruuid, 2);
			NametagAPI.setPrefix(killer.getName(), ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Lvl:" + Main.getKitLevel().get(killer.getName()) + ChatColor.DARK_GRAY + "] " + ChatColor.WHITE);
			break;
		case 250:
			Util.notify(killer, "You have leveled! You are now Level 3!");
			Main.getKitLevel().put(killeruuid, 3);
			NametagAPI.setPrefix(killer.getName(), ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Lvl:" + Main.getKitLevel().get(killer.getName()) + ChatColor.DARK_GRAY + "] " + ChatColor.WHITE);
			break;
		case 251:
			Util.notify(killer, "You have leveled! You are now Level 3!");
			Main.getKitLevel().put(killeruuid, 3);
			NametagAPI.setPrefix(killer.getName(), ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Lvl:" + Main.getKitLevel().get(killer.getName()) + ChatColor.DARK_GRAY + "] " + ChatColor.WHITE);
			break;
		case 500:
			Util.notify(killer, "You have leveled! You are now Level 4!");
			Main.getKitLevel().put(killeruuid, 4);
			NametagAPI.setPrefix(killer.getName(), ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Lvl:" + Main.getKitLevel().get(killer.getName()) + ChatColor.DARK_GRAY + "] " + ChatColor.WHITE);
			break;
		case 501:
			Util.notify(killer, "You have leveled! You are now Level 4!");
			Main.getKitLevel().put(killeruuid, 4);
			NametagAPI.setPrefix(killer.getName(), ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Lvl:" + Main.getKitLevel().get(killer.getName()) + ChatColor.DARK_GRAY + "] " + ChatColor.WHITE);
			break;
		case 1000:
			Main.getKitLevel().put(killeruuid, 5);
			Util.notify(killer, "You have leveled! You are now Level 5!");
			Util.broadcast("Congradulations '" + ChatColor.GREEN + ChatColor.BOLD + killer.getName() + ChatColor.GOLD + ChatColor.BOLD + "'! You have reached the max kit level!");
			Util.notify(killer, "Please give us some feedback on how we can improve the expirience on KitPvP!");
			Util.notify(killer, "" + ChatColor.YELLOW + "" + ChatColor.UNDERLINE + "http://alohacraft.net/kitpvp");
			NametagAPI.setPrefix(killer.getName(), ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Lvl:" + Main.getKitLevel().get(killer.getName()) + ChatColor.DARK_GRAY + "] " + ChatColor.WHITE);
			break;
		case 1001:
			Main.getKitLevel().put(killeruuid, 5);
			Util.notify(killer, "You have leveled! You are now Level 5!");
			Util.broadcast("Congradulations '" + ChatColor.GREEN + ChatColor.BOLD + killer.getName() + ChatColor.GOLD + ChatColor.BOLD + "'! You have reached the max kit level!");
			Util.notify(killer, "Please give us some feedback on how we can improve the expirience on KitPvP!");
			Util.notify(killer, "" + ChatColor.YELLOW + "" + ChatColor.UNDERLINE + "http://alohacraft.net/kitpvp");
			NametagAPI.setPrefix(killer.getName(), ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Lvl:" + Main.getKitLevel().get(killer.getName()) + ChatColor.DARK_GRAY + "] " + ChatColor.WHITE);
			break;
		default:
			return;
		}
	}
	public void killstreak(Player killer, Player player) {
		String killeruuid = killer.getUniqueId().toString();
		String playeruuid = player.getUniqueId().toString();
		int killz = Main.getKSC().get(killeruuid);
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
		Main.getKSC().put(playeruuid, 0);
		Main.getKSC().put(killeruuid, (Main.getKSC().get(killeruuid) + 1));
	}
}