package hust.soict.hedspi.aims.UI;

import hust.soict.hedspi.aims.order.Order;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class OrderManagementApplication extends JFrame implements ActionListener {

  private JPanel mainPanel;
  private JButton createNewOrderButton;
  private JButton exitButton;
  private JButton displayTheItemsListButton;
  private JButton deleteItemByIdButton;
  private JButton addItemToTheButton;

  public OrderManagementApplication(String title) throws HeadlessException {
    super(title);
    setContentPane(mainPanel);
    setVisible(true);
    setSize(new Dimension(1000, 800));
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    addAllAction();
  }

  private void addAllAction() {
    createNewOrderButton.addActionListener(this);
    addItemToTheButton.addActionListener(this);
    deleteItemByIdButton.addActionListener(this);
    displayTheItemsListButton.addActionListener(this);
    exitButton.addActionListener(this);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        new OrderManagementApplication("Order Management Application");
      }
    });
  }

  @Override
  public void actionPerformed(ActionEvent actionEvent) {
    Object source = actionEvent.getSource();
    OrderManagementApplication cur = this;
    if (createNewOrderButton.equals(source)) {
      orderList[nbOrder++] = Order.createOrder();
      JOptionPane.showMessageDialog(cur, "Create new order successfully!", "Message",
          JOptionPane.INFORMATION_MESSAGE, null);
    } else if (addItemToTheButton.equals(source)) {
      if (nbOrder == 0) {
        JOptionPane.showMessageDialog(cur, "You need to create an order first!", "Message",
            JOptionPane.WARNING_MESSAGE, null);
      } else {
        setVisible(false);
        new AddItemToTheOrder("Add item to the order", cur);
      }
    } else if (deleteItemByIdButton.equals(source)) {
      if (nbOrder == 0) {
        JOptionPane.showMessageDialog(cur, "You need to create an order first!", "Message",
            JOptionPane.WARNING_MESSAGE, null);
      } else {
        orderList[nbOrder - 1].removeMedia(Integer.parseInt(
            JOptionPane.showInputDialog(cur, "Input id: ", "Message",
                JOptionPane.INFORMATION_MESSAGE)));
      }
    } else if (displayTheItemsListButton.equals(source)) {
      if (nbOrder == 0) {
        JOptionPane.showMessageDialog(cur, "You need to create an order first!", "Message",
            JOptionPane.WARNING_MESSAGE, null);
      }else {
        int num = Integer.parseInt(JOptionPane.showInputDialog(cur, "Input order's id:", JOptionPane.INFORMATION_MESSAGE));
        JOptionPane.showMessageDialog(cur, "List of products in the order " + num + ":\n"+orderList[num], "", JOptionPane.INFORMATION_MESSAGE);
      }
    } else if (exitButton.equals(source)) {
      dispose();
      System.exit(0);
    }
  }

  public static Order[] orderList = new Order[Order.MAX_LIMITTED_ORDERS];
  public static int nbOrder = 0;
}
