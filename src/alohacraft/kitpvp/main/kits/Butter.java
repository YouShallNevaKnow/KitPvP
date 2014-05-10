package alohacraft.kitpvp.main.kits;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.EnchantmentWrapper;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import alohacraft.kitpvp.main.Util;

public class Butter {
	public static Butter butter = new Butter();
	@SuppressWarnings("deprecation")
	public void l1(final Player player) {
		Util.resetInv(player);
		ItemStack bchest = new ItemStack(Material.GOLD_INGOT, 1);
		ItemMeta bchestMeta = bchest.getItemMeta();
		bchestMeta.setDisplayName(ChatColor.GOLD + "Butter");
		bchest.setItemMeta(bchestMeta);
		int bchestEffect = 16;
		int bchestEnhantmentLevel = 1;
		EnchantmentWrapper bchestEnhantment = new EnchantmentWrapper(bchestEffect);
		bchest.addUnsafeEnchantment(bchestEnhantment, bchestEnhantmentLevel);
		int bchestEffect2 = 19;
		int bchestEnhantmentLevel2 = 1;
		EnchantmentWrapper bchestEnhantment2 = new EnchantmentWrapper(bchestEffect2);
		bchest.addUnsafeEnchantment(bchestEnhantment2, bchestEnhantmentLevel2);
		player.getInventory().addItem(new ItemStack(bchest));
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l2(final Player player) {
		Util.resetInv(player);
		addArmor(player, new ItemStack(Material.GOLD_HELMET), new ItemStack(0), new ItemStack(0), new ItemStack(0));
		ItemStack bchest = new ItemStack(Material.GOLD_INGOT, 1);
		ItemMeta bchestMeta = bchest.getItemMeta();
		bchestMeta.setDisplayName(ChatColor.GOLD + "Butter");
		bchest.setItemMeta(bchestMeta);
		int bchestEffect = 16;
		int bchestEnhantmentLevel = 1;
		EnchantmentWrapper bchestEnhantment = new EnchantmentWrapper(bchestEffect);
		bchest.addUnsafeEnchantment(bchestEnhantment, bchestEnhantmentLevel);
		int bchestEffect2 = 19;
		int bchestEnhantmentLevel2 = 2;
		EnchantmentWrapper bchestEnhantment2 = new EnchantmentWrapper(bchestEffect2);
		bchest.addUnsafeEnchantment(bchestEnhantment2, bchestEnhantmentLevel2);
		player.getInventory().addItem(new ItemStack(bchest));
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l3(final Player player) {
		Util.resetInv(player);
		addArmor(player, new ItemStack(Material.GOLD_HELMET), new ItemStack(0), new ItemStack(0), new ItemStack(Material.GOLD_BOOTS));
		ItemStack bchest = new ItemStack(Material.GOLD_INGOT, 1);
		ItemMeta bchestMeta = bchest.getItemMeta();
		bchestMeta.setDisplayName(ChatColor.GOLD + "Butter");
		bchest.setItemMeta(bchestMeta);
		int bchestEffect = 16;
		int bchestEnhantmentLevel = 2;
		EnchantmentWrapper bchestEnhantment = new EnchantmentWrapper(bchestEffect);
		bchest.addUnsafeEnchantment(bchestEnhantment, bchestEnhantmentLevel);
		int bchestEffect2 = 19;
		int bchestEnhantmentLevel2 = 2;
		EnchantmentWrapper bchestEnhantment2 = new EnchantmentWrapper(bchestEffect2);
		bchest.addUnsafeEnchantment(bchestEnhantment2, bchestEnhantmentLevel2);
		player.getInventory().addItem(new ItemStack(bchest));
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l4(final Player player) {
		Util.resetInv(player);
		addArmor(player, new ItemStack(Material.GOLD_HELMET), new ItemStack(0), new ItemStack(Material.GOLD_LEGGINGS), new ItemStack(Material.GOLD_BOOTS));
		ItemStack bchest = new ItemStack(Material.GOLD_INGOT, 1);
		ItemMeta bchestMeta = bchest.getItemMeta();
		bchestMeta.setDisplayName(ChatColor.GOLD + "Butter");
		bchest.setItemMeta(bchestMeta);
		int bchestEffect = 16;
		int bchestEnhantmentLevel = 2;
		EnchantmentWrapper bchestEnhantment = new EnchantmentWrapper(bchestEffect);
		bchest.addUnsafeEnchantment(bchestEnhantment, bchestEnhantmentLevel);
		int bchestEffect2 = 19;
		int bchestEnhantmentLevel2 = 2;
		EnchantmentWrapper bchestEnhantment2 = new EnchantmentWrapper(bchestEffect2);
		bchest.addUnsafeEnchantment(bchestEnhantment2, bchestEnhantmentLevel2);
		player.getInventory().addItem(new ItemStack(bchest));
		addSoup(player);
		player.updateInventory();
	}	
	@SuppressWarnings("deprecation")
	public void l5(final Player player) {
		Util.resetInv(player);
		addArmor(player, new ItemStack(Material.GOLD_HELMET), new ItemStack(Material.GOLD_CHESTPLATE), new ItemStack(Material.GOLD_LEGGINGS), new ItemStack(Material.GOLD_BOOTS));
		ItemStack bchest = new ItemStack(Material.GOLD_INGOT, 1);
		ItemMeta bchestMeta = bchest.getItemMeta();
		bchestMeta.setDisplayName(ChatColor.GOLD + "Butter");
		bchest.setItemMeta(bchestMeta);
		int bchestEffect = 16;
		int bchestEnhantmentLevel = 3;
		EnchantmentWrapper bchestEnhantment = new EnchantmentWrapper(bchestEffect);
		bchest.addUnsafeEnchantment(bchestEnhantment, bchestEnhantmentLevel);
		int bchestEffect2 = 19;
		int bchestEnhantmentLevel2 = 2;
		EnchantmentWrapper bchestEnhantment2 = new EnchantmentWrapper(bchestEffect2);
		bchest.addUnsafeEnchantment(bchestEnhantment2, bchestEnhantmentLevel2);
		player.getInventory().addItem(new ItemStack(bchest));
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
