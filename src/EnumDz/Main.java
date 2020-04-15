package EnumDz;

import javafx.geometry.Pos;

import java.util.Scanner;

public class Main {
    User[] users;

    public static void main(String[] args) {
        User user1 = new User("Петя", 130000, Position.PM);
        User user2 = new User("Вася", 120000, Position.TESTER);
        User user3 = new User("Вася", 120000, Position.PROGRAMMER);
        Position positions1 = Position.PM;
        user1.getPosition(Position.PM);

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Введите Имя");
        String symvol = scanner.nextLine();

        
    }

    public void addUsers(User newUser) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = newUser;
                break;
            }

        }
    }
}