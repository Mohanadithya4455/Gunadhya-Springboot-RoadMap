//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
      Runtime runtime = Runtime.getRuntime();
      runtime.addShutdownHook(new Sample());

      for(int i=0;i<10;i++)
      {
          System.out.println(i);
          Thread.sleep(2000);
      }
      //sample2.start();
    }
}