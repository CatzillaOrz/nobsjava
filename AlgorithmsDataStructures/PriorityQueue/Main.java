import java.util.*;
public class Main {
  public static void main(String[] args) {
    Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
    Queue<String> queueStr = new PriorityQueue<>(Collections.reverseOrder());

    queue.offer(3.0);
    queue.offer(2.5);
    queue.offer(4.0);
    queue.offer(1.5);
    queue.offer(2.0);

    queueStr.offer("E");
    queueStr.offer("B");
    queueStr.offer("A");
    queueStr.offer("D");
    queueStr.offer("C");

    while (!queue.isEmpty()) {
      System.out.println(queue.poll());
    }

    while (!queueStr.isEmpty()) {
      System.out.println(queueStr.poll());
    }
  }
}
