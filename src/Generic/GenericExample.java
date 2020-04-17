package Generic;

import EnumDz.Position;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class GenericExample {
    public static void main(String[] args) {
        // В <> указывае конкретный тип данных, который будет подставляться вместо Т
        User<String> stringUser = new User<>(); // тип данных ID лбьекта StringUser будет Strings
        stringUser.setId("1");
        stringUser.setLogin("Login");
        stringUser.setPwn("123qwe");

        User<Integer> integerUser = new User<>(); //Обязательно оператор

        // Нельзя использовать примитивы
        // А только классы обертки
        integerUser.setPwn("12qw");
        integerUser.setLogin("Login1");
        integerUser.setId(2);

        System.out.println(stringUser);
        System.out.println(integerUser);
        //Для обьекта contener1 mun данных key - String
        //Для обьекта contener1 mun данных value - Ingerer

        PairContener<String, Integer> contener1 = new PairContener<>("QWe", 32);

        //Для обьекта contener1 mun данных Double - String
        //Для обьекта contener1 mun данных value -
        PairContener<Double, User> contener2 = new PairContener<>(21.2, stringUser); // Если мы не конкретеируем то всегда обджект

        contener2.getValue().setId(12); // id - Object

        contener2.getValue().setId("323"); // id - Object

        PairContener<Double, User<String>> contener3 = new PairContener<>(3.4, stringUser);
        contener3.getValue().setId("dgdfgdfgfdg"); // Id string

        User<Number> numberUser = new User<>();
        numberUser.setId(32);
        PairContener<String, User<Number>> contener = new PairContener<>("Hello", numberUser);









    }
}
