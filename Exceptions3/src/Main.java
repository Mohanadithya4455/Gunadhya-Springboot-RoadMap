import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Lenovo\\Desktop\\Practice_project_MAR\\learning.txt");
           //System.out.println(file.exists());
           try {
               FileInputStream fis = new FileInputStream(file);
               int data=fis.read();
               while(data!=-1){
                   System.out.print((char)data);
                   data=fis.read();
               }
           }
           catch (IOException e) {
               throw new RuntimeException(e);
           }

    }
}