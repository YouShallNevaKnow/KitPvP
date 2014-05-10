package alohacraft.kitpvp.main.managers;

import org.bukkit.entity.Player;
import alohacraft.kitpvp.main.Main;
import alohacraft.kitpvp.main.kits.Archer;
import alohacraft.kitpvp.main.kits.Boxer;
import alohacraft.kitpvp.main.kits.Butter;
import alohacraft.kitpvp.main.kits.Druid;
import alohacraft.kitpvp.main.kits.Dwarf;
import alohacraft.kitpvp.main.kits.Fireny;
import alohacraft.kitpvp.main.kits.Hidden;
import alohacraft.kitpvp.main.kits.Hitman;
import alohacraft.kitpvp.main.kits.Jumper;
import alohacraft.kitpvp.main.kits.Maniac;
import alohacraft.kitpvp.main.kits.Moog;
import alohacraft.kitpvp.main.kits.Murloc;
import alohacraft.kitpvp.main.kits.Paladin;
import alohacraft.kitpvp.main.kits.Pyro;
import alohacraft.kitpvp.main.kits.Tank;
import alohacraft.kitpvp.main.kits.Warper;
import alohacraft.kitpvp.main.kits.Warrior;
import alohacraft.kitpvp.main.kits.Witch;
import alohacraft.kitpvp.main.kits.Wither;

