package virionis.nikolas.rainbow.six.siege;

import virionis.nikolas.rainbow.six.siege.operators.*;
import virionis.nikolas.rainbow.six.siege.weapons.*;
import virionis.nikolas.rainbow.six.siege.gadgets.*;
import virionis.nikolas.rainbow.six.siege.gadgets.Throwable;

import java.util.ArrayList;
import java.util.Arrays;

import virionis.nikolas.rainbow.six.siege.attachments.*;

public class Main {
    public static void main(String[] args) {
        SMG mpx = new SMG(26, 30);
        Handgun deagle = new Handgun(71, 7);
        Throwable c4 = new Throwable(145, "Nitro cell", 1);
        Sight holo = new Sight(1, "Holographic");
        Grip vert = new Grip(1d, "reduced", "Vertical grip");
        Barrel comp = new Barrel(1d, "horizontal", "Compesator");
        UnderBarrel none = new UnderBarrel("none");
        MediumOperator valk = new MediumOperator(new ArrayList<Weapon>(Arrays.asList(mpx)),
                new ArrayList<Weapon>(Arrays.asList(deagle)), new ArrayList<Gadget>(Arrays.asList(c4)), 'd');

    }
}
