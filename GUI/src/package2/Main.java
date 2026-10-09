package package2;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon(Objects.requireNonNull(Main.class.getResource("logo.png")));
        JLabel label = new JLabel(); // create a label
        label.setText("Hello World"); // set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);//set text LEFT,CENTER,RIGHT OF IMAGE ICON
        label.setVerticalTextPosition(JLabel.BOTTOM); //set text TOP,CENTER,BOTTOM OF IMAGE ICON
        label.setForeground(Color.green); // set the color of the text
        label.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 50)); // set the font , size of the text


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1100, 1500);
        frame.add(label);
        frame.setVisible(true);
    }

}