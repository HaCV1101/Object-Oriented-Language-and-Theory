import javax.swing.JOptionPane;

public class PhuongTrinhBacHai {
        public static void main(String[] args) {
                String strANumber, strBNumber, strCNumber;
                Double aNumber, bNumber, cNumber, delta;
                JOptionPane.showMessageDialog(null, "ax^2 + bx + c=0", "Giai phuong trinh bac hai",
                                JOptionPane.INFORMATION_MESSAGE);
                strANumber = JOptionPane.showInputDialog(null, "Nhap he so a cua phuong trinh: ", "Input",
                                JOptionPane.INFORMATION_MESSAGE);
                aNumber = Double.parseDouble(strANumber);
                if (aNumber == 0) {
                        JOptionPane.showMessageDialog(null,
                                        "Day khong phai la phuong trinh bac hai!!!");

                } else {
                        strBNumber = JOptionPane.showInputDialog(null, "Nhap he so b cua phuong trinh: ",
                                        "Input",
                                        JOptionPane.INFORMATION_MESSAGE);
                        bNumber = Double.parseDouble(strBNumber);
                        strCNumber = JOptionPane.showInputDialog(null, "Nhap he so c cua phuong trinh: ",
                                        "Input",
                                        JOptionPane.INFORMATION_MESSAGE);
                        cNumber = Double.parseDouble(strCNumber);
                        delta = Math.pow(bNumber, 2) - 4 * aNumber * cNumber;
                        if (delta < 0)
                                JOptionPane.showMessageDialog(null, "Phuong trinh vo nghiem.",
                                                "Solve", JOptionPane.INFORMATION_MESSAGE);
                        else if (delta == 0)
                                JOptionPane.showMessageDialog(null,
                                                "Phuong trinh co nghiem kep la: x1 = x2 =" + (-bNumber / (2 * aNumber)),
                                                "Solve",
                                                JOptionPane.INFORMATION_MESSAGE);
                        else
                                JOptionPane.showMessageDialog(null,
                                                "Phuong trinh co hai nghiem phan biet la:" + "\n" + "x1 = "
                                                                + ((-bNumber + Math.sqrt(delta)) / (2 * aNumber)) + "\n"
                                                                + "x2 = "
                                                                + ((-bNumber - Math.sqrt(delta)) / (2 * aNumber)),
                                                "Solve", JOptionPane.INFORMATION_MESSAGE);
                }
                PhuongTrinhBacHai.main(args);
                System.exit(0);
        }

}
