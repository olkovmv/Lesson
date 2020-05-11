package lesson19.serialization.messages;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.time.chrono.IsoChronology;
 // Обьект типа коннектион можно создавать в трай вис рескрсес
// Ьлагодоря AutoCloseble  и переопредлененному методу close
public class Connection implements AutoCloseable{
    private Socket socket;
    private ObjectInputStream input;
    private ObjectOutputStream output;

    public Connection(Socket socket) throws IOException {
        this.socket = socket;
        output = new ObjectOutputStream(this.socket.getOutputStream());
        input = new ObjectInputStream(this.socket.getInputStream());

    }

    public void sendMassage (SimpleMessage message) throws IOException {
        message.setDateTime();
        output.writeObject(message);
        output.flush();
    }

    public SimpleMessage readMessage() throws IOException, ClassNotFoundException {
        return (SimpleMessage) input.readObject();

    }

    @Override
    public void close() throws Exception {
        input.close();
        output.close();
        socket.close();
    }


}
