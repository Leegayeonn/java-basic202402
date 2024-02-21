package basic.constate;

import java.util.Scanner;

public class IfQuiz {

    public static void main(String[] args) {
        /*
        - 정수 3개를 입력 받습니다.
        - 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해 보세요.

        # max, mid, min이라는 변수를 미리 선언하셔서
         판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
         마지막에 한번에 출력하시면 되겠습니다.
        */

        Scanner n1 = new Scanner(System.in);

        System.out.print("첫번째 정수를 입력해주세요: ");
        int num1 = n1.nextInt();
        System.out.print("두번째 정수를 입력해주세요: ");
        int num2 = n1.nextInt();
        System.out.print("세번째 정수를 입력해주세요: ");
        int num3 = n1.nextInt();



        int max;
        int mid;
        int min;

        if(num1 > num2 && num1 > num3) {
            max = num1;
            if(num2 > num3) {
                mid = num2;
                min = num3;
            }else {
                mid = num3; min = num2;
            }
        } else if (num2 > num1 && num2 > num3){
            max = num2;
            if(num1 > num3) {
                mid = num1;
                min = num3;
            } else {
                mid = num3;
                min = num1;
            }
        }else {
            max = num3;
            if(num1 > num2) {
                mid = num1;
                min = num2;
            } else {
                mid = num2;
                min = num1;
            }
        }

        System.out.println("max = " + max);
        System.out.println("mid = " + mid);
        System.out.println("min = " + min);

        n1.close();




    }
}