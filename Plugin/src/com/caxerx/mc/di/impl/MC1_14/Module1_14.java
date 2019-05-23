package com.caxerx.mc.di.impl.MC1_14;

import com.caxerx.mc.di.api.GamePlayerBuilder;
import com.caxerx.mc.di.api.PlayerManager;
import com.google.inject.Binder;
import com.google.inject.Module;

public class Module1_14 implements Module {
    @Override
    public void configure(Binder binder) {
        binder.bind(PlayerManager.class).to(ImplPlayerManager1_14.class);
        binder.bind(GamePlayerBuilder.class).to(ImplGamePlayerBuilder1_14.class);
    }

}
