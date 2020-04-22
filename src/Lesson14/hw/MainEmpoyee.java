package Lesson14.hw;

import Lesson14.Student;

import java.util.*;

public class MainEmpoyee {
    public static void main(String[] args) {


        HashSet<Employee> hashSet = new HashSet<>( Employee.employeeGenerator(6));

        System.out.println(hashSet);


    }
}
