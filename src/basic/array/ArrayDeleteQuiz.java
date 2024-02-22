package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] kakao = {"무지", "네오", "어피치", "라이언", "춘식이"};
        System.out.println("현재 저장된 친구들: " + Arrays.toString(kakao));

        /*
         1. 삭제할 친구를 입력받아서 삭제를 진행해 주세요.
         2. 입력받은 이름이 없다면 없다고 얘기해 주세요.

         - 추가
         배열의 길이가 0이 될 때까지 삭제를 반복해 보세요.
         더 이상 지울 친구가 없다면 프로그램 종료.
         */

        while(true) {

            if (kakao.length == 0) {
                System.out.println("삭제 모두완료!");
                break;
            }

            System.out.println("삭제할 친구를 입력해주세요");
            System.out.print("> ");
            String name = sc.next();




            //인덱스 탐색
            int index = -1;    //인덱스가 -1이면 못찾은것으로 인식하게

            for (int i = 0; i < kakao.length ; i++) {
                if(name.equals(kakao[i])) {
                    index = i;
                    break;
                }
            }

            if( index != -1) {
                System.out.println(kakao[index] + "의 이름을 삭제합니다.");

                for (int i = index; i < kakao.length - 1; i++) {
                    kakao[i] = kakao[i + 1];
                }

                String[] newKakao = new String[kakao.length - 1];

                for (int j = 0; j < newKakao.length; j++) {
                    newKakao[j] = kakao[j];
                }


                kakao = newKakao;
                newKakao = null;

                System.out.print("삭제 후 정보: ");
                System.out.println(Arrays.toString(kakao));


            }
             else {
                System.out.printf("%s는(은) 없는 친구입니다.", name);
            }



        }
            sc.close();


    }
}
