package alohacraft.kitpvp.main.managers;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import alohacraft.kitpvp.main.Main;
import alohacraft.kitpvp.main.Util;
import alohacraft.kitpvp.main.commands.DoubleEXPCmd;
import alohacraft.kitpvp.main.commands.InfoCmd;
import alohacraft.kitpvp.main.commands.RewardCmd;
import alohacraft.kitpvp.main.commands.BaseCmd;
import alohacraft.kitpvp.main.commands.FastRespawnCmd;
import alohacraft.kitpvp.main.commands.KillFeedCmd;
import alohacraft.kitpvp.main.commands.SetFSCmd;
import alohacraft.kitpvp.main.commands.StatsCmd;
import alohacraft.kitpvp.main.commands.TeamCmd;

public class CommandManager implements CommandExecutor {

    private List<BaseCmd> cmds = new ArrayList<BaseCmd>();
	public static Main plugins;
    //Add Commands Here!
    public CommandManager(Main plugins) {
            cmds.add(new StatsCmd());
            cmds.add(new FastRespawnCmd());
            cmds.add(new KillFeedCmd());
            cmds.add(new SetFSCmd());
            cmds.add(new RewardCmd());
            cmds.add(new DoubleEXPCmd());
            cmds.add(new InfoCmd(plugins));
            cmds.add(new TeamCmd(plugins));
    }

    public boolean onCommand(CommandSender s, Command command, String label, String[] args) {
            if (args.length == 0 || getCommands(args[0]) == null) {
                    s.sendMessage(ChatColor.DARK_GRAY + "-----------------------[" + ChatColor.GREEN + "" + ChatColor.BOLD + "KitPvP" + ChatColor.DARK_GRAY + "]----------------------");
                    for (BaseCmd cmd : cmds) {
                            if (Util.hp(s, cmd.cmdName)) s.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.GREEN + "/kitpvp " + cmd.helper());
                    }
                    s.sendMessage(ChatColor.DARK_GRAY + "-----------------------------------------------------");
            } else getCommands(args[0]).processCmd(s, args);
            return true;
    }

    private BaseCmd getCommands(String s) {
            for (BaseCmd cmd : cmds) {
                    if (cmd.cmdName.equalsIgnoreCase(s)) {
                            return cmd;
                    }
            }
            return null;
    }
}
