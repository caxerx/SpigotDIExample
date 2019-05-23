package com.caxerx.mc.extdi;

import com.caxerx.mc.di.api.UserMechanic;
import org.bukkit.event.Listener;

import java.util.ArrayList;
import java.util.List;

public class UserMechanicImpl implements UserMechanic {
    @Override
    public List<Listener> getMechanics() {
        ArrayList<Listener> l = new ArrayList<>();
        l.add(new MechanicListener());
        return l;
    }
}
