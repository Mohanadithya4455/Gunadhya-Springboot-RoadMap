import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Lenovo\\Desktop\\Practice_project_MAR\\learning.txt");
        /*FileOutputStream fos=new FileOutputStream(file);
        String str="hello";
        for(char c:str.toCharArray())
        fos.write(c);*/

       /* FileWriter fw=new FileWriter(file);
        String str="hello Adithya How are you?";

        for(char c:str.toCharArray()){
            fw.write(c);
        }
        fw.close();*/

        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(file));
        String str="hello Kalyan How are you?";

        for(char c:str.toCharArray()){
            bos.write(c);
        }
        bos.close();
    }
}