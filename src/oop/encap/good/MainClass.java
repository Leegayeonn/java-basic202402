package oop.encap.good;

public class MainClass {

    public static void main(String[] args) {

        MyBirth my = new MyBirth();
//        my.year = 1996; (x)
        my.setYear(1996);
        my.setMonth(11);
        my.setDay(30);

        my.birthInfo();
        //System.out.printf("내 생일은  %d년 %d월 %d일 입니다.\n", my.getYear("aaa1111!"),my.getMonth(),my.getDay());
        // 같은 클래스가 아니라면 getter를 불러야한다.


    }
}
