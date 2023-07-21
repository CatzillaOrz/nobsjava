public class Main {
  public static void main(String[] args) {
    /**
    Outside out = new Outside();
    Outside.Inside inside = out.new Inside();
    System.out.println(out.x + inside.y);
    */

    Greeting greeting = new Greeting(){
      public void Welcome(){
        System.out.println("Yo bro! ");
      }
    };

    greeting.Welcome();

    MyFrame myFrame = new MyFrame();


  }

}
