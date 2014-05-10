package alohacraft.kitpvp.main.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;
import alohacraft.kitpvp.main.Main;
import alohacraft.kitpvp.main.kits.Moog;
import alohacraft.kitpvp.main.managers.KitManager;

public class PlayerRespawnEventListner implements Listener{
	private Main plugin;
	//This is your constructor, it's called when you first create the class instance
	public PlayerRespawnEventListner(Main plugin) {
		this.plugin = plugin;
	}
	@EventHandler(priority = EventPriority.MONITOR)
	public void whenRespawnkitpvp(PlayerRespawnEvent e){
		Player player = (Player) e.getPlayer();
		String id = player.getUniqueId().toString();
		if (Main.getFRS().contains(id)) {
			World w = Bukkit.getServer().getWorld(plugin.getConfig().getString("fs.world"));
	        double x = plugin.getConfig().getDouble("fs.x");
	        double y = plugin.getConfig().getDouble("fs.y");
	        double z = plugin.getConfig().getDouble("fs.z");
	        Location l = new Location(w, x, y, z);
	        e.setRespawnLocation(l);
		}
		String kitname = Main.getKit().get(id);
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
}