package video.user.service;

import video.common.AppService;
import video.ui.AppUi;
import video.user.domain.Grade;
import video.user.domain.User;
import video.user.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

import static video.ui.AppUi.*;

public class UserService implements AppService {
    private final UserRepository userRepository = new UserRepository(); // 유저레파지토리 객체생성

    @Override
    public void start() {

        while (true) {
            userManagementScreen();
            int selection = inputInteger(">>> ");

            switch (selection) {
                case 1:  // 신규회원추가
                    join();
                    break;
                case 2: // 회원검색
                    showSearchUser();
                    break;
                case 3: // 회원탈퇴
                    deleteUser();

                    break;
                case 4: // 첫화면으로 돌아가기
                    return; // start() 메서드를 강제종료해서 초기 화면으로 돌아갈 수 있도록 처리.
                default:
                    System.out.println("# 메뉴를 다시 입력하세요!");
            }
        }
    }

    // 1번 : 회원 추가 비즈니스 로직
    // 비즈니스 로직: 요청에 따른 데이터의 생성, 조희, 저장, 변경 등의 로직
    private void join() {

        System.out.println("\n====== 회원 가입을 진행합니다. ======");
        String name = inputString("# 회원명: ");
        String phone = inputString("# 전화번호: ");


        // 저장할 객체생성을 위해 domain 패키지에 User 생성해줌
        // ->
        // 입력받은 값을 토대로 User 객체 생성 (등급은 BRONZE 로)
        User newUser = new User(name, phone, Grade.BRONZE);

        // UserRepository 의 addUser() 메서드 부르기! (맨위에 객체생성 해놓았음)
        userRepository.addUser(newUser); // static 하게 운영되는 Map 객체
        System.out.printf("\n### [%s]님의 회원 가입이 완료되었습니다.\n", name);

    }
    // 2번 : 회원 검색 로직 (기능을 분리하여 작성)
    // 2-1) 이름을 입력받아 해당 이름이 포함된 객체리스트를 리턴하는 기능
    private List<User> searchUser() {
        System.out.println("\n### 조회할 회원의 이름을 입력하세요.");
        String name = inputString(">>> ");
        return userRepository.findUserByName(name);
    }

    // 2-2) 단순 조회 결과 출력
    private void showSearchUser() {
        List<User> users = searchUser();
        
        if (users.size() > 0) {
            System.out.println("\n===================================== 회원 조회 결과 =====================================");
            for (User user : users) {
                System.out.println(user);
            }
        } else {
            System.out.println("\n### 조회 결과가 없습니다.");
        }
    }

    // 3번 : 회원 탈퇴 비즈니스 로직
    private void deleteUser() {
        List<User> users = searchUser();

        if(users.size() > 0) { // 1. 조회결과를 일단 보여주고

            // 3. 삭제대상 회원번호 리스트 생성 -> 탈퇴할 회원번호를 입력할 때 삭제 대상 번호를 입력했는지 확인용
            List<Integer> userNums = new ArrayList<>();

            for (User user : users) {
                System.out.println(user);
                userNums.add(user.getUserNumber()); // 객체가 전달될때 마다 위 리스트에 번호를 추가해놓음
            }

            System.out.println("\n### 탈퇴할 회원의 번호를 입력하세요."); //2. 그다음 번호를 입력받기
            int delUserNum = inputInteger(">>> ");

            if (userNums.contains(delUserNum)) {
                User delUser = userRepository.deleteUser(delUserNum); // 삭제될유저
                System.out.printf("\n### %s[%s] 님의 회원정보가 정상 삭제되었습니다.\n",
                                        delUser.getUserName(), delUser.getPhoneNumber());  // 유저레포지토리에서 리턴값 받음.
            } else {
                System.out.println("\n### 검색한 회원의 회원번호로만 삭제 가능합니다.");
            }

        } else {
            System.out.println("\n### 조회 결과가 없습니다.");
        }

    }
}