public class KitManager {
	public static KitManager km = new KitManager();
	public void getLvl(final Player player, String kitname) {
		int kitlvl = Main.getKitLevel().get(player.getUniqueId().toString());
		switch (kitname) {
		case "tank":
			Tank Tank = new Tank();
			switch (kitlvl) {
			case 1:
				Tank.l1(player);
				break;
			case 2:
				Tank.l2(player);
				break;
			case 3:
				Tank.l3(player);
				break;
			case 4:
				Tank.l4(player);
				break;
			default:
				Tank.l5(player);
				break;
			}
			break;
		case "warrior":
			Warrior Warrior = new Warrior();
			switch (kitlvl) {
			case 1:
				Warrior.l1(player);
				break;
			case 2:
				Warrior.l2(player);
				break;
			case 3:
				Warrior.l3(player);
				break;
			case 4:
				Warrior.l4(player);
				break;
			default:
				Warrior.l5(player);
				break;
			}
			break;
		case "archer":
			Archer Archer = new Archer();
			switch (kitlvl) {
			case 1:
				Archer.l1(player);
				break;
			case 2:
				Archer.l2(player);
				break;
			case 3:
				Archer.l3(player);
				break;
			case 4:
				Archer.l4(player);
				break;
			default:
				Archer.l5(player);
				break;
			}
			break;
		case "pyro":
			Pyro Pyro = new Pyro();
			switch (kitlvl) {
			case 1:
				Pyro.l1(player);
				break;
			case 2:
				Pyro.l2(player);
				break;
			case 3:
				Pyro.l3(player);
				break;
			case 4:
				Pyro.l4(player);
				break;
			default:
				Pyro.l5(player);
				break;
			}
			break;
		case "maniac":
			Maniac Maniac = new Maniac();
			switch (kitlvl) {
			case 1:
				Maniac.l1(player);
				break;
			case 2:
				Maniac.l2(player);
				break;
			case 3:
				Maniac.l3(player);
				break;
			case 4:
				Maniac.l4(player);
				break;
			default:
				Maniac.l5(player);
				break;
			}
			break;
		case "dwarf":
			Dwarf Dwarf = new Dwarf();
			switch (kitlvl) {
			case 1:
				Dwarf.l1(player);
				break;
			case 2:
				Dwarf.l2(player);
				break;
			case 3:
				Dwarf.l3(player);
				break;
			case 4:
				Dwarf.l4(player);
				break;
			default:
				Dwarf.l5(player);
				break;
			}
			break;
		case "moog":
			Moog.l5(player);
			break;
		case "hitman":
			Hitman Hitman = new Hitman();
			switch (kitlvl) {
			case 1:
				Hitman.l1(player);
				break;
			case 2:
				Hitman.l2(player);
				break;
			case 3:
				Hitman.l3(player);
				break;
			case 4:
				Hitman.l4(player);
				break;
			default:
				Hitman.l5(player);
				break;
			}
			break;
		case "boxer":
			Boxer Boxer = new Boxer();
			switch (kitlvl) {
			case 1:
				Boxer.l1(player);
				break;
			case 2:
				Boxer.l2(player);
				break;
			case 3:
				Boxer.l3(player);
				break;
			case 4:
				Boxer.l4(player);
				break;
			default:
				Boxer.l5(player);
				break;
			}
			break;
		case "wither":
			Wither Wither = new Wither();
			switch (kitlvl) {
			case 1:
				Wither.l1(player);
				break;
			case 2:
				Wither.l2(player);
				break;
			case 3:
				Wither.l3(player);
				break;
			case 4:
				Wither.l4(player);
				break;
			default:
				Wither.l5(player);
				break;
			}
			break;
		case "hidden":
			Hidden Hidden = new Hidden();
			switch (kitlvl) {
			case 1:
				Hidden.l1(player);
				break;
			case 2:
				Hidden.l2(player);
				break;
			case 3:
				Hidden.l3(player);
				break;
			case 4:
				Hidden.l4(player);
				break;
			default:
				Hidden.l5(player);
				break;
			}
			break;
		case "butter":
			Butter Butter = new Butter();
			switch (kitlvl) {
			case 1:
				Butter.l1(player);
				break;
			case 2:
				Butter.l2(player);
				break;
			case 3:
				Butter.l3(player);
				break;
			case 4:
				Butter.l4(player);
				break;
			default:
				Butter.l5(player);
				break;
			}
			break;
		case "warper":
			Warper Warper = new Warper();
			switch (kitlvl) {
			case 1:
				Warper.l1(player);
				break;
			case 2:
				Warper.l2(player);
				break;
			case 3:
				Warper.l3(player);
				break;
			case 4:
				Warper.l4(player);
				break;
			default:
				Warper.l5(player);
				break;
			}
			break;
		case "jumper":
			Jumper Jumper = new Jumper();
			switch (kitlvl) {
			case 1:
				Jumper.l1(player);
				break;
			case 2:
				Jumper.l2(player);
				break;
			case 3:
				Jumper.l3(player);
				break;
			case 4:
				Jumper.l4(player);
				break;
			default:
				Jumper.l5(player);
				break;
			}
			break;
		case "murloc":
			Murloc Murloc = new Murloc();
			switch (kitlvl) {
			case 1:
				Murloc.l1(player);
				break;
			case 2:
				Murloc.l2(player);
				break;
			case 3:
				Murloc.l3(player);
				break;
			case 4:
				Murloc.l4(player);
				break;
			default:
				Murloc.l5(player);
				break;
			}
			break;
		case "druid":
			Druid Druid = new Druid();
			switch (kitlvl) {
			case 1:
				Druid.l1(player);
				break;
			case 2:
				Druid.l2(player);
				break;
			case 3:
				Druid.l3(player);
				break;
			case 4:
				Druid.l4(player);
				break;
			default:
				Druid.l5(player);
				break;
			}
			break;
		case "paladin":
			Paladin Paladin = new Paladin();
			switch (kitlvl) {
			case 1:
				Paladin.l1(player);
				break;
			case 2:
				Paladin.l2(player);
				break;
			case 3:
				Paladin.l3(player);
				break;
			case 4:
				Paladin.l4(player);
				break;
			default:
				Paladin.l5(player);
				break;
			}
			break;
		case "fireny":
			Fireny Fireny = new Fireny();
			switch (kitlvl) {
			case 1:
				Fireny.l1(player);
				break;
			case 2:
				Fireny.l2(player);
				break;
			case 3:
				Fireny.l3(player);
				break;
			case 4:
				Fireny.l4(player);
				break;
			default:
				Fireny.l5(player);
				break;
			}
			break;
		case "witch":
			Witch Witch = new Witch();
			switch (kitlvl) {
			case 1:
				Witch.l1(player);
				break;
			case 2:
				Witch.l2(player);
				break;
			case 3:
				Witch.l3(player);
				break;
			case 4:
				Witch.l4(player);
				break;
			default:
				Witch.l5(player);
				break;
			}
			break;
		default:
			//Don't use! Or Ignore!
			break;
		}
	}
}
