import java.util.Stack;
public class Main {
  public static void main(String[] args) {
    Stack<String> stack = new Stack<String>();


    stack.push("Rick");
    stack.push("Morty");
    stack.push("Summer");
    
    System.out.println(stack.empty());
    System.out.println(stack);
  }
}
