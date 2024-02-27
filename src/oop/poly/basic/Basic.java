package oop.poly.basic;


// 다형성 : 타입의 규격화

/*
- 자바에서는 하나의 클래스 파일에 여러 개의 클래스를 선언할 수 있습니다.
 밀접한 연관이 있는 클래스를 모아 놓기 위해 사용합니다.
- 단, 파일명과 동일한 클래스가 반드시 존재해야 하고,
 해당 클래스만 public으로 선언할 수 있습니다.
*/

class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

public class Basic {

    A a = new A();
    B b = new B();
    C c = new C();
    D d = new D();
    E e = new E();

    /*
    - 다형성이란 자식 객체가 모든 부모의 타입을 가질 수 있다는 것을 의미합니다.
    - 즉, 부모 타입의 변수에 자식 객체의 주소값을 얼마든지 저장할 수 있다는 것을 의미합니다.
     */
    
    // 부모: 상위클래스
    // 자식: 하위클래스

    A v1 = new B(); // 상속관계라면 가능, 자식객체의 주소값을 부모타입에 저장가능.
                    // 클래스 타입B -> A타입 으로 자동 형 변환(promotion)
    A v2 = new C();
    A v3 = new D(); // 직속은 아니지만 상속되었기 때문에 가능
    A v4 = new E();

    B v6 = new D();
    C v7 = new E();

    // 상속 관계가 없다면 다형성적용이 불가능합니다.
    // 즉, 다형성은 무조건 상속 관계 하에서만 발생합니다.
//    B v8 = new C(); (x) 부모가 같지만 남이다
//    C v9 = new D(); (x)
//    B v10 = new E(); (x)
//    D v11 = new E(); (x)

    // Object 는 자바의 최상위 클래스입니다.
    // 모든 객체는 Object 의 자식입니다.
    // Object 타입의 변수에는 어떠한 객체도 들어올 수 있습니다.
    // import 는 안붙는다
    Object o1 = new A();
    Object o2 = new B();
    Object o3 = new C();
    Object o4 = new D();
    Object o5 = new E();
    Object o6 = new String("안녕하세요!");
    Object o7 = new Basic();

    





}









