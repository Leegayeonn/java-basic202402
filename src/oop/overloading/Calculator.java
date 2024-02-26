package oop.overloading;

public class Calculator {

    /*
     # 오버로딩 (중복): 하나의 클래스 내부에서 같은 이름을 가진 메서드나
      생성자를 여러 개 중복해서 선언할 수 있게 해주는 문법.

     - 오버로딩 적용 조건:
     1. 매개 변수의 데이터 타입이 다를 것! or
     2. 매개 변수의 전달 순서가 다를 것! or
     3. 매개 변수의 개수가 다를 것.
     */

    void inputData() {}  //return 타입은 void

    void inputData(int a) {}

    void inputData(int a, int b) {}

//    void inputData(int b, int a) {} // (x) 데이터타입이 같기때문에 안됨

    void inputData(String s) {}

    void inputData(int a, double d) {}

    void inputData(double d, int a) {}  // 데이터타입이 다르기때문에 호출가능

//    void inputData(int number) {} // (x) 정수매개값 1개받는 메서드 이미 선언 ,데이터타입이 같다

//    int inputData(int number) {
//        return 0;
//    } (x) 반환유형(return type)은 오버로딩에 영향을 미치지 못합니다.


      /*
         - Calculator 클래스에 calcRectArea() 메서드를 선언하여

         1. 길이를 하나만 전달하면 정사각형의 넓이를 리턴.
         2. 길이를 두 개 전달하면 (가로, 세로) 직사각형의 넓이를 리턴.
         3. 길이를 세 개 전달하면 (밑변, 윗변, 높이) 사다리꼴의 넓이를 리턴.

         MainClass에서 객체를 생성한 후 직접 메서드를 호출해서 출력해 보세요.
         (길이가 5인 정사각형의 넓이, 가로10 세로20인 직사각형의 넓이
         윗변 5 밑변 13 높이 7인 사다리꼴의 넓이)
         */

    void calcRectArea(int length) {
        System.out.printf("정사각형의 넓이: %d\n", length*length );
    }

    void calcRectArea(int width, int height) {
        System.out.printf("직사각형의 넓이: %d\n", width*height);
    }

    void calcRectArea(int bottom, int top, int height) {
        System.out.printf("사다리꼴의 넓이: %d", (bottom + top) * height /2.0);
    }








}
