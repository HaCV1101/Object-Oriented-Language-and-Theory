package hust.soict.hedspi.gui.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.plaf.basic.BasicBorders.ButtonBorder;

/* FrameDemo.java requires no other files. */
public class Test {
  /**
   * Create the GUI and show it.  For thread safety,
   * this method should be invoked from the
   * event-dispatching thread.
   */
  private static void createAndShowGUI() {
    //Create and set up the window.
    JFrame frame = new JFrame("FrameDemo");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel emptyLabel = new JLabel("fsfs");
    emptyLabel.setPreferredSize(new Dimension(175, 100));
    frame.getContentPane().add(emptyLabel, BorderLayout.NORTH);

    ButtonBorder border = new ButtonBorder(Color.ORANGE, Color.DARK_GRAY, Color.BLACK, Color.LIGHT_GRAY);
    emptyLabel.setBorder(border);
    //Display the window.
    frame.pack();
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    //Schedule a job for the event-dispatching thread:
    //creating and showing this application's GUI.
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        createAndShowGUI();
      }
    });
  }
}