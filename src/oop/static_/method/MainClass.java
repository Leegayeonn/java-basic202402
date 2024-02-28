package oop.static_.method;

import oop.modi.cls.pac2.C;
import util.Utility;

import static util.Utility.*;

public class MainClass {

    public static void main(String[] args) {

        Count c = new Count(); // 실제 객체를 만들기
        int result = c.method1(); // 메서드 호출

        // static 메서드호출
        int result2 = Count.method2();

        makeLine();
        String name = input("이름을 입력하세요: ");
        System.out.println("name = " + name);


    }
}
