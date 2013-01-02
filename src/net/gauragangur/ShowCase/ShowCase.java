package net.gauragangur.ShowCase;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class ShowCase extends JavaPlugin {

	public final Logger logger = Logger.getLogger("ShowCase");
	public final Events Events = new Events();
	public void onEnable() {
		logger.info(this.getDescription().getName() + " version: " + this.getDescription().getVersion() + " has been enabled!");
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(Events, this);
	}
	public void onDisable() {
		logger.info(this.getDescription().getName() + " version: " + this.getDescription().getVersion() + " has been disabled!");
	}
}
