package basic.array;

import java.util.Arrays;

public class EnhancedForLoop_forEach {

    public static void main(String[] args) {

        /*
         # 향상된 for문 (forEach)
         - 제어변수(인덱스)의 사용 없이 배열 내부의 요소를
          전체 참조할 수 있게 해 주는 반복문.

         ex)
         for(배열 요소를 받아줄 수 있는 변수 : 배열변수명) {
             반복 실행문
         }
         */

        String[] week = {"월","화","수","목","금","토","일"};

        //배열의 타입과 변수타입을 같게 해주면된다
        //자바스크립트는 : 대신 of
        for(String day : week) {
            System.out.println(day + "요일 좋아~!");
        }

        System.out.println("------------------------------------------");

        /*
         1. scores라는 이름으로 int배열을 하나 선언해서
         점수 데이터를 저장하세요.
         {96, 88, 74, 63, 100, 55}

         2. 향상 for문(forEach)을 사용하여 총점과 평균을 구해보세요.
         총점(int), 평균(double, 소수점 둘째 자리까지 출력)
        */

        int[] scores = {96, 88, 74, 63, 100, 55};

            int total = 0;
        for(int i : scores){
            total += i;
        }
            System.out.println("총점: " + total );

            System.out.println("평균: " + (double)total / scores.length);

            // double avg = (double)total / scores.length
    }
}
