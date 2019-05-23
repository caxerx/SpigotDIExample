package com.caxerx.mc.di.plugin;

import com.caxerx.mc.di.api.DIPlugin;
import com.caxerx.mc.di.api.PlayerManager;

public class MCDIPlugin implements DIPlugin {
    public static DIPlugin getPlugin() {
        throw new RuntimeException("API Interface");
    }

    @Override
    public PlayerManager getPlayerManager() {
        throw new RuntimeException("API Interface");
    }
}
