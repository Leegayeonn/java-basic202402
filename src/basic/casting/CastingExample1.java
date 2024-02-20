package basic.casting;

public class CastingExample1 {

    public static void main(String[] args) {

        // 형변환

        /*
         - 크기가 작은 데이터 타입의 자료를 큰 데이터 타입으로 변환할 때는
          자바 가상 머신 (JVM)이 자동으로 타입을 올려서 변환해 줍니다.
          (promotion, UpCasting)
         */

        //암묵적 변환
        byte b = 10;  // 1byte
        int i = b;  // 4byte (byte -> int) , 용량이 큰곳에 넣으면 상관없기때문에
        System.out.println("i = " + i);

        char c = '가';  // 문자형(0~ 6만어쩌고)
        int j = c;   // 정수형(21억)  (char -> int)  char < int
        System.out.println("'가'의 문자 번호: " + j);  //유니코드로 변환된 값이 출력

        int k = 500;
        double d = k;  // double(실수) > int(정수)  int -> double
        System.out.println("d = " + d);

    }
}
