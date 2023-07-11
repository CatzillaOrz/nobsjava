import java.util.Scanner;
public class Survey {
  public static void main(String[] args) {
    int counter = 0;

    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome. Thank you for taking the survey");
    System.out.println("What is you name?");
    
    String name = scan.nextLine();
    counter++;

    System.out.println("How much money do you spend on coffeee?");
    double coffeePrice = scan.nextDouble();
    counter++;

    System.out.println("How much money do you spend on fast food?");
    double foodPrice = scan.nextDouble();
    counter++;


    System.out.println("How many times a week do you buy coffee?");
    double coffeeAmount  = scan.nextInt();
    counter++;


    System.out.println("How many times a week do you buy fast food?");
    double foodAmount = scan.nextInt();
    counter++;

    scan.close();
    System.out.println("\nThanks for answer all " + counter + " questions!");

  }
}
