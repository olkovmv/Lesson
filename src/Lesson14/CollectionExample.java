package Lesson14;


import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        Student student1 = new Student("Петр", "Алексеев", 18);
        Student student2 = new Student("Екатерина", "Еремина", 20);
        Student student3 = new Student("Денис", "Попов", 22);
        Student student4 = new Student("Петр", "Попов", 22);

        // в java существует несколько реализаций коллекций (все они имплементирую интерфейс Collection) и различаются:
        // безопасностью использования в многопоточых срадах,
        // возможностью хранить дублирующиеся элементы,
        // возможностью хранить элементы в отсортированным виде,
        // скоростью добавления, удаления, извлечения элементов из начала / середины / конца коллекции
        // возможностью хранить элементы в том порядке, в котором они были добавлены и тд

        // Коллекции, которые необходимы для работы в многопоточных средах мы рассмотрим в теме по многопоточности.
        // Все коллекции, которые будут рассмотрены в lesson14 не являются потокобезопасными

        // все коллекции - дженерики, при создании объекта коллекции
        // в <> необходимо указать объекты какого типа Вы собираетесь в ней
        // хранить






        System.out.println("----list----");
        System.out.println("-----LinkList---");
        //Особенности
        // 1. В порядке добавления
        // Можно добавить NULL
        // Хранение дублирующих элементов
        // LinkList используется гораздо реже чем ArryList

        LinkedList<Student> studentlinkedList = new LinkedList<>();
        studentlinkedList.add(student1); // добавляет в конец списка
        studentlinkedList.add(student2);
        studentlinkedList.add(student1);
        studentlinkedList.add(1,student3);
       // [student1, student2, student1]
                //

//        studentlinkedList.add(10,student3);
        // При обращении к несуществующему индексу появляется одна ошибка IndexOutOfBoundsException


        //Получение элементов
        System.out.println(studentlinkedList.getFirst()); // вернет первый элемент спискка
        studentlinkedList.getLast(); // вВернет последний элемент списка
        studentlinkedList.get(2);


        studentlinkedList.addFirst(null); // добавление элемента в начало строки
        System.out.println(studentlinkedList.toString());
            //Для каждого элемента будет вызван метод
        studentlinkedList.forEach(System.out::print);
        studentlinkedList.removeFirst(); // Удаление первого элемента
        studentlinkedList.removeLast(); // Улаоение последнегоэлемента
        studentlinkedList.remove(1); // Удаление элемента по индексу
        studentlinkedList.remove(student1);
//        studentlinkedList.remove(); ==   studentlinkedList.removeFirst(); // Удаление первого элемента


        System.out.println(studentlinkedList);


        System.out.println("---ArrayList---");
        // Особенности
        // Можем добавать элементы, в  начало конец по индексу и тд

        /// ОЧень часто используется
        //Внутри массив
        // Реализован на примере массива
        // Можно добавить NULL
        // Хранение дублирующих элементов

        ArrayList<Student> arrayList = new ArrayList<>(); // Создался массив на 10 элементов
        //ПО дефолту так
        arrayList = new ArrayList<>(20); //ТАк сразу создаем на 20 как начальный массив

        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        arrayList.add(0,null);
        arrayList.add(null);
        System.out.println(arrayList.size()); // Количество эллементов в коллекции
        System.out.println(arrayList);

        arrayList.trimToSize();
        System.out.println(arrayList.size());

        System.out.println(arrayList.subList(0,2));

        System.out.println(arrayList.get(3));

        arrayList.remove(student1);
        arrayList.remove(1);

        Student[] studentsArray = {student1, student2, student3};

        List<Student> arrList = Arrays.asList(studentsArray);
        arrayList.addAll(arrayList);
        System.out.println(arrayList);


        System.out.println(" -----Интерфейс Set------");
        //Особенности Set;
        // 1. Позволяет хранит толко уникальные элементы
        //2.  Обязательно должны быть переопределены метожы
        //equals и hashCode

        ///Не хранит дублирующие элементы!!!!

        System.out.println("HashSet");
        // Особенности
        //1. Основан на hash таблице (Использует hash code)
        // 2. Порядок элементов может отличаться от порядка добавления
        // 3. МОжет хранить null

        HashSet<Student> hashSet = new HashSet<>(arrayList);
        hashSet.add(student1);
        /// У set нет индексов и нет get
        hashSet.add(student4);
        System.out.println(hashSet.isEmpty());
        System.out.println(hashSet.contains(student1));
        System.out.println(hashSet.size());
        System.out.println(hashSet.remove(student3));
        System.out.println(hashSet.size());
        System.out.println(hashSet.toString());


        System.out.println("---LinkHashSet-----");
        LinkedHashSet<Student> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(student1);
        linkedHashSet.add(student2);
        linkedHashSet.add(student3);
        linkedHashSet.add(student4);
        System.out.println(linkedHashSet);

        System.out.println("----TreeSet----");
        // Особенности
        // Не разрешит добавить null
        // Все элементы отсортированны
        // Основан в алгоритме красно черного дерева
        // необходимо задать порядок сортировки



        //ДЛя добавления элементов  в treeset необходимо;

        // Чтобы класс ( Экземпляры которого бужут хранится в данной колекции )
        // реализовывал интерфейс Comparable
        // В его методе compareTo ( В нем определяется какой считать большим какой меньшим
        //

        // 2.  Передать в конструктор Treeet компоратор  - обьект класса compoirator


        // Класс реализует интерфейс Compareble

        //
        TreeSet<Student> treeSet1 = new TreeSet<>();
        treeSet1.add(student1);
        treeSet1.add(student2);
        treeSet1.add(student3);
        treeSet1.add(student4);
        System.out.println(treeSet1);


        Comparator<Student> studentComparable = new StudentNameComporator()
                .thenComparing(new StudentAgeComporator());

        TreeSet<Student> treeSet2 = new TreeSet<>(studentComparable);
        treeSet2.add(student1);
        treeSet2.add(student2);
        System.out.println(treeSet2);





        ///перебор колекций foreach

        LinkedList<Student> students = new LinkedList<>();
        studentlinkedList.add(student1); // добавляет в конец списка
        studentlinkedList.add(student2);
        studentlinkedList.add(student1);

        for (Student student:students
             ) {
            System.out.println(student.getAge());
            System.out.println(student.getName());
            students.remove(student2);
            
        }



    }
}

