package virionis.nikolas.rainbow.six.siege.operators;

import java.util.ArrayList;

import virionis.nikolas.rainbow.six.siege.gadgets.*;
import virionis.nikolas.rainbow.six.siege.weapons.*;

public class MediumOperator extends Operator {

    public MediumOperator(String name, String unit,
            ArrayList<Weapon> primaryWeaponOptions,
            ArrayList<Weapon> secondaryWeaponOptions,
            ArrayList<Gadget> gadgetOptions, Character side) {
        super(name, unit, 110, 2, 2, primaryWeaponOptions,
                secondaryWeaponOptions, gadgetOptions, side);
    }


}
