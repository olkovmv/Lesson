package lesson20;

import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;

public class NIOBuffer {
    public static void main(String[] args) {
        // Есть функционал работы с файловой системой
        //Набор классов для работы в вводом и выводом


        //Java NIO (New IO aka Non-blocking IO) - предназначенн для работы с вводом-выводм.
        // Неблокирующий
        // Асинхронный
        // Буфер-ориентированный

        //Каналы:
        // канал может быть использован и для записи и для чтения ( Один канал а не два как io)
        // чтение и запись может происходить асинхронно
        // каналы всегда пишут в буфер и читают из буфера
        // Каналы могут быть созданы на основе:
        // - FileChannel
        // - DatagramChannel
        // - SocketChannel
        // - ServerSocketChannel

        // Буферы могут быть:
        // ByteBuffer
        // CharBuffer
        // DoubleBuffer
        // FloatBuffer
        // IntBuffer
        // LongBuffer
        // ShortBuffer

        // свойсва буфера:
        // capacity - емкость (не меняется после установки)
        // position - текущая позоция в буфере (изначально 0)
        // limit - до какого значения можно читать/писать данные (изначально равен capacity)

        ByteBuffer buffer = ByteBuffer.allocate(16);
        assert buffer.position() == 0;
        assert buffer.capacity() == 16;
        assert buffer.limit() == 16;
        assert buffer.remaining() == 16; // разница между position и limit

        // Увеличивает позицию на 4.
        buffer.putInt(100);

        assert buffer.position() == 4;
        assert buffer.remaining() == 12;

        // Увеличивает позицию на 8.
        buffer.putDouble(100.25);

        assert buffer.position() == 12;
        assert buffer.remaining() == 4;

        // Устанавливает лимит на место позиции, сбрасывает позицию в 0 (для чтения из буфера)
        buffer.flip();

        assert buffer.position() == 0;
        assert buffer.limit() == 12;
        assert buffer.remaining() == 12;

        // Увеличивает позицию на 4.
        int anInt = buffer.getInt();

        assert buffer.position() == 4;
        assert buffer.remaining() == 8;

        // Увеличивает позицию на 8.
        double aDouble = buffer.getDouble();

        assert buffer.position() == 12;
        assert buffer.remaining() == 0;

        // Сбрасывает позицию в 0 (limit остается на прежнем месте - для повторного чтения)
        buffer.rewind();

        assert buffer.position() == 0;
        assert buffer.limit() == 12;
        assert buffer.remaining() == 12;

        // Увеличивает позицию на 4.
        assert anInt == buffer.getInt();
        // Увеличивает позицию на 8.
        assert aDouble == buffer.getDouble();

        // Сбрасывает позицию в 0, ставит лимит, равный емкости буфера (для записи в буфер)
        buffer.clear();

        assert buffer.position() == 0;
        assert buffer.capacity() == 16;
        assert buffer.limit() == 16;
        assert buffer.remaining() == 16;

        // копирует все непрочитанные данные в начало буфера. Лимит равен емкости буфера
        // (для записи в буфер после непрочитанных данных)
        // buffer.compact();




    }
}