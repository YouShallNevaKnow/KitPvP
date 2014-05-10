package alohacraft.kitpvp.main.commands;

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

	@Override
	public boolean run() {
		String pn = args[2]; 
		String cmd = args[1].toLowerCase();
		if(Bukkit.getServer().getPlayer(pn) != null) {
			Player player = (Player) Bukkit.getServer().getPlayer(pn);
			String p = player.getUniqueId().toString();
			int level = Main.getKitLevel().get(p);
			switch(cmd) {
			case "addlevel":
				switch(level) {
				case 2:
					Main.getKitLevel().put(p, 3);
					Main.getKitExp().put(p, 250);
					break;
				case 3:
					Main.getKitLevel().put(p, 4);
					Main.getKitExp().put(p, 500);
					break;
				case 4:
					Main.getKitLevel().put(p, 5);
					Main.getKitExp().put(p, 1000);
					break;
				case 5:
					Util.serror(sender, "That player is the Max Level!");
					break;
				default:
					Main.getKitLevel().put(p, 2);
					Main.getKitExp().put(p, 100);
					break;
				}
				break;
			case "decreaselevel":
				switch(level) {
				case 2:
					Main.getKitLevel().put(p, 1);
					Main.getKitExp().put(p, 0);
					break;
				case 3:
					Main.getKitLevel().put(p, 2);
					Main.getKitExp().put(p, 100);
					break;
				case 4:
					Main.getKitLevel().put(p, 3);
					Main.getKitExp().put(p, 250);
					break;
				case 5:
					Main.getKitLevel().put(p, 4);
					Main.getKitExp().put(p, 500);
					break;
				default:
					Main.getKitLevel().put(p, 1);
					Main.getKitExp().put(p, 0);
					break;
				}
				break;
			case "addexp":
				Main.getKitExp().put(p, Main.getKitExp().get(p) + 50);
				KitLevelUpCheckDouble(player);
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
	public void KitLevelUpCheckDouble(Player player) {
		String pp = player.getUniqueId().toString();
		if ((Main.getKitExp().get(pp) >= 0) && (Main.getKitExp().get(pp) < 100)) {
			Main.getKitLevel().put(pp, 1);
		} else if ((Main.getKitExp().get(pp) >= 100) && (Main.getKitExp().get(pp) < 250)) {
			Main.getKitLevel().put(pp, 2);
		} else if ((Main.getKitExp().get(pp) >= 250) && (Main.getKitExp().get(pp) < 500)) {
			Main.getKitLevel().put(pp, 3);
		} else if ((Main.getKitExp().get(pp) >= 500) && (Main.getKitExp().get(pp) < 1000)) {
			Main.getKitLevel().put(pp, 4);
		} else if (Main.getKitExp().get(pp) >= 1000) {
			Main.getKitLevel().put(pp, 5);
		}
	}
}
