package alohacraft.kitpvp.main.listeners;

import java.util.ArrayList;
import java.util.HashMap;

import net.milkbowl.vault.economy.Economy;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.potion.PotionEffect;

import alohacraft.kitpvp.main.Main;
import alohacraft.kitpvp.main.Util;
import alohacraft.kitpvp.main.kits.Moog;
import alohacraft.kitpvp.main.managers.KitManager;


public class PlayerInteractEventListener implements Listener {
	private Main p;
	public PlayerInteractEventListener(Main plugin) {
		p = plugin;
	}
	@EventHandler
	public void onKitClick(PlayerInteractEvent e) {
		Block b = e.getClickedBlock();
		Player player = (Player) e.getPlayer();
		BlockState bs = b.getState();
		Action action = e.getAction();
		ItemStack item = player.getItemInHand();
		Material m  = item.getType();
		if ((action.equals(Action.RIGHT_CLICK_BLOCK)) && (bs instanceof Sign)) {
			ArrayList<String> cd = new ArrayList<String>();
			Sign sign = (Sign)bs;
			String line = ChatColor.DARK_RED + "" + ChatColor.BOLD + "[Kit]";
			String sline = sign.getLine(0);
			if (sline.equalsIgnoreCase(line)) {
				// Tank Kit
				if (!cd.contains(player.getName())) {
					if(item == null || m.equals(Material.AIR)) {
						resetInv(player, cd);
						String kitname = sign.getLine(2).toLowerCase();
						String pn = player.getUniqueId().toString();
						KitManager km = new KitManager();
						HashMap<String, String> kit = Main.getKit();
						switch (kitname) {
						case "tank":
							kit.put(pn, "tank");
							km.getLvl(player, kitname);
							break;
						case "warrior":
							kit.put(pn, "warrior");
							km.getLvl(player, kitname);
							break;
						case "archer":
							kit.put(pn, "archer");
							km.getLvl(player, kitname);
							break;
						case "pyro":
							kit.put(pn, "pyro");
							km.getLvl(player, kitname);
							break;
						case "maniac":
							kit.put(pn, "maniac");
							km.getLvl(player, kitname);
							break;
						case "dwarf":
							if(player.hasPermission("kitpvp.earned.dwarf")) {
								kit.put(pn, "dwarf");
								km.getLvl(player, kitname);
							} else {
								Util.error(player, "You need to purchase this kit for $750 to be able to use it!");
							}
							break;
						case "moog":
							if(Main.getKitLevel().get(pn).equals(5)) {
								Moog.l5(player);
								Main.getKit().put(pn, "moog");
							} else {
								Util.error(player, "You need to be level 5 to use this kit!");
							}
							break;
						case "hitman":
							if(player.hasPermission("kitpvp.earned.hitman")) {
								kit.put(pn, "hitman");
								km.getLvl(player, kitname);
							} else {
								Util.error(player, "You need to purchase this kit for $1000 to be able to use it!");
							}
							break;
						case "boxer":
							if(player.hasPermission("kitpvp.earned.boxer")) {
								kit.put(pn, "boxer");
								km.getLvl(player, kitname);
							} else {
								Util.error(player, "You need to purchase this kit from the vote shop on the forums!");
							}
							break;
						case "wither":
							if(player.hasPermission("kitpvp.alohagod")) {
								kit.put(pn, "wither");
								km.getLvl(player, kitname);
							} else {
								Util.error(player, "You need to purchase the AlohaGod Package from the donation shop!");
							}
							break;
						case "hidden":
							if(player.hasPermission("kitpvp.youtuber")) {
								kit.put(pn, "hidden");
								km.getLvl(player, kitname);
							} else {
								Util.error(player, "You need to obtain the YouTube node by making a video about KitPvP with 300 views!");
							}
							break;
						case "butter":
							if(player.hasPermission("kitpvp.coal")) {
								kit.put(pn, "butter");
								km.getLvl(player, kitname);
							} else {
								Util.error(player, "You need to purchase the Coal Package from the donation shop!");
							}
							break;
						case "warper":
							if(player.hasPermission("kitpvp.iron")) {
								kit.put(pn, "warper");
								km.getLvl(player, kitname);
							} else {
								Util.error(player, "You need to purchase the Iron Package from the donation shop!");
							}
							break;
						case "jumper":
							if(player.hasPermission("kitpvp.gold")) {
								kit.put(pn, "jumper");
								km.getLvl(player, kitname);
							} else {
								Util.error(player, "You need to purchase the Gold Package from the donation shop!");
							}
							break;
						case "murloc":
							if(player.hasPermission("kitpvp.redstone")) {
								kit.put(pn, "murloc");
								km.getLvl(player, kitname);
							} else {
								Util.error(player, "You need to purchase the Redstone Package from the donation shop!");
							}
							break;
						case "druid":
							if(player.hasPermission("kitpvp.emerald")) {
								kit.put(pn, "druid");
								km.getLvl(player, kitname);
							} else {
								Util.error(player, "You need to purchase the Emerald Package from the donation shop!");
							}
							break;
						case "paladin":
							if(player.hasPermission("kitpvp.diamond")) {
								kit.put(pn, "paladin");
								km.getLvl(player, kitname);
							} else {
								Util.error(player, "You need to purchase the Diamond Package from the donation shop!");
							}
							break;
						case "fireny":
							if(player.hasPermission("kitpvp.obsidian")) {
								kit.put(pn, "fireny");
								km.getLvl(player, kitname);
							} else {
								Util.error(player, "You need to purchase the Obsidian Package from the donation shop!");
							}
							break;
						case "witch":
							if(player.hasPermission("kitpvp.bedrock")) {
								kit.put(pn, "witch");
								km.getLvl(player, kitname);
							} else {
								Util.error(player, "You need to purchase the Bedrock Package from the donation shop!");
							}
							break;
						default:
							break;
						}
					} else {
						Util.error(player, "Please select a kit with a blank slot in your hotbar!");
					}
				} else {
					Util.error(player, "Please wait before click a Kit Sign...");
				}
				//buy kits
			} else if (sline.equalsIgnoreCase(ChatColor.DARK_BLUE + "[Buy-Kit]")) {
				String kit = sign.getLine(1).toLowerCase();
				int cost = Integer.parseInt(sign.getLine(3));
				Economy eco = Main.economy;
				String pn = player.getName();
				if (eco.getBalance(pn) >= cost) {
					if (player.hasPermission("kitpvp.earned." + kit)) {
						Util.error(player, "You have already purchased this kit!");
					} else {
						eco.withdrawPlayer(pn, cost);
						Main.permission.playerAdd(player, "kitpvp.earned." + kit);
						Util.notify(player, "You have purchase the " + kit + " kit!");
					}
				} else {
					Util.error(player, "You don't have enough money to purchase that!");
				}
			} 
		} else if (((action == Action.RIGHT_CLICK_AIR) && (m.equals(Material.MUSHROOM_SOUP))) || ((action == Action.RIGHT_CLICK_BLOCK) && (m.equals(Material.MUSHROOM_SOUP)))) {
			if(!player.isDead()) {
				double health = player.getHealth();
				if (health >= 10) {
					player.setHealth(20);
				} else {
					player.setHealth(health + 10);
				}
				int food = player.getFoodLevel();
				if (food <= 12) {
					player.setFoodLevel(food + 8);
				} else {
					player.setFoodLevel(20);
				}
				item.setType(Material.BOWL);
				return;
			} else {
				Util.error(player, "Sorry but you're dead, you don't eat :D");
				return;
			}
		}
	}
	public void resetInv(final Player player, ArrayList<String> cd) {
		// Clear armor and Inventory
		for (PotionEffect ef : player.getActivePotionEffects()) {
			player.removePotionEffect(ef.getType());
		}
		PlayerInventory i = player.getInventory();
		i.clear();
		remArmor(player);
		//Add items
		cd.add(player.getName());
		coolDown(player, cd);
	}
	@SuppressWarnings("deprecation")
	public void remArmor(final Player player) {
		PlayerInventory i = player.getInventory();
		i.setHelmet(new ItemStack(0));
		i.setChestplate(new ItemStack(0));
		i.setLeggings(new ItemStack(0));
		i.setBoots(new ItemStack(0));
	}
	public void coolDown(final Player player, final ArrayList<String> cd) {
		p.getServer().getScheduler().scheduleSyncDelayedTask(p, new Runnable() {
			public void run() {
				cd.remove(player.getName());
			}
		}, 5 * 20L);
	}
}
