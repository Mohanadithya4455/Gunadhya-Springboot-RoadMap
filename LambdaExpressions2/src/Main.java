import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("aadhi");
        list.add("mohan");
        list.add("rankireddy");

        list.forEach(i->System.out.println(i));
    }
}