package entity;

import java.util.Arrays;
import java.util.Objects;

public class Album {
    private int id;
    private String name;
    private byte[] content;

    public Album(int id, String name, byte[] content) {
        this.id = id;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return id == album.id &&
                Objects.equals(name, album.name) &&
                Arrays.equals(content, album.content);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, name);
        result = 31 * result + Arrays.hashCode(content);
        return result;
    }
}
