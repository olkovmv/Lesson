package Lesson2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.crypto.AEADBadTagException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysLesson {
    public static void main(String[] args) {

////       ОБьявление массива
//        int[] arrName;
////        int arrName[]; C- style
//
//
//        arrName = new int[7];  //Для int целых чисел "0"// Для double используется 0,0 // Для boolen "false"
//
//        System.out.println(Arrays.toString(arrName));

//
//        int[] arrNsme2 = {32, 23, 13, 13, 43, 1321, 132, 543};
//        System.out.println(Arrays.toString(arrNsme2));
//        int[] someAir = new int[21];
        int[] someAir2 = new int[]{23, 1, -13, 5};

        for (int i = 0; i < someAir2.length; i++) {
            someAir2[i] *= 2;

        }
        System.out.println(Arrays.toString(someAir2));

        int[] SomeAit3 = {21, 42, 13, 42, 53};
        for (int elem : SomeAit3) {
            elem *= 2;
            System.out.println(elem);

        }
        System.out.println(Arrays.toString(SomeAit3));

        // Копирование массиоов
        SomeAit3 = new int[]{23, 1, -10, 5};
        int[] arr = SomeAit3; // Не копирование массива, а ссылка на другой массив
        int[] cloneArr = SomeAit3.clone();
        System.out.println(cloneArr);


        SomeAit3 = new int[]{23, 1, -10, 5};
        someAir2 = new int[15];
        System.arraycopy(SomeAit3, 1, someAir2, 3, 2);
        System.out.println(Arrays.toString(someAir2));

        int[] copyArr = Arrays.copyOf(SomeAit3, 33);
        System.out.println(Arrays.toString(SomeAit3));

//        Сравнивание массивов
//         someArr == someArr2;
//        someArr.equals(someArr2)
        int[] someArr1 = {23, 1, -10, 6};
        int[] someArr2 = {23, 1, -10, 6};
        System.out.println(Arrays.equals(someArr1, someArr2));

        someArr1 = new int[]{232, 1, -10, 6};
        someArr2 = new int[]{23, 1, -103, 6};
        System.out.println(Arrays.equals(someArr1, someArr2));
        int[] someArr3 = new int[4];
        for (int i = 0; i < someArr3.length; i++) {
            someArr3[i] = someArr1[i] + someArr2[i];


        }
        System.out.println(Arrays.toString(someArr3));
//        Сортировка массива
        someArr1 = new int[]{232, 1, -10, 6};
        Arrays.sort(someArr1);// Arrays.sort(arr, 1,5);
        System.out.println(Arrays.toString(someArr1));
        // алгоритм быстрой сортировки, сложность 0 (n log n)

        someArr1 = new int[]{232, 1, -10, 6};
        Arrays.sort(someArr1);
        System.out.println(Arrays.binarySearch(someArr1, 6));
        System.out.println(Arrays.binarySearch(someArr1, 15));

        int[][] newArr = new int[3][4];
        System.out.println(Arrays.deepToString(newArr));
        int[][] newArr2 = {{21, 4, 3, 3}, {2, 8, 5}, {0, 4, 0, 3}};
        System.out.println(Arrays.deepToString(newArr2));
        System.out.println(newArr2[1][2]);
        for (int i = 0; i < newArr2.length; i++) {
//            newArr[i] - Вложенный массив
            for (int j = 0; j < newArr2[i].length; j++) {
                newArr2[i][j] *= newArr2[i][j];


            }

        }
        System.out.println(Arrays.deepToString(newArr2));

//        https://github.com/jjd-ifmo




        }

    }


