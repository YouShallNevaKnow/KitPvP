package alohacraft.kitpvp.main.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerDropItemEvent;

import alohacraft.kitpvp.main.Main;
import alohacraft.kitpvp.main.Util;

public class FeatureListeners implements Listener {
	@EventHandler
	public void onQ(PlayerDropItemEvent e) {
		e.setCancelled(true);
		return;
	}
	@EventHandler
	public void onHungerLoss(FoodLevelChangeEvent e) {
		Player player = (Player) e.getEntity();
		if (player instanceof Player) {
			if(player.hasPermission("kitpvp.coal")) {
				e.setFoodLevel(20);
				return;
			}
		}
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void hurtVoid(EntityDamageEvent e) {
		DamageCause cause = e.getCause();
		Entity entity = e.getEntity();
		if(cause.equals(EntityDamageEvent.DamageCause.VOID)) {
			if (entity instanceof Player) {
				Player player = (Player)entity;
				if (player.hasPermission("kitpvp.coal")) {
					player.setHealth(20.0);
					player.setFallDistance(0.0F);
					player.teleport(Bukkit.getServer().getWorld("world").getSpawnLocation());
					Main.getKSC().put(player.getName(), 0);
					Util.msg(player, "You have fell off the map!");
					Util.ksm(player, "Your KillStreak was reset!");
					return;
				}
			}
		} else if(entity instanceof Player && cause == DamageCause.FALL) e.setCancelled(true);
	}
	@EventHandler
	public void onArmorSlot(InventoryClickEvent e) {
		if (e.getSlotType().equals(InventoryType.SlotType.ARMOR)){
			HumanEntity entity = (HumanEntity) e.getWhoClicked();
			Player player = (Player) entity;
			String pn = player.getName();
			String kit = Main.getKit().get(pn);
			if (kit.equalsIgnoreCase("hidden")) {
				e.setCancelled(true);
			}
			return;
		}
		return;
	}
}
