package alohacraft.kitpvp.main.listeners;

import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import alohacraft.kitpvp.main.Main;
import alohacraft.kitpvp.main.Util;

public class EntityDamageByEntityEventListener implements Listener {
	@EventHandler
	public void onDamage(EntityDamageByEntityEvent e) {
		Entity entity = (Entity) e.getEntity();
		Entity hitter = (Entity) e.getDamager();
		//Arrow
		if (e.getDamager() instanceof Arrow) {
			Entity shooter = (Entity) ((Arrow) e.getDamager()).getShooter(); //get the shooter
			if (shooter instanceof Player) {
				if (entity instanceof Player) {
					Player player = (Player) entity;
					Player damager = (Player) shooter;
					if(Main.getTeams().containsKey(damager.getName())) {
						if (Main.getTeams().get(damager.getName()).equalsIgnoreCase(player.getName())) {
							Util.error(player, "That player is on your team!");
							e.setCancelled(true);							
						}
					}
				}
			}
		}
		//Physical
		if (hitter instanceof Player) {
			if (entity instanceof Player) {
				Player player = (Player) entity;
				Player damager = (Player) hitter;
				if(Main.getTeams().containsKey(damager.getName())) {
					if (Main.getTeams().get(damager.getName()).equalsIgnoreCase(player.getName())) {
						Util.error(player, "That player is on your team!");
						e.setCancelled(true);							
					}
				}
			}
		}
	}
}
