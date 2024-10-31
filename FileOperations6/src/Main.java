import java.io.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Lenovo\\Desktop\\Practice_project_MAR\\learning.txt");

        /*FileInputStream fis=new FileInputStream(file);
        int data= fis.read();
        while(data!=-1){
            System.out.print((char)data);
            data=fis.read();
        }*/

       /* FileReader fr=new FileReader(file);
        int data= fr.read();
        while(data!=-1) {
            System.out.print((char) data);
            data = fr.read();
        }*/

        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }

    }
}