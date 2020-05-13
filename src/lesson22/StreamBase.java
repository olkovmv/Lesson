package lesson22;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBase {
    public static void main(String[] args) {
         /*Stream API - набор методов для работы с данными, как с потоком
         позволяет представить различные наботы данных в виде потока
         И далее: сортировать их, фильтровать, осуществлять поиск по различным критериям,
         кроме этого позволяет создавать новые потоки, создавать коллекции и мапы на основе потока данных*/
        // Stream НЕ ХРАНИТ ДАННЫЕ Для сохранения данных из Stream нужно использовать специальные методы

         /*Для работы с потоками данных:
         1. получить данные в виде потока - объект типа Stream
         2. выполнить промежуточные операции с потоком данных
         (промежуточные операции обрабатывают данные и возвражают Stream объект)
         3. выполнить терминальную (конечную) операцию
         (терминальная операция обрабатывает данные и завершает работу стрима)
         Без терминальной операции промежуточные операции не начнут выполняться!!!

         Например, получили объект stream
         промежуточные операции
         stream.операция1() - вернет преобразованный объект stream
               .операция2() - вернет преобразованный объект stream
               .операция3()  - вернет преобразованный объект stream
               .терминальнаяОперация(); // запускает промежуточные операции, данные обрабатываются, стрим закрывается
         терминальные forEach / findFirst / findAny / xxxMatch / min / max / collect*/

         /*методы получения Stream объектов:
         из коллекций collection.stream();
         из массива Arrays.stream(arr);
         из файла Files.lines(path_to_file);
         из строки string.chars();
         используя builder:
         Stream.builder().add(obj1).add(obj2).add(objN).build();
         Stream.of(1, 4, 7); любой набор данных*/


        Stream<Integer> integerSrteam = Stream.of(-3,321,-12,543,234,-423);
        integerSrteam.filter(num->num<0)
        // оставит в стриме
        // только те элементы которые удоавлетовряют услвоия
        .map(num -> num*10)  //Создание нового обьекта
        // Мап заменяет элементы( Усмножает на 10)
        .limit(2).forEach(System.out::println);
        // оставляет только первые 2 элемента
        System.out.println("----Новый стрим-----");

        integerSrteam = Stream.of(12,-2,534,0,65,8,4,-12,-434,534,-2);
        integerSrteam.distinct()
                //Остаются только уникальные значения
        .sorted()
                // Сортировка по возрастания
        .forEach(System.out::println);

        // Терминальные операции: anyMatch - хотя бы один| allMatch  - все| noneMatch
        System.out.println("----Новый стрим-----");
        integerSrteam = Stream.of(12,-2,534,0,65,8,30,-12,-434,534,-2);
        System.out.println(integerSrteam.anyMatch(num -> num == 30));
        System.out.println("----Новый стрим-----");
        integerSrteam = Stream.of(12,-2,534,0,65,8,4,-12,-434,534,-2);
        System.out.println(integerSrteam.allMatch(num -> num > 30));

        System.out.println("----Новый стрим-----");
        integerSrteam = Stream.of(12,-2,534,0,65,8,4,-12,-434,534,-2);
        System.out.println(integerSrteam.noneMatch(num -> num > 50));

        System.out.println("----Новый стрим из массива-----");
        String[] sringArr ={ "cat", "dog", "pig", "beef"};
        //Терминальные операции
        // findFirst - получение первого элемента
        // findAny - получение рандомного элемента
        String s = Arrays.stream(sringArr) // Возвращает обьект типа Optional
                .findFirst().get();

        System.out.println(s);


        String d = Arrays.stream(sringArr) // Возвращает обьект типа Optional
                .findFirst().orElse("defoult");

        System.out.println(d);



        boolean isElemPresent = Arrays.stream(sringArr).findFirst().isPresent();
        System.out.println("----Новый стрим из массива-----");
        Arrays.stream(sringArr).skip(1) // удаляет первый элементов
        .filter(s1 -> s1.endsWith("g"))
                .forEach(System.out::println);
        // массив пользователей младше 30





        ArrayList<User> users = new ArrayList<>();
        users.add(new User("qwe", 34));
        users.add(new User("asd", 56));
        users.add(new User("zxc", 18));
        users.add(new User("qwe", 34));
        users.add(new User("zxc", 22));
// массив пользователей младше 30
        User[] userArr = users.stream().filter(user->user.getAge()<30)
                .toArray(User[]::new);
                //toArray(); вернет obgect
        System.out.println(Arrays.toString(userArr));

        List<User> userList = users.stream()
                .filter(user -> user.getAge()>30)
                .peek(user -> user.setActive(true))
                .collect(Collectors.toList());

         // peek для изменения свойст существующего обьекта
        // Если я из стрима хочу собрать массив то ту эррей
        // Если не массив то коллект



    }
}
