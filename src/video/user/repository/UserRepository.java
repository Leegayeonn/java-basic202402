package video.user.repository;

import video.movie.domain.Movie;
import video.order.domain.Order;
import video.user.domain.Grade;
import video.user.domain.User;

import java.security.Key;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {
    // 맵으로 관리!

    // static 전역 모두가 공유할수있도록
    //final (혹시모를 값변경을 막기위해) 해쉬맵의 주소가 변경되면 안되기 때문에 상수로 선언 해줌( 여기선 굳이 필요없긴함: private 하기때문)
    private static final Map<Integer, User> userDatabase = new HashMap<>();

    static {
        User test1 = new User("김테스트", "010-1234-5678", Grade.BRONZE);
        User test2 = new User("유사버미", "010-8126-0802", Grade.BRONZE);
        userDatabase.put(test1.getUserNumber(), test1);

        Movie testMovie = new Movie("테스트무비", "테스트국가", 2024);

        Order testOrder = new Order(test1, testMovie);
        testOrder.setOrderDate(LocalDate.of(2024, 3, 1));
        testOrder.setReturnDate(LocalDate.of(2024, 3, 4));
        test1.addOder(testOrder);

    }


    // 회원 추가 기능
    public void addUser(User user) {
        userDatabase.put(user.getUserNumber(),user); // (유저객체에 회원고유번호 , 유저객체)
    }

    // 회원 검색 기능(이름을 통해 회원 검색)
    // 동명이인이 있다면 모두 리턴하기 위해 List 리턴타입 설정
    public List<User> findUserByName(String userName) {
        List<User> userList = new ArrayList<>();

        // Map 을 반복 처리하기위해 key 들을 Set 으로 반환.
        for (int key : userDatabase.keySet()) {
            User user = userDatabase.get(key); // key 값을 통해 User 객체를 얻기.
            if (user.getUserName().equals(userName)) { // User 객체의 name 이 매개값으로 받은 name 과 같다면
                userList.add(user); // 리스트에 객체를 추가
            }
        }


        return userList;
    }

    // 회원 삭제 기능
    public User deleteUser(int delUserNum) {  // key 값
        return userDatabase.remove(delUserNum);  // 사용자 정보를 출력해 주려고 리턴값주기!(보이드메서드를 User로 변경)
    }

    // 회원 번호 찾기
    public User findUserByNumber(int userNumber) {
        return userDatabase.get(userNumber);
    }
}
