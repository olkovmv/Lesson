package lesson16.ReflDZ;

import javax.naming.PartialResultException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Mainmy {
    public static void main(String[] args) throws NoSuchMethodException {
        Class myclass = Myrefl.class;
        Constructor[] constructors = myclass.getDeclaredConstructors();
        System.out.println(Arrays.toString(constructors));
        Field[] filds = myclass.getFields();
        System.out.println(Arrays.toString(filds));

        Method method = myclass.getDeclaredMethod("setAge", int.class);
        method.getClass().getInterfaces();







    }
}
