//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your sentence/word: ");
    String s=sc.nextLine();
    String temp="";
        Set<Character> list=new HashSet<>();
    for(char c:s.toCharArray()){
        if(c==' ')
            continue;
        else if(temp.contains(String.valueOf(c))){
            list.add(c);
        }
        else{
            temp+=c;
        }
    }
    System.out.println(list);
    }
}