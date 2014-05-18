package alohacraft.kitpvp.main;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.EnchantmentWrapper;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Items {
	public static Items items = new Items();
	@SuppressWarnings("deprecation")
	public void sword1(final Player player) {
		ItemStack knife = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta knifeMeta = knife.getItemMeta();
		knifeMeta.setDisplayName(ChatColor.AQUA + "The Sword Of Fifty Votes");
		knife.setItemMeta(knifeMeta);
		knife.addUnsafeEnchantment(new EnchantmentWrapper(16), 5);
		knife.addUnsafeEnchantment(new EnchantmentWrapper(19), 2);
		knife.addUnsafeEnchantment(new EnchantmentWrapper(20), 2);
		knife.addUnsafeEnchantment(new EnchantmentWrapper(34), 3);
		player.getInventory().addItem(knife);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void axe1(final Player player) {
		ItemStack knife = new ItemStack(Material.DIAMOND_AXE);
		ItemMeta knifeMeta = knife.getItemMeta();
		knifeMeta.setDisplayName(ChatColor.AQUA + "zRA1Nz's Long Lost Axe");
		knife.setItemMeta(knifeMeta);
		knife.addUnsafeEnchantment(new EnchantmentWrapper(16), 5);
		knife.addUnsafeEnchantment(new EnchantmentWrapper(19), 2);
		knife.addUnsafeEnchantment(new EnchantmentWrapper(20), 2);
		knife.addUnsafeEnchantment(new EnchantmentWrapper(34), 3);
		player.getInventory().addItem(knife);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void armor1(final Player player) {
		ItemStack a = new ItemStack(Material.DIAMOND_HELMET);
		a.addUnsafeEnchantment(new EnchantmentWrapper(0), 5);
		a.addUnsafeEnchantment(new EnchantmentWrapper(1), 5);
		a.addUnsafeEnchantment(new EnchantmentWrapper(4), 2);
		
		ItemStack b = new ItemStack(Material.DIAMOND_CHESTPLATE);
		b.addUnsafeEnchantment(new EnchantmentWrapper(0), 5);
		b.addUnsafeEnchantment(new EnchantmentWrapper(1), 5);
		b.addUnsafeEnchantment(new EnchantmentWrapper(4), 2);
		
		ItemStack c = new ItemStack(Material.DIAMOND_LEGGINGS);
		c.addUnsafeEnchantment(new EnchantmentWrapper(0), 5);
		c.addUnsafeEnchantment(new EnchantmentWrapper(1), 5);
		c.addUnsafeEnchantment(new EnchantmentWrapper(4), 2);
		
		ItemStack d = new ItemStack(Material.DIAMOND_BOOTS);
		d.addUnsafeEnchantment(new EnchantmentWrapper(0), 5);
		d.addUnsafeEnchantment(new EnchantmentWrapper(1), 5);
		d.addUnsafeEnchantment(new EnchantmentWrapper(4), 2);
		
		player.getInventory().addItem(a);
		player.getInventory().addItem(b);
		player.getInventory().addItem(c);
		player.getInventory().addItem(d);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void armor2(final Player player) {
		ItemStack knife = new ItemStack(Material.DIAMOND_CHESTPLATE);
		ItemMeta knifeMeta = knife.getItemMeta();
		knifeMeta.setDisplayName(ChatColor.YELLOW + "Chester's Chestplate");
		knife.setItemMeta(knifeMeta);
		knife.addUnsafeEnchantment(new EnchantmentWrapper(0), 5);
		player.getInventory().addItem(knife);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void apple(final Player player) {
		ItemStack knife = new ItemStack(Material.GOLDEN_APPLE, 1, (byte)1);
		player.getInventory().addItem(knife);
		player.updateInventory();
	}
}
