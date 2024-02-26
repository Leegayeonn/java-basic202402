package oop.modi.protec.pac2;

import oop.modi.protec.pac1.*;

public class C extends A{

//    A a1 = new A(30); (x)
//    A a2 = new A(5.67); (x)



    public C() {

        /*
            - protected 제한자는 패키지가 다른경우
            두 클래스 사이에 상속 관계가 존재한다면
            super 키워드를 통해 참조를 허용합니다.
         */

        super(30); // protected 패키지가 다르더라도 자식클래스라면 가능
//       super(3.14);  // default 패키지가 달라지면 사용불가

        super.x = 1;
//        super.y = 2;

        super.method1();
//        super.method2();  // 패키지가 달라지면 호출 불가능


    }

}
