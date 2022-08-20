package hust.soict.hedspi.gui.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTCounter extends Frame {

  //Khai bao cac component tren giao dien
  private Label lblCount;
  private TextField ifCount;
  private Button btnCount;
  private int count;

  //Constructor cho AWRCounter: Khoi tao cua so giao dien
  public AWTCounter() {
    //THiet lap layout cho cua so giao dien
    //FlowLayout: bo cuc dang don gian: component nao duoc them vao truoc se xuat hien truoc
    //tren 1 hang, neu khong du cho thi xuong hang moi
    this.setLayout(new FlowLayout());
    //Khoi tao cac component va them vao giao dien
    lblCount = new Label("Counter");
    this.add(lblCount);
    ifCount = new TextField(count + "", 10);
    ifCount.setEditable(false);
    ifCount.setFocusable(false);
    this.add(ifCount);
    btnCount = new Button("Count");
    this.add(btnCount);
    //Dang ky lang nghe su kien tren button
    btnCount.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent actionEvent) {
        count++;
        ifCount.setText(count + "");
      }
    });
    //Thiet lap thong tin cho cua so giao dien
    this.setTitle("Counter Application");
    this.setSize(460, 250);
    this.setLocation(1000, 500);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    AWTCounter app = new AWTCounter();
  }

}
