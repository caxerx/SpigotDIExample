package com.caxerx.mc.extdi;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class MechanicListener implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        e.getPlayer().sendMessage("DAMN YOU");
    }
}
