package virionis.nikolas.rainbow.six.siege.operators;

import java.util.ArrayList;

import virionis.nikolas.rainbow.six.siege.gadgets.*;
import virionis.nikolas.rainbow.six.siege.weapons.*;

public class HeavyOperator extends Operator {

    public HeavyOperator(String name, String unit,
            ArrayList<Weapon> primaryWeaponOptions,
            ArrayList<Weapon> secondaryWeaponOptions,
            ArrayList<Gadget> gadgetOptions, Character side) {
        super(name, unit, 125, 3, 1, primaryWeaponOptions,
                secondaryWeaponOptions, gadgetOptions, side);
    }

}
