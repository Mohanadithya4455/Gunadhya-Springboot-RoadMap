//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int answer=0;
        int num=sc.nextInt();
        while(num>0){
            int rem=num%10;
            num/=10;
            answer=answer*10+rem;

        }
        System.out.println(answer);
    }
}