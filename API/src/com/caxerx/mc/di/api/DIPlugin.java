package com.caxerx.mc.di.api;

public interface DIPlugin {
    PlayerManager getPlayerManager();
    void registerMechanic(UserMechanic mech);
}
