package alohacraft.kitpvp.main.kits;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import alohacraft.kitpvp.main.Util;

public class Boxer {
	public static Boxer boxer = new Boxer();
	@SuppressWarnings("deprecation")
	public void l1(final Player player) {
		Util.resetInv(player);
		player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 100000, 2));
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l2(final Player player) {
		Util.resetInv(player);
		player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 100000, 2));
		addArmor(player, new ItemStack(Material.CHAINMAIL_HELMET), new ItemStack(0), new ItemStack(0), new ItemStack(Material.CHAINMAIL_BOOTS));
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l3(final Player player) {
		Util.resetInv(player);
		player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 100000, 2));
		addArmor(player, new ItemStack(Material.CHAINMAIL_HELMET), new ItemStack(0), new ItemStack(Material.CHAINMAIL_LEGGINGS), new ItemStack(Material.CHAINMAIL_BOOTS));
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l4(final Player player) {
		Util.resetInv(player);
		player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 100000, 3));
		addArmor(player, new ItemStack(Material.CHAINMAIL_HELMET), new ItemStack(Material.CHAINMAIL_CHESTPLATE), new ItemStack(Material.CHAINMAIL_LEGGINGS), new ItemStack(Material.CHAINMAIL_BOOTS));
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l5(final Player player) {
		Util.resetInv(player);
		player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 100000, 3));
		addArmor(player, new ItemStack(Material.IRON_HELMET), new ItemStack(Material.IRON_CHESTPLATE), new ItemStack(Material.IRON_LEGGINGS), new ItemStack(Material.IRON_BOOTS));
		addSoup(player);
		player.updateInventory();
	}
	public void addArmor(final Player player, ItemStack a, ItemStack b, ItemStack c, ItemStack d) {
		player.getInventory().setHelmet(a);
		player.getInventory().setChestplate(b);
		player.getInventory().setLeggings(c);
		player.getInventory().setBoots(d);
	}
	public void addSoup(final Player player) {
		if (player.hasPermission("kitpvp.moresoup")) {
			for (int i=1; i<=10; i++) {
				player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			}
		} else {
			for (int i=1; i<=5; i++) {
				player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			}
		}
	}
}
