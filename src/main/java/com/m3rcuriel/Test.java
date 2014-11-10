package com.m3rcuriel;

import org.bukkit.Location;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.*;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Lee Mracek on 11/9/14.
 */
public class Test extends JavaPlugin implements Listener, CommandExecutor{
    public void onEnable() {
        PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvents(this, this);
    }
}
