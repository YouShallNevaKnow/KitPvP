package alohacraft.kitpvp.main.kits;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.EnchantmentWrapper;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Fireny {
	public static Fireny fireny = new Fireny();
	@SuppressWarnings("deprecation")
	public void l1(final Player player) {
		player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 100000, 1));
		addArmor(player, new ItemStack(Material.CHAINMAIL_HELMET), new ItemStack(Material.CHAINMAIL_CHESTPLATE), new ItemStack(Material.CHAINMAIL_LEGGINGS), new ItemStack(Material.CHAINMAIL_BOOTS));
		player.getInventory().addItem(new ItemStack(Material.WOOD_SWORD, 1));
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l2(final Player player) {
		player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 100000, 1));
		addArmor(player, new ItemStack(Material.IRON_HELMET), new ItemStack(Material.CHAINMAIL_CHESTPLATE), new ItemStack(Material.CHAINMAIL_LEGGINGS), new ItemStack(Material.CHAINMAIL_BOOTS));
		ItemStack bchest = new ItemStack(Material.WOOD_SWORD, 1);
		ItemMeta bchestMeta = bchest.getItemMeta();
		bchestMeta.setDisplayName(ChatColor.GOLD + "Level 2 Fireny Sword");
		bchest.setItemMeta(bchestMeta);
		EnchantmentWrapper entype = new EnchantmentWrapper(20);
		bchest.addUnsafeEnchantment(entype, 1);
		player.getInventory().addItem(bchest);
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l3(final Player player) {
		player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 100000, 1));
		addArmor(player, new ItemStack(Material.IRON_HELMET), new ItemStack(Material.CHAINMAIL_CHESTPLATE), new ItemStack(Material.CHAINMAIL_LEGGINGS), new ItemStack(Material.IRON_BOOTS));
		ItemStack bchest = new ItemStack(Material.STONE_SWORD, 1);
		ItemMeta bchestMeta = bchest.getItemMeta();
		bchestMeta.setDisplayName(ChatColor.GOLD + "Level 3 Fireny Sword");
		bchest.setItemMeta(bchestMeta);
		EnchantmentWrapper entype = new EnchantmentWrapper(20);
		bchest.addUnsafeEnchantment(entype, 1);
		player.getInventory().addItem(bchest);
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l4(final Player player) {
		player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 100000, 2));
		addArmor(player, new ItemStack(Material.IRON_HELMET), new ItemStack(Material.CHAINMAIL_CHESTPLATE), new ItemStack(Material.IRON_LEGGINGS), new ItemStack(Material.IRON_BOOTS));
		ItemStack bchest = new ItemStack(Material.STONE_SWORD, 1);
		ItemMeta bchestMeta = bchest.getItemMeta();
		bchestMeta.setDisplayName(ChatColor.GOLD + "Level 4 Fireny Sword");
		bchest.setItemMeta(bchestMeta);
		EnchantmentWrapper entype = new EnchantmentWrapper(20);
		bchest.addUnsafeEnchantment(entype, 1);
		player.getInventory().addItem(bchest);
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l5(final Player player) {
		player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 100000, 2));
		addArmor(player, new ItemStack(Material.IRON_HELMET), new ItemStack(Material.IRON_CHESTPLATE), new ItemStack(Material.IRON_LEGGINGS), new ItemStack(Material.IRON_BOOTS));
		ItemStack bchest = new ItemStack(Material.IRON_SWORD, 1);
		ItemMeta bchestMeta = bchest.getItemMeta();
		bchestMeta.setDisplayName(ChatColor.GOLD + "Level 5 Fireny Sword");
		bchest.setItemMeta(bchestMeta);
		EnchantmentWrapper entype = new EnchantmentWrapper(20);
		bchest.addUnsafeEnchantment(entype, 1);
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
