package lesson22.tasks;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopTenWords {
    public static void main(String[] args) throws IOException {
        // создать Map<String, Long> map
        // String - слово
        // Long - частота встречаемости
        // в мапу должны войти только первые 10 частоте встречаемости слов

        // текст в файле
        File file = new File("sources/task21.txt");
        Map<String, Long> map;  // = читаем из файла в stream
                // сделать stream параллельным
                // обработать каждый элемент: убрать пробелы, привести к нижнему регистру
                // создать новый stream: массив слов - flatMap
                // собрать в map: слово - количество
                // получить entrySet() терминальная операция!!!
                // снова создать параллельный stream
                // сортировать по значениям
                // получить первые 10 элементов
                // собирать мапу; терминальная операция!!!

        // вывести в консоль

    }
}
