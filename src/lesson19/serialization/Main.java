package lesson19.serialization;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Преобразование обьектов в байты это сирюализация
        // И байты в обьект из байт в обьект десюриализация

        Pupil pupil1 = new Pupil();
        pupil1.setAge(7);
        pupil1.setName("pupil1");
        pupil1.setGroup(new Group("Химия", 12));
        pupil1.learn();

        Pupil pupil2 = new Pupil();
        pupil2.setAge(8);
        pupil2.setName("pupil2");
        pupil2.setGroup(new Group("Биология", 22));
        pupil2.learn();

        Director director = new Director("Super Speech");
        director.setAge(44);
        director.setName("director");
        director.setRating(2);

        System.out.println("До записи в файил "+ pupil1);
        System.out.println("До записи в файил "+ pupil2);


        File file =  new File("school.bin");



        objectToFile(file, pupil1);

        Pupil pupilFromFile1 = (Pupil) getObjectFromFile(file);
        System.out.println("После записи " + pupilFromFile1.toString());
        System.out.println(pupil1.equals(pupilFromFile1));



        objectToFile(file, pupil2);

        Pupil pupilFromFile2 = (Pupil) getObjectFromFile(file);
        System.out.println("После записи " + pupilFromFile2.toString());
        System.out.println(pupil2.equals(pupilFromFile2));


        objectToFile(file, director);
        Director directorFromfile = (Director) getObjectFromFile(file);
        System.out.println("После записи " + directorFromfile.toString());
        System.out.println(pupil2.equals(directorFromfile));





    }

    private static void objectToFile(File file, Object obj) {
        try (FileOutputStream fileOutput = new FileOutputStream(file);
             ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput)) {
            // OutputStream(File) <----- objectOutput <---- java app

            objectOutput.writeObject(obj);
        } catch (FileNotFoundException ignored) {
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static Object getObjectFromFile(File file) {
        Object obj = null;
        try (FileInputStream fileInput = new FileInputStream(file);  //Чтобы файлы оказались в программе
             ObjectInputStream objectInput = new ObjectInputStream(fileInput)) {
            obj = objectInput.readObject();


        } catch (FileNotFoundException e) {
            System.out.println("Фаил не найден");
        } catch (IOException e) {
            System.out.println("Проблема в момент чтения");
        } catch (ClassNotFoundException e) {
            System.out.println("Клас не найден");
        }
        return obj;


    }

    // если хотим сериализовать нужен интерфейс Srializeble     все полы класса надо серюализовать ( все поля сериализованы)
    //  Второй интерфейс extranalixeble по умолчанию он не сириализует поля
}