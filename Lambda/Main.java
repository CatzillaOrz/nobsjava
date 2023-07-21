public class Main {
  public static void main(String[] args) {
    MyInterface myInterface = () ->  System.out.println("Hello world! ");
    myInterface.message();
  }
}
