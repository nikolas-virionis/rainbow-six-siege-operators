package virionis.nikolas.rainbow.six.siege.weapons;

import virionis.nikolas.rainbow.six.siege.attachments.*;

public class Weapon implements IWeapon {
    private Integer damage;
    private Integer maxMagCapacity;
    private Integer magCapacity;
    private Sight sight;
    private UnderBarrel underBarrel;
    private Barrel barrel;
    private Grip grip;
    private Integer adsTime;

    public Weapon(Integer damage, Integer maxMagCapacity) {
        this.damage = damage;
        this.maxMagCapacity = maxMagCapacity;
        this.magCapacity = maxMagCapacity;
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

    public Sight getSight() {
        return sight;
    }

    public UnderBarrel getUnderBarrel() {
        return underBarrel;
    }

    public Barrel getBarrel() {
        return barrel;
    }

    public Grip getGrip() {
        return grip;
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
