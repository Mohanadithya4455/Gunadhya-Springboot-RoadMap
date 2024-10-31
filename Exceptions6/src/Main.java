import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        String str= "adithya";
        String temp=isVowelPresent(str);
        System.out.println(temp);
    }
    public static String isVowelPresent(String string) throws Exception {
        String str=string.toLowerCase();

            if (!str.contains("a") && !str.contains("e") && !str.contains("i") && !str.contains("o") && !str.contains("u")) {
                throw new Exception("Vowels are not present in the string");
            }

           return string;

    }
}