package com.caxerx.mc.di.plugin;

import com.caxerx.mc.di.api.DIPlugin;
import com.caxerx.mc.di.api.PlayerManager;
import com.caxerx.mc.di.impl.MC1_14.Module1_14;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.bukkit.plugin.java.JavaPlugin;

public class MCDIPlugin extends JavaPlugin implements DIPlugin {
    private static DIPlugin diPlugin;
    private PlayerManager playerManager;

    @Override
    public void onLoad() {
        Injector injector = null;
        if (getServer().getVersion().contains("1.14")) {
            injector = Guice.createInjector(new Module1_14());
        }
        if (injector == null) {
            System.out.println("Version Not Supported");
            getServer().shutdown();
            return;
        }
        playerManager = injector.getInstance(PlayerManager.class);
        diPlugin = this;
    }

    public static DIPlugin getPlugin() {
        return diPlugin;
    }

    @Override
    public PlayerManager getPlayerManager() {
        return playerManager;
    }
}
