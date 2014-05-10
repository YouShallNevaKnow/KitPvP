package alohacraft.kitpvp.main.kits;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.EnchantmentWrapper;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import alohacraft.kitpvp.main.Util;

public class Tank {
	public static Tank tank = new Tank();
	@SuppressWarnings("deprecation")
	public void l1(final Player player) {
		Util.resetInv(player);
		addArmor(player, new ItemStack(Material.IRON_HELMET), new ItemStack(Material.IRON_CHESTPLATE), new ItemStack(Material.IRON_LEGGINGS), new ItemStack(Material.IRON_BOOTS));
		player.getInventory().addItem(new ItemStack(Material.WOOD_SWORD));
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l2(final Player player) {
		Util.resetInv(player);
		addArmor(player, new ItemStack(Material.IRON_HELMET), new ItemStack(Material.IRON_CHESTPLATE), new ItemStack(Material.IRON_LEGGINGS), new ItemStack(Material.IRON_BOOTS));
		player.getInventory().addItem(new ItemStack(Material.STONE_SWORD));
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l3(final Player player) {
		Util.resetInv(player);
		addArmor(player, new ItemStack(Material.DIAMOND_HELMET), new ItemStack(Material.IRON_CHESTPLATE), new ItemStack(Material.IRON_LEGGINGS), new ItemStack(Material.DIAMOND_BOOTS));
		player.getInventory().addItem(new ItemStack(Material.STONE_SWORD));
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l4(final Player player) {
		Util.resetInv(player);
		addArmor(player, new ItemStack(Material.DIAMOND_HELMET), new ItemStack(Material.IRON_CHESTPLATE), new ItemStack(Material.DIAMOND_LEGGINGS), new ItemStack(Material.DIAMOND_BOOTS));
		player.getInventory().addItem(new ItemStack(Material.STONE_SWORD));
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l5(final Player player) {
		Util.resetInv(player);
		ItemStack knife = new ItemStack(Material.FIRE);
		ItemMeta knifeMeta = knife.getItemMeta();
		knifeMeta.setDisplayName(ChatColor.GOLD + "Tanks Fire Helm");
		knife.setItemMeta(knifeMeta);
		int knifeEffect = 0;
		int knifeEnhantmentLevel = 2;
		EnchantmentWrapper knifeEnhantment = new EnchantmentWrapper(knifeEffect);
		knife.addUnsafeEnchantment(knifeEnhantment, knifeEnhantmentLevel);
		addArmor(player, knife, new ItemStack(Material.DIAMOND_CHESTPLATE), new ItemStack(Material.DIAMOND_LEGGINGS), new ItemStack(Material.DIAMOND_BOOTS));
		player.getInventory().addItem(new ItemStack(Material.IRON_SWORD));
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
