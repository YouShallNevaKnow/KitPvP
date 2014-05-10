package alohacraft.kitpvp.main.commands;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import alohacraft.kitpvp.main.Main;
import alohacraft.kitpvp.main.Util;

public class TeamCmd extends BaseCmd {
	public TeamCmd(Main plugins) {
		super(plugins);
		forcePlayer = true;
		cmdName = "team";
		argLength = 3;
		usage = "<create/leave/accept/decline/view> <playername>";
		desc = ":: Join or leave Teams";
		noperm = "You do not have permission for /kitpvp " + cmdName;
	}
	HashMap<String, String> teamque = new HashMap<String, String>();
	@Override
	public boolean run() {
		String tn = args[2];
		String pn = player.getName();
		if (args[1].equalsIgnoreCase("create")) {
			if (Bukkit.getServer().getPlayer(args[2]) != null) {
				if(!Main.getTeams().containsKey(pn)) {
					if(!Main.getTeams().containsKey(tn)) {
						if (!teamque.containsKey(pn)) {
							if (!teamque.containsKey(tn)) {
								Player target = (Player) Bukkit.getServer().getPlayer(tn);
								teamque.put(pn, tn);
								teamque.put(tn, pn);
								Util.notify(player, "You have sent a(n) request to " + tn + "!"); 
								Util.notify(target, pn + " has sent you a TEAM request!");
								Util.notify(target, "Type '/k team accept " + pn + "' to join " + pn + " team!");
								queDelay(player, target);
								return true;
							} else {
								//Target is in que for a team
								Util.error(player, "That player is already in que for a team!");
								return true;
							}
						} else {
							//Player is in que for a team
							Util.error(player, "You are already in que for a team!");
							return true;
						}
					} else {
						//Target is on a team
						Util.error(player, "That player is already on a team!");
						return true;
					}
				} else {
					// Player is on a team
					Util.error(player, "You are already on a team!");
					return true;
				}
			} else {
				//Player is does not Exist, This is Case Locked!
				Util.error(player, "That player does not Exist! This feature is CASE Sensitive!");
				return true;
			}
		} else if (args[1].equalsIgnoreCase("leave")) {
			if (Main.getTeams().containsKey(player.getName())) {
				Player target = (Player) Bukkit.getServer().getPlayer(Main.getTeams().get(player.getName()));
				Util.error(target, player.getName() + " has disbanded the team!");
				Util.error(player, "You have disbanded the team!");
				Main.getTeams().remove(Main.getTeams().get(player.getName()));
				Main.getTeams().remove(player.getName());
				return true;
			} else {
				//Players not on a team
				Util.error(player, "You are not in a team with anyone!");
				return true;
			}
		} else if (args[1].equalsIgnoreCase("accept")) {
			if (teamque.containsKey(player.getName())) {
				Player target = (Player) Bukkit.getServer().getPlayer(teamque.get(player.getName()));
				Util.notify(player, "You are now in a team with " + teamque.get(player.getName()) + "!");
				Util.notify(target, "You are now in a team with " + player.getName() + "!");
				Main.getTeams().put(player.getName(), teamque.get(player.getName()));
				Main.getTeams().put(teamque.get(player.getName()), player.getName());
				teamque.remove(teamque.get(player.getName()));
				teamque.remove(player.getName());
				return true;
			} else {
				// Player does not have any team request	
				Util.error(player, "You don't have any current request!");
				return true;
			}
		} else if (args[1].equalsIgnoreCase("decline")) {
			if (teamque.containsKey(player.getName())) {
				Player target = (Player) Bukkit.getServer().getPlayer(teamque.get(player.getName()));
				Util.error(target, player.getName() + " has declined your team request!");
				Util.error(player, "You have declined " + target.getName() + " team request!");
				teamque.remove(teamque.get(player.getName()));
				teamque.remove(player.getName());
				return true;
			} else {
				// Player does not have any team request	
				Util.error(player, "You don't have any current request!");
				return true;
			}
		} else if (args[1].equalsIgnoreCase("view")) {
			if (Main.getTeams().containsKey(player.getName())) {
				Util.notify(player, "You teamed up with " + ChatColor.YELLOW + Main.getTeams().get(player.getName()) + ChatColor.GREEN + "!");
				return true;
			} else {
				//You are not in a team
				Util.error(player, "You are not on a team!");
				return true;
			}
		} else {
			//Not a valid argument
			Util.error(player, "That is not a valid argument! Valid: create, leave, accept, decline, and view!");
			return true;
		}
	}
	public void queDelay(final Player player, final Player target) {
	plugins.getServer().getScheduler().scheduleSyncDelayedTask(plugins, new Runnable() {
			public void run() {
				Util.error(player, "Your team request has expired!");
				Util.error(target, player.getName() + " team request has expired!");
				teamque.remove(player.getName());
				teamque.remove(target.getName());
			}
		}, 60 * 20L);
	}
}
