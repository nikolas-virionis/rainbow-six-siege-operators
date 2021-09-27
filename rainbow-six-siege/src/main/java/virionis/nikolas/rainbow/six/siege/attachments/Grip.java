package virionis.nikolas.rainbow.six.siege.attachments;

public class Grip extends Attachment{
    private Double aimSpeed;
    private String recoilEffect;

    public Grip(Double aimSpeed, String recoilEffect, String name) {
        super(name);
        this.aimSpeed = aimSpeed;
        this.recoilEffect = recoilEffect;
    }
}
