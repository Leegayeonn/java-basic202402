package oop.abs;

public class Cat extends Pet{

    public Cat(String name, String kind, int age) {
        super(name, kind, age);
    }

    @Override
    public void takeNap() {
        System.out.println("고양이는 캣타워에서 쉬는중~");
    }

    @Override
    public void eat() {
        System.out.println("고양이는 생선을 냠냠냠");
    }

    @Override
    public void walk() {
        System.out.println("고양이는 산책을 싫어해요 데굴데구리");
    }
}
