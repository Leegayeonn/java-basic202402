package oop.constructor;

public class PhoneMain {

    public static void main(String[] args) {

        Phone basic = new Phone();
        basic.showSpec();

        Phone basic2 = new Phone();
        basic.showSpec();

        Phone galaxy = new Phone("갤럭시");
        //galaxy.model = "갤럭시";  //매개값으로 주면 바꿀수있음(생성자를 생성해서)
        galaxy.showSpec();

        Phone iPhone = new Phone("아이폰");
        iPhone.showSpec();

        Phone iPhone14 = new Phone("아이폰", "스페이스그레이");
        iPhone14.showSpec();



    }
}
