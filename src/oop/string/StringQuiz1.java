package oop.string;

import java.util.Arrays;
import java.util.Scanner;

public class StringQuiz1 {

    public static void main(String[] args) {


        /*
         1. 주민등록번호 13자리를 입력받습니다.
         2. 주민등록번호는 -을 포함해서 받을 예정입니다.
         3. 13자리가 아니라면 다시 입력받습니다.
         4. ex)
         921013-1234567 -> 1992년 10월 13일 32세 남자
         960223-1234567 -> 1992년 2월 23일 28세 남자
         031125-3456789 -> 2003년 11월 25일 21세 남자
         031125-3456789 -> 2003년 11월 25일 21세 여자

         제대로 출력이 될 때까지 다시 입력을 받으세요.
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("주민등록번호를 '-'를 포함하여 입력해주세요");
        System.out.print(">> ");
        String personNumber = sc.next();

        String[] split = personNumber.split("-");
        // System.out.println(Arrays.toString(split));

        // 년도
        String year = split[0].substring(0, 2);
        System.out.println(year);
        
        // 월
        String month = split[0].substring(2, 4);
        System.out.println(month);

        // 일
        String day = split[0].substring(4, 6);
        System.out.println(day);

        // 년도를 정수로 변환
        int year1 = Integer.parseInt(year);



        String gender;
        switch (split[1].indexOf(0)) {

            case 1: case 3:
                gender = "남자";

            case 2: case 4:
                gender = "여자";

        }

        // Integer.parseInt(): 문자를 정수로
      if(split[1].indexOf(0) == 1 || split[1].indexOf(0) == 2) {

      }



        System.out.println();








    }
}
