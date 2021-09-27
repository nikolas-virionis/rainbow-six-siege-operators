package virionis.nikolas.rainbow.six.siege.gadgets;

public class Throwable extends Gadget{
    private Integer damage;

    public Throwable(Integer damage, String name, Integer maxQuantity) {
        super(name, maxQuantity);
        this.damage = damage;
    }
    
}
