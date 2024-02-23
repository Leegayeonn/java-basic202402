package oop.constructor;

public class Bread {

    String breadName;
    int price;
    String ingredient;
    
    // 기본 생성자를 자동으로 만들어 주는 것은 생성자가 하나도 선언되어있지 않을 때만 자동생성
    // 매개값을 아무것도 받지 않는 기본 생성자는 클래스내에 존재하는 편이 좋습니다.
    // 매개값을 받는 여러 생성자를 이용할 수도 있지만, 기본형태로 생성되어야 할 일도 있기때문입니다.
    Bread() {}  // 기본 생성자!!!!!!!!! 셋팅 필요~


    Bread(String bName , int bPrice, String bIng) {
        breadName = bName;
        price = bPrice;
        ingredient = bIng;
    }

    void showCase() {
        System.out.println("이름: " + breadName);
        System.out.println("가격: " + price + "원");
        System.out.println("주재료: " + ingredient);
    }

}
