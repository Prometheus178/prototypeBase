package main;

import dao.DataDAO;
import dao.DataDAOimpl;
import entity.Album;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        SessionFactory sessionFactory = new Configuration()
//                .configure()
//                .buildSessionFactory();
//        Session session = sessionFactory.openSession();

//        Album photo1 = new Album();
//        photo1.setName("puppy");
//        byte[] puppy =
//        photo1.setContent(kitty);
//        session.save(photo1);
//        Album album = (Album) session.get(Album.class, 1);
////        System.out.println(album);
//        try {
//            FileOutputStream outputStream = new FileOutputStream("/home/sirius/Музыка/baseJpa/images/output.jpg");
//            outputStream.write(album.getContent());
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        session.close();
//        sessionFactory.close();
            ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataDAOimpl dataDAOimpl = (DataDAOimpl) context.getBean("dataDAOimpl");
        System.out.println(dataDAOimpl);
        List<Album> albumList = dataDAOimpl.getAlbum();
        System.out.println(albumList);

    }
}
