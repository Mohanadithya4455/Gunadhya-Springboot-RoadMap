//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Sentence/word: ");
        String s = sc.nextLine();
        s=s.toLowerCase();
        String str="";
        for(char c:s.toCharArray()){
            if(!str.contains(String.valueOf(c))&&c!=' '){
                str=str+c;
            }
            if(c==' ')
                str=str+c;
        }
        System.out.println(str);

    }
}