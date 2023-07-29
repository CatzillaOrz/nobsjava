/**
 * Hashtable = A data structure that stores unique keys t values ex.<Integer, String>
 *             Each key/value pair is known as an Entry
 *             FAST insertion, look up, deletion of key/value pairs
 *             Not ideal for small data sets, great with large data sets
 *            
 * hashing = takes a key and computes an integer (formula will vary based on key & data type)
 *           In a Hashtable, we use the hash % capacity to calculate an index number
 *
 *           key.hashCode() % capacity = index
 *
 * bucket = an indexed storage location for one or more Entries
 *          can store multiple Entries in case of a collision (linked similarly a LinkedList)
 *         
 *          collision = hash function generates the same index for more than one key
 *          less collision = more efficiency
 *
 * Runtime complexity: Best Case O(1)
 *                     Worst Case O(n)
 *
 */
import java.util.*;
public class Main {
  public static void main(String[] args) {
    Hashtable<String, String> table = new Hashtable<>(21);

    table.put("100", "Spongebob");
    table.put("123", "Patrick");
    table.put("321", "Sandy");
    table.put("555", "Squidward");
    table.put("777", "Gary");

    // table.remvoe(777);

    for(String key: table.keySet()){
      System.out.println(key.hashCode() % 21 + "\t" + key  + "\t" + table.get(key));
    }
  }
}
