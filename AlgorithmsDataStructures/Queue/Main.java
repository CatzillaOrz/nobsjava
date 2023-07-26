import java.util.Queue;
import java.util.LinkedList;
public class Main {
  public static void main(String[] args) {
      Queue<String> queue = new LinkedList<String>();
      queue.offer("Rickest Rick");
      queue.offer("Rickest Morty");
      queue.offer("Rickest Summer");

      System.out.println(queue.peek());
      System.out.println(queue);
  }
}
