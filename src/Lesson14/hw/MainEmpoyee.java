package Lesson14.hw;



import java.util.*;

public class MainEmpoyee {
    public static void main(String[] args) {





        Comparator<Employee> employeeComparator1 = new EmployeeNameComparable();

        TreeSet<Employee> treeSet1 = new TreeSet<>(employeeComparator1);
        treeSet1.addAll(Employee.employeeGenerator(6));



        Comparator<Employee> employeeComparator2 = new EmployeeNameComparable()
                .thenComparing(new EmployeeSalaryComparable());

        TreeSet<Employee> treeSet2 = new TreeSet<>(employeeComparator2);
        treeSet2.addAll(Employee.employeeGenerator(6));

        Comparator<Employee> employeeComparator3 = new EmployeeNameComparable()
                .thenComparing(new EmployeeSalaryComparable())
                .thenComparing(new EmployeeAgeComparable()).thenComparing(new EmployeeCompanyComparable());


        TreeSet<Employee> treeSet3 = new TreeSet<>(employeeComparator3);
        treeSet3.addAll(Employee.employeeGenerator(6));



        System.out.println(treeSet1);

        System.out.println(treeSet2);
        System.out.println(treeSet3);



    }
}


class EmployeeNameComparable implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class EmployeeCompanyComparable implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getCompany().compareTo(o2.getCompany());
    }
}

class EmployeeSalaryComparable implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getSalary(), o2.getSalary());
    }
}

class EmployeeAgeComparable implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}