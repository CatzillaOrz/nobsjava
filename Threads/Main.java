public class Main {
  public static void main(String[] args) throws InterruptedException{
    System.out.println(Thread.activeCount());

    Thread.currentThread().setName("MAIN");
    System.out.println(Thread.currentThread().getName());

    // Thread.currentThread.setPriority(2);
    System.out.println(Thread.currentThread().getPriority());

    System.out.println(Thread.currentThread().isAlive()); 

    for(int i = 3; i> 0 ; i--){
      System.out.println(i);
      Thread.sleep(1000);
    }

  }
}
