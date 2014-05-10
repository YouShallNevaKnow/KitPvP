package alohacraft.kitpvp.main.kits;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.EnchantmentWrapper;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import alohacraft.kitpvp.main.Util;

public class Hitman {
	public static Hitman hitman = new Hitman();
	@SuppressWarnings("deprecation")
	public void l1(final Player player) {
		Util.resetInv(player);
		ItemStack knife = new ItemStack(Material.BOW);
		ItemMeta knifeMeta = knife.getItemMeta();
		knifeMeta.setDisplayName(ChatColor.RED + "Hitman Bow");
		knife.setItemMeta(knifeMeta);
		knife.addUnsafeEnchantment(new EnchantmentWrapper(48), 5);
		knife.addUnsafeEnchantment(new EnchantmentWrapper(49), 2);
		
		player.getInventory().addItem(knife);
		player.getInventory().addItem(new ItemStack(Material.ARROW, 3));
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l2(final Player player) {
		Util.resetInv(player);
		ItemStack knife = new ItemStack(Material.BOW);
		ItemMeta knifeMeta = knife.getItemMeta();
		knifeMeta.setDisplayName(ChatColor.RED + "Hitman Bow");
		knife.setItemMeta(knifeMeta);
		knife.addUnsafeEnchantment(new EnchantmentWrapper(48), 5);
		knife.addUnsafeEnchantment(new EnchantmentWrapper(49), 2);

		player.getInventory().addItem(knife);
		player.getInventory().addItem(new ItemStack(Material.ARROW, 5));
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l3(final Player player) {
		Util.resetInv(player);
		ItemStack knife = new ItemStack(Material.BOW);
		ItemMeta knifeMeta = knife.getItemMeta();
		knifeMeta.setDisplayName(ChatColor.RED + "Hitman Bow");
		knife.setItemMeta(knifeMeta);
		knife.addUnsafeEnchantment(new EnchantmentWrapper(48), 5);
		knife.addUnsafeEnchantment(new EnchantmentWrapper(49), 2);
		addArmor(player, new ItemStack(Material.CHAINMAIL_HELMET), new ItemStack(0), new ItemStack(0), new ItemStack(Material.CHAINMAIL_BOOTS));
		player.getInventory().addItem(knife);
		player.getInventory().addItem(new ItemStack(Material.ARROW, 7));
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l4(final Player player) {
		Util.resetInv(player);
		ItemStack knife = new ItemStack(Material.BOW);
		ItemMeta knifeMeta = knife.getItemMeta();
		knifeMeta.setDisplayName(ChatColor.RED + "Hitman Bow");
		knife.setItemMeta(knifeMeta);
		knife.addUnsafeEnchantment(new EnchantmentWrapper(48), 5);
		knife.addUnsafeEnchantment(new EnchantmentWrapper(49), 2);
		addArmor(player, new ItemStack(Material.CHAINMAIL_HELMET), new ItemStack(0), new ItemStack(Material.CHAINMAIL_LEGGINGS), new ItemStack(Material.CHAINMAIL_BOOTS));
		player.getInventory().addItem(knife);
		player.getInventory().addItem(new ItemStack(Material.ARROW, 9));
		addSoup(player);
		player.updateInventory();
	}
	
	@SuppressWarnings("deprecation")
	public void l5(final Player player) {
		Util.resetInv(player);
		ItemStack knife = new ItemStack(Material.BOW);
		ItemMeta knifeMeta = knife.getItemMeta();
		knifeMeta.setDisplayName(ChatColor.RED + "Grand Hitman Bow");
		knife.setItemMeta(knifeMeta);
		knife.addUnsafeEnchantment(new EnchantmentWrapper(48), 5);
		knife.addUnsafeEnchantment(new EnchantmentWrapper(49), 2);
		knife.addUnsafeEnchantment(new EnchantmentWrapper(50), 1);
		addArmor(player, new ItemStack(Material.CHAINMAIL_HELMET), new ItemStack(Material.CHAINMAIL_CHESTPLATE), new ItemStack(Material.CHAINMAIL_LEGGINGS), new ItemStack(Material.CHAINMAIL_BOOTS));
		player.getInventory().addItem(knife);
		player.getInventory().addItem(new ItemStack(Material.ARROW, 10));
		player.getInventory().addItem(new ItemStack(Material.STONE_SWORD, 1));
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
