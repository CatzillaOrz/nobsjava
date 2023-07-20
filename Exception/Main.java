import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
   Scanner sacn = new Scanner(System.in);
   System.out.println("Enter your age: ");
   int age = sacn.nextInt();

   try{
     checkAge(age);
   }catch(Exception e){
     System.out.println("A problem occured: " + e);
   }
  }

  static void checkAge(int age)throws AgeException{
    if(age<18){
      throw new AgeException("\n" + "You must be 18+ to sign up!");
    }else{
      System.out.println("Your are now signed up!");
    }
  }
}
