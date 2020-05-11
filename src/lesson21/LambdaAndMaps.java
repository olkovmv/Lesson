package lesson21;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class LambdaAndMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Сидней", 2000);
        map.put("Париж", 2423);
        map.put("Лондон", 3231);
        map.put("Иркутск", 432423);

        map.put("Москва", 4324);
        System.out.println("-----map foreсо------");

        System.out.println(map.toString());

        BiConsumer<String, Integer> biConsumer = (key, value) ->
                System.out.println(key + " : " + value );
        map.forEach(biConsumer);
        map.computeIfPresent();
        map.computeIfAbsent();
        map.merge()
    }
}
