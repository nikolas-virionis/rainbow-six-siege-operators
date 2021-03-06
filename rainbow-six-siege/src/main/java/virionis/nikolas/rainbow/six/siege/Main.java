package virionis.nikolas.rainbow.six.siege;

import virionis.nikolas.rainbow.six.siege.operators.*;
import virionis.nikolas.rainbow.six.siege.weapons.*;
import virionis.nikolas.rainbow.six.siege.gadgets.*;
import virionis.nikolas.rainbow.six.siege.attachments.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // attachments//
        // sights
        Sight noSight = new Sight(1d, "None");
        Sight holo = new Sight(1d, "Holographic");
        Sight reflex = new Sight(1d, "Reflex");
        Sight reddot = new Sight(1d, "Red dot");
        Sight acog = new Sight(2.5, "2.5x ACOG");
        Sight scope2 = new Sight(2d, "Scope 2.0x");
        Sight scope3 = new Sight(3d, "Scope 3.0x");
        Sight scope15 = new Sight(1.5, "Scope 1.5x");
        ArrayList<Sight> defaultSights = new ArrayList<Sight>(Arrays.asList(noSight, reddot, holo, reflex));

        // grips
        Grip noGrip = new Grip(1d, "none", "No grip");
        Grip vert = new Grip(1d, "reduced", "Vertical grip");
        Grip angled = new Grip(0.6, "none", "Angled grip");
        ArrayList<Grip> defaultGrips = new ArrayList<Grip>(Arrays.asList(noGrip, vert, angled));

        // barrels
        Barrel noBarrel = new Barrel(1d, "none", "None");
        Barrel comp = new Barrel(1d, "horizontal", "Compesator");
        Barrel flashHider = new Barrel(1d, "Vertical", "Flash Hider");
        Barrel muzzleBreak = new Barrel(1d, "Tap fire", "Muzzle Break");
        Barrel longBarrel = new Barrel(1d, "none", "Long barrel");
        Barrel suppressor = new Barrel(0.84, "none", "Suppressor");
        ArrayList<Barrel> defaultBarrels = new ArrayList<Barrel>(
                Arrays.asList(noBarrel, flashHider, comp, muzzleBreak, suppressor));

        // under barrels
        UnderBarrel noUnderBarrel = new UnderBarrel("None");
        UnderBarrel laser = new UnderBarrel("Laser");
        ArrayList<UnderBarrel> defaultUnderBarrels = new ArrayList<UnderBarrel>(Arrays.asList(noUnderBarrel, laser));

        // gadgets//
        // throwables
        ThrowableGadget c4 = new ThrowableGadget(145, "Nitro cell", 1);
        ThrowableGadget nade = new ThrowableGadget(145, "Frag Grenade", 2);
        ThrowableGadget impact = new ThrowableGadget(51, "Impact Grenade", 2);
        ThrowableGadget smoke = new ThrowableGadget(0, "Smoke", 2);
        ThrowableGadget flash = new ThrowableGadget(0, "Flash", 3);

        // intel
        Intel bulletProofCam = new Intel("Bullet Proof Camera", 1);

        // protection
        Protection shield = new Protection("Deployable Shield", 1);

        // Breach
        Breach soft = new Breach("Soft Breach Charge", 3);
        Breach hard = new Breach("Hard Breach Charge", 1);

        // trap
        Trap barbedWire = new Trap(0, "Slowed movement", "Barbed Wire", 2);
        Trap alarm = new Trap(0, "Trigger alarm", "Proximity alarm", 2);
        Trap clay = new Trap(120, "Explosion", "Claymore", 1);

        // weapons//
        // assault rifles
        AssaultRifle l85a2 = new AssaultRifle("L85A2", 47, 30,
                new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1), defaultSights.get(2),
                        defaultSights.get(3), scope15, acog)),
                defaultUnderBarrels, defaultBarrels,
                new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0), defaultGrips.get(1))), 670);
        AssaultRifle ar33 = new AssaultRifle("AR33", 41, 25,
                new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1), defaultSights.get(2),
                        defaultSights.get(3), scope15, scope2)),
                defaultUnderBarrels, defaultBarrels, defaultGrips, 749);
        AssaultRifle g36c = new AssaultRifle(
                "G36C", 38, 30, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1),
                        defaultSights.get(2), defaultSights.get(3), scope15)),
                defaultUnderBarrels, defaultBarrels, defaultGrips, 780);
        AssaultRifle r4c = new AssaultRifle(
                "R4-C", 39, 30, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1),
                        defaultSights.get(2), defaultSights.get(3), scope15)),
                defaultUnderBarrels, defaultBarrels, defaultGrips, 850);
        AssaultRifle ar556xi = new AssaultRifle(
                "556xi", 47, 30, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1),
                        defaultSights.get(2), defaultSights.get(3), scope2, acog)),
                defaultUnderBarrels, defaultBarrels, defaultGrips, 690);
        AssaultRifle f2 = new AssaultRifle("F2", 37, 25,
                new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1), defaultSights.get(2),
                        defaultSights.get(3), scope15)),
                defaultUnderBarrels, defaultBarrels,
                new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0), defaultGrips.get(1))), 980);
        AssaultRifle ak12 = new AssaultRifle(
                "AK-12", 45, 30, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1),
                        defaultSights.get(2), defaultSights.get(3), scope2, acog)),
                defaultUnderBarrels, defaultBarrels, defaultGrips, 850);
        AssaultRifle augA2 = new AssaultRifle("AUG A2", 42, 30,
                new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1), defaultSights.get(2),
                        defaultSights.get(3), acog)),
                defaultUnderBarrels, defaultBarrels,
                new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0), defaultGrips.get(1))), 720);
        AssaultRifle commando = new AssaultRifle(
                "552 Commando", 48, 30, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1),
                        defaultSights.get(2), defaultSights.get(3), scope15)),
                defaultUnderBarrels, defaultBarrels, defaultGrips, 690);
        AssaultRifle carbine416c = new AssaultRifle("416-C", 38, 30, defaultSights, defaultUnderBarrels, defaultBarrels,
                new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0), defaultGrips.get(1))), 740);
        AssaultRifle c8 = new AssaultRifle("C8", 40, 30,
                new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1), defaultSights.get(2),
                        defaultSights.get(3), scope15)),
                defaultUnderBarrels, defaultBarrels, new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 837);
        AssaultRifle mk17 = new AssaultRifle(
                "MK17", 40, 20, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1),
                        defaultSights.get(2), defaultSights.get(3), scope15)),
                defaultUnderBarrels, defaultBarrels, defaultGrips, 585);
        AssaultRifle para308 = new AssaultRifle(
                "PARA-308", 48, 30, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1),
                        defaultSights.get(2), defaultSights.get(3), scope15)),
                defaultUnderBarrels, defaultBarrels, defaultGrips, 690);
        AssaultRifle type89 = new AssaultRifle(
                "TYPE-89", 40, 20, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1),
                        defaultSights.get(2), defaultSights.get(3), scope15)),
                defaultUnderBarrels, defaultBarrels, defaultGrips, 585);
        AssaultRifle c7e = new AssaultRifle(
                "C7E", 45, 25, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1),
                        defaultSights.get(2), defaultSights.get(3), scope2)),
                defaultUnderBarrels, defaultBarrels, defaultGrips, 800);
        AssaultRifle m762 = new AssaultRifle(
                "M762", 45, 30, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1),
                        defaultSights.get(2), defaultSights.get(3), scope2)),
                defaultUnderBarrels, defaultBarrels, defaultGrips, 730);
        AssaultRifle v308 = new AssaultRifle(
                "V308", 44, 50, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1),
                        defaultSights.get(2), defaultSights.get(3), scope2, acog)),
                defaultUnderBarrels, defaultBarrels, defaultGrips, 750);
        AssaultRifle spear308 = new AssaultRifle("Spear .308", 42, 30,
                new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1), defaultSights.get(2),
                        defaultSights.get(3), scope2)),
                defaultUnderBarrels, defaultBarrels,
                new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0), defaultGrips.get(1))), 700);
        AssaultRifle m4 = new AssaultRifle(
                "M4", 44, 30, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1),
                        defaultSights.get(2), defaultSights.get(3), scope15)),
                defaultUnderBarrels, defaultBarrels, defaultGrips, 740);
        AssaultRifle ak74m = new AssaultRifle("AK-74M", 44, 40,
                new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1), defaultSights.get(2),
                        defaultSights.get(3), scope15, acog)),
                defaultUnderBarrels, defaultBarrels, new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 650);
        AssaultRifle arx = new AssaultRifle("ARX200", 47, 20,
                new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1), defaultSights.get(2),
                        defaultSights.get(3), scope2, acog)),
                defaultUnderBarrels, defaultBarrels, new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 750);
        AssaultRifle f90 = new AssaultRifle("F90", 38, 30,
                new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1), defaultSights.get(2),
                        defaultSights.get(3), scope2, acog)),
                defaultUnderBarrels, defaultBarrels,
                new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0), defaultGrips.get(1))), 780);
        AssaultRifle commando9 = new AssaultRifle("Commando 9", 36, 25, defaultSights, defaultUnderBarrels,
                defaultBarrels, defaultGrips, 780);
        AssaultRifle sc3000k = new AssaultRifle("SC3000K", 45, 25,
                new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1), defaultSights.get(2),
                        defaultSights.get(3), scope15, scope2)),
                defaultUnderBarrels, defaultBarrels, defaultGrips, 850);

        // SMG
        SMG fmg9 = new SMG("FMG-9", 34, 30,
                new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1), defaultSights.get(2),
                        defaultSights.get(3), scope15)),
                defaultUnderBarrels, defaultBarrels, new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 800);
        SMG mp5k = new SMG("MP5K", 30, 30,
                new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1), defaultSights.get(2),
                        defaultSights.get(3), scope15)),
                defaultUnderBarrels, defaultBarrels, new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 800);
        SMG ump45 = new SMG(
                "UMP45", 38, 25, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1),
                        defaultSights.get(2), defaultSights.get(3), scope15)),
                defaultUnderBarrels, defaultBarrels, defaultGrips, 600);
        SMG mp5 = new SMG("MP5", 27, 25,
                new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1), defaultSights.get(2),
                        defaultSights.get(3), scope15, scope2)),
                defaultUnderBarrels,
                new ArrayList<Barrel>(Arrays.asList(defaultBarrels.get(0), defaultBarrels.get(1), defaultBarrels.get(3),
                        defaultBarrels.get(4))),
                new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0), defaultGrips.get(1))), 800);
        SMG p90 = new SMG("P90", 22, 50,
                new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1), defaultSights.get(2),
                        defaultSights.get(3), scope15)),
                defaultUnderBarrels, new ArrayList<Barrel>(Arrays.asList(defaultBarrels.get(0), defaultBarrels.get(1),
                        defaultBarrels.get(3), defaultBarrels.get(4))),
                new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 970);
        SMG smg9x19 = new SMG(
                "9x19VSN", 34, 30, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1),
                        defaultSights.get(2), defaultSights.get(3), scope15)),
                defaultUnderBarrels, defaultBarrels, defaultGrips, 750);
        SMG mp7 = new SMG("MP7", 32, 30,
                new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1), defaultSights.get(2),
                        defaultSights.get(3), scope15)),
                defaultUnderBarrels, defaultBarrels, new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 900);
        SMG c1 = new SMG("9mm C1", 45, 33,
                new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1), defaultSights.get(2),
                        defaultSights.get(3), scope15)),
                defaultUnderBarrels,
                new ArrayList<Barrel>(Arrays.asList(defaultBarrels.get(0), defaultBarrels.get(4), longBarrel)),
                defaultGrips, 575);
        SMG mpx = new SMG("MPX", 26, 30, defaultSights, defaultUnderBarrels, defaultBarrels, defaultGrips, 830);
        SMG m12 = new SMG("M12", 40, 30, defaultSights, defaultUnderBarrels, defaultBarrels,
                new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 550);
        SMG mp5sd = new SMG("MP5SD", 30, 30, defaultSights, defaultUnderBarrels,
                new ArrayList<Barrel>(Arrays.asList(defaultBarrels.get(4))), defaultGrips, 800);
        SMG pdw9 = new SMG(
                "PDW9", 34, 50, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1),
                        defaultSights.get(2), defaultSights.get(3), scope15)),
                defaultUnderBarrels, defaultBarrels, defaultGrips, 800);
        SMG vector = new SMG("Vector .45 ACP", 21, 25,
                new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1), defaultSights.get(2),
                        defaultSights.get(3), scope15)),
                defaultUnderBarrels, defaultBarrels,
                new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0), defaultGrips.get(1))), 1200);
        SMG t5 = new SMG("T-5 SMG", 28, 30,
                new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1), defaultSights.get(2),
                        defaultSights.get(3), scope15)),
                defaultUnderBarrels, defaultBarrels, new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 900);
        SMG scorpion = new SMG("Scorpion EVO 3 A1", 23, 40, defaultSights, defaultUnderBarrels, defaultBarrels,
                defaultGrips, 1080);
        SMG k1a = new SMG("K1A", 36, 30, defaultSights, defaultUnderBarrels, defaultBarrels, defaultGrips, 720);
        SMG mx4 = new SMG(
                "Mx4 Storm", 26, 30, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1),
                        defaultSights.get(2), defaultSights.get(3), scope15)),
                defaultUnderBarrels, defaultBarrels, defaultGrips, 950);
        SMG augA3 = new SMG(
                "AUG A3", 36, 31, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1),
                        defaultSights.get(2), defaultSights.get(3), scope15)),
                defaultUnderBarrels, defaultBarrels, defaultGrips, 700);
        SMG p10 = new SMG(
                "AUG A3", 26, 19, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1),
                        defaultSights.get(2), defaultSights.get(3), scope15)),
                defaultUnderBarrels, defaultBarrels, defaultGrips, 980);

        // Shotgun
        Shotgun m590a1 = new Shotgun("M590A1", 48, 7, defaultSights, defaultUnderBarrels,
                new ArrayList<Barrel>(Arrays.asList(defaultBarrels.get(0))),
                new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 1);
        Shotgun m1014 = new Shotgun("M1014", 32, 8, defaultSights, defaultUnderBarrels,
                new ArrayList<Barrel>(Arrays.asList(defaultBarrels.get(0))),
                new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 1);
        Shotgun sgcqb = new Shotgun("SG-CQB", 53, 7, defaultSights, defaultUnderBarrels,
                new ArrayList<Barrel>(Arrays.asList(defaultBarrels.get(0))),
                new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0), defaultGrips.get(1))), 1);
        Shotgun sasg12 = new Shotgun("SASG-12", 49, 10, defaultSights, defaultUnderBarrels,
                new ArrayList<Barrel>(Arrays.asList(defaultBarrels.get(0), defaultBarrels.get(4))), defaultGrips, 1);
        Shotgun m870 = new Shotgun("M870", 60, 7, defaultSights, defaultUnderBarrels,
                new ArrayList<Barrel>(Arrays.asList(defaultBarrels.get(0))),
                new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 1);
        Shotgun super90 = new Shotgun("Super 90", 35, 8, defaultSights, defaultUnderBarrels,
                new ArrayList<Barrel>(Arrays.asList(defaultBarrels.get(0))),
                new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 1);
        Shotgun spas12 = new Shotgun("SPAS-12", 35, 7, defaultSights, defaultUnderBarrels,
                new ArrayList<Barrel>(Arrays.asList(defaultBarrels.get(0))),
                new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 1);
        Shotgun spas15 = new Shotgun("SPAS-15", 30, 6, defaultSights, defaultUnderBarrels,
                new ArrayList<Barrel>(Arrays.asList(defaultBarrels.get(0))),
                new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 1);
        Shotgun superNova = new Shotgun("SuperNova", 48, 7, defaultSights, defaultUnderBarrels,
                new ArrayList<Barrel>(Arrays.asList(defaultBarrels.get(0), defaultBarrels.get(4))),
                new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 1);
        Shotgun ita12l = new Shotgun("ITA12L", 50, 8, defaultSights, defaultUnderBarrels,
                new ArrayList<Barrel>(Arrays.asList(defaultBarrels.get(0))),
                new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 1);
        Shotgun six12 = new Shotgun("SIX12", 35, 6, defaultSights, defaultUnderBarrels,
                new ArrayList<Barrel>(Arrays.asList(defaultBarrels.get(0))),
                new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 1);
        Shotgun six12sd = new Shotgun("SIX12SD", 35, 6, defaultSights, defaultUnderBarrels,
                new ArrayList<Barrel>(Arrays.asList(defaultBarrels.get(4))),
                new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 1);
        Shotgun fo12 = new Shotgun("FO-12", 35, 10, defaultSights, defaultUnderBarrels,
                new ArrayList<Barrel>(Arrays.asList(defaultBarrels.get(0), defaultBarrels.get(4), longBarrel)),
                defaultGrips, 1);
        Shotgun bosg = new Shotgun("BOSG.12.2", 125, 2,
                new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1), defaultSights.get(2),
                        defaultSights.get(3), defaultSights.get(4), acog)),
                defaultUnderBarrels, new ArrayList<Barrel>(Arrays.asList(defaultBarrels.get(0))), defaultGrips, 1);
        Shotgun acs12 = new Shotgun("ACS12", 59, 30,
                new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1), defaultSights.get(2),
                        defaultSights.get(3), defaultSights.get(4), scope15, scope2)),
                defaultUnderBarrels, new ArrayList<Barrel>(Arrays.asList(defaultBarrels.get(0))), defaultGrips, 300);
        Shotgun tcsg12 = new Shotgun("TCSG12", 57, 10,
                new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1), defaultSights.get(2),
                        defaultSights.get(3), defaultSights.get(4), scope2)),
                defaultUnderBarrels, new ArrayList<Barrel>(Arrays.asList(defaultBarrels.get(0), defaultBarrels.get(4))),
                defaultGrips, 1);
        Shotgun ita12s = new Shotgun("ITA12S", 70, 5, defaultSights, defaultUnderBarrels,
                new ArrayList<Barrel>(Arrays.asList(defaultBarrels.get(0))),
                new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 1);
        Shotgun superShorty = new Shotgun("Super Shorty", 35, 3,
                new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1))), defaultUnderBarrels,
                new ArrayList<Barrel>(Arrays.asList(defaultBarrels.get(0))),
                new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 1);

        // MarksmanRifle
        MarksmanRifle sn417 = new MarksmanRifle("417", 69, 20,
                new ArrayList<Sight>(
                        Arrays.asList(defaultSights.get(0), defaultSights.get(1), defaultSights.get(2), acog)),
                defaultUnderBarrels, defaultBarrels,
                new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0), defaultGrips.get(1))), 1);
        MarksmanRifle ots03 = new MarksmanRifle("OTs-03", 71, 15,
                new ArrayList<Sight>(Arrays.asList(defaultSights.get(0))), defaultUnderBarrels,
                new ArrayList<Barrel>(Arrays.asList(defaultBarrels.get(0), defaultBarrels.get(2), defaultBarrels.get(3),
                        defaultBarrels.get(4))),
                new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 1);
        MarksmanRifle camrs = new MarksmanRifle("CAMRS", 69, 20,
                new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1), defaultSights.get(2),
                        defaultSights.get(3), acog)),
                defaultUnderBarrels, defaultBarrels, new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 1);
        MarksmanRifle sr25 = new MarksmanRifle("SR-25", 61, 20,
                new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1), defaultSights.get(2),
                        defaultSights.get(3), acog)),
                defaultUnderBarrels, defaultBarrels,
                new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0), defaultGrips.get(1))), 1);
        MarksmanRifle mk14 = new MarksmanRifle(
                "Mk 14 EBR", 60, 20, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1),
                        defaultSights.get(2), defaultSights.get(3), acog)),
                defaultUnderBarrels, defaultBarrels, defaultGrips, 1);
        MarksmanRifle ar15 = new MarksmanRifle(
                "AR-15.50", 62, 10, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1),
                        defaultSights.get(2), defaultSights.get(3), acog)),
                defaultUnderBarrels, defaultBarrels, defaultGrips, 1);
        MarksmanRifle csrx300 = new MarksmanRifle("CSRX 300", 69, 20,
                new ArrayList<Sight>(Arrays.asList(defaultSights.get(0))),
                new ArrayList<UnderBarrel>(Arrays.asList(defaultUnderBarrels.get(0))),
                new ArrayList<Barrel>(Arrays.asList(defaultBarrels.get(0))),
                new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 1);

        // LMG
        LMG lmg6p41 = new LMG("6P41", 46, 100,
                new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1), defaultSights.get(2),
                        defaultSights.get(3), scope15, acog)),
                defaultUnderBarrels,
                new ArrayList<Barrel>(
                        Arrays.asList(defaultBarrels.get(0), defaultBarrels.get(2), defaultBarrels.get(4))),
                new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0), defaultGrips.get(1))), 680);
        LMG g8 = new LMG(
                "G8A1", 37, 50, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1),
                        defaultSights.get(2), defaultSights.get(3), scope2, acog)),
                defaultUnderBarrels, defaultBarrels, defaultGrips, 850);
        LMG m249 = new LMG("M249", 48, 100,
                new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1), defaultSights.get(2),
                        defaultSights.get(3), scope2, acog)),
                defaultUnderBarrels, defaultBarrels,
                new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0), defaultGrips.get(1))), 650);
        LMG t95 = new LMG(
                "T-95", 46, 80, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1),
                        defaultSights.get(2), defaultSights.get(3), scope2, acog)),
                defaultUnderBarrels, defaultBarrels, defaultGrips, 650);
        LMG lmgE = new LMG("LMG-E", 41, 150,
                new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1), defaultSights.get(2),
                        defaultSights.get(3), scope15, acog)),
                defaultUnderBarrels, defaultBarrels,
                new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0), defaultGrips.get(1))), 720);
        LMG alda = new LMG("ALDA 5.56", 35, 80, defaultSights, defaultUnderBarrels, defaultBarrels,
                new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0), defaultGrips.get(1))), 900);
        LMG m249saw = new LMG("M249 SAW", 48, 60,
                new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(1), defaultSights.get(2),
                        defaultSights.get(3), scope2, acog)),
                defaultUnderBarrels, defaultBarrels,
                new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0), defaultGrips.get(1))), 650);
        LMG dp27 = new LMG("DP27", 49, 70,
                new ArrayList<Sight>(Arrays.asList(defaultSights.get(0), defaultSights.get(3))), defaultUnderBarrels,
                defaultBarrels, new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 550);

        // Handgun
        Handgun p226 = new Handgun("P226 Mk 25", 50, 15, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0))),
                defaultUnderBarrels, defaultBarrels, new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 1);
        Handgun m45 = new Handgun("M45 MEUSOC", 58, 7, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0))),
                defaultUnderBarrels, defaultBarrels, new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 1);
        Handgun usg57 = new Handgun("5.7 USG", 42, 20, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0))),
                defaultUnderBarrels, defaultBarrels, new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 1);
        Handgun p9 = new Handgun("P9", 45, 16, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0))),
                defaultUnderBarrels, defaultBarrels, new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 1);
        Handgun lfp586 = new Handgun("LFP586", 78, 6, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0))),
                defaultUnderBarrels, new ArrayList<Barrel>(Arrays.asList(defaultBarrels.get(0))),
                new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 1);
        Handgun gsh18 = new Handgun("GSh-18", 44, 18, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0))),
                defaultUnderBarrels, defaultBarrels, new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 1);
        Handgun pmm = new Handgun("PMM", 63, 8, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0))),
                defaultUnderBarrels, defaultBarrels, new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 1);
        Handgun p12 = new Handgun("P12", 45, 15, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0))),
                defaultUnderBarrels, defaultBarrels, new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 1);
        Handgun mk1 = new Handgun("MK1 9mm", 48, 13, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0))),
                defaultUnderBarrels, defaultBarrels, new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 1);
        Handgun deagle = new Handgun("D-50", 71, 7, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0))),
                defaultUnderBarrels, defaultBarrels, new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 1);
        Handgun prb92 = new Handgun("PRB92", 42, 15, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0))),
                defaultUnderBarrels, defaultBarrels, new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 1);
        Handgun luison = new Handgun("Luison", 65, 15, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0))),
                defaultUnderBarrels, new ArrayList<Barrel>(Arrays.asList(defaultBarrels.get(4))),
                new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 1);
        Handgun p229 = new Handgun("P229", 50, 12, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0))),
                defaultUnderBarrels, defaultBarrels, new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 1);
        Handgun usp40 = new Handgun("P226 Mk 25", 48, 12, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0))),
                defaultUnderBarrels, defaultBarrels, new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 1);
        Handgun q929 = new Handgun("P226 Mk 25", 60, 10, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0))),
                defaultUnderBarrels, defaultBarrels, new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 1);
        Handgun rg15 = new Handgun("RG15", 38, 15, new ArrayList<Sight>(Arrays.asList(defaultSights.get(1))),
                defaultUnderBarrels, defaultBarrels, new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 1);
        Handgun bailif = new Handgun("Bailiff 410", 35, 5, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0))),
                defaultUnderBarrels, defaultBarrels, new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 1);
        Handgun keratos = new Handgun("Keratos .357", 78, 6, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0))),
                defaultUnderBarrels, defaultBarrels, new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 1);
        Handgun tacops = new Handgun("1911 TACOPS", 55, 8, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0))),
                defaultUnderBarrels, defaultBarrels, new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 1);
        Handgun p10c = new Handgun("P-10C", 40, 15, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0))),
                defaultUnderBarrels, defaultBarrels, new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 1);
        Handgun mag44 = new Handgun(".44 Mag Semi-Auto", 54, 7, new ArrayList<Sight>(Arrays.asList(scope3)),
                defaultUnderBarrels, new ArrayList<Barrel>(Arrays.asList(defaultBarrels.get(0))),
                new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 1);
        Handgun sdp9mm = new Handgun("SDP 9mm", 47, 16, new ArrayList<Sight>(Arrays.asList(defaultSights.get(0))),
                defaultUnderBarrels, defaultBarrels, new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0))), 1);

        // Machine pistols
        MachinePistol smg11 = new MachinePistol("SMG-11", 35, 16, defaultSights, defaultUnderBarrels, defaultBarrels,
                new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0), defaultGrips.get(1))), 1270);
        MachinePistol bearing9 = new MachinePistol("Bearing 9", 33, 25, defaultSights, defaultUnderBarrels,
                defaultBarrels, new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0), defaultGrips.get(1))), 1100);
        MachinePistol smg12 = new MachinePistol("SMG-12", 28, 32, defaultSights, defaultUnderBarrels, defaultBarrels,
                new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0), defaultGrips.get(1))), 1270);
        MachinePistol cz = new MachinePistol("C75 Auto", 35, 26, defaultSights, defaultUnderBarrels, defaultBarrels,
                new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0), defaultGrips.get(1))), 1000);
        MachinePistol spsmg9 = new MachinePistol("SPSMG9", 33, 20, defaultSights, defaultUnderBarrels, defaultBarrels,
                new ArrayList<Grip>(Arrays.asList(defaultGrips.get(0), defaultGrips.get(1))), 980);
    }
}
