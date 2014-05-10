package alohacraft.kitpvp.main.listeners;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;

import ca.wacos.nametagedit.NametagAPI;
import alohacraft.kitpvp.main.Main;
import alohacraft.kitpvp.main.Util;
import alohacraft.kitpvp.main.kits.Moog;
import alohacraft.kitpvp.main.managers.KitManager;


public class PlayerInteractEventListner implements Listener {
	private Main p;
	public PlayerInteractEventListner(Main plugin) {
		p = plugin;
	}
	@EventHandler
	public void onKitClick(PlayerInteractEvent e) {
		Block b = e.getClickedBlock();
		Player player = (Player) e.getPlayer();
		if ((e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) && (b.getState() instanceof Sign)) {
			ArrayList<String> cd = new ArrayList<String>();
			Sign sign = (Sign)b.getState();
			String line = ChatColor.DARK_RED + "" + ChatColor.BOLD + "[Kit]";
			if (sign.getLine(0).equalsIgnoreCase(line)) {
				// Tank Kit
				if (!cd.contains(player.getName())) {
					ItemStack item = player.getItemInHand();
					if(item == null || item.getType().equals(Material.AIR)) {
						resetInv(player, cd);
						String kitname = sign.getLine(2).toLowerCase();
						String pn = player.getUniqueId().toString();
						KitManager km = new KitManager();
						switch (kitname) {
						case "tank":
							Main.getKit().put(pn, "tank");
							km.getLvl(player, kitname);
							break;
						case "warrior":
							Main.getKit().put(pn, "warrior");
							km.getLvl(player, kitname);
							break;
						case "archer":
							Main.getKit().put(pn, "archer");
							km.getLvl(player, kitname);
							break;
						case "pyro":
							Main.getKit().put(pn, "pyro");
							km.getLvl(player, kitname);
							break;
						case "maniac":
							Main.getKit().put(pn, "maniac");
							km.getLvl(player, kitname);
							break;
						case "dwarf":
							if(player.hasPermission("kitpvp.earned.dwarf")) {
								Main.getKit().put(pn, "dwarf");
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
								Main.getKit().put(pn, "hitman");
								km.getLvl(player, kitname);
							} else {
								Util.error(player, "You need to purchase this kit for $1000 to be able to use it!");
							}
							break;
						case "boxer":
							if(player.hasPermission("kitpvp.earned.boxer")) {
								Main.getKit().put(pn, "boxer");
								km.getLvl(player, kitname);
							} else {
								Util.error(player, "You need to purchase this kit from the vote shop on the forums!");
							}
							break;
						case "wither":
							if(player.hasPermission("kitpvp.alohagod")) {
								Main.getKit().put(pn, "wither");
								km.getLvl(player, kitname);
							} else {
								Util.error(player, "You need to purchase the AlohaGod Package from the donation shop!");
							}
							break;
						case "hidden":
							if(player.hasPermission("kitpvp.youtuber")) {
								Main.getKit().put(pn, "hidden");
								km.getLvl(player, kitname);
							} else {
								Util.error(player, "You need to obtain the YouTube node by making a video about KitPvP with 300 views!");
							}
							break;
						case "butter":
							if(player.hasPermission("kitpvp.coal")) {
								Main.getKit().put(pn, "butter");
								km.getLvl(player, kitname);
							} else {
								Util.error(player, "You need to purchase the Coal Package from the donation shop!");
							}
							break;
						case "warper":
							if(player.hasPermission("kitpvp.iron")) {
								Main.getKit().put(pn, "warper");
								km.getLvl(player, kitname);
							} else {
								Util.error(player, "You need to purchase the Iron Package from the donation shop!");
							}
							break;
						case "jumper":
							if(player.hasPermission("kitpvp.gold")) {
								Main.getKit().put(pn, "jumper");
								km.getLvl(player, kitname);
							} else {
								Util.error(player, "You need to purchase the Gold Package from the donation shop!");
							}
							break;
						case "murloc":
							if(player.hasPermission("kitpvp.redstone")) {
								Main.getKit().put(pn, "murloc");
								km.getLvl(player, kitname);
							} else {
								Util.error(player, "You need to purchase the Redstone Package from the donation shop!");
							}
							break;
						case "druid":
							if(player.hasPermission("kitpvp.emerald")) {
								Main.getKit().put(pn, "druid");
								km.getLvl(player, kitname);
							} else {
								Util.error(player, "You need to purchase the Emerald Package from the donation shop!");
							}
							break;
						case "paladin":
							if(player.hasPermission("kitpvp.diamond")) {
								Main.getKit().put(pn, "paladin");
								km.getLvl(player, kitname);
							} else {
								Util.error(player, "You need to purchase the Diamond Package from the donation shop!");
							}
							break;
						case "fireny":
							if(player.hasPermission("kitpvp.obsidian")) {
								Main.getKit().put(pn, "fireny");
								km.getLvl(player, kitname);
							} else {
								Util.error(player, "You need to purchase the Obsidian Package from the donation shop!");
							}
							break;
						case "witch":
							if(player.hasPermission("kitpvp.bedrock")) {
								Main.getKit().put(pn, "witch");
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
			} else if (sign.getLine(0).equalsIgnoreCase(ChatColor.DARK_BLUE + "[Buy-Kit]")) {
				String kit = sign.getLine(1).toLowerCase();
				int cost = Integer.parseInt(sign.getLine(3));
				if (Main.economy.getBalance(player.getName()) >= cost) {
					if (player.hasPermission("kitpvp.earned." + kit)) {
						Util.error(player, "You have already purchased this kit!");
					} else {
						Main.economy.withdrawPlayer(player.getName(), cost);
						Main.permission.playerAdd(player, "kitpvp.earned." + kit);
						Util.notify(player, "You have purchase the " + kit + " kit!");
					}
				} else {
					Util.error(player, "You don't have enough money to purchase that!");
				}
			} else if (sign.getLine(0).equalsIgnoreCase(ChatColor.DARK_BLUE + "[Buy-Tag]")) {
				String tag = sign.getLine(1).toLowerCase();
				int cost = Integer.parseInt(sign.getLine(3));
				if (Main.economy.getBalance(player.getName()) >= cost) {
					if (player.hasPermission("kitpvp.tag." + tag)) {
						Util.error(player, "You have already purchased this tag!");
					} else {
						Main.economy.withdrawPlayer(player.getName(), cost);
						Main.permission.playerAdd(player, "kitpvp.tag." + tag);
						Util.notify(player, "You have purchase the " + tag + " tag!");
					}
				} else {
					Util.error(player, "You don't have enough money to purchase that!");
				}
			} else if (sign.getLine(0).equalsIgnoreCase(ChatColor.DARK_GREEN + "[Use-Tag]")) {
				String tag = sign.getLine(1).toLowerCase();
				if ((tag.equalsIgnoreCase("donor")) || (tag.equalsIgnoreCase("maxed")) || (tag.equalsIgnoreCase("slayer")) ||
						(tag.equalsIgnoreCase("voter")) || (tag.equalsIgnoreCase("bold")) || (tag.equalsIgnoreCase("youtuber"))) {
					switch (tag) {
					case "donor":
						if (player.hasPermission("kitpvp.coal")) {
							NametagAPI.setPrefix(player.getName(), ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Lvl:" + Main.getKitLevel().get(player.getName()) + ChatColor.DARK_GRAY + "] " + ChatColor.AQUA);
							NametagAPI.setSuffix(player.getName(), " the Donor");
							Util.notify(player, "Tag Selected!");
						} else {
							Util.error(player, "You need to be a donor to use this tag!");
						}
						break;
					case "maxed":
						if (Main.getKitLevel().get(player.getUniqueId().toString()).equals(5)) {
							NametagAPI.setPrefix(player.getName(), ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Lvl:" + Main.getKitLevel().get(player.getName()) + ChatColor.DARK_GRAY + "] " + ChatColor.GOLD);
							NametagAPI.setSuffix(player.getName(), " the Maxed");
							Util.notify(player, "Tag Selected!");
						} else {
							Util.error(player, "You need to be level 5 to use this tag!");
						}
						break;
					case "slayer":
						if (Main.getKills().get(player.getUniqueId().toString()) >= 1500) {
							NametagAPI.setPrefix(player.getName(), ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Lvl:" + Main.getKitLevel().get(player.getName()) + ChatColor.DARK_GRAY + "] " + ChatColor.DARK_RED);
							NametagAPI.setSuffix(player.getName(), " the Slayer");
							Util.notify(player, "Tag Selected!");
						} else {
							Util.error(player, "You need to have more than 1500 kills to use this tag!");
						}
						break;
					case "voter":
						if (player.hasPermission("kitpvp.tag.voter")) {
							NametagAPI.setPrefix(player.getName(), ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Lvl:" + Main.getKitLevel().get(player.getName()) + ChatColor.DARK_GRAY + "] " + ChatColor.BLUE);
							NametagAPI.setSuffix(player.getName(), " the Voter");
							Util.notify(player, "Tag Selected!");
						} else {
							Util.error(player, "You need to purchase this tag from the vote shop!");
						}
						break;
					case "bold":
						if (Main.getKills().get(player.getUniqueId().toString()) >= 500) {
							NametagAPI.setPrefix(player.getName(), ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Lvl:" + Main.getKitLevel().get(player.getName()) + ChatColor.DARK_GRAY + "] " + ChatColor.BOLD);
							NametagAPI.setSuffix(player.getName(), " the Bold");
							Util.notify(player, "Tag Selected!");
						} else {
							Util.error(player, "You need to have more than 500 kills to use this tag!");
						}
						break;
					case "youtuber":
						if (player.hasPermission("kitpvp.youtuber")) {
							NametagAPI.setPrefix(player.getName(), ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Lvl:" + Main.getKitLevel().get(player.getName()) + ChatColor.DARK_GRAY + "] " + ChatColor.DARK_RED);
							NametagAPI.setSuffix(player.getName(), " the Youtuber");
							Util.notify(player, "Tag Selected!");
						} else {
							Util.error(player, "You need to obtain the YouTube node by making a video about KitPvP with 300 views!");
						}
						break;

					default:
						Util.error(player, "Don't know what cause this error but that sucks!");
						break;
					}
				} else {
					if (player.hasPermission("kitpvp.tag." + tag)) {
						switch (tag) {
						case "hero":
							NametagAPI.setPrefix(player.getName(), ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Lvl:" + Main.getKitLevel().get(player.getName()) + ChatColor.DARK_GRAY + "] " + ChatColor.YELLOW);
							NametagAPI.setSuffix(player.getName(), " the Hero");
							Util.notify(player, "Tag Selected!");
							break;
						case "legend":
							NametagAPI.setPrefix(player.getName(), ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Lvl:" + Main.getKitLevel().get(player.getName()) + ChatColor.DARK_GRAY + "] " + ChatColor.DARK_AQUA);
							NametagAPI.setSuffix(player.getName(), " the Legend");
							Util.notify(player, "Tag Selected!");
							break;
						case "aware":
							NametagAPI.setPrefix(player.getName(), ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Lvl:" + Main.getKitLevel().get(player.getName()) + ChatColor.DARK_GRAY + "] " + ChatColor.LIGHT_PURPLE);
							NametagAPI.setSuffix(player.getName(), " the Aware");
							Util.notify(player, "Tag Selected!");
							break;
						case "god":
							NametagAPI.setPrefix(player.getName(), ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Lvl:" + Main.getKitLevel().get(player.getName()) + ChatColor.DARK_GRAY + "] " + ChatColor.GOLD);
							NametagAPI.setSuffix(player.getName(), " the God");
							Util.notify(player, "Tag Selected!");
							break;
						case "beast":
							NametagAPI.setPrefix(player.getName(), ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Lvl:" + Main.getKitLevel().get(player.getName()) + ChatColor.DARK_GRAY + "] " + ChatColor.DARK_GREEN);
							NametagAPI.setSuffix(player.getName(), " the Beast");
							Util.notify(player, "Tag Selected!");
							break;
						case "crusader":
							NametagAPI.setPrefix(player.getName(), ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Lvl:" + Main.getKitLevel().get(player.getName()) + ChatColor.DARK_GRAY + "] " + ChatColor.GRAY);
							NametagAPI.setSuffix(player.getName(), " the Crusader");
							Util.notify(player, "Tag Selected!");
							break;
						case "immortal":
							NametagAPI.setPrefix(player.getName(), ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Lvl:" + Main.getKitLevel().get(player.getName()) + ChatColor.DARK_GRAY + "] " + ChatColor.DARK_PURPLE);
							NametagAPI.setSuffix(player.getName(), " the Immortal");
							Util.notify(player, "Tag Selected!");
							break;
						case "lord":
							NametagAPI.setPrefix(player.getName(), ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Lvl:" + Main.getKitLevel().get(player.getName()) + ChatColor.DARK_GRAY + "] " + ChatColor.DARK_BLUE);
							NametagAPI.setSuffix(player.getName(), " the Lord");
							Util.notify(player, "Tag Selected!");
							break;
						case "ancient":
							NametagAPI.setPrefix(player.getName(), ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Lvl:" + Main.getKitLevel().get(player.getName()) + ChatColor.DARK_GRAY + "] " + ChatColor.GREEN);
							NametagAPI.setSuffix(player.getName(), " the Ancient");
							Util.notify(player, "Tag Selected!");
							break;
						default:
							Util.error(player, "Don't know what cause this error but that sucks!");
							break;
						}
					} else {
						Util.error(player, "You need to purchase this tag before being able to use it!");
					}
				}
			}//End of signs
		} else if (((e.getAction() == Action.RIGHT_CLICK_AIR) && (player.getItemInHand().getType().equals(Material.MUSHROOM_SOUP))) || ((e.getAction() == Action.RIGHT_CLICK_BLOCK) && (player.getItemInHand().getType().equals(Material.MUSHROOM_SOUP)))) {
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
				player.getItemInHand().setType(Material.BOWL);
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
		player.getInventory().clear();
		remArmor(player);
		//Add items
		cd.add(player.getName());
		coolDown(player, cd);
	}
	@SuppressWarnings("deprecation")
	public void remArmor(final Player player) {
		player.getInventory().setHelmet(new ItemStack(0));
		player.getInventory().setChestplate(new ItemStack(0));
		player.getInventory().setLeggings(new ItemStack(0));
		player.getInventory().setBoots(new ItemStack(0));
	}
	public void coolDown(final Player player, final ArrayList<String> cd) {
		p.getServer().getScheduler().scheduleSyncDelayedTask(p, new Runnable() {
			public void run() {
				cd.remove(player.getName());
			}
		}, 5 * 20L);
	}
}
