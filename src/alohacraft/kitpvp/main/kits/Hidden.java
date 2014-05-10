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

public class Hidden {
	public static Hidden hidden = new Hidden();
	@SuppressWarnings("deprecation")
	public void l1(final Player player) {
		Util.resetInv(player);
		player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 100000, 0));
		addArmor(player, new ItemStack(Material.CHAINMAIL_HELMET), new ItemStack(Material.LEATHER_CHESTPLATE), new ItemStack(Material.CHAINMAIL_LEGGINGS), new ItemStack(Material.CHAINMAIL_BOOTS));
		player.getInventory().addItem(new ItemStack(Material.WOOD_SWORD, 1));
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l2(final Player player) {
		Util.resetInv(player);
		player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 100000, 0));
		addArmor(player, new ItemStack(Material.CHAINMAIL_HELMET), new ItemStack(Material.LEATHER_CHESTPLATE), new ItemStack(Material.CHAINMAIL_LEGGINGS), new ItemStack(0));
		player.getInventory().addItem(new ItemStack(Material.STONE_SWORD, 1));
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l3(final Player player) {
		Util.resetInv(player);
		player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 100000, 0));
		addArmor(player, new ItemStack(0), new ItemStack(Material.LEATHER_CHESTPLATE), new ItemStack(Material.CHAINMAIL_LEGGINGS), new ItemStack(0));
		player.getInventory().addItem(new ItemStack(Material.IRON_SWORD, 1)); 
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l4(final Player player) {
		Util.resetInv(player);
		player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 100000, 0));
		player.getInventory().addItem(new ItemStack(Material.DIAMOND_SWORD, 1));
		addArmor(player, new ItemStack(0), new ItemStack(0), new ItemStack(Material.CHAINMAIL_LEGGINGS), new ItemStack(0));
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l5(final Player player) {
		Util.resetInv(player);
		player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 100000, 0));
		ItemStack bchest = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta bchestMeta = bchest.getItemMeta();
		bchestMeta.setDisplayName(ChatColor.DARK_PURPLE + "Level 5 Hidden Sword");
		bchest.setItemMeta(bchestMeta);
		int bchestEffect = 16;
		int bchestEnhantmentLevel = 1;
		EnchantmentWrapper bchestEnhantment = new EnchantmentWrapper(bchestEffect);
		bchest.addUnsafeEnchantment(bchestEnhantment, bchestEnhantmentLevel);
		player.getInventory().addItem(bchest);
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
