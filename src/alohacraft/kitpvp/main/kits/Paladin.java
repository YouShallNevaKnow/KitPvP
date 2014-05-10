package alohacraft.kitpvp.main.kits;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.EnchantmentWrapper;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionType;

import alohacraft.kitpvp.main.Util;

public class Paladin {
	public static Paladin paladin = new Paladin();
	@SuppressWarnings("deprecation")
	public void l1(final Player player) {
		Util.resetInv(player);
		ItemStack bchest = new ItemStack(Material.STONE_AXE, 1);
		ItemMeta bchestMeta = bchest.getItemMeta();
		bchestMeta.setDisplayName(ChatColor.YELLOW + "Level 1 Paladin Sword");
		bchest.setItemMeta(bchestMeta);
		int bchestEffect = 19;
		int bchestEnhantmentLevel = 1;
		EnchantmentWrapper bchestEnhantment = new EnchantmentWrapper(bchestEffect);
		bchest.addUnsafeEnchantment(bchestEnhantment, bchestEnhantmentLevel);
		newPotion(player, 1, PotionType.INSTANT_HEAL, 1, false);
		addArmor(player, new ItemStack(Material.CHAINMAIL_HELMET), new ItemStack(Material.CHAINMAIL_CHESTPLATE), new ItemStack(Material.CHAINMAIL_LEGGINGS), new ItemStack(Material.CHAINMAIL_BOOTS));
		player.getInventory().addItem(bchest);
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l2(final Player player) {
		Util.resetInv(player);
		ItemStack bchest = new ItemStack(Material.STONE_AXE, 1);
		ItemMeta bchestMeta = bchest.getItemMeta();
		bchestMeta.setDisplayName(ChatColor.YELLOW + "Level 2 Paladin Sword");
		bchest.setItemMeta(bchestMeta);
		int bchestEffect1 = 19;
		int bchestEnhantmentLevel1 = 2;
		EnchantmentWrapper bchestEnhantment1 = new EnchantmentWrapper(bchestEffect1);
		bchest.addUnsafeEnchantment(bchestEnhantment1, bchestEnhantmentLevel1);
		newPotion(player, 2, PotionType.INSTANT_HEAL, 1, false);
		addArmor(player, new ItemStack(Material.IRON_HELMET), new ItemStack(Material.CHAINMAIL_CHESTPLATE), new ItemStack(Material.CHAINMAIL_LEGGINGS), new ItemStack(Material.CHAINMAIL_BOOTS));
		player.getInventory().addItem(bchest);
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l3(final Player player) {
		Util.resetInv(player);
		ItemStack bchest = new ItemStack(Material.IRON_AXE, 1);
		ItemMeta bchestMeta = bchest.getItemMeta();
		bchestMeta.setDisplayName(ChatColor.YELLOW + "Level 3 Paladin Sword");
		bchest.setItemMeta(bchestMeta);
		int bchestEffect1 = 19;
		int bchestEnhantmentLevel1 = 2;
		EnchantmentWrapper bchestEnhantment1 = new EnchantmentWrapper(bchestEffect1);
		bchest.addUnsafeEnchantment(bchestEnhantment1, bchestEnhantmentLevel1);
		newPotion(player, 2, PotionType.INSTANT_HEAL, 1, false);
		newPotion(player, 1, PotionType.INSTANT_HEAL, 1, true);
		addArmor(player, new ItemStack(Material.IRON_HELMET), new ItemStack(Material.CHAINMAIL_CHESTPLATE), new ItemStack(Material.CHAINMAIL_LEGGINGS), new ItemStack(Material.IRON_BOOTS));
		player.getInventory().addItem(bchest);
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l4(final Player player) {
		Util.resetInv(player);
		ItemStack bchest = new ItemStack(Material.IRON_AXE, 1);
		ItemMeta bchestMeta = bchest.getItemMeta();
		bchestMeta.setDisplayName(ChatColor.YELLOW + "Level 4 Paladin Sword");
		bchest.setItemMeta(bchestMeta);
		int bchestEffect = 16;
		int bchestEnhantmentLevel = 1;
		EnchantmentWrapper bchestEnhantment = new EnchantmentWrapper(bchestEffect);
		bchest.addUnsafeEnchantment(bchestEnhantment, bchestEnhantmentLevel);
		int bchestEffect1 = 19;
		int bchestEnhantmentLevel1 = 2;
		EnchantmentWrapper bchestEnhantment1 = new EnchantmentWrapper(bchestEffect1);
		bchest.addUnsafeEnchantment(bchestEnhantment1, bchestEnhantmentLevel1);
		newPotion(player, 3, PotionType.INSTANT_HEAL, 1, false);
		newPotion(player, 2, PotionType.INSTANT_HEAL, 1, true);
		addArmor(player, new ItemStack(Material.IRON_HELMET), new ItemStack(Material.CHAINMAIL_CHESTPLATE), new ItemStack(Material.IRON_LEGGINGS), new ItemStack(Material.IRON_BOOTS));
		player.getInventory().addItem(bchest);
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l5(final Player player) {
		Util.resetInv(player);
		ItemStack bchest = new ItemStack(Material.IRON_AXE, 1);
		ItemMeta bchestMeta = bchest.getItemMeta();
		bchestMeta.setDisplayName(ChatColor.YELLOW + "Level 5 Paladin Sword");
		bchest.setItemMeta(bchestMeta);
		int bchestEffect = 16;
		int bchestEnhantmentLevel = 2;
		EnchantmentWrapper bchestEnhantment = new EnchantmentWrapper(bchestEffect);
		bchest.addUnsafeEnchantment(bchestEnhantment, bchestEnhantmentLevel);
		int bchestEffect1 = 19;
		int bchestEnhantmentLevel1 = 2;
		EnchantmentWrapper bchestEnhantment1 = new EnchantmentWrapper(bchestEffect1);
		bchest.addUnsafeEnchantment(bchestEnhantment1, bchestEnhantmentLevel1);
		newPotion(player, 4, PotionType.INSTANT_HEAL, 1, false);
		newPotion(player, 4, PotionType.INSTANT_HEAL, 1, true);
		addArmor(player, new ItemStack(Material.IRON_HELMET), new ItemStack(Material.IRON_CHESTPLATE), new ItemStack(Material.IRON_LEGGINGS), new ItemStack(Material.IRON_BOOTS));
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
	public void newPotion(final Player player, int amount, PotionType effect, int level, boolean splash) {
		ItemStack item = new ItemStack(Material.POTION, amount);
		Potion pot = new Potion(1); //The constructor calls for an (int name), but I'm not sure what that is... I tried 1 and it works fine.
		pot.setType(effect);
		pot.setHasExtendedDuration(false);
		pot.setSplash(splash);
		pot.setLevel(level);
		pot.apply(item);
		player.getInventory().addItem(item);
	}
}
