package me.sheak.sadi.bunjeeCore.Events;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.event.ServerConnectEvent;
import net.md_5.bungee.api.event.ServerKickEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;



public class OnKick implements Listener {
   @EventHandler
    public void onkick(ServerKickEvent e){
       String reason= BaseComponent.toLegacyText(e.getKickReasonComponent());

            e.getPlayer().sendMessage(new TextComponent("Reason: "+reason));



            if (reason.contains("banned")){
                e.setCancelled(true);

                ServerInfo target= ProxyServer.getInstance().getServerInfo("anarchy");
                e.getPlayer().sendMessage(new TextComponent(format("&c[&adeadhorse&e*network&c] &bYou have been teleported to anarchy server for violeting rules")));


                e.getPlayer().connect(target);


            }



   }
    public String format (String massage){
        return ChatColor.translateAlternateColorCodes('&',massage);
    }

}
