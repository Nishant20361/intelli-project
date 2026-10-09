package package1;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
      //  jFrame= a GUI window to add JComponent
//        JFrame frame=new JFrame(); // creates frame for us
//        frame.setTitle("JFrame title goes here"); // set title of frame
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of  application
//        frame.setResizable(false); // prevent frame from  being resize
//        frame.setSize(420,420); // set the x dimension and y dimension of frame
//        frame.setVisible(true); // make frame visible
//        ImageIcon icon=new ImageIcon("logo.png"); // create an image icon
//        frame.setIconImage(icon.getImage()); // change icon of frame
//        frame.getContentPane().setBackground(Color.green); // change the color of the background
       // frame.getContentPane().setBackground(new Color(rgb values like 0,0,0 means black)); // change the color of the backgro

        myFrame frame = new myFrame(); // extend the program
        frame.setVisible(true);
    }
}
