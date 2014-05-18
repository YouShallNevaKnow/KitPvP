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
	@SuppressWarnings("deprecation")
	@Override
	public boolean run() {
		HashMap<String, String> teamque = new HashMap<String, String>();
		String pn = player.getName();
		String teamq = teamque.get(pn); 
		String pt = Main.getTeams().get(pn);
		if (args[1].equalsIgnoreCase("create")) {
			Player pargs = (Player) Bukkit.getServer().getPlayer(args[2]);
			if (pargs != null) {
				if (pt == null){
					String tn = pargs.getName();
					String tt = Main.getTeams().get(tn);
					if (tt == null) {
						if (teamq == null) {
							String teamt = teamque.get(tn);
							if (teamt == null) {
								Player target = (Player) Bukkit.getServer().getPlayer(tn);
								teamque.put(pn, tn);
								teamque.put(tn, pn);
								Util.notify(player, "You have sent a(n) request to " + tn + "!"); 
								Util.notify(target, pn + " has sent you a TEAM request!");
								Util.notify(target, "Type '/k team accept " + pn + "' to join " + pn + " team!");
								queDelay(player, target, teamque);
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
			if (pt != null) {
				Player target = (Player) Bukkit.getServer().getPlayer(pt);
				Util.error(target, pn + " has disbanded the team!");
				Util.error(player, "You have disbanded the team!");
				Main.getTeams().remove(pt);
				Main.getTeams().remove(pn);
				return true;
			} else {
				//Players not on a team
				Util.error(player, "You are not in a team with anyone!");
				return true;
			}
		} else if (args[1].equalsIgnoreCase("accept")) {
			if (teamq != null) {
				Player target = (Player) Bukkit.getServer().getPlayer(teamq);
				Util.notify(player, "You are now in a team with " + teamq + "!");
				Util.notify(target, "You are now in a team with " + pn + "!");
				Main.getTeams().put(pn, teamq);
				Main.getTeams().put(teamq, pn);
				teamque.remove(teamq);
				teamque.remove(pn);
				return true;
			} else {
				// Player does not have any team request	
				Util.error(player, "You don't have any current request!");
				return true;
			}
		} else if (args[1].equalsIgnoreCase("decline")) {
			if (teamq != null) {
				Player target = (Player) Bukkit.getServer().getPlayer(teamq);
				Util.error(target, pn + " has declined your team request!");
				Util.error(player, "You have declined " + target.getName() + " team request!");
				teamque.remove(teamq);
				teamque.remove(pn);
				return true;
			} else {
				// Player does not have any team request	
				Util.error(player, "You don't have any current request!");
				return true;
			}
		} else if (args[1].equalsIgnoreCase("view")) {
			if (pt != null) {
				Util.notify(player, "You teamed up with " + ChatColor.YELLOW + pt + ChatColor.GREEN + "!");
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
	public void queDelay(final Player player, final Player target, final HashMap<String, String> hash) {
	plugins.getServer().getScheduler().scheduleSyncDelayedTask(plugins, new Runnable() {
			public void run() {
				String pn = player.getName();
				Util.error(player, "Your team request has expired!");
				Util.error(target, pn + " team request has expired!");
				hash.remove(pn);
				hash.remove(target.getName());
			}
		}, 60 * 20L);
	}
}
