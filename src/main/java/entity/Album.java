package entity;

public class Album {
    private int id;
    private String description;
    private byte[] content;

    public Album(int id, String description, byte[] content) {
        this.id = id;
        this.description = description;
        this.content = content;
    }

    public Album() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String name) {
        this.description = name;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", content=" + content +
                '}';
    }
}
