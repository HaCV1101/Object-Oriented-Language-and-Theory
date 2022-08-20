import javax.swing.JOptionPane;

public class HePhuongTrinhBacNhat {
        public static void main(String[] args) {
                String strA11, strA12, strA21, strA22, strB1, strB2;
                Double a11, a12, a21, a22, b1, b2, D, D1, D2;
                JOptionPane.showMessageDialog(null, " a11*x1 + a12*x2 = b1 \n a21*x1 + a22*x2 = b2",
                                "Giai he phuong trinh bac nhat",
                                JOptionPane.INFORMATION_MESSAGE);
                strA11 = JOptionPane.showInputDialog(null, "Nhap he so a11 cho he phuong trinh: ", "Input",
                                JOptionPane.INFORMATION_MESSAGE);
                a11 = Double.parseDouble(strA11);
                strA12 = JOptionPane.showInputDialog(null, "Nhap he so a12 cho he phuong trinh: ", "Input",
                                JOptionPane.INFORMATION_MESSAGE);

                a12 = Double.parseDouble(strA12);
                strB1 = JOptionPane.showInputDialog(null, "Nhap he so b1 cho he phuong trinh: ", "Input",
                                JOptionPane.INFORMATION_MESSAGE);
                b1 = Double.parseDouble(strB1);
                strA21 = JOptionPane.showInputDialog(null, "Nhap he so a21 cho he phuong trinh: ", "Input",
                                JOptionPane.INFORMATION_MESSAGE);
                a21 = Double.parseDouble(strA21);
                strA22 = JOptionPane.showInputDialog(null, "Nhap he so a22 cho he phuong trinh: ", "Input",
                                JOptionPane.INFORMATION_MESSAGE);
                a22 = Double.parseDouble(strA22);
                strB2 = JOptionPane.showInputDialog(null, "Nhap he so b2 cho he phuong trinh: ", "Input",
                                JOptionPane.INFORMATION_MESSAGE);
                b2 = Double.parseDouble(strB2);
                if ((a11 * a11 + a12 * a12) != 0 && (a21 * a21 + a22 * a22) != 0) {
                        D = a11 * a22 - a21 * a12;
                        D1 = b1 * a22 - b2 * a12;
                        D2 = a11 * b2 - b1 * a21;
                        if (D != 0)
                                JOptionPane.showMessageDialog(null,
                                                "He phuong trinh co nghiem duy nhat (x1,x2)=" + "("
                                                                + (D1 / D + "," + D2 / D)
                                                                + ")",
                                                "Solve",
                                                JOptionPane.INFORMATION_MESSAGE);
                        else if (D == 0 && D1 == 0 && D2 == 0)
                                JOptionPane.showMessageDialog(null,
                                                "He phuong trinh co vo so nghiem ",
                                                "Solve",
                                                JOptionPane.INFORMATION_MESSAGE);
                        else
                                JOptionPane.showMessageDialog(null, "He phuong trinh vo nghiem", "Solve",
                                                JOptionPane.INFORMATION_MESSAGE);
                        HePhuongTrinhBacNhat.main(args);
                } else if (b1 != 0 || b2 != 0)
                        JOptionPane.showMessageDialog(null, "He phuong trinh vo nghiem", "Solve",
                                        JOptionPane.INFORMATION_MESSAGE);
                else
                        JOptionPane.showMessageDialog(null,
                                        "He phuong trinh co vo so nghiem",
                                        "Solve",
                                        JOptionPane.INFORMATION_MESSAGE);
                HePhuongTrinhBacNhat.main(args);
                System.exit(0);
        }
}
