/**
 * recursion = When a thing is defined in terms of itself. - Wikipedia
 * Apply the result of a procedure, to a precedure.
 * A recursive method calls itself. Can be a substitute for iteration.
 * Divide a problem into sub-problems of the same type as the original.
 * Commonly used with advanced sorting algorithms and navigating trees.
 *
 * Advantages
 * ----------
 *  easier to read/write
 *  easier to debug
 *
 *  Disadvantages
 *  --------
 *  somethims slower
 *  uses more memory
 * 
 */
public class Main {
  public static void main(String[] args) {
    walk(5);
    System.out.println(factorial(7));
    System.out.println(power(2, 8));
    

  }

  private static void walk(int steps){
    if(steps < 1) return ;

    System.out.println("You take a step");

    walk(steps - 1);
  }

  private static int factorial(int num){
    if(num < 1) return 1; //base case
    return num * factorial(num -1);
  }

  private static int power(int base, int exponent){
    if(exponent < 1) return 1;
    return base * power(base, exponent -1 );
  }
}
