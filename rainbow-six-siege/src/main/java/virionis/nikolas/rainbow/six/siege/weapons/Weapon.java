package virionis.nikolas.rainbow.six.siege.weapons;

import java.util.ArrayList;

import virionis.nikolas.rainbow.six.siege.attachments.*;

public class Weapon implements IWeapon {
    private Integer damage;
    private Integer maxMagCapacity;
    private Integer magCapacity;
    private ArrayList<Sight> sightOptions;
    private ArrayList<UnderBarrel> underBarrelOptions;
    private ArrayList<Barrel> barrelOptions;
    private ArrayList<Grip> gripOptions;
    private Integer adsTime;

    public Weapon(Integer damage, Integer maxMagCapacity, ArrayList<Sight> sightOptions,
            ArrayList<UnderBarrel> underBarrelOptions, ArrayList<Barrel> barrelOptions, ArrayList<Grip> gripOptions) {
        this.damage = damage;
        this.maxMagCapacity = maxMagCapacity;
        this.magCapacity = maxMagCapacity;
        this.sightOptions = sightOptions;
        this.underBarrelOptions = underBarrelOptions;
        this.barrelOptions = barrelOptions;
        this.gripOptions = gripOptions;
    }

    public Integer getDamage() {
        return damage;
    }

    public Integer getMaxMagCapacity() {
        return maxMagCapacity;
    }

    public Integer getMagCapacity() {
        return magCapacity;
    }

    public ArrayList<Sight> getSightOptions() {
        return sightOptions;
    }

    public ArrayList<UnderBarrel> getUnderBarrelOptions() {
        return underBarrelOptions;
    }

    public ArrayList<Barrel> getBarrelOptions() {
        return barrelOptions;
    }

    public ArrayList<Grip> getGripOptions() {
        return gripOptions;
    }

    public Integer getAdsTime() {
        return adsTime;
    }

    @Override
    public void shoot() {

    }

    @Override
    public void aim() {

    }

    @Override
    public Integer checkMagazine() {
        return -1;
    }

    @Override
    public void reload() {

    }

}
