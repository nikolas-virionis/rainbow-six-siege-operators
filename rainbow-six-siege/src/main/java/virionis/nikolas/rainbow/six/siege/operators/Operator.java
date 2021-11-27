package virionis.nikolas.rainbow.six.siege.operators;

import java.util.ArrayList;

import virionis.nikolas.rainbow.six.siege.gadgets.*;
import virionis.nikolas.rainbow.six.siege.weapons.*;

public abstract class Operator {

    private String name;
    private String unit;
    private Integer maxHp;
    private Integer hp;
    private Integer health;
    private Integer speed;
    private ArrayList<Weapon> primaryWeaponOptions;
    private ArrayList<Weapon> secondaryWeaponOptions;
    private Weapon primaryWeapon;
    private Weapon secondaryWeapon;
    private ArrayList<Gadget> gadgetOptions;
    private Gadget gadget;
    private Character side;

    public Operator(String name, String unit, Integer maxHp, Integer health,
            Integer speed,
            ArrayList<Weapon> primaryWeaponOptions,
            ArrayList<Weapon> secondaryWeaponOptions,
            ArrayList<Gadget> gadgetOptions, Character side) {
        this.name = name;
        this.setUnit(unit);
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.health = health;
        this.speed = speed;
        this.primaryWeaponOptions = primaryWeaponOptions;
        this.secondaryWeaponOptions = secondaryWeaponOptions;
        this.gadgetOptions = gadgetOptions;
        this.side = side;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public Integer getMaxHp() {
        return maxHp;
    }

    public Integer getHp() {
        return hp;
    }

    public Integer getHealth() {
        return health;
    }

    public Integer getSpeed() {
        return speed;
    }

    public ArrayList<Weapon> getPrimaryWeaponOptions() {
        return primaryWeaponOptions;
    }

    public ArrayList<Weapon> getSecondaryWeaponOptions() {
        return secondaryWeaponOptions;
    }

    public Weapon getPrimaryWeapon() {
        return primaryWeapon;
    }

    public Weapon getSecondaryWeapon() {
        return secondaryWeapon;
    }

    public ArrayList<Gadget> getGadgetOptions() {
        return gadgetOptions;
    }

    public Gadget getGadget() {
        return gadget;
    }

    public Character getSide() {
        return side;
    }

    public void walk(Character direction, Integer speed) {
    }

    public void sprint(Character direction, Integer speed) {
    }

    public void crouch() {
    }

    public void prone() {
    }

    public void shoot(Boolean hit, Operator target) {
    }

    public void getShot(Integer damage) {
    }

    public void ads(Integer speed) {
    }

    public void unAds(Integer speed) {
    }

}
