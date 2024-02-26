package oop.modi.constructor.pac2;

import oop.modi.constructor.pac1.A;

public class C {

    // public밖에 안됨
    A a1 = new A(true);
    // A a2 = new A(30); // (x) default(다른패키지에서는 사용불가)
    // A a3 = new A(3.14);  // (x) private
}
