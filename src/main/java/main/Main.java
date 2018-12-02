package main;

import entity.Album;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure()
                .buildSessionFactory();
        Session session = sessionFactory.openSession();

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


        session.close();
        sessionFactory.close();

    }
}
