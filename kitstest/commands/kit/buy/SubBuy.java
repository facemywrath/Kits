package facemywrath.kitstest.commands.kit.buy;

import org.bukkit.command.CommandSender;

import facemywrath.kitstest.commands.SubCommand;

public class SubBuy implements SubCommand {

	@Override
	public void execute(CommandSender player, String[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Purchase a kit";
	}

	@Override
	public String getPermission() {
		// TODO Auto-generated method stub
		return "kit.buy";
	}

	@Override
	public boolean consoleUse() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getUsage() {
		// TODO Auto-generated method stub
		return "(kit-name)";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "buy";
	}

}
