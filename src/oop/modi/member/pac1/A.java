package oop.modi.member.pac1;

public class A {

    public  int x;
    int y;  // default (패키지가 달라지면 사용불가능)
    private int z;


    // 생성자


    public A() {
        x = 1;
        y = 2;
        z = 3;

        method1();
        method2();
        method3();
    }

    public void method1() {}
    void method2() {}
    private void method3() {}

}
