import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileReader fr = new FileReader("Sample.txt");
            int data = fr.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fr.read();
            }
            fr.close();

        } catch (Exception e) {
            throw new FileNotFoundException("File is not found");
        }
    }
}