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

public class Druid {
	public static Druid druid = new Druid();
	@SuppressWarnings("deprecation")
	public void l1(final Player player) {
		Util.resetInv(player);
		ItemStack bchest = new ItemStack(Material.RED_ROSE, 1);
		ItemMeta bchestMeta = bchest.getItemMeta();
		bchestMeta.setDisplayName(ChatColor.DARK_RED + "Rosella");
		bchest.setItemMeta(bchestMeta);
		int bchestEffect = 16;
		int bchestEnhantmentLevel = 1;
		EnchantmentWrapper bchestEnhantment = new EnchantmentWrapper(bchestEffect);
		bchest.addUnsafeEnchantment(bchestEnhantment, bchestEnhantmentLevel);
		
		ItemStack helm = new ItemStack(Material.LEATHER_HELMET, 1);
		int helmEffect = 7;
		int helmEnhantmentLevel = 1;
		EnchantmentWrapper helmEnhantment = new EnchantmentWrapper(helmEffect);
		bchest.addUnsafeEnchantment(helmEnhantment, helmEnhantmentLevel);
		
		ItemStack chest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
		int chestEffect = 7;
		int chestEnhantmentLevel = 1;
		EnchantmentWrapper chestEnhantment = new EnchantmentWrapper(chestEffect);
		bchest.addUnsafeEnchantment(chestEnhantment, chestEnhantmentLevel);
		
		ItemStack legs = new ItemStack(Material.LEATHER_LEGGINGS, 1);
		int legsEffect = 7;
		int legsEnhantmentLevel = 1;
		EnchantmentWrapper legsEnhantment = new EnchantmentWrapper(legsEffect);
		bchest.addUnsafeEnchantment(legsEnhantment, legsEnhantmentLevel);
		
		ItemStack boots = new ItemStack(Material.LEATHER_BOOTS, 1);
		int bootsEffect = 7;
		int bootsEnhantmentLevel = 1;
		EnchantmentWrapper bootsEnhantment = new EnchantmentWrapper(bootsEffect);
		bchest.addUnsafeEnchantment(bootsEnhantment, bootsEnhantmentLevel);
		
		player.getInventory().addItem(new ItemStack(bchest));
		addArmor(player, helm, chest, legs, boots);
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l2(final Player player) {
		Util.resetInv(player);
		ItemStack bchest = new ItemStack(Material.RED_ROSE, 1);
		ItemMeta bchestMeta = bchest.getItemMeta();
		bchestMeta.setDisplayName(ChatColor.DARK_RED + "Rosella");
		bchest.setItemMeta(bchestMeta);
		int bchestEffect = 16;
		int bchestEnhantmentLevel = 1;
		EnchantmentWrapper bchestEnhantment = new EnchantmentWrapper(bchestEffect);
		bchest.addUnsafeEnchantment(bchestEnhantment, bchestEnhantmentLevel);
		
		ItemStack helm = new ItemStack(Material.CHAINMAIL_HELMET, 1);
		int helmEffect = 7;
		int helmEnhantmentLevel = 1;
		EnchantmentWrapper helmEnhantment = new EnchantmentWrapper(helmEffect);
		bchest.addUnsafeEnchantment(helmEnhantment, helmEnhantmentLevel);
		
		ItemStack chest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
		int chestEffect = 7;
		int chestEnhantmentLevel = 1;
		EnchantmentWrapper chestEnhantment = new EnchantmentWrapper(chestEffect);
		bchest.addUnsafeEnchantment(chestEnhantment, chestEnhantmentLevel);
		
		ItemStack legs = new ItemStack(Material.LEATHER_LEGGINGS, 1);
		int legsEffect = 7;
		int legsEnhantmentLevel = 1;
		EnchantmentWrapper legsEnhantment = new EnchantmentWrapper(legsEffect);
		bchest.addUnsafeEnchantment(legsEnhantment, legsEnhantmentLevel);
		
		ItemStack boots = new ItemStack(Material.LEATHER_BOOTS, 1);
		int bootsEffect = 7;
		int bootsEnhantmentLevel = 1;
		EnchantmentWrapper bootsEnhantment = new EnchantmentWrapper(bootsEffect);
		bchest.addUnsafeEnchantment(bootsEnhantment, bootsEnhantmentLevel);
		
		newPotion(player, 1, PotionType.INSTANT_HEAL, 1, false);

		player.getInventory().addItem(new ItemStack(bchest));

		addArmor(player, helm, chest, legs, boots);
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l3(final Player player) {
		Util.resetInv(player);
		ItemStack bchest = new ItemStack(Material.RED_ROSE, 1);
		ItemMeta bchestMeta = bchest.getItemMeta();
		bchestMeta.setDisplayName(ChatColor.DARK_RED + "Rosella");
		bchest.setItemMeta(bchestMeta);
		int bchestEffect = 16;
		int bchestEnhantmentLevel = 1;
		EnchantmentWrapper bchestEnhantment = new EnchantmentWrapper(bchestEffect);
		bchest.addUnsafeEnchantment(bchestEnhantment, bchestEnhantmentLevel);
		
		ItemStack helm = new ItemStack(Material.CHAINMAIL_HELMET, 1);
		int helmEffect = 7;
		int helmEnhantmentLevel = 2;
		EnchantmentWrapper helmEnhantment = new EnchantmentWrapper(helmEffect);
		bchest.addUnsafeEnchantment(helmEnhantment, helmEnhantmentLevel);
		
		ItemStack chest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
		int chestEffect = 7;
		int chestEnhantmentLevel = 2;
		EnchantmentWrapper chestEnhantment = new EnchantmentWrapper(chestEffect);
		bchest.addUnsafeEnchantment(chestEnhantment, chestEnhantmentLevel);
		
		ItemStack legs = new ItemStack(Material.LEATHER_LEGGINGS, 1);
		int legsEffect = 7;
		int legsEnhantmentLevel = 2;
		EnchantmentWrapper legsEnhantment = new EnchantmentWrapper(legsEffect);
		bchest.addUnsafeEnchantment(legsEnhantment, legsEnhantmentLevel);
		
		ItemStack boots = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
		int bootsEffect = 7;
		int bootsEnhantmentLevel = 2;
		EnchantmentWrapper bootsEnhantment = new EnchantmentWrapper(bootsEffect);
		bchest.addUnsafeEnchantment(bootsEnhantment, bootsEnhantmentLevel);
		
		newPotion(player, 2, PotionType.INSTANT_HEAL, 1, false);
		newPotion(player, 2, PotionType.INSTANT_HEAL, 1, true);
		
		player.getInventory().addItem(new ItemStack(bchest));
		addArmor(player, helm, chest, legs, boots);
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l4(final Player player) {
		Util.resetInv(player);
		ItemStack bchest = new ItemStack(Material.RED_ROSE, 1);
		ItemMeta bchestMeta = bchest.getItemMeta();
		bchestMeta.setDisplayName(ChatColor.DARK_RED + "Rosella");
		bchest.setItemMeta(bchestMeta);
		int bchestEffect = 16;
		int bchestEnhantmentLevel = 2;
		EnchantmentWrapper bchestEnhantment = new EnchantmentWrapper(bchestEffect);
		bchest.addUnsafeEnchantment(bchestEnhantment, bchestEnhantmentLevel);
		
		ItemStack helm = new ItemStack(Material.CHAINMAIL_HELMET, 1);
		int helmEffect = 7;
		int helmEnhantmentLevel = 2;
		EnchantmentWrapper helmEnhantment = new EnchantmentWrapper(helmEffect);
		bchest.addUnsafeEnchantment(helmEnhantment, helmEnhantmentLevel);
		
		ItemStack chest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
		int chestEffect = 7;
		int chestEnhantmentLevel = 2;
		EnchantmentWrapper chestEnhantment = new EnchantmentWrapper(chestEffect);
		bchest.addUnsafeEnchantment(chestEnhantment, chestEnhantmentLevel);
		
		ItemStack legs = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
		int legsEffect = 7;
		int legsEnhantmentLevel = 2;
		EnchantmentWrapper legsEnhantment = new EnchantmentWrapper(legsEffect);
		bchest.addUnsafeEnchantment(legsEnhantment, legsEnhantmentLevel);
		
		ItemStack boots = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
		int bootsEffect = 7;
		int bootsEnhantmentLevel = 2;
		EnchantmentWrapper bootsEnhantment = new EnchantmentWrapper(bootsEffect);
		bchest.addUnsafeEnchantment(bootsEnhantment, bootsEnhantmentLevel);
		
		newPotion(player, 3, PotionType.INSTANT_HEAL, 1, false);
		newPotion(player, 3, PotionType.INSTANT_HEAL, 1, true);
		
		player.getInventory().addItem(new ItemStack(bchest));
		addArmor(player, helm, chest, legs, boots);
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l5(final Player player) {
		Util.resetInv(player);
		ItemStack bchest = new ItemStack(Material.RED_ROSE, 1);
		ItemMeta bchestMeta = bchest.getItemMeta();
		bchestMeta.setDisplayName(ChatColor.DARK_RED + "Rosella");
		bchest.setItemMeta(bchestMeta);
		int bchestEffect = 16;
		int bchestEnhantmentLevel = 2;
		EnchantmentWrapper bchestEnhantment = new EnchantmentWrapper(bchestEffect);
		bchest.addUnsafeEnchantment(bchestEnhantment, bchestEnhantmentLevel);
		
		ItemStack helm = new ItemStack(Material.CHAINMAIL_HELMET, 1);
		int helmEffect = 7;
		int helmEnhantmentLevel = 3;
		EnchantmentWrapper helmEnhantment = new EnchantmentWrapper(helmEffect);
		bchest.addUnsafeEnchantment(helmEnhantment, helmEnhantmentLevel);
		
		ItemStack chest = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
		int chestEffect = 7;
		int chestEnhantmentLevel = 3;
		EnchantmentWrapper chestEnhantment = new EnchantmentWrapper(chestEffect);
		bchest.addUnsafeEnchantment(chestEnhantment, chestEnhantmentLevel);
		
		ItemStack legs = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
		int legsEffect = 7;
		int legsEnhantmentLevel = 3;
		EnchantmentWrapper legsEnhantment = new EnchantmentWrapper(legsEffect);
		bchest.addUnsafeEnchantment(legsEnhantment, legsEnhantmentLevel);
		
		ItemStack boots = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
		int bootsEffect = 7;
		int bootsEnhantmentLevel = 3;
		EnchantmentWrapper bootsEnhantment = new EnchantmentWrapper(bootsEffect);
		bchest.addUnsafeEnchantment(bootsEnhantment, bootsEnhantmentLevel);
		
		newPotion(player, 4, PotionType.INSTANT_HEAL, 1, false);
		newPotion(player, 4, PotionType.INSTANT_HEAL, 1, true);
		
		player.getInventory().addItem(new ItemStack(bchest));
		addArmor(player, helm, chest, legs, boots);
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
