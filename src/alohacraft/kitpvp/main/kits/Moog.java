package alohacraft.kitpvp.main.kits;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.EnchantmentWrapper;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import alohacraft.kitpvp.main.Util;

public class Moog {
	@SuppressWarnings("deprecation")
	public static void l5(final Player player) {
		Util.resetInv(player);
		player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100000, 3));
		ItemStack knife = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta knifeMeta = knife.getItemMeta();
		knifeMeta.setDisplayName(ChatColor.GOLD + "Sword of the Moog");
		knife.setItemMeta(knifeMeta);
		knife.addUnsafeEnchantment(new EnchantmentWrapper(16), 5);
		knife.addUnsafeEnchantment(new EnchantmentWrapper(19), 2);
		knife.addUnsafeEnchantment(new EnchantmentWrapper(20), 2);
		addArmor(player, new ItemStack(Material.CHAINMAIL_HELMET), new ItemStack(Material.CHAINMAIL_CHESTPLATE), new ItemStack(Material.CHAINMAIL_LEGGINGS), new ItemStack(Material.CHAINMAIL_BOOTS));
		player.getInventory().addItem(knife);
		addSoup(player);
		player.updateInventory();
	}

	public static void addArmor(final Player player, ItemStack a, ItemStack b, ItemStack c, ItemStack d) {
		player.getInventory().setHelmet(a);
		player.getInventory().setChestplate(b);
		player.getInventory().setLeggings(c);
		player.getInventory().setBoots(d);
	}
	public static void addSoup(final Player player) {
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
