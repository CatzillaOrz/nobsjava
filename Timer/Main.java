import java.util.Timer;
import java.util.TimerTask;
public class Main {
  public static void main(String[] args) {
    Timer timer = new Timer();

    TimerTask task = new TimerTask(){
      @Override
      public void run(){
        System.out.println("Task is completet :) ");
      }
    };

    timer.schedule(task , 3000);
  }
}
