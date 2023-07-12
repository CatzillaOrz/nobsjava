import java.util.Arrays;
public class ReferenceTrap {
  public static void main(String[] args) {
    String[] staffLastYear = {"Tommy", "Joei", "Ellie"};
    System.out.println(Arrays.toString(staffLastYear));
    String[] staffThisYear =  staffLastYear;
    staffThisYear[1] = "Abby"; // trap    System.out.println(Arrays.toString(staffLastYear));
    System.out.println(Arrays.toString(staffThisYear));

    // slove the trap
    String[] newThisYear = new String[3];
    for(int i= 0; i < staffLastYear.length ; i++){
      newThisYear[i] = staffLastYear[i];
    }

    newThisYear[1] = "Hero";
    System.out.println(Arrays.toString(staffLastYear));
    System.out.println(Arrays.toString(newThisYear));
  }
}
