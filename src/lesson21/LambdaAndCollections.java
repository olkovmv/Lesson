package lesson21;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class LambdaAndCollections {
    public static void main(String[] args) {

        Student student1 = new Student("Tom", 25, "Canada");
        Student student2 = new Student("Tim", 33, "Russia");
        Student student3 = new Student("Alex", 19, "China");
        Student student4 = new Student("Robert", 36, "Russia");
        Student student5 = new Student("Paul", 30, "China");

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        University university = new University(students);
        // boolean test (Student student)
        Predicate<Student> russuaFilter = student -> student.getCountry().equals("Russia");
        System.out.println("-----russiaFilter----");
        System.out.println(university.getFilteredStudent(russuaFilter));
        //Стиарше 30 лет
        Predicate<Student> filter30 = student -> student.getAge()>= 30;
        System.out.println("-----ageFilter----");
        System.out.println(university.getFilteredStudent(filter30));

        System.out.println(university.getFilteredStudent(russuaFilter.and(russuaFilter)));

        Comparator<Student> byName =(std1, std2) -> std1.getName().compareTo(std2.getName());


        // Через :: переадется ссылка на метод или на конструктор
        byName = Comparator.comparing(Student::getAge);

        students.sort(byName);


        // interface Consummer<T> : void accept(T t)
        students.forEach(student -> student.setAge(student.getAge()+10));
        students.forEach(System.out::println);









    }

    static class  University {
        private List<Student> studentList;
        public  University(List<Student>  studenlist){
            this.studentList = studenlist;
        }
        public List<Student> getFilteredStudent(Predicate<Student> filter){
            List<Student> students = new ArrayList<>();
            for (Student student:studentList ){
                if (filter.test(student)) students.add(student);
            }
            return students;
        }

    }
}




class Student {
    private String name;
    private int age;
    private String country;

    public Student(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}';
    }
}
