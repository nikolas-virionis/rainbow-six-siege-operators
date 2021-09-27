package virionis.nikolas.rainbow.six.siege.gadgets;

public class Trap extends Gadget{
    private Integer damage;
    private String movementEffect;

    public Integer getDamage() {
        return damage;
    }

    public String getMovementEffect() {
        return movementEffect;
    }

    public Trap(Integer damage, String movementEffect, String name, Integer maxQuantity) {
        super(name, maxQuantity);
        this.damage = damage;
        this.movementEffect = movementEffect;
    }
    
}
