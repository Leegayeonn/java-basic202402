package datatype;

public class FloatExample {


    public static void main(String[] args) {

        // 실수 리터럴의 기본 데이터 타입은 double 입니다.
        float f1 = 7.12345F;
        double d1 = 7.12345F;

        ///////////////////////////////////////////////

        float f2 = 1.234567891234F;  // 7자리 (반올림 해버림)
        double d2 = 1.234567891234;  // 15자리

        //주로 double 사용!

        System.out.println("f2 = " + f2);
        System.out.println("d2 = " + d2);
    }
}
