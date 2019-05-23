package com.caxerx.mc.extdi;

import com.caxerx.mc.di.api.DIPlugin;
import com.caxerx.mc.di.api.GamePlayer;
import com.caxerx.mc.di.api.PlayerManager;
import com.caxerx.mc.di.plugin.MCDIPlugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onLoad() {
        DIPlugin plugin = MCDIPlugin.getPlugin();
        plugin.registerMechanic(new UserMechanicImpl());
    }
}
