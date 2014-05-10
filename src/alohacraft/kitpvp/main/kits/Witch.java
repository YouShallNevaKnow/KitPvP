package alohacraft.kitpvp.main.kits;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionType;

import alohacraft.kitpvp.main.Util;

public class Witch {
	public static Witch witch = new Witch();
	@SuppressWarnings("deprecation")
	public void l1(final Player player) {
		Util.resetInv(player);
		newPotion(player, 3, PotionType.INSTANT_DAMAGE, 1, true);
		newPotion(player, 1, PotionType.SLOWNESS, 1, true);
		newPotion(player, 1, PotionType.POISON, 1, true);
		addArmor(player, new ItemStack(Material.CHAINMAIL_HELMET), new ItemStack(Material.CHAINMAIL_CHESTPLATE), new ItemStack(Material.CHAINMAIL_LEGGINGS), new ItemStack(Material.CHAINMAIL_BOOTS));
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l2(final Player player) {
		Util.resetInv(player);
		newPotion(player, 5, PotionType.INSTANT_DAMAGE, 1, true);
		newPotion(player, 2, PotionType.SLOWNESS, 1, true);
		newPotion(player, 1, PotionType.POISON, 1, true);
		addArmor(player, new ItemStack(Material.IRON_HELMET), new ItemStack(Material.CHAINMAIL_CHESTPLATE), new ItemStack(Material.CHAINMAIL_LEGGINGS), new ItemStack(Material.CHAINMAIL_BOOTS));
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l3(final Player player) {
		Util.resetInv(player);
		newPotion(player, 5, PotionType.INSTANT_DAMAGE, 2, true);
		newPotion(player, 3, PotionType.SLOWNESS, 1, true);
		newPotion(player, 2, PotionType.POISON, 1, true);
		newPotion(player, 1, PotionType.WEAKNESS, 1, true);
	
		addArmor(player, new ItemStack(Material.IRON_HELMET), new ItemStack(Material.CHAINMAIL_CHESTPLATE), new ItemStack(Material.CHAINMAIL_LEGGINGS), new ItemStack(Material.IRON_BOOTS));
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l4(final Player player) {
		Util.resetInv(player);
		newPotion(player, 7, PotionType.INSTANT_DAMAGE, 2, true);
		newPotion(player, 5, PotionType.SLOWNESS, 1, true);
		newPotion(player, 2, PotionType.POISON, 2, true);
		newPotion(player, 2, PotionType.WEAKNESS, 1, true);
		addArmor(player, new ItemStack(Material.IRON_HELMET), new ItemStack(Material.CHAINMAIL_CHESTPLATE), new ItemStack(Material.IRON_LEGGINGS), new ItemStack(Material.IRON_BOOTS));
		addSoup(player);
		player.updateInventory();
	}
	@SuppressWarnings("deprecation")
	public void l5(final Player player) {
		Util.resetInv(player);
		addArmor(player, new ItemStack(Material.GOLD_HELMET), new ItemStack(Material.DIAMOND_CHESTPLATE), new ItemStack(Material.CHAINMAIL_LEGGINGS), new ItemStack(Material.GOLD_BOOTS));
		newPotion(player, 8, PotionType.INSTANT_DAMAGE, 2, true);
		newPotion(player, 5, PotionType.SLOWNESS, 1, true);
		newPotion(player, 5, PotionType.POISON, 2, true);
		newPotion(player, 5, PotionType.WEAKNESS, 1, true);
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
