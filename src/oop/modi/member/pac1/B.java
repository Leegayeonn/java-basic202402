package oop.modi.member.pac1;

public class B {

    public B() {
        A a = new A();
        a.x = 1;
        a.y = 2;
//        a.z = 3;  //private (클래스가 다르면 접근불가능)

        a.method1();
        a.method2();
//        a.method3();  // private 메서드 이기때문에 부를수없다.


    }
}
