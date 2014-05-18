package alohacraft.kitpvp.main.commands;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import alohacraft.kitpvp.main.Items;
import alohacraft.kitpvp.main.Main;
import alohacraft.kitpvp.main.Util;

public class RewardCmd extends BaseCmd {

	public RewardCmd() {
		super(plugins);
		forcePlayer = false;
		cmdName = "reward";
		argLength = 3;
		usage = "<rewardname> <playername>";
		desc = ":: Reward players";
		noperm = "You do not have permission for /kitpvp " + cmdName;
	}

	@SuppressWarnings("deprecation")
	@Override
	public boolean run() {
		String pn = args[2]; 
		String cmd = args[1].toLowerCase();
		if(Bukkit.getServer().getPlayer(pn) != null) {
			Player player = (Player) Bukkit.getServer().getPlayer(pn);
			String p = player.getUniqueId().toString();
			Items Items = new Items();
			HashMap<String, Integer> hlvl = Main.getKitLevel();
			HashMap<String, Integer> hexp = Main.getKitExp();
			int level = hlvl.get(p);
			switch(cmd) {
			case "addlevel":
				switch(level) {
				case 2:
					hlvl.put(p, 3);
					hexp.put(p, 250);
					break;
				case 3:
					hlvl.put(p, 4);
					hexp.put(p, 500);
					break;
				case 4:
					hlvl.put(p, 5);
					hexp.put(p, 1000);
					break;
				case 5:
					Util.serror(sender, "That player is the Max Level!");
					break;
				default:
					hlvl.put(p, 2);
					hexp.put(p, 100);
					break;
				}
				break;
			case "decreaselevel":
				switch(level) {
				case 2:
					hlvl.put(p, 1);
					hexp.put(p, 0);
					break;
				case 3:
					hlvl.put(p, 2);
					hexp.put(p, 100);
					break;
				case 4:
					hlvl.put(p, 3);
					hexp.put(p, 250);
					break;
				case 5:
					hlvl.put(p, 4);
					hexp.put(p, 500);
					break;
				default:
					hlvl.put(p, 1);
					hexp.put(p, 0);
					break;
				}
				break;
			case "addexp":
				hexp.put(p, hexp.get(p) + 50);
				LevelCheck(player);
				break;
			case "sword1":
				Items.sword1(player);
				break;
			case "axe1":
				Items.axe1(player);
				break;
			case "armor1":
				Items.armor1(player);
				break;
			case "armor2":
				Items.armor2(player);
				break;
			case "apple":
				Items.apple(player);
				break;
			case "votertag":
				Main.permission.playerAdd(player, "kitpvp.tag.voter");
				break;
			case "boxerkit":
				Main.permission.playerAdd(player, "kitpvp.earned.boxer");
				break;
			case "youtuber":
				Main.permission.playerAdd(player, "kitpvp.youtuber");
				break;
			default:
				//Not a valid Reward Name!
				Util.serror(sender, "That's not a valid reward!");
				break;
			}
			return true;
		} else {
			// Player is null, does not exist!
			Util.serror(sender, "That is not a valid player!");
			return true;
		}
	}
	public void LevelCheck(Player player) {
		String pp = player.getUniqueId().toString();
		HashMap<String, Integer> hlvl = Main.getKitLevel();
		int kitexp = Main.getKitExp().get(pp);
		if ((kitexp >= 0) && (kitexp < 100)) {
			hlvl.put(pp, 1);
		} else if ((kitexp >= 100) && (kitexp < 250)) {
			hlvl.put(pp, 2);
		} else if ((kitexp >= 250) && (kitexp < 500)) {
			hlvl.put(pp, 3);
		} else if ((kitexp >= 500) && (kitexp < 1000)) {
			hlvl.put(pp, 4);
		} else if (kitexp >= 1000) {
			hlvl.put(pp, 5);
		}
	}
}
