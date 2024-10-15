import java.io.File;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Lenovo\\Desktop\\Practice_project_MAR\\practice.txt");
       // System.out.println(file.exists());
        File rename = new File("C:\\Users\\Lenovo\\Desktop\\Practice_project_MAR\\learning.txt");
        System.out.print(file.renameTo(rename));
    }
}