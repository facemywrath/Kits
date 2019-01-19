package facemywrath.kitstest.main;

import org.bukkit.plugin.java.JavaPlugin;

import facemywrath.kitstest.commands.kit.CMDKit;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		new CMDKit(this, "kit");
	}

}
