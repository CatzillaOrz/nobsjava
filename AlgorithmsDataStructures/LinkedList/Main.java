import java.util.*;
public class Main {
  public static void main(String[] args) {
    LinkedList<String> linkedList = new LinkedList<String>();

    linkedList.push("A");
    linkedList.push("B");
    linkedList.push("C");
    linkedList.push("D");
    linkedList.push("E");
    linkedList.push("F");
    linkedList.pop();

    // LinkedList as a Queue
    // linkedList.offer("G");
    // linkedList.poll();

    linkedList.add(5, "G");
    linkedList.remove("G");
    System.out.println(linkedList);
  }
}
