package com.caxerx.mc.di.impl.MC1_14;

import com.caxerx.mc.di.api.GamePlayer;
import com.caxerx.mc.di.api.GamePlayerBuilder;
import com.caxerx.mc.di.api.PlayerManager;
import com.google.inject.Inject;

public class ImplPlayerManager1_14 implements PlayerManager {
    @Inject
    private GamePlayerBuilder gamePlayerBuilder;

    @Override
    public GamePlayer getGamePlayer(String playerName) {
        return gamePlayerBuilder.build(playerName);
    }
}
