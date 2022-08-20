import javax.swing.JOptionPane;

public class PhuongTrinhBacNhat {
        public static void main(String[] args) {
                String strANumber, strBNumber;
                Double aNumber, bNumber;
                JOptionPane.showMessageDialog(null, "ax+b=0", "Giai phuong trinh bac nhat",
                                JOptionPane.INFORMATION_MESSAGE);
                strANumber = JOptionPane.showInputDialog(null, "Nhap he so a cua phuong trinh: ",
                                "Input",
                                JOptionPane.INFORMATION_MESSAGE);
                aNumber = Double.parseDouble(strANumber);

                if (aNumber == 0)
                        JOptionPane.showMessageDialog(null,
                                        "Day khong phai la phuong trinh bac nhat!!!", "Sovle",
                                        JOptionPane.INFORMATION_MESSAGE);
                else {
                        strBNumber = JOptionPane.showInputDialog(null, "Nhap he so b cua phuong trinh: ",
                                        "Input ",
                                        JOptionPane.INFORMATION_MESSAGE);
                        bNumber = Double.parseDouble(strBNumber);
                        JOptionPane.showMessageDialog(null, "x" + "=" + (-bNumber / aNumber),
                                        "Nghiem cua phuong trinh la:",
                                        JOptionPane.INFORMATION_MESSAGE);
                }
                PhuongTrinhBacNhat.main(args);
                System.exit(0);
        }

}
