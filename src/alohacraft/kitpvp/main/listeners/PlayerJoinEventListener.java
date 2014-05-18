package alohacraft.kitpvp.main.listeners;

import java.util.HashMap;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.potion.PotionEffect;

import alohacraft.kitpvp.main.Main;
import alohacraft.kitpvp.main.kits.Moog;
import alohacraft.kitpvp.main.managers.DataManager;
import alohacraft.kitpvp.main.managers.KitManager;

public class PlayerJoinEventListener implements Listener {	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {	
		Player player = (Player) e.getPlayer();
		String id = player.getUniqueId().toString();
		resetInv(player);
		HashMap<String, String> kit = Main.getKit();
		DataManager datam = DataManager.getInstance();
		String data = datam.getDataFile().getString("players." + id);
		if(data == null) {
			kit.put(id, "warrior");
			Main.getKitExp().put(id, 0);
			Main.getKitLevel().put(id, 1);
			Main.getKills().put(id, 0);
			Main.getDeaths().put(id, 0);
		} else {
			String[] words = data.split(":");
			kit.put(id, words[0]);
			Main.getKitLevel().put(id, Integer.parseInt(words[1]));
			Main.getKitExp().put(id, Integer.parseInt(words[2]));
			Main.getKills().put(id, Integer.parseInt(words[3]));
			Main.getDeaths().put(id, Integer.parseInt(words[4]));
		}
		String kitname = kit.get(id);
		KitManager km = new KitManager();
		switch (kitname) {
		case "tank":
			km.getLvl(player, kitname);
			break;
		case "warrior":
			km.getLvl(player, kitname);
			break;
		case "archer":
			km.getLvl(player, kitname);
			break;
		case "pyro":
			km.getLvl(player, kitname);
			break;
		case "maniac":
			km.getLvl(player, kitname);
			break;
		case "dwarf":
			km.getLvl(player, kitname);
			break;
		case "moog":
			Moog.l5(player);
			break;
		case "hitman":
			km.getLvl(player, kitname);
			break;
		case "boxer":
			km.getLvl(player, kitname);
			break;
		case "wither":
			km.getLvl(player, kitname);
			break;
		case "hidden":
			km.getLvl(player, kitname);
			break;
		case "butter":
			km.getLvl(player, kitname);
			break;
		case "warper":
			km.getLvl(player, kitname);
			break;
		case "jumper":
			km.getLvl(player, kitname);
			break;
		case "murloc":
			km.getLvl(player, kitname);
			break;
		case "druid":
			km.getLvl(player, kitname);
			break;
		case "paladin":
			km.getLvl(player, kitname);
			break;
		case "fireny":
			km.getLvl(player, kitname);
			break;
		case "witch":
			km.getLvl(player, kitname);
			break;
		default:
			//Don't use! Or Ignore!
			break;
		}
	}
	public void resetInv(final Player player) {
		// Clear armor and Inventory
		for (PotionEffect ef : player.getActivePotionEffects()) {
			player.removePotionEffect(ef.getType());
		}
		player.getInventory().clear();
		remArmor(player);
	}
	@SuppressWarnings("deprecation")
	public void remArmor(final Player player) {
		PlayerInventory inv = player.getInventory();
		inv.setHelmet(new ItemStack(0));
		inv.setChestplate(new ItemStack(0));
		inv.setLeggings(new ItemStack(0));
		inv.setBoots(new ItemStack(0));
	}
}
