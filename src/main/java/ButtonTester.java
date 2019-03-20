import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonTester {


    public static void main(String[] args) {
//        JFrame f = new JFrame("Button Example");
//        JButton b = new JButton("Click Here");
//        b.setBounds(100, 100, 155, 30);
//        f.add(b);
//        f.setSize(400, 400);
//        f.setLayout(null);
//        f.setVisible(true);
        JFrame f = new JFrame("Button Example");
        final JTextField tf = new JTextField();
        tf.setBounds(50, 50, 150, 20);
        JButton b = new JButton("Click Here");
        b.setBounds(50, 100, 95, 30);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println();
                tf.setText("Welcome to Javatpoint.");
            }
        });
        f.add(b);
        f.add(tf);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }


}


