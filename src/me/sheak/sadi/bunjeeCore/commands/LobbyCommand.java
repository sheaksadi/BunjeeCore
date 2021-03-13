package me.sheak.sadi.bunjeeCore.commands;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class LobbyCommand extends Command {
    public LobbyCommand() {
        super("lobby");
    }

    @Override
    public void execute(CommandSender commandSender, String[] strings) {

        if (!(commandSender instanceof ProxiedPlayer)) {
            return;
        }


        ProxiedPlayer player =(ProxiedPlayer)commandSender;
        ServerInfo target= ProxyServer.getInstance().getServerInfo("lobby");


        if(player.getServer().getInfo().getName().equals(target.getName())){
            player.sendMessage(new TextComponent(format("&c[&adeadhorse&e*network&c] &bYou are already in the lobby")));

            return;
        }

        player.connect(target);
        player.sendMessage(new TextComponent(format("&c[&adeadhorse&e*network&c] &bYou have been teleported to the Lobby")));

    }
    public String format (String massage){
        return ChatColor.translateAlternateColorCodes('&',massage);
    }

}
