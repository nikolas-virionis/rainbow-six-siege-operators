package virionis.nikolas.rainbow.six.siege.operators;

import java.util.ArrayList;

import virionis.nikolas.rainbow.six.siege.gadgets.*;
import virionis.nikolas.rainbow.six.siege.weapons.*;

public class LightOperator extends Operator {

    public LightOperator(String name, String unit,
            ArrayList<Weapon> primaryWeaponOptions,
            ArrayList<Weapon> secondaryWeaponOptions,
            ArrayList<Gadget> gadgetOptions, Character side) {
        super(name, unit, 100, 1, 3, primaryWeaponOptions,
                secondaryWeaponOptions, gadgetOptions, side);
    }

}
