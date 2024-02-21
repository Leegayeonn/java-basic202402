package basic.constate;

import java.util.Scanner;

public class SwitchExample1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("성별을 입력하세요(M/F): ");
        String gender = sc.next();
        //String gender = sc.next().toUpperCase();  //대문자로 변환하기위한 매서드 추가

        switch (gender) {     //괄호안에는 기준(사용자의 입력)

            /*
         switch 괄호 안에 지정하신 기준값에 따라
         만족하는 case문을 순서대로 탐색합니다.
         적합한 case가 존재하는 경우에는 해당 case에
         종속된 문장을 실행합니다.
         따로 조치가 없다면 나머지 케이스들이 연속적으로 실행됩니다.
         */

            case "m":   //break 없기때문에 아래로 흘러내려가서 다음 케이스가 실행되는 스위치문의 성질이용(가로로 작성해도됨)
            case "M":
                System.out.println("남성입니다!");
                break; //해당 케이스만 실행하고 Switch문을 종료

            case "f": case "F": case "ㄹ":  // 가로로 작성을 많이함!
                System.out.println("여성입니다!");
                break;

            default:  // case를 설정하지 않은 값들은 모두 defalut로 빠집니다.
                System.out.println("잘못된 입력입니다.");
                // break; 코드종료되기때문에 break 사용필요없음

        }

        sc.close();



    }
}
