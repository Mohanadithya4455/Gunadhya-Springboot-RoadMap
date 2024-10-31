import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NotEvenException {
     Scanner scanner=new Scanner(System.in);
     System.out.println("Enter the number: ");
     int number=scanner.nextInt();
     fun(number);
    }
    public static void fun(int number) throws NotEvenException {
        if(number%2!=0){
            throw new NotEvenException("Not a even number");
        }
        else
            System.out.println(number+" is a even number");
    }


}