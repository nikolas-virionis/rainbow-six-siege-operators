package virionis.nikolas.rainbow.six.siege.gadgets;

public class Intel extends Gadget {
    private Boolean brokenGlass;

    public Intel(String name, Integer maxQuantity) {
        super(name, maxQuantity);
        this.brokenGlass = false;
    }

    public Boolean getBrokenGlass() {
        return brokenGlass;
    }

}
