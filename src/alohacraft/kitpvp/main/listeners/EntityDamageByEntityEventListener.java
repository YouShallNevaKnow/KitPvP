package alohacraft.kitpvp.main.listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
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
		if (entity instanceof Player) {
			if (hitter instanceof Projectile) {
				hitter = (Entity) ((Projectile) e.getDamager()).getShooter();
				if (hitter instanceof Player) {
					Player shooter = (Player) hitter;
					Player player = (Player) entity;
					Object hash = Main.getTeams().get(shooter.getName());
					if (hash != null) {
						if (hash.toString().equalsIgnoreCase(player.getName())) {
							Util.error(player, "That player is on your team!");
							e.setCancelled(true);
						}
					}
				}
			} else if (hitter instanceof Player) {
				Player player = (Player) entity;
				Player damager = (Player) hitter;
				Object hash = Main.getTeams().get(damager.getName());
				if (hash != null) {
					if (hash.toString().equalsIgnoreCase(player.getName())) {
						Util.error(player, "That player is on your team!");
						e.setCancelled(true);
					}
				}
			}
		}
	}
}