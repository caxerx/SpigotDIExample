package com.caxerx.mc.extdi;

import com.caxerx.mc.di.api.DIPlugin;
import com.caxerx.mc.di.api.GamePlayer;
import com.caxerx.mc.di.api.PlayerManager;
import com.caxerx.mc.di.plugin.MCDIPlugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        DIPlugin plugin = MCDIPlugin.getPlugin();
        PlayerManager mgr = plugin.getPlayerManager();
        GamePlayer player = mgr.getGamePlayer("GamePlayer");
        System.out.println(player.getPlayerName());
    }
}
