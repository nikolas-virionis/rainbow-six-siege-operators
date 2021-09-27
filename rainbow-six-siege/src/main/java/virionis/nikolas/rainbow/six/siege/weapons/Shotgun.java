package virionis.nikolas.rainbow.six.siege.weapons;

import java.util.ArrayList;

import virionis.nikolas.rainbow.six.siege.attachments.*;

public class Shotgun extends Weapon {

    public Shotgun(Integer damage, Integer maxMagCapacity, ArrayList<Sight> sightOptions,
            ArrayList<UnderBarrel> underBarrelOptions, ArrayList<Barrel> barrelOptions, ArrayList<Grip> gripOptions) {
        super(damage, maxMagCapacity, sightOptions, underBarrelOptions, barrelOptions, gripOptions);
    }

}
