package Lesson18;

import com.sun.tools.classfile.ConstantPool;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.FileHandler;

public class IOLesson {
    public static void main(String[] args) {


        // IO  api представляет возможность передачи
        // Хранит последовательность байт или чар
        File file = new File("filepath.txt");
        try {
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Возвращает абсалютный путь
        System.out.println(file.getAbsolutePath());
        // Проверка на дирректорию
        System.out.println(file.isDirectory());
    // ИМя файла
        System.out.println(file.getName());

        System.out.println(file.isFile());
    //Доступне для чтения
        System.out.println(file.canRead());
        // Доступен для записи
        System.out.println(file.canWrite());

        file.length(); // Длинна в байтах

        try {
            writeToFile(file, "hello", false);
//            writeToFileBudder(file);
            readFromFileToByAsrra(file);
            byte[] bytes = ingByteArray(new File("sourses/marshmallow.jpg"));
            byteArrayToImage(new File("sourses/marsfdhmallow.jpg"), bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Если данные передаются из программы в виже
        // последоватлеьности байт, то мы будеми работать
        //с OutputStream
        // ресурс <------ java app
        //Если данные передаются в программу в виде
        //последоватлеьности байт, то мы будеми работать
        // InputStream
        // ресурс ------> java app

    }
   // ресурс <------ java app
    private static void writeToFile(File file, String data, boolean append) throws IOException {
        //Записываем название файла, что записываем и флаг в начало фалйла и дозаписываем
        // Строка должна быть записана в file
        // Если append true - запись в конце файла
        // Если append false - запись в начало файла
        // try - with - resourses - доступен , начиная с 7 версии языка
        // Нужна для автоматичесеого закрытия ресурсов
        // Когда блок try завершит свою работу
        try(FileOutputStream fileOutputStream = new FileOutputStream(file, append)) { // Уходит из программы
        /// Как закрыть ресурсы - у всех обьекто которые открыты в круглых скобках будут вызывается metod close
            byte[] bytes = data.getBytes(); // нашу строяку представили как наор байт
            fileOutputStream.write(bytes); // Записывваем этот массив байт

        }

    }
    // ресурс <--[buffer]---- java app   // Программа отдает данные в буфер, буфер копится и записывает в файл
    private static void writeToFileBudder(File file) throws IOException {
        try (FileOutputStream fileOutputs = new FileOutputStream(file);
        BufferedOutputStream bufferedOutput = new BufferedOutputStream(fileOutputs)) {
            // Размер буфера можно установить через конструктор// по умолчаниб 8192 байта
            // new BuBufferedOutputStream(fileOutputs, size))

            for (int i = 0; i <1_000 ; i++) {
                bufferedOutput.write((i + " ").getBytes());

            }


        }
    }

    private static String readFromFileToByAsrra(File file) throws IOException {
        String string = null;

        try (FileInputStream fileInput = new FileInputStream(file);
        ByteArrayOutputStream arrayOut = new ByteArrayOutputStream()) {
            byte[] buf = new byte[512];
            int data;
            while  ((data = fileInput.read(buf)) > 0) {
                System.out.println(data);
                System.out.println(Arrays.toString(buf));
                arrayOut.write(buf, 0 , data);
                System.out.println(Arrays.toString((arrayOut.toByteArray())));
            }
            string = arrayOut.toString();
        }
        return string;

    }

    public  static  byte[] ingByteArray(File file) throws IOException {
        BufferedImage image = ImageIO.read(file);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        ImageIO.write(image, "png", output);
        return output.toByteArray();


    }

    public static  boolean byteArrayToImage(File file, byte[] bytes) throws IOException {
        try (ByteArrayInputStream input = new ByteArrayInputStream(bytes)){
            BufferedImage image = ImageIO.read(input);
            return  ImageIO.write(image, "png", file);

        }
    }
}