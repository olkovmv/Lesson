package lesson21;

public class Lambda {
    public static void main(String[] args) {
        // Лямьда 0 реализация метода интерфейса
        // При этом в интерфейсе должен быть только один абстрактным метод и любое киличество дефолт иетодов


        //Реализация метода с сохранением в переменную
       // Operation operation = реализация метода через лямбда;


        //1. Если у нас нет принимаемых аргументов то указываем ()
        //2. Если всего один аргумент то скобки модно не ставить a ->  a + 21;


        //1. Если тело функции состоит из  однйо инструкции то фигунрные скобки можно не ставить
        // Если нет фигурных скобок то там есть return ( Его не видно а он есть)
        //2.

        Operation plus = (n, m) ->  n + m; // a  и b не из головы, смотрим всколько аргументов принимает метод
        Operation devision = (a, b) ->  {
            if (b==0) throw  new IllegalArgumentException("0!!!");
            return  a/b;
        };
        System.out.println(plus.execure(23,12));
            ///  а данном случае мы саи передали реализацию
        System.out.println(Calculator.calculate(32, 132, devision));

        //Без сохранения в переменуую лямбда

        System.out.println(Calculator.calculate(10,10, (a,b) -> a-b));
    }
}

// Интерфейсы у которых только один абсрактный метод и любым количесвом defult методов нахывается функциональным
@FunctionalInterface
interface Operation {
    double execure (double a, double b);

}


class Calculator {
    public static double calculate(double a, double b, Operation operation){
        return operation.execure(a,b);
    }
}


//