public class Main {
  public static void main(String[] args) {
    DynamicArray dynamicArray  = new DynamicArray();

    System.out.println(dynamicArray.capacity);

    dynamicArray.add("A");
    dynamicArray.add("B");
    dynamicArray.add("C");

    dynamicArray.insert(0, "X");
    dynamicArray.delete("A");

    System.out.println(dynamicArray);
    System.out.println(dynamicArray.size);
    System.out.println(dynamicArray.capacity);
    System.out.println(dynamicArray.isEmpty());
    
  }
}
