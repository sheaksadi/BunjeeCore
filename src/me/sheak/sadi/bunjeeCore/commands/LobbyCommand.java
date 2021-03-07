package me.sheak.sadi.bunjeeCore.commands;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
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
        player.connect(target);
    }
}
