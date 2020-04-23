package lesson15;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import com.sun.xml.internal.xsom.XSUnionSimpleType;
import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        User cbf = new User("cbf", "12443", Role.USER);
        User asd = new User("asd", "2625", Role.ADMIN);
        User rty = new User("rty", "8734", Role.USER);
        User bnm = new User("bnm", "2688", Role.ADMIN);
        // Ключи и значения в Мапах не повторяются
        // К одному ключу одно значение. Ключи уникальны
        // Мапы не связаны с еолекциями
        // MAp это интерфейс
        //Hashtable используется крайне редко
        System.out.println("---HashMap----");
        //1. Хранит в hash триблиц
        // Для доступа нудны ключи
        // должны быть переопредлены euqels и hashcode
        // Порядок добавления может отличаться от порядка выывода
        // Null может быть использован в качестве ключа
        // Внутри map  элемент у которого null - на первом месте

        HashMap<String, User> userHashMap = new HashMap<>();

        // Добавление ьэлементов в качестве ключей будем использовать логины
        // В качестве элементов пользователей
        userHashMap.put(asd.getLogin(),asd);
        userHashMap.put(rty.getLogin(),rty);
        userHashMap.put(bnm.getLogin(),bnm);
        userHashMap.put(null,null);

        System.out.println(userHashMap);


        // Внутри создался массив на 16 элементов
        // Массив типа entry -
        // Он динамически расширяется но не сужается
        // У класса entry есть поле
        // int hashCode;
        // K key;
        // V - valeu;
        //Entry/Node next


        // это касается только тех мап которые основаны на хеттаблицы
        // Элементы с одинаковыми хешкодами добавлчяются как связанные списки



            /// Если есть варик какой ключ взять интеджер или стринг то лучше стринг
        // потому что они уже хранятся в хешкоде
        System.out.println(userHashMap.get("dsd"));
        // если его нет то вернет null
        System.out.println(userHashMap.get("asd"));


        userHashMap.remove("bnm");
        System.out.println(userHashMap);

        System.out.println(userHashMap.getOrDefault("vvv", bnm));

        //Удаление по паре ( Если ключ есть такой и такое значение то false

        System.out.println(userHashMap.remove("bnm",bnm));
        // Заменить значение

        // ЗАменя значения у ключа null
        userHashMap.replace(null, asd);

        System.out.println(userHashMap);


        // Замена по паре ключ-значение: если указано ключ null
        // соответсвует указанное значение (asd) произойдет значение на новое
        // Значение null вместо asd
        userHashMap.replace(null, asd, null);
        System.out.println(userHashMap);

            /// Смтроеть
//        clear()
//        containsKey(Object key)
//        containsValue(Object value)
//        entrySet()
//        get(Object key)
//        getOrDefault(Object key, V defaultValue)
//        keySet()
//        put(K key, V value)
//        putAll(Map<? extends K,? extends V> m)
//        putIfAbsent(K key, V value)
//        putIfAbsent(K key, V value)
//        remove(Object key, Object value)
//        replace(K key, V value)
//        replace(K key, V oldValue, V newValue)
//        size()
//        values()
        System.out.println(userHashMap.size());

        System.out.println("----Перебор элементов mao----");
        for (Map.Entry<String, User>entry: userHashMap.entrySet()){
            System.out.println(entry.getKey()+ "" + entry.getValue());
        }

        System.out.println("-----Enum Map- ---");
        // в качестве ключей используется enum, должны быть одного типа
        // null в качестве ключа не используется
        // Порядок хранения элементов соотвествует порядку в enum
        // значения (valeus) хранятся в массиве (его размер определяет количество
        // элементов enum
        // Порядковый номер ключа - метод original() (vals[key.original()])

        //Создаем обьект enunMap в конструкторе необходимо передать ссылку на enum
        // Который будет использован в качестве ключа

        EnumMap<Role, ArrayList<User>> enumMap = new EnumMap<>(Role.class);

        // ТУт короче мы  мы прописали ArrayLIst он еще не ыбл создан
        //НО так как enum так работает то должны брать с этого листа нужные обьекты
        // А в конце ссылка на Класс  - РОль


        enumMap.put(Role.USER, new ArrayList<>(Arrays.asList(cbf, rty)));
//              Запись аналога
//          List<User> usersList = Arrays.asList(cbf,rty);  -
//        ArrayList<User> userArrayList = new ArrayList<>(usersList);
//        enumMap.put(Role.USER, userArrayList);

        enumMap.put(Role.ADMIN, new ArrayList<>(Arrays.asList(asd, bnm)));

        System.out.println(enumMap);
        System.out.println(enumMap.get(Role.USER));
        System.out.println(enumMap.size());


        for (User user: enumMap.get(Role.ADMIN)){
            System.out.println(user.getLogin() + user.getPwd()); }

        User newUser = new User("NewUser", "dsf", Role.ADMIN);
        // Добавить обьект в enumMap в зависимости от роли
        //
        enumMap.get(newUser.getRole()).add(newUser);

        //Получаем роль нового юзера newUser.getRole
        //Далее по ключу получаем

        System.out.println("---TreeMap----");

        //1. Хранит элементы в отсортированном порядке
        // null не может быть использован в качестве ключа
        // Класс обьекты которого используются в качестве ключей
        // Должен имплементировать интерфей Comparable
        // Либо обьект Comporator должен передоваться в конструктор treeMap
        // Основан на алгоритме красно черного дерева
        //

        userHashMap.remove(null);
        TreeMap <String, User> treeMap = new TreeMap<>(userHashMap);

        System.out.println(treeMap);
        treeMap.put(asd.getLogin(), asd);
        treeMap.put(rty.getLogin(), rty);
        treeMap.put(bnm.getLogin(), bnm);

        System.out.println(treeMap);

        System.out.println("----WeakHashMap-----");
        WeakHashMap<Object, String> weakHashMap = new WeakHashMap<>();
        Object weekkey = new Object();
        String weekVal = "WeakHashMap valeu";
        weakHashMap.put(weekkey, weekVal);










    }
}
