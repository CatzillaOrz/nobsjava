/**
 *  interpolation search =
 *                          - improvement over binary search
 *                          - best used for "uniformly" distributed "guesses" where a value might be based on calculated probe results
 *                          - if probe is incorrect, search area is narrowed, and a new probe is calculated
 *                           
 *  - average case: O(log(log(n)))
 *  - worst case: O(n) [values increase exponentially]
 *
 */

public class Main {
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4 , 5, 6, 7, 8, 9};

    int index = interpolationSearch(array, 8);

    
  }

  private static int interpolationSearch(int[] array, int value){
    //TODO: Auto-generated method stub
    return 0;
  }
}
