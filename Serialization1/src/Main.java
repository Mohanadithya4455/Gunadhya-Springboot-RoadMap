import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
          Student s1=new Student();
          s1.name="Adithya";
          s1.age=24;

        File f = new File("C:\\Users\\Lenovo\\Desktop\\Practice_project_MAR\\serializattion.txt");
        try {
            if (!f.exists())
                f.createNewFile();
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            fos.close();
            oos.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
   try {
       FileInputStream fis = new FileInputStream(f);
       ObjectInputStream ois = new ObjectInputStream(fis);
       Student student = (Student)ois.readObject();
       System.out.println("Student details: " + student.name+ "   "+student.age);
       fis.close();
       ois.close();
   }
   catch (IOException e){
       System.out.println("It is a Io excpetion");
   } catch (ClassNotFoundException e) {
       throw new RuntimeException(e);
   }
    }
}