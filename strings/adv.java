package strings;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
class A extends JFrame{
      public A(){
        JButton b1 = new JButton("A");
        JButton b2 = new JButton("c");
        JCheckBox c = new JCheckBox();
        add(b1);
        add(b2);
        add(c);
        setLayout(new FlowLayout());

        JLabel obj = new JLabel("hello ");
        add(obj);
        setVisible(true);
        setSize(400,400);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
      }
}

public class adv{
    public static void main(String args[]){
        A obj = new A();
    }
}