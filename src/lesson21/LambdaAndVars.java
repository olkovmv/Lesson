package lesson21;

import java.util.function.UnaryOperator;

public class LambdaAndVars {
    private static int statInt = 12;

    public static void main(String[] args) {
        int localInt = 10;
        Data localData = new Data("Текстовые данные");
        UnaryOperator<Integer> unaryOperator = x -> {

            //1. Не можем изменять значвения локальных переменных
            //2 х = 10000;
            // LocalData = new Data("Текст")
            // Можно прочитать значение локальных переменных
            System.out.println("LocalData " + localData);
            System.out.println("x " + x);
            statInt = 2000;
            System.out.println("StaticInt " + statInt);
            return x+5;

        }

    }
}
class Data {
    private String text;

    public Data(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
