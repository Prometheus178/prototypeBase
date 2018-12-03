package dao;

import entity.Album;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

import java.util.List;

public class DataDAOimpl implements DataDAO {
    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Override
    public List<Album> getAlbum() {
        Session session = this.sessionFactory.openSession();
        List<Album> albumList = (List<Album>) session.get(Album.class,1);
        session.close();
        return albumList;
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
