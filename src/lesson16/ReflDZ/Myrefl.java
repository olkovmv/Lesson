package lesson16.ReflDZ;

import java.util.Arrays;
import java.util.Date;

public class Myrefl {
    private int age = 67;
    private String name = "qwe";
    int[] data;

    public Myrefl(int age, String name, int[] data) {
        this.age = age;
        this.name = name;
        this.data = data;
    }

    public Myrefl() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Myrefl{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", data=" + Arrays.toString(data) +
                '}';
    }


}
