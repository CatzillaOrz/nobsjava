import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    HelloWorld(3);

    Scanner scan = new Scanner(System.in);
    System.out.println("How far do you want to walk (meters) ? : ");
    int distance = scan.nextInt();
    takeAstep(0, distance);
    
  }

  static void takeAstep(int i , int distance){
    if(i < distance){
      i++;
      System.out.println("* you take a step * : " + i + " meter/s");
      takeAstep(i , distance);
    }{
      System.out.println("Your are done walking!");
    }
  }

  static void HelloWorld(int n){
    if(n > 0){
      System.out.println("Hello World ! " + n);
      n--;
      HelloWorld(n);
    }
  }
}
