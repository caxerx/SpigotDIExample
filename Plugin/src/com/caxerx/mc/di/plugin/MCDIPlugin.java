package com.caxerx.mc.di.plugin;

import com.caxerx.mc.di.api.DIPlugin;
import com.caxerx.mc.di.api.PlayerManager;
import com.caxerx.mc.di.api.UserMechanic;
import com.caxerx.mc.di.impl.MC1_14.Module1_14;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.bukkit.plugin.java.JavaPlugin;

public class MCDIPlugin extends JavaPlugin implements DIPlugin {
    private static DIPlugin diPlugin;
    private PlayerManager playerManager;
    private Module1_14 module = new Module1_14();

    @Override
    public void onLoad() {
        diPlugin = this;
    }

    public void onEnable() {
        getServer().getScheduler().runTask(this, () -> {
            Injector injector = Guice.createInjector(module);
            playerManager = injector.getInstance(PlayerManager.class);
            UserMechanic mechanic = injector.getInstance(UserMechanic.class);
            mechanic.getMechanics().forEach(m -> getServer().getPluginManager().registerEvents(m, this));
        });
    }

    public static DIPlugin getPlugin() {
        return diPlugin;
    }

    @Override
    public PlayerManager getPlayerManager() {
        return playerManager;
    }

    @Override
    public void registerMechanic(UserMechanic mechanic) {
        module.register(UserMechanic.class, mechanic);
    }
}
