package oop.abs;

public class Dog extends Pet {


    // 부모로부터 생성자를 만들어야함
    public Dog(String name, String kind, int age) {
        super(name, kind, age);
    }

    @Override
    public void takeNap() {
        System.out.println("강아지는 마당에서 쿨쿨~");
    }

    @Override
    public void eat() {
        System.out.println("강아지가 사료를 왁왁먹어요!");
    }

    @Override
    public void walk() {
        System.out.println("강아지는 산책을 좋아해요~");
    }
}
