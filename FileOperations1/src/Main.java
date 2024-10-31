import java.io.File;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {


            File file = new File("C:\\Users\\Lenovo\\Desktop\\Practice_project_MAR\\practice.txt");
            System.out.println(file.createNewFile());

           // System.out.print("Something went wrong");

    }
}