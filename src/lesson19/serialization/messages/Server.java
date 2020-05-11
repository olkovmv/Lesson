package lesson19.serialization.messages;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private int port;
    private Connection connection;

    public Server(int port) {
        this.port = port;
    }

    public void start() throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(port)){
            System.out.println("Серве{р запущен,.. ");
            while (true){
                Socket clientSocet = serverSocket.accept();
                connection = new Connection(clientSocet);
                System.out.println(connection.readMessage());
                connection.sendMassage(SimpleMessage.getInstance("server", "Hello"));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int port = 8090;
        Server server = new Server(port);
        try {
            server.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
