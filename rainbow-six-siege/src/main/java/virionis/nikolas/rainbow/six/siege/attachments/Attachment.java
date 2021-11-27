package virionis.nikolas.rainbow.six.siege.attachments;

public abstract class Attachment {
    private String name;

    public Attachment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
