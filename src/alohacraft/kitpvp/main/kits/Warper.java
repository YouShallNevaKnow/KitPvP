package alohacraft.kitpvp.main.kits;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.EnchantmentWrapper;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import alohacraft.kitpvp.main.Util;


public class Warper {
	public static Warper warper = new Warper();
	@SuppressWarnings("deprecation")
	public void l1(final Player player) {
		Util.resetInv(player);
		addArmor(player, new ItemStack(Material.CHAINMAIL_HELMET), new ItemStack(Material.CHAINMAIL_CHESTPLATE), new ItemStack(Material.CHAINMAIL_LEGGINGS), new ItemStack(Material.CHAINMAIL_BOOTS));
		player.getInventory().addItem(new ItemStack(Material.STONE_SWORD, 1));
		player.getInventory().addItem(new ItemStack(Material.ENDER_PEARL, 2));
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l2(final Player player) {
		Util.resetInv(player);
		ItemStack bchest = new ItemStack(Material.STONE_SWORD, 1);
		ItemMeta bchestMeta = bchest.getItemMeta();
		bchestMeta.setDisplayName(ChatColor.DARK_RED + "Level 2 Warper Sword");
		bchest.setItemMeta(bchestMeta);
		int bchestEffect = 19;
		int bchestEnhantmentLevel = 1;
		EnchantmentWrapper bchestEnhantment = new EnchantmentWrapper(bchestEffect);
		bchest.addUnsafeEnchantment(bchestEnhantment, bchestEnhantmentLevel);
		
		addArmor(player, new ItemStack(Material.IRON_HELMET), new ItemStack(Material.CHAINMAIL_CHESTPLATE), new ItemStack(Material.CHAINMAIL_LEGGINGS), new ItemStack(Material.CHAINMAIL_BOOTS));
		player.getInventory().addItem(bchest);
		player.getInventory().addItem(new ItemStack(Material.ENDER_PEARL, 4));
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l3(final Player player) {
		Util.resetInv(player);
		ItemStack bchest = new ItemStack(Material.IRON_SWORD, 1);
		ItemMeta bchestMeta = bchest.getItemMeta();
		bchestMeta.setDisplayName(ChatColor.DARK_RED + "Level 3 Warper Sword");
		bchest.setItemMeta(bchestMeta);
		int bchestEffect1 = 19;
		int bchestEnhantmentLevel1 = 2;
		EnchantmentWrapper bchestEnhantment1 = new EnchantmentWrapper(bchestEffect1);
		bchest.addUnsafeEnchantment(bchestEnhantment1, bchestEnhantmentLevel1);
	
		addArmor(player, new ItemStack(Material.IRON_HELMET), new ItemStack(Material.CHAINMAIL_CHESTPLATE), new ItemStack(Material.CHAINMAIL_LEGGINGS), new ItemStack(Material.IRON_BOOTS));
		player.getInventory().addItem(bchest);
		player.getInventory().addItem(new ItemStack(Material.ENDER_PEARL, 6));
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l4(final Player player) {
		Util.resetInv(player);
		ItemStack bchest = new ItemStack(Material.IRON_SWORD, 1);
		ItemMeta bchestMeta = bchest.getItemMeta();
		bchestMeta.setDisplayName(ChatColor.DARK_RED + "Level 4 Warper Sword");
		bchest.setItemMeta(bchestMeta);
		int bchestEffect = 16;
		int bchestEnhantmentLevel = 1;
		EnchantmentWrapper bchestEnhantment = new EnchantmentWrapper(bchestEffect);
		bchest.addUnsafeEnchantment(bchestEnhantment, bchestEnhantmentLevel);
		int bchestEffect1 = 19;
		int bchestEnhantmentLevel1 = 2;
		EnchantmentWrapper bchestEnhantment1 = new EnchantmentWrapper(bchestEffect1);
		bchest.addUnsafeEnchantment(bchestEnhantment1, bchestEnhantmentLevel1);

		addArmor(player, new ItemStack(Material.IRON_HELMET), new ItemStack(Material.CHAINMAIL_CHESTPLATE), new ItemStack(Material.IRON_LEGGINGS), new ItemStack(Material.IRON_BOOTS));
		player.getInventory().addItem(bchest);
		player.getInventory().addItem(new ItemStack(Material.ENDER_PEARL, 8));
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l5(final Player player) {
		Util.resetInv(player);
		ItemStack bchest = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta bchestMeta = bchest.getItemMeta();
		bchestMeta.setDisplayName(ChatColor.DARK_RED + "Level 5 Warper Sword");
		bchest.setItemMeta(bchestMeta);
		int bchestEffect = 16;
		int bchestEnhantmentLevel = 1;
		EnchantmentWrapper bchestEnhantment = new EnchantmentWrapper(bchestEffect);
		bchest.addUnsafeEnchantment(bchestEnhantment, bchestEnhantmentLevel);
		int bchestEffect1 = 19;
		int bchestEnhantmentLevel1 = 2;
		EnchantmentWrapper bchestEnhantment1 = new EnchantmentWrapper(bchestEffect1);
		bchest.addUnsafeEnchantment(bchestEnhantment1, bchestEnhantmentLevel1);
		addArmor(player, new ItemStack(Material.IRON_HELMET), new ItemStack(Material.IRON_CHESTPLATE), new ItemStack(Material.IRON_LEGGINGS), new ItemStack(Material.IRON_BOOTS));
		player.getInventory().addItem(bchest);
		player.getInventory().addItem(new ItemStack(Material.ENDER_PEARL, 10));
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
