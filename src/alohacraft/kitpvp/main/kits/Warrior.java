package alohacraft.kitpvp.main.kits;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.EnchantmentWrapper;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import alohacraft.kitpvp.main.Util;

public class Warrior {
	public static Warrior warrior = new Warrior();
	@SuppressWarnings("deprecation")
	public void l1(final Player player) {
		Util.resetInv(player);
		addArmor(player, new ItemStack(Material.CHAINMAIL_HELMET), new ItemStack(Material.CHAINMAIL_CHESTPLATE), new ItemStack(Material.CHAINMAIL_LEGGINGS), new ItemStack(Material.CHAINMAIL_BOOTS));
		player.getInventory().addItem(new ItemStack(Material.IRON_SWORD));
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l2(final Player player) {
		Util.resetInv(player);
		addArmor(player, new ItemStack(Material.IRON_HELMET), new ItemStack(Material.CHAINMAIL_CHESTPLATE), new ItemStack(Material.CHAINMAIL_LEGGINGS), new ItemStack(Material.IRON_BOOTS));
		player.getInventory().addItem(new ItemStack(Material.IRON_SWORD));
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l3(final Player player) {
		Util.resetInv(player);
		ItemStack bchest = new ItemStack(Material.IRON_SWORD, 1);
		ItemMeta bchestMeta = bchest.getItemMeta();
		bchestMeta.setDisplayName(ChatColor.DARK_RED + "Level 3 Warrior Sword");
		bchest.setItemMeta(bchestMeta);
		int bchestEffect = 16;
		int bchestEnhantmentLevel = 1;
		EnchantmentWrapper bchestEnhantment = new EnchantmentWrapper(bchestEffect);
		bchest.addUnsafeEnchantment(bchestEnhantment, bchestEnhantmentLevel);
		addArmor(player, new ItemStack(Material.IRON_HELMET), new ItemStack(Material.CHAINMAIL_CHESTPLATE), new ItemStack(Material.IRON_LEGGINGS), new ItemStack(Material.IRON_BOOTS));
		player.getInventory().addItem(bchest);
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l4(final Player player) {
		Util.resetInv(player);
		ItemStack bchest = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta bchestMeta = bchest.getItemMeta();
		bchestMeta.setDisplayName(ChatColor.DARK_RED + "Level 4 Warrior Sword");
		bchest.setItemMeta(bchestMeta);
		int bchestEffect = 16;
		int bchestEnhantmentLevel = 1;
		EnchantmentWrapper bchestEnhantment = new EnchantmentWrapper(bchestEffect);
		bchest.addUnsafeEnchantment(bchestEnhantment, bchestEnhantmentLevel);
		int bchestEffect1 = 19;
		int bchestEnhantmentLevel1 = 1;
		EnchantmentWrapper bchestEnhantment1 = new EnchantmentWrapper(bchestEffect1);
		bchest.addUnsafeEnchantment(bchestEnhantment1, bchestEnhantmentLevel1);
		addArmor(player, new ItemStack(Material.IRON_HELMET), new ItemStack(Material.CHAINMAIL_CHESTPLATE), new ItemStack(Material.IRON_LEGGINGS), new ItemStack(Material.IRON_BOOTS));
		player.getInventory().addItem(bchest);
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l5(final Player player) {
		Util.resetInv(player);
		ItemStack bchest = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta bchestMeta = bchest.getItemMeta();
		bchestMeta.setDisplayName(ChatColor.DARK_RED + "Level 5 Warrior Sword");
		bchest.setItemMeta(bchestMeta);
		int bchestEffect = 16;
		int bchestEnhantmentLevel = 1;
		EnchantmentWrapper bchestEnhantment = new EnchantmentWrapper(bchestEffect);
		bchest.addUnsafeEnchantment(bchestEnhantment, bchestEnhantmentLevel);
		int bchestEffect1 = 19;
		int bchestEnhantmentLevel1 = 1;
		EnchantmentWrapper bchestEnhantment1 = new EnchantmentWrapper(bchestEffect1);
		bchest.addUnsafeEnchantment(bchestEnhantment1, bchestEnhantmentLevel1);
		
		ItemStack chest = new ItemStack(Material.IRON_CHESTPLATE);
		ItemMeta chestMeta = chest.getItemMeta();
		chestMeta.setDisplayName(ChatColor.DARK_RED + "Level 5 Warrior Chestplate");
		chest.setItemMeta(chestMeta);
		int chestEffect = 7;
		int chestEnhantmentLevel = 2;
		EnchantmentWrapper chestEnhantment = new EnchantmentWrapper(chestEffect);
		chest.addUnsafeEnchantment(chestEnhantment, chestEnhantmentLevel);
		
		addArmor(player, new ItemStack(Material.IRON_HELMET), chest, new ItemStack(Material.IRON_LEGGINGS), new ItemStack(Material.IRON_BOOTS));
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
