package oop.abs;

public class GoldFish extends Pet{

    public GoldFish(String name, String kind, int age) {
        super(name, kind, age);
    }

    @Override
    public void takeNap() {
        System.out.println("물고기가 어항에서 눈을 부릅뜨고 자용");
    }

    @Override
    public void eat() {
        System.out.println("물고기가 먹이를 뻐끔뻐끄미 먹어요");
    }
    
    
}
