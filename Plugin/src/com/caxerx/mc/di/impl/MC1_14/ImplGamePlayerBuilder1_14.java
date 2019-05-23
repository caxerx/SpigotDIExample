package com.caxerx.mc.di.impl.MC1_14;

import com.caxerx.mc.di.api.GamePlayer;
import com.caxerx.mc.di.api.GamePlayerBuilder;

public class ImplGamePlayerBuilder1_14 implements GamePlayerBuilder {
    @Override
    public GamePlayer build(String player) {
        return new ImplGamePlayer1_14(player);
    }
}
