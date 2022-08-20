package hust.soict.hedspi.aims.UI;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListCellRenderer;

public class AddItemToTheOrder extends JFrame implements ActionListener, WindowListener {

  private JButton bookButton;
  private JButton compactDiscButton;
  private JButton digitalVideoDiscButton;
  private JPanel mainPanel;
  private JTextField textField1;
  private JTextField textField2;
  private JTextField textField3;
  private JTextField textField4;
  private JTextField textField5;
  private JTextArea textArea1;
  private JButton addButton;
  private JButton addButton1;
  private JButton addButton2;
  private JComboBox<Integer> comboBox1;
  private JPanel inputPanel;
  private JTextField titleDVD;
  private JTextField categoryDVD;
  private JTextField directorDVD;
  private JTextField lengthDVD;
  private JTextField costDVD;

  public AddItemToTheOrder(String title, Component parent) throws HeadlessException {
    super(title);
    this.parent = parent;
    setContentPane(mainPanel);
    setVisible(true);
    setSize(new Dimension(1000, 800));
    setLocationRelativeTo(null);
    addAllAction();
    customs();
  }

  private void customs() {
  }

  private void addAllAction() {
    addWindowListener(this);
    bookButton.addActionListener(this);
    compactDiscButton.addActionListener(this);
    digitalVideoDiscButton.addActionListener(this);
    addButton1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent actionEvent) {
        DigitalVideoDisc dvd = new DigitalVideoDisc(titleDVD.getText(), categoryDVD.getText(),
            directorDVD.getText(), Integer.parseInt(lengthDVD.getText()),
            Float.parseFloat(costDVD.getText()));
        OrderManagementApplication.orderList[OrderManagementApplication.nbOrder - 1].addMedia(dvd);
        titleDVD.setText("");
        categoryDVD.setText("");
        directorDVD.setText("");
        lengthDVD.setText("");
        costDVD.setText("");
        JOptionPane.showMessageDialog(mainPanel, "DVD had been added!", "Success", JOptionPane.INFORMATION_MESSAGE);
      }
    });
  }

  @Override
  public void actionPerformed(ActionEvent actionEvent) {
    Object source = actionEvent.getSource();
    CardLayout layout = (CardLayout) inputPanel.getLayout();
    layout.first(inputPanel);
    if (bookButton.equals(source)) {
    } else if (digitalVideoDiscButton.equals(source)) {
      layout.next(inputPanel);
    } else if (compactDiscButton.equals(source)) {
      layout.next(inputPanel);
      layout.next(inputPanel);
    }
  }

  private Component parent;

  @Override
  public void windowOpened(WindowEvent windowEvent) {

  }

  @Override
  public void windowClosing(WindowEvent windowEvent) {
    dispose();
    parent.setVisible(true);
  }

  @Override
  public void windowClosed(WindowEvent windowEvent) {
  }

  @Override
  public void windowIconified(WindowEvent windowEvent) {

  }

  @Override
  public void windowDeiconified(WindowEvent windowEvent) {

  }

  @Override
  public void windowActivated(WindowEvent windowEvent) {

  }

  @Override
  public void windowDeactivated(WindowEvent windowEvent) {

  }
}
