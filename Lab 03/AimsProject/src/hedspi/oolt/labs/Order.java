package hedspi.oolt.labs;

public class Order {
    //Khai bao mot hang so: so luong san pham toi da
    public static final int MAX_NUMBERS_ORDERED = 10;
    //Khai bao mot mang (array) cac doi tuong DVD
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    //khai bao thuoc tinh chua so luong phan tu hien co trong don hang
    private int qtyOrdered = 0;
    //Xay dung cac phuong thuc get/set

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    // Xay dung phuong thuc them mot doi tuong DVD vao don hang
    // Noi dung: them mot doi tuong vao mang itemsOrdered
    //--> phai kiem tra xem mang da bi day phan tu chua?
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (this.qtyOrdered == MAX_NUMBERS_ORDERED)
            System.out.println("The order is almost full");
        else {
            this.itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
            System.out.println("Total disc: " + this.qtyOrdered);
        }
    }

    //Phuong thuc xoa mot doi tuong DVD khoi don hang
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        //Viet lenh loai bo doi tuong DVD khoi mang
        //Luu y kiem tra tinh huong mang rong ( khong co phan tu)
        //TODO
        int pos = qtyOrdered;
        if (this.qtyOrdered == 0)
            System.out.println("The order is empty.");
        else {
            for (int i = 0; i < this.qtyOrdered; i++) {
                if (this.itemsOrdered[i] == disc) {
                    pos = i;
                    System.out.println("Remove successful. Number of remaining elements: " + (this.qtyOrdered - 1));
                    break;
                }
            }
            if (pos == qtyOrdered) return;
            for (int i = pos; i < this.qtyOrdered - 1; i++) {
                this.itemsOrdered[i] = this.itemsOrdered[i + 1];
            }
            this.qtyOrdered--;
        }
    }

    // Phuong thuc tinh tong gia tri cua don hang
    public float totalCost() {
        float total = 0.0f;
        for (int i = 0; i < this.qtyOrdered; i++)
            total += itemsOrdered[i].getCost();
        return total;
    }

}

