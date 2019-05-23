package com.caxerx.mc.di.plugin;

import com.caxerx.mc.di.api.DIPlugin;
import com.caxerx.mc.di.api.PlayerManager;

public class MCDIPlugin implements DIPlugin {
    public static DIPlugin getPlugin() {
        return null;
    }

    @Override
    public PlayerManager getPlayerManager() {
        return null;
    }
}
