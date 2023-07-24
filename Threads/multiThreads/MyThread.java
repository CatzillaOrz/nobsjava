public class MyThread extends Thread{
    @Override
    public void run(){
      for(int i = 10; i> 0 ; i--){
        try{
          System.out.println(i);
          Thread.sleep(1000);
        }catch(InterruptedException e){
          System.out.println("Thread #1: " +i);
        }
      }
      System.out.println("Thread #1 is finished! :) ");
    }
}
