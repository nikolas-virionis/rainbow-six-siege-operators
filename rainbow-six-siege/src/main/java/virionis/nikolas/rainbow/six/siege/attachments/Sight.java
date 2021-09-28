package virionis.nikolas.rainbow.six.siege.attachments;

public class Sight extends Attachment {
    private Double zoom;

    public Double getZoom() {
        return zoom;
    }

    public Sight(Double zoom, String name) {
        super(name);
        this.zoom = zoom;
    }

}
