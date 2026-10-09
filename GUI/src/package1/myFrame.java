package package1;

import javax.swing.*;
import java.awt.*;

public class myFrame extends JFrame {
    myFrame(){
        this.setTitle("Jthis title goes here"); // set title of this
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of  application
        this.setResizable(false); // prevent this from  being resize
        this.setSize(420,420); // set the x dimension and y dimension of this
        this.setVisible(true); // make this visible
        ImageIcon icon=new ImageIcon("logo.png"); // create an image icon
        this.setIconImage(icon.getImage()); // change icon of this
        this.getContentPane().setBackground(Color.darkGray); // change the color of the background
        // this.getContentPane().setBackground(new Color(rgb values like 0,0,0 means black)); // change the color of the backgro
    }
    }

