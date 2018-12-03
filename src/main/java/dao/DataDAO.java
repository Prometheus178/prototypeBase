package dao;

import entity.Album;

import java.util.List;

public interface DataDAO {
    List<Album> getAlbum();
    List<Album> getImage();
    List<Album> delete();
    List<Album> save();
}
