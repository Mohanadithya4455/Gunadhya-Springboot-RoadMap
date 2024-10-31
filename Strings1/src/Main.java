//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence/word: ");
        String s = sc.nextLine();

        int arr[]=new int[256];
        int max=0;
        char ch=' ';
        for(char c:s.toCharArray()){
            arr[c]+=1;
            if(arr[c]>max){
                max=arr[c];
                ch=c;
            }
        }
        System.out.println(ch);
    }
}