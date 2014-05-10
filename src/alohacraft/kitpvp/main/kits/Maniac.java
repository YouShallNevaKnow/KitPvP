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

public class Maniac {
	public static Maniac maniac = new Maniac();
	@SuppressWarnings("deprecation")
	public void l1(final Player player) {
		Util.resetInv(player);
		player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100000, 1));
		ItemStack bchest = new ItemStack(Material.IRON_SWORD, 1);
		ItemMeta bchestMeta = bchest.getItemMeta();
		bchestMeta.setDisplayName(ChatColor.AQUA + "Level 1 Maniac Sword");
		bchest.setItemMeta(bchestMeta);
		int bchestEffect = 16;
		int bchestEnhantmentLevel = 2;
		EnchantmentWrapper bchestEnhantment = new EnchantmentWrapper(bchestEffect);
		bchest.addUnsafeEnchantment(bchestEnhantment, bchestEnhantmentLevel);
		player.getInventory().addItem(bchest);
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l2(final Player player) {
		Util.resetInv(player);
		player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100000, 2));
		ItemStack bchest = new ItemStack(Material.IRON_SWORD, 1);
		ItemMeta bchestMeta = bchest.getItemMeta();
		bchestMeta.setDisplayName(ChatColor.AQUA + "Level 2 Maniac Sword");
		bchest.setItemMeta(bchestMeta);
		int bchestEffect = 16;
		int bchestEnhantmentLevel = 2;
		EnchantmentWrapper bchestEnhantment = new EnchantmentWrapper(bchestEffect);
		bchest.addUnsafeEnchantment(bchestEnhantment, bchestEnhantmentLevel);
		player.getInventory().addItem(bchest);
		player.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET));
		player.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS));
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l3(final Player player) {
		Util.resetInv(player);
		player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100000, 3));
		ItemStack bchest = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta bchestMeta = bchest.getItemMeta();
		bchestMeta.setDisplayName(ChatColor.AQUA + "Level 3 Maniac Sword");
		bchest.setItemMeta(bchestMeta);
		int bchestEffect = 16;
		int bchestEnhantmentLevel = 1;
		EnchantmentWrapper bchestEnhantment = new EnchantmentWrapper(bchestEffect);
		bchest.addUnsafeEnchantment(bchestEnhantment, bchestEnhantmentLevel);
		player.getInventory().addItem(bchest);
		player.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET));
		player.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS));
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l4(final Player player) {
		Util.resetInv(player);
		player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100000, 4));
		ItemStack bchest = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta bchestMeta = bchest.getItemMeta();
		bchestMeta.setDisplayName(ChatColor.AQUA + "Level 4 Maniac Sword");
		bchest.setItemMeta(bchestMeta);
		int bchestEffect = 16;
		int bchestEnhantmentLevel = 1;
		EnchantmentWrapper bchestEnhantment = new EnchantmentWrapper(bchestEffect);
		bchest.addUnsafeEnchantment(bchestEnhantment, bchestEnhantmentLevel);
		player.getInventory().addItem(bchest);
		player.getInventory().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
		player.getInventory().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l5(final Player player) {
		Util.resetInv(player);
		player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100000, 5));
		ItemStack bchest = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta bchestMeta = bchest.getItemMeta();
		bchestMeta.setDisplayName(ChatColor.AQUA + "Level 5 Maniac Sword");
		bchest.setItemMeta(bchestMeta);
		int bchestEffect = 16;
		int bchestEnhantmentLevel = 3;
		EnchantmentWrapper bchestEnhantment = new EnchantmentWrapper(bchestEffect);
		bchest.addUnsafeEnchantment(bchestEnhantment, bchestEnhantmentLevel);
		player.getInventory().addItem(bchest);
		player.getInventory().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
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
