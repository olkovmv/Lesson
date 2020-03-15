package Dz2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Dz21 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите первое слово");
        String firstSt1 = vvod.nextLine();
        System.out.println("Введите второе слово");
        String firstSt2 = vvod.nextLine();
        System.out.println("Первое слово " + firstSt1);
        System.out.println("Второе слово " + firstSt2);
        int st1Leng = firstSt1.length();
        int st2Leng = firstSt2.length();
        System.out.println("Слово состоит из " + st1Leng);
        System.out.println("Слово состоит из " + st2Leng);
        int cer1 = st1Leng/2;
        int cer2 = st2Leng/2;
        String perStr1 = firstSt1.substring(0,cer1);
        String perStr2 = firstSt1.substring(cer1,st1Leng);
        String vtStr1 = firstSt2.substring(0,cer2);
        String vtStr2 = firstSt2.substring(cer2,st2Leng);
        System.out.println("Первый результат " + perStr1+vtStr2);
        System.out.println("Второй результат " + vtStr1+perStr2);

    }
}
