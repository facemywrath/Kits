package facemywrath.kitstest.commands.kit;

import facemywrath.kitstest.commands.Command;
import facemywrath.kitstest.commands.kit.buy.SubBuy;
import facemywrath.kitstest.commands.kit.give.SubGive;
import facemywrath.kitstest.commands.kit.menu.SubMenu;
import facemywrath.kitstest.main.Main;

public class CMDKit extends Command{

	public CMDKit(Main main, String name) {
		super(main, name);
		this.registerSubCommand("buy", new SubBuy())
		.registerSubCommand("give", new SubGive())
		.registerSubCommand("menu", new SubMenu());
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUsage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPermission() {
		// TODO Auto-generated method stub
		return "kitstest.kit";
	}

	@Override
	public boolean consoleUse() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "kit";
	}

}
