package facemywrath.kitstest.commands.kit.give;

import org.bukkit.command.CommandSender;

import facemywrath.kitstest.commands.SubCommand;

public class SubGive implements SubCommand {

	@Override
	public void execute(CommandSender player, String[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Give a player a kit";
	}

	@Override
	public String getPermission() {
		// TODO Auto-generated method stub
		return "kit.give";
	}

	@Override
	public boolean consoleUse() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getUsage() {
		// TODO Auto-generated method stub
		return "(player) (kit)";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "give";
	}

}
