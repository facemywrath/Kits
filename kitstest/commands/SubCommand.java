package facemywrath.kitstest.commands;

import org.bukkit.command.CommandSender;

public interface SubCommand {

	public void execute(CommandSender player, String args[]);
	
	public String getDescription();
	
	public String getUsage();
	
	public String getPermission();
	
	public String getName();
	
	public boolean consoleUse();
	
}
