package me.sheak.sadi.bunjeeCore;

import me.sheak.sadi.bunjeeCore.commands.LobbyCommand;
import net.md_5.bungee.api.plugin.Plugin;

public class Main extends Plugin {
    @Override
    public void onEnable() {
        getLogger().info("Yay! It loads!");
        getProxy().getPluginManager().registerCommand(this,new LobbyCommand());
    }

    @Override
    public void onDisable() {

    }
}
