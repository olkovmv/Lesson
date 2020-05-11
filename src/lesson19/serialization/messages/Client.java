package lesson19.serialization.messages;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    private String ip;
    private int port;
    private Scanner scanner;

    public Client(String ip, int port) {
        this.ip = ip;
        this.port = port;
        scanner = new Scanner(System.in);

    }

    private Socket getSocet() throws IOException {
        Socket socket = new Socket(ip, port);
        return socket;
    }

    private void sendAndPrintMasseg(SimpleMessage message) throws Exception {
        try (Connection connection = new Connection(getSocet())){
            connection.sendMassage(message);
            SimpleMessage fromServer  = connection.readMessage();
            System.out.println("Ответ сервера " + fromServer);

        }

    }

    public void start() throws IOException {
        System.out.println("Введите имя");
        String name = scanner.nextLine();
        String text;
        while (true){
            System.out.println("Введите сообщение");
        text = scanner.nextLine();
            try {
                sendAndPrintMasseg(SimpleMessage.getInstance(name, text));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }}

        public static void main(String[] args) {
        int port = 8090;
        String ip  = "127.0.0.1";
        try {
            new Client(ip, port).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        }

}
