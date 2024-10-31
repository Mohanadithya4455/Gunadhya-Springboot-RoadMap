//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your first Sentence: ");
        String s1=scanner.nextLine();
        System.out.println("Enter your second Sentence: ");
        String s2=scanner.nextLine();
        for(char c:s2.toCharArray()){
            if(c!=' ')
            s1=s1.replaceAll(String.valueOf(c),"");
        }
        System.out.println(s1);

    }
}

