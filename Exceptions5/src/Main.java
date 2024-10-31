import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=5;
        List list = new ArrayList();

       for(int i=0;i<5;i++){
            int val=sc.nextInt();
            if(list.contains(val)){
                throw new Exception("Element is already exists");
            }
            else{
                list.add(val);
            }
        }
        System.out.println(list);

    }
}