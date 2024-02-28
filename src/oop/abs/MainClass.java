package oop.abs;

public class MainClass {

    public static void main(String[] args) {

        /*
         - 추상 클래스(추상 메서드)를 사용하면 오버라이딩이 강제화 되기 때문에
          프로그래머의 오버라이딩 실수를 방지할 수 있고, 부모 클래스에서
          메서드를 선언할 때 메서드 내부에 어떤 내용을 써야 할 지 막연할 때도
          구현하기가 편합니다.

         - 다형성을 적용시켰을 경우에도 안전하게 사용이 가능합니다.
         */

//        Pet p  = new Pet("애완동물", "몰라",3)
        // 추상클래스는 직접 객체 생성 불가능(자식을 통해서만 생성된다!)
        // 하지만, 추상 클래스의 객체가 아예 생성이 안되는것은 아니라
        // 자식객체를 통해 실체화가 가능합니다.(super())

        Pet dog = new Dog("뽀삐", "푸들" ,3);  // 다형성으로 부모타입에 객체에 선언
        Cat cat = new Cat("츄이", "코숏", 2);  // 각자 타입으로 선언
        GoldFish fish = new GoldFish("잉어킹" , "잉어", 1);  // 각자타입으로 선언

        Pet[] pets = {
                dog, cat, fish
        };

        for (Pet pet : pets) {
            System.out.println("--------------------------------");
            pet.takeNap();
            pet.eat();
            pet.walk();
            System.out.println(pet.sayHello());  // 타입이 String 이기 때문에
        }




    }
}
