public class MyThread extends Thread{
  @Override
  public void run(){
    if(this.isDaemon()){
      System.out.println("This thread is a Daemon running, it's a lower proirity thread !");
    }else{
      System.out.println("This is user thread is running");
    }

  }
}
