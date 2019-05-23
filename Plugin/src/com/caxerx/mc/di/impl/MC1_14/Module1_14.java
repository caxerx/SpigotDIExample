package com.caxerx.mc.di.impl.MC1_14;

import com.caxerx.mc.di.api.GamePlayerBuilder;
import com.caxerx.mc.di.api.PlayerManager;
import com.google.inject.Binder;
import com.google.inject.Module;

import java.util.HashMap;

public class Module1_14 implements Module {
    HashMap<Class, Object> implementations = new HashMap<>();

    @Override
    public void configure(Binder binder) {
        binder.bind(PlayerManager.class).to(ImplPlayerManager1_14.class);
        binder.bind(GamePlayerBuilder.class).to(ImplGamePlayerBuilder1_14.class);
        implementations.forEach((cls, obj) -> binder.bind(cls).toInstance(obj));
    }

    public void register(Class c, Object implementation) {
        implementations.put(c, implementation);
    }
}
