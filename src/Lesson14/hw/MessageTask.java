package Lesson14.hw;

import java.util.*;

public class MessageTask {
    public static void countEachPriority(List<Message> messageList) {
            // TODO:  Подсчитать количество сообщений для каждого приоритела
            //  Ответ в консоль
        int low = 0, medium = 0, high = 0, urgent = 0;

        Iterator<Message> messageIterator = messageList.listIterator();
        while (messageIterator.hasNext()) {
            if (messageIterator.next().getPriority().equals("LOW")) {
                low++;
            }
            else if (messageIterator.next().getPriority().equals("MEDIUM")) {
                medium++;

            }
            else if (messageIterator.next().getPriority().equals("HIGH")) {
                high++;

            }
            else if (messageIterator.next().getPriority().equals("URGENT")) {
                urgent++;
            }
        }

        System.out.println(messageIterator.next().getCode());
        System.out.println(medium);
        System.out.println(high);
        System.out.println(urgent);



    }

    public static void countEachCode(List<Message> messageList) {
        // TODO: Подсчитать количество сообщений для каждого кода сообщения
        //  Ответ в консоль
    }

    private static void uniqueMessageCount(List<Message> messageList) {
        // TODO: Подсчитать количество уникальных сообщений
        //  Ответ в консоль
    }

    public static List<Message> uniqueMessagesInOriginalOrder(List<Message> messageList){
        // TODO: вернуть только неповторяющиеся сообщения и в том порядке,
        //  в котором они встретились в первоначальном списке
        //  Например, было: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}]
        //  на выходе: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}]
        return messageList;
    }

    public static void removeEach(List<Message> messageList, MessagePriority priority){
        // TODO: удалить из коллекции каждое сообщение с заданным приоритетом
        //  вывод в консоль до удаления и после удаления
    }

    public static void removeOther(List<Message> messageList, MessagePriority priority){
        // TODO: удалить из коллекции все сообщения, кроме тех, которые имеют заданный приоритет
        //  вывод в консоль до удаления и после удаления
    }

    public static void main(String[] args) {
        // вызов методов
    }
}
