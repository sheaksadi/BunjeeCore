package me.sheak.sadi.bunjeeCore;

import me.sheak.sadi.bunjeeCore.Events.OnKick;
import me.sheak.sadi.bunjeeCore.commands.LobbyCommand;
import net.md_5.bungee.api.plugin.Plugin;

public class Main extends Plugin {
    @Override
    public void onEnable() {
        getLogger().info("Yay! It loads!");
        getProxy().getPluginManager().registerCommand(this,new LobbyCommand());
        getProxy().getPluginManager().registerListener(this ,new OnKick());
    }

    @Override
    public void onDisable() {

    }
}
