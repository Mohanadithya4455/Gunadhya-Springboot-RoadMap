import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Lenovo\\Desktop\\Practice_project_MAR\\learning.txt");
        FileReader fr = new FileReader(file);
        int data=fr.read();
        if(data == -1){
            throw new IOException("File is Empty");
        }
        while(data!=-1){
            System.out.print((char)data);
            data=fr.read();
        }
    }
}