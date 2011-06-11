package me.Razish.NoChicken;

import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerListener;

public class NoChickenPlayerListener extends PlayerListener {
	public static NoChicken plugin;

	public NoChickenPlayerListener( NoChicken instance )
	{//Constructor
		plugin = instance;
	}

	public void onPlayerEggThrow( PlayerEggThrowEvent e )
	{
		e.setHatching( false );
	}
}
