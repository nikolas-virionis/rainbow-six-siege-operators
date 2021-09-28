package virionis.nikolas.rainbow.six.siege.weapons;

import java.util.ArrayList;

import virionis.nikolas.rainbow.six.siege.attachments.*;

public class LMG extends Weapon {

    public LMG(String name, Integer damage, Integer maxMagCapacity,
            ArrayList<Sight> sightOptions,
            ArrayList<UnderBarrel> underBarrelOptions,
            ArrayList<Barrel> barrelOptions, ArrayList<Grip> gripOptions,
            Integer fireRate) {
        super(name, damage, maxMagCapacity, sightOptions, underBarrelOptions,
                barrelOptions, gripOptions, fireRate);
    }

}
