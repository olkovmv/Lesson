package lesson22;

import java.util.ArrayList;

public class CollectorsExample {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("qwe", "Apple", 2000, 19));
        employees.add(new Employee("asd", "Yandex", 3000, 38));
        employees.add(new Employee("zxc", "Google", 2500, 49));
        employees.add(new Employee("vbn", "Google", 3000, 22));
        employees.add(new Employee("tyu", "Apple", 1500, 22));

    }
}
