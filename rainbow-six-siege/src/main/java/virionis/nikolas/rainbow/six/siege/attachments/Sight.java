package virionis.nikolas.rainbow.six.siege.attachments;

public class Sight extends Attachment {
    private Integer zoom;

    public Integer getZoom() {
        return zoom;
    }

    public Sight(Integer zoom, String name) {
        super(name);
        this.zoom = zoom;
    }

}
