package oop.static_.init;

public class DBManager {


    //어디서든 참조할수있도록 static 으로 선언
    // static 멤버!
    public static String addr;  //주소
    public static String uid;  //아이디
    public static String upw;  //비번
    
    // 정적 변수를 자동으로 초기화하려면 정적 초기화자가 필요합니다.(static initializer)
    static {
        System.out.println("정적초기화자가 호출됨!");
        addr = "192.168.0.2:8181/XEPDB1";
        uid = "abc1234";
        upw = "aaa1111!";
    }

    public DBManager() {
        System.out.println("생성자가 호출됨!");
        addr = "192.168.0.2:8181/XEPDB1";
        uid = "abc1234";
        upw = "aaa1111!";
    }


}
