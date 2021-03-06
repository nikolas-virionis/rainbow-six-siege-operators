package virionis.nikolas.rainbow.six.siege.gadgets;

public abstract class Gadget {
    private String name;
    private Integer maxQuantity;

    public String getName() {
        return name;
    }

    public Integer getMaxQuantity() {
        return maxQuantity;
    }

    public Gadget(String name, Integer maxQuantity) {
        this.name = name;
        this.maxQuantity = maxQuantity;
    }
}
