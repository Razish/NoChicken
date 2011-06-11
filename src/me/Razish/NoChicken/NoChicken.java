package me.Razish.NoChicken;

import java.util.logging.Logger;

import org.bukkit.event.Event;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class NoChicken extends JavaPlugin
{
	private PlayerListener playerListener;
	private PluginManager pm;
	
	public Logger log;

	public void onLoad()
	{
		log = Logger.getLogger( "Minecraft" );
		pm = this.getServer().getPluginManager();
		playerListener = new NoChickenPlayerListener( this );
	}

	public void onEnable()
	{
		pm.registerEvent( Event.Type.PLAYER_EGG_THROW, playerListener, Event.Priority.Normal, this );

		log.info( "[NoChicken]: Hello world! Version " + this.getDescription().getVersion() );
	}

	public void onDisable()
	{
		log.info( "[NoChicken]: Goodbye world! Version " + this.getDescription().getVersion() );
	}
}
