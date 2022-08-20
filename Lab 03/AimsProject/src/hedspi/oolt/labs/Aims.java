package hedspi.oolt.labs;

public class Aims {
 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //Syntax: new + loi goi constructor()

        DigitalVideoDisc dvd0 = new DigitalVideoDisc();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        dvd1.setCategory("Animation");
        dvd1.setDirector("Roger Allers");
        dvd1.setLength(87);
        dvd1.setCost(19.95f);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.95f);
        dvd0.printInfo();
        dvd1.printInfo();
        dvd2.printInfo();
        dvd3.printInfo();
        // Tao mot don hang moi
        Order anOrder = new Order();
        //Them cac dia DVD vao don hang
        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd2);
        anOrder.addDigitalVideoDisc(dvd3);
        // In ra tong gia tri cua don hang
        System.out.println("Total cost is: " + anOrder.totalCost());

        // Xoa di mot yeu cau trong don hang
        anOrder.removeDigitalVideoDisc(dvd2);
        anOrder.removeDigitalVideoDisc(dvd1);
        // In ra tong gia tri cua don hang
        System.out.println("Total cost is: " + anOrder.totalCost());


    }

}
