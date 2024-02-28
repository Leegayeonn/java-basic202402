package oop.poly.player;



public class Player {


    String name;
    int level;
    int atk;
    int hp;

    Player() {
        this.level = 1;
        this.atk = 3;
        this.hp = 50;

    }

    public Player(String name) {
        this();
        this.name = name;
    }
    
    Player(String name, int hp) {
        this(name); // 2번생성자 호출(다른생성자의 호출은 생성자 내에서 최상단에 위치해야합니다.

        // this.name = name;  // 지워도됨 위에 2번생성자 호출함
        this.hp = hp;
    }

    void attack(Player target){  //Player 객체를 보내주세요!
//        System.out.println("때리는 애 = " + this.name);
//        System.out.println("맞는 애 = " + target.name);

        if(this == target) { // this랑 target 주소값이 같니?
            System.out.println("스스로는 때릴 수 없습니다.");
            return;
        }

        // 출력메세지: x가 y를 공격합니다.
        System.out.printf("%s(이)가 %s(을)를 공격합니다. \n", this.name, target.name);

        // 맞는 사람의 hp를 10 낮추고, 나의 체력을 5 회복하고싶다.
        // 결과를 출력하자. (나의 체력은: XX, 상대의 체력: XX)
        target.hp -= 10;
        this.hp += 5;
        System.out.printf("나의 체력은 : %d, 상대의 체력은: %d\n", this.hp, target.hp);





    }


    void characterInfo() {
        System.out.println("*** 캐릭터의 정보 ***");
        System.out.println("# 아이디: " + name);
        System.out.println("# 레벨: "+ level);
        System.out.println("# 공격력: "+ atk);
        System.out.println("# 체력: "+ hp);
        System.out.println("지금 이 메서드를 부른 객체의 아이디: " + this.name);
    }

}