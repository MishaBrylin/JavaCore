package HW05;

import java.io.*;
import java.nio.ByteBuffer;

public class TicTac {

    public static void main(String[] args) {
        int[] field = {1, 0, 2, 2, 2, 0, 1, 3, 1};
        String filename = "D://Downloads/test.txt";


        try (OutputStream outputStream = new FileOutputStream(filename)) {
            ByteBuffer buffer = ByteBuffer.allocate(3);
            for (int i = 0; i < field.length; i += 3) {
                buffer.clear();
                buffer.put((byte) (field[i] & 0xFF));
                buffer.put((byte) (field[i + 1] & 0xFF));
                buffer.put((byte) (field[i + 2] & 0xFF));
                outputStream.write(buffer.array());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (InputStream inputStream = new FileInputStream(filename)) {
            byte[] bytes = new byte[3];
            int bytesRead;
            while ((bytesRead = inputStream.read(bytes)) != -1) {
                for (int i = 0; i < bytesRead; i++) {


                        if (i == 0){
                            System.out.print("\n|");
                        }


                    int value = bytes[i] & 0xFF;
                    char symbol;
                    switch (value) {
                        case 0:
                            symbol = '.';
                            break;
                        case 1:
                            symbol = 'x';
                            break;
                        case 2:
                            symbol = 'o';
                            break;
                        default:
                            symbol = ' ';
                            break;
                    }
                    System.out.print(symbol+"");
                    System.out.print("|");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
