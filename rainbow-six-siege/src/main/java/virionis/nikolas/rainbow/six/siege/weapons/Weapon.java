package virionis.nikolas.rainbow.six.siege.weapons;

import virionis.nikolas.rainbow.six.siege.attachments.*;

public class Weapon implements IWeapon{
    private Integer damage;
    private Integer maxMagCapacity;    
    private Integer magCapacity;
    private Sight sight;    
    private UnderBarrel underBarrel;
    private Barrel barrel;
    private Grip grip;
    private Integer adsTime;

    public Weapon(Integer damage, Integer maxMagCapacity, Sight sight, 
            UnderBarrel underBarrel, Barrel barrel, Grip grip, Integer adsTime) {
        this.damage = damage;
        this.maxMagCapacity = maxMagCapacity;
        this.magCapacity = maxMagCapacity;
        this.sight = sight;
        this.underBarrel = underBarrel;
        this.barrel = barrel;
        this.grip = grip;        
        this.adsTime = adsTime;
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
