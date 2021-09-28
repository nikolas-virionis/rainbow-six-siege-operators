package virionis.nikolas.rainbow.six.siege.gadgets;

public class ThrowableGadget extends Gadget{
    private Integer damage;

    public Integer getDamage() {
        return damage;
    }

    public ThrowableGadget(Integer damage, String name, Integer maxQuantity) {
        super(name, maxQuantity);
        this.damage = damage;
    }
    
}
