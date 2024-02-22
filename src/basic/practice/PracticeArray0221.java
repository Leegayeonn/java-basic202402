package basic.practice;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeArray0221 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] kakao = {"무지", "네오", "어피치", "라이언", "춘식이"};
        System.out.println("현재 저장된 친구들: " + Arrays.toString(kakao));

        // 1. 수정 타겟의 이름을 입력받는다.
        // 2. 해당 이름이 있는지 탐색해본다.
        // 3. 탐색에 성공하면 해당 이름의 인덱스를 알아온다.
        // 4. 탐색에 실패하면 실패한 증거를 확보한다.
        // 5. 성공했을 시 수정을 원하는 새로운 이름을 입력받는다.
        // 6. 찾은 인덱스를 통해 새로운 이름으로 수정한다.
        // 7. 위 내용을 수정이 정확히 완료될때까지 반복한다.

        System.out.println("수정할 친구를 입력해주세요");
        System.out.println("수정을 중단하고 싶으면 '중단' 이라고 입력해주세요");
        System.out.print("> ");
        String name = sc.next();

        boolean flag = false;
        for (int i = 0; i < kakao.length ; i++) {
            if(name.equals(kakao[i])) {
                System.out.println("탐색 성공! ");
                System.out.println("인덱스 번호: " + i );
                flag = true;

                System.out.println("수정할 친구의 이름을 입력해주세요");
                System.out.print("> ");
                String newName = sc.next();
                kakao[i] = newName;

            }
            if(name.equals("중단")){
                System.out.println("수정이 중단 되었습니다.");
                break;
            }

        }

        if(!flag){
            System.out.println(name + "이라는 친구는 없습니다.");
        }

        System.out.println("수정된 친구들: " + Arrays.toString(kakao));


        sc.close();

    }
}
