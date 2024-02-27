package oop.poly.car;

public class MainClass {

    public static void main(String[] args) {

        Sonata s1 = new Sonata();
        Sonata s2 = new Sonata();
        Sonata s3 = new Sonata();

        Porsche p1 = new Porsche();
        Porsche p2 = new Porsche();
        Porsche p3 = new Porsche();

        Tesla t1 = new Tesla();
        Tesla t2 = new Tesla();
        Tesla t3 = new Tesla();
        Tesla t4 = new Tesla();

//        s1.run(); s2.run(); s3.run(); 객체 메서드를 직접 부르는 방법 (갯수가 많아지면 별로..)



//        Sonata[] sonatas = {s1, s2, s3}; // 배열안에는 같은 타입(Sonata)의 객체만 넣을수있다.
//        for (Sonata s : sonatas) {
//            s.run();
//        }

        // 다형성을 이용하여 타른 타입의 객체를 메서드로 출력!
        Car[] cars = {s1,s2,s3,p1,p2,p3,t1,t2,t3,t4}; // 부모타입의 배열에는 자식객체들이 들어갈수있다.
        for (Car c : cars) {
            c.run();
        }
        // 부모타입에 자식객체!!!!!!!!!!!!!!!!!!
        System.out.println("===================================");

        Driver kim = new Driver();
        kim.drive(s1);
        kim.drive(p2);
        kim.drive(t3);

        System.out.println("===================================");

        Tesla myTesla = (Tesla) kim.buyCar("테슬라"); //같은 메서드에 여러종류의 객체를 리턴받을수있다.
        myTesla.run();
        myTesla.activeAutoPilot();
//        myTesla.activeAutoPilot(); // 다형성의 한계 (부모와 다른 매서드를 선언할경우 호출이 되지않음)

//        Tesla t = (Tesla) myTesla;
//        t.activeAutoPilot(); (o) 사용가능!

        System.out.println("===================================");
        
        CarShop shop = new CarShop();
        shop.carPrice(s2);
        shop.carPrice(t4);
        shop.carPrice(p1);


    }
}
