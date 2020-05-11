package lesson17;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertisClass {
    public static void main(String[] args) {
        // Обьект типа пПропертис основан на хеш таблице
        // используется для хранения пар: Ключ значение
        // При этом тип данных ключей String
        // Тип данных значений String

        Properties properties = new Properties();
        // Удобно для работы с проперти файлами
        // В корне проекта ( на одном уровне с src и out)
        // Создаем дирректорию sourses

        // Resourses root

        // файл example.properties
    try(InputStream input = PropertisClass.class
            .getClassLoader().getResourceAsStream("example.properties")){
        properties.load(input);

    } catch (IOException e) {
        e.printStackTrace();
    }
        System.out.println(properties.getProperty("key"));
        System.out.println(properties.getProperty("age"));
        System.out.println(properties.getProperty("sey"));
        System.out.println(properties.getProperty("sey", "ada"));
        //Добавить в обьект ключ значение не в фаил
        properties.setProperty("name", "паразит");


        //
        PropertiesLoader loader1 = PropertiesLoader.getPropertiesLoader("example.properties");


        PropertiesLoader loader2 = PropertiesLoader.getPropertiesLoader("example.properties");

    }
}
