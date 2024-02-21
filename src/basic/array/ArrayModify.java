package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModify {

    public static void main(String[] args) {


        // 배열의 수정
        String[] foods = {"삼겹살", "족발","피자", "햄버거"};
        System.out.println(Arrays.toString(foods));

        foods[0] = "치킨";
        foods[2] = "탕수육";

        System.out.println(Arrays.toString(foods));


        System.out.println("--------------------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 음식을 입력하세요: ");
        String name = sc.next();


        // 배열 값 찾기

        /* 첫번째 방법
           boolean 타입의 변수를 선언하여 존재 유무를 확인해 준다.
           찾았으면 true로, 반복문 다 돌릴 때 까지 못찾았으면 false로.
         반복문이 끝나고 나서 확인해 주자.
         */

        boolean flag = false;
        for(int i=0; i<foods.length; i++) {
            if(name.equals(foods[i])) {
                System.out.println("탐색 완료!");
                System.out.println("인덱스: " + i + "번");
                flag = true;
                break;
            }
        }

        if(!flag) { //flag == false
            System.out.println("없는 음식입니다.");
        }


        /* 두번째 방법.
         탐색하지 못한다면 반복문이 끝까지 돌아가면서 i의 값이 배열의 길이와 같아지며
        반복문의 조건식을 false로 만들면서 탈출하는 것을 이용.
         i가 배열의 길이와 같아졌다면 탐색하지 못했다는 증거.
         */

        int i;
        for(i = 0; i < foods.length; i++) {
            if(name.equals(foods[i])) {
                System.out.println("탐색 완료!");
                System.out.println("인덱스: " + i + "번");
                break;
            }
        }

        if(i == foods.length) {
            System.out.println("없는 음식입니다.");
        }


        // 3번째 방법


//        for(int i = 0; i < foods.length; i++) {
//            if(name.equals(foods[i])) {
//                System.out.println("탐색 완료!");
//                System.out.println("인덱스: " + i + "번");
//                break;
//            } else if(i == foods.length-1) {
//                System.out.println("없는 음식입니다.");
//            }
//        }










    }
}
