package virionis.nikolas.rainbow.six.siege.operators;

import java.util.ArrayList;

import virionis.nikolas.rainbow.six.siege.gadgets.*;
import virionis.nikolas.rainbow.six.siege.weapons.*;

public class Operator implements IOperator {

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
        this.unit = unit;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.health = health;
        this.speed = speed;
        this.primaryWeaponOptions = primaryWeaponOptions;
        this.secondaryWeaponOptions = secondaryWeaponOptions;
        this.gadgetOptions = gadgetOptions;
        this.side = side;
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

    @Override
    public void walk(Character direction, Integer speed) {
        // TODO Auto-generated method stub

    }

    @Override
    public void sprint(Character direction, Integer speed) {
        // TODO Auto-generated method stub

    }

    @Override
    public void crouch() {
        // TODO Auto-generated method stub

    }

    @Override
    public void prone() {
        // TODO Auto-generated method stub

    }

    @Override
    public void shoot(Boolean hit, Operator target) {
        // TODO Auto-generated method stub

    }

    @Override
    public void getShot(Integer damage) {
        // TODO Auto-generated method stub

    }

    @Override
    public void ads(Integer speed) {
        // TODO Auto-generated method stub

    }

    @Override
    public void unAds(Integer speed) {
        // TODO Auto-generated method stub

    }

}
