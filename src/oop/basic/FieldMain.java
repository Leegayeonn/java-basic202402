package oop.basic;

public class FieldMain {

    public static void main(String[] args) {

        // 클래스를 기반으로 객체 생성해야됨
        FieldAndLocal fl = new FieldAndLocal();

        // 객체 생성
        fl.a = 2;
        fl.printNumber(4); //매개변수에 들어갈 값
        fl.foo();
        
        // 객체의 기능 -> 매서드 (자바에서는 함수라는 말보다는 메서드라고 함)

        
    }
}
