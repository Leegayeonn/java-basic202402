package etc.api.collection.list;

import util.Utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListQuiz02 {

    public static void main(String[] args) {

/*
         1. User 클래스를 은닉(캡슐화)된 변수 name, age 로 선언해서 구현
          User 클래스의 생성자는 모든 필드값을 받는 생성자 1개.

         2. User 객체를 모음저장할 수 있는 ArrayList 를 선언. (main method)
         3. User 객체를 3개 생성해서 리스트에 추가하세요. (main method)

         4. 리스트에 저장된 모든 이름, 나이를 for 문으로 출력 (향상 for 문)
         5. 리스트 내부 객체 중 이름이 "홍길동" 이 있다면
               그 객체를 삭제해 주세요. (일반 for 문)
         */
        List<User> ArrayList = new ArrayList<>();

//        User user = new User("홍길동", 30);
//        User user2 = new User("유사범", 28);
//        User user3 = new User("이가연", 29);

//        ArrayList.add(user);
//        ArrayList.add(user2);
//        ArrayList.add(user3);
        //Collections.addAll(ArrayList, user, user2, user3);

        Collections.addAll(ArrayList,
                new User("홍길동", 30),
                new User("유사범", 28),
                new User("이가연", 29)
        );

        System.out.println(ArrayList);


        for (User username : ArrayList) {
            System.out.println(username);  // toString() 메서드재정의
        }

        Utility.makeLine();

      // 향상 for 문은 List 크기를 변화시킬 수 없음
/*
         - forEach(향상 for 문)을 사용하여 반복문을 순회할 때
          리스트의 크기를 마음대로 줄이거나 늘릴 수 없습니다.
         - 향상 for 문은 반복문을 시작할 때 구조적으로 컬렉션의
          크기 및 사용 가능한 요소들의 개수를 항상 파악하고 있기 때문에
          값의 변경이 일어나면 예외를 발생시키도록 설계되어 있습니다.

        for (User user : ArrayList) {
            if(user.getName().equals("홍길동")){
                ArrayList.remove(user);
                break; //향상for문에서는 break 꼭 불러야함
            }
        }
 */
        for (int i = 0; i < ArrayList.size(); i++) {
            /*
            User user = ArrayList.get(i);
            String name = user.getName();
            if (name.equals("홍길동")) {
                ArrayList.remove(i);
            */
            if(ArrayList.get(i).getName().equals("홍길동")){
                ArrayList.remove(i);
            }
        }
        System.out.println(ArrayList);




    }
}
