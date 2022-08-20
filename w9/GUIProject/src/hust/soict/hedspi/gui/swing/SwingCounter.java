package hust.soict.hedspi.gui.swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class SwingCounter extends JFrame {

  private JLabel lblCount;
  private JTextField ifCount;
  private JButton btnCount;
  private int count;

  //Constructor cho AWRCounter: Khoi tao cua so giao dien
  public SwingCounter() {
    Container cp = getContentPane();
    cp.setLayout(new FlowLayout());
    lblCount = new JLabel("Counter");
    cp.add(lblCount);
    ifCount = new JTextField("0", 15);
    ifCount.setEditable(false);
    ifCount.setFocusable(false);
    cp.add(ifCount);
    btnCount = new JButton("Count");
    cp.add(btnCount);
    btnCount.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent actionEvent) {
        count++;
        ifCount.setText(count + "");
      }
    });
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("Counter Application");
    this.setSize(460, 250);
//    this.setLocation(1000, 500);
    this.setVisible(true);
    this.setLocationRelativeTo(null);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        new SwingCounter();
      }
    });
  }
}
