package oop.this_super;



public class Warrior extends Player {

    int rage;

    public Warrior(String name) {
        // 모든 생성자에는 super()가 컴파일 과정에서 항상 내장되어 있습니다.
        // 자식 객체가 생성될 때는 부모의 객체도 생성이 되어야
        // 부모의 속성과 기능이 실존하게 되고, 물려줄 수 있기 때문입니다.
        super(name); // 항상 super();가 포함되어있다.
        // this.name = name;
        this.rage = 60;
    }

    // 단축키!! 알트+인서트-> 매서드 재정의


    void characterInfo(){
        super.characterInfo();
        System.out.println("# 분노: " + rage);

    }


}
