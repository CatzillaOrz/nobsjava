public class Main {
  public static void main(String[] args) {
    String name = "Bro";
    char symbol = '!';
    MyInterface myInterface = (x, s) ->  {
      System.out.println("Hello world ");
      System.out.println(s);
      System.out.println(x);
    };
    myInterface.message(name, symbol);
  }
}
