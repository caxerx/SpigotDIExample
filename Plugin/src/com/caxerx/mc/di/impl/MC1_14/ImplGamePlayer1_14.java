package com.caxerx.mc.di.impl.MC1_14;

import com.caxerx.mc.di.api.GamePlayer;

public class ImplGamePlayer1_14 implements GamePlayer {
    private String playerName;
    public ImplGamePlayer1_14(String playerName) {
        this.playerName=playerName;
    }
    public String getPlayerName(){
        return "1.14 "+playerName;
    }
}
