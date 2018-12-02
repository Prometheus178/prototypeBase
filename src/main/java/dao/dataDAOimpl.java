package dao;

import entity.Album;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;

import java.util.List;

public class dataDAOimpl implements dataDAO{

    private SessionFactory sessionFactory;

    @Override
    public List<Album> getAlbum() {
        return null;
    }



    @Override
    public List<Album> getImage() {
        return null;
    }

    @Override
    public List<Album> delete() {
        return null;
    }

    @Override
    public List<Album> save() {
        return null;
    }
//    private DetachedCriteria createPhotoCriteria(){
//        DetachedCriteria photoListCriteria = DetachedCriteria.forClass(Album.class , "image");
//        createAlices(photoListCriteria);
//        return photoListCriteria;
//    }
//    private void createAlices(DetachedCriteria criteria){
//        criteria.createAlias("image.album", "album");
//    }
//
//    private List<Album> createPhotoList(DetachedCriteria photoListCriteria) {
//        Criteria criteria = photoListCriteria.getExecutableCriteria(sessionFactory.getCurrentSession());
//
//        return criteria.list();
//    }
}
