package lesson16.reflection;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;
import sun.plugin2.main.client.MacOSXMozillaServiceDelegate;

import java.lang.reflect.*;
import java.util.Arrays;

public class MainRefl {
    static{
        if(System.getSecurityManager()==null){
            System.setSecurityManager(new SecurityManager());
        }
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        // являются обьектами типа класс



        // Рефлексия в Java — это механизм, с помощью которого можно получать информацию
        // о классах, интерфейсах, полях и методах
        // во время выполнения программы, для чего нужна только ссылка на класс.
        // Кроме того, Reflection API дает возможность создавать новые экземпляры классов,
        // вызывать методы, а также получать или устанавливать значения полей.

        // Все классы в языке являются объектами типа Class

        // получение ссылок на класс

        //Получение ссылок
        Class strlClass = String.class; // ссылка на класс стринг
        System.out.println(strlClass);
        Class intClass = int.class; // ссылка на int
        System.out.println(intClass);

        Class textMassageClass = TextMessage.class;
        System.out.println(textMassageClass); // Ссылка на класс

        // получение ссылок на класс через обьект

        TextMessage textMessage = new TextMessage("Срочное сообщение");
        textMessage.setText("Рефлексия");



        textMassageClass = textMessage.getClass(); // Ссылка на класс TextMassage
        System.out.println(textMassageClass);


        // Получим название класса
        String className = textMassageClass.getName();
        String packaName = textMassageClass.getPackage().getName();
        System.out.println(className);
        System.out.println(packaName);


        // Интерфейсы которые имплементируют клас


        // getInterfaces() возвращает интерфейсы класса


        Class[] interfaces = textMassageClass.getInterfaces();
        System.out.println(Arrays.toString(interfaces));

        // Полуим ссылку на рожительский класс
        Class parent = textMassageClass.getSuperclass();
        System.out.println(parent); // ссылка на класс MAssage

        parent = textMassageClass.getSuperclass().getSuperclass(); // Обджект
        System.out.println(parent);

        parent = textMassageClass.getSuperclass().getSuperclass().getSuperclass(); //null

        System.out.println(parent);

        Class[] parentInterfaces = textMassageClass.getSuperclass().getInterfaces();
        System.out.println(Arrays.toString(parentInterfaces));

        //Доступ к компонентам класса

        Class<TextMessage> tmClass = TextMessage.class;
        //доступ к полям ( свойства) класса
        // import java.lang.reflect.Field;
        // getFields получаем публичные полч класса своих и предков
//        Field[] fields= tmClass.getFields();
//        System.out.println(Arrays.toString(fields));


        // с любым модификатором вс все поля
        Field[] declareFild = tmClass.getDeclaredFields();
        System.out.println(Arrays.toString(declareFild));

// Доступ к методам
        //возвращает все васе публичные
        // import java.lang.reflect.Field;
        Method[] methods = tmClass.getMethods();
        System.out.println(Arrays.toString(methods));
        // Вернет текущего класса но с любым илентификатором

        Method[] declareMEtods = tmClass.getDeclaredMethods();
        System.out.println(Arrays.toString(declareMEtods));

        // доступ к конструкторам
        Constructor[] constructors = tmClass.getDeclaredConstructors();
        System.out.println(Arrays.toString(constructors));


        Constructor<TextMessage> textMessageConstructor = tmClass.getDeclaredConstructor(String.class);

        // Созздать обьект используя конструктор
        // Создаем обьект типа тест месседж

        TextMessage reflectMassage = textMessageConstructor.newInstance("Рефлексный обьект");
        System.out.println(reflectMassage);

        // получим ссылку на поле по названию
        //Private string text
        Field fild = tmClass.getDeclaredField("text");
        System.out.println(fild.getName());
        System.out.println(fild.getType());
        fild.setAccessible(true);

        // получили значения
        System.out.println(fild.get(reflectMassage));
        // устанавливаем значения поля обьекта
        fild.set(reflectMassage, "Значение установлени через рефлексию");

        System.out.println(fild.get(reflectMassage));
        System.out.println(reflectMassage.getText());

        Method method = tmClass
                .getDeclaredMethod("printText", String.class, String.class);
        // Вызов метода обьекта

        method.setAccessible(true);
        // Выызов метода у обьекта
        method.invoke(reflectMassage, "!!!", "###");

        BigTextMassage bmt = new BigTextMassage(("Big Massage"));
        fild.set(bmt, "Big Text");

        System.out.println("bmt " + fild.get(bmt));

        //Class
        // Field
        // Method
        // Modifier


        fild.getModifiers();

        boolean isPrivade = Modifier.isPrivate(fild.getModifiers());
        System.out.println("is text private " + isPrivade);


        // Выбрать наиболее важные иетоды
        //











    }
}
