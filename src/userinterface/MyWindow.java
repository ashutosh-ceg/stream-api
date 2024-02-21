package userinterface;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;

public class MyWindow {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("My Window");
        jFrame.setSize(400, 400);
        jFrame.setLayout(new FlowLayout());

        JButton jButton = new JButton("Click me");
        jFrame.add(jButton);

        jButton.addActionListener(e -> {
            System.out.println("Button click");
            JOptionPane.showMessageDialog(null, "Button Clicked");
        });

        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
