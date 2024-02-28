package oop.inter;


// 인터페이스: 객체의 규격(기능)을 표준화 해서 명세하는 역할.
public interface Inter {

    // 인터페이스에서 변수를 선언하면 상수(static final) 로 인식합니다.
    int NUM = 5;

    // 인터페이스는 생성자를 가질 수 없다.(객체화 될 수 없는 개념)
//    Inter() {
//
//    }

    // 인터페이스에서 메서드를 선언하면 추상 메서드로 지정됩니다.(abstract 를 사용하지않아도)
    void method1();

    
    // static 메서드는 생성 가능
    public static void staticMethod() {
        System.out.println("가능합니다~");
    }


}
