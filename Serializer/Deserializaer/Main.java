import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException , ClassNotFoundException{
      User user = null;

      FileInputStream fileIn  = new FileInputStream("../UserInfo.ser");
      ObjectInputStream inputStr = new ObjectInputStream(fileIn);

      user = (User) inputStr.readObject();

      inputStr.close();
      fileIn.close();

      System.out.println(user.name + "is Deserialized successfully!" + user.password);
      
      
    }
}

