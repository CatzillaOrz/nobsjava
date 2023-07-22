import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {

    JButton button1 = new JButton("Button #1");

    MyFrame(){

      button1.setBounds(100,100,100 ,100 );
      button1.addActionListener(
          (e) -> System.out.println("You \n\t win!")
          );
      this.add(button1);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setSize(500, 500);
      this.setLayout(null);
      this.setVisible(true);
    };

}
