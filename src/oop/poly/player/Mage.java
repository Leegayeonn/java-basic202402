package oop.poly.player;

import java.lang.annotation.Target;

public class Mage extends Player {

    int mana;

    Mage(String name) {
        super(name);
        this.mana = 100;
    }

    public void blizzard(Player[] target) {
        System.out.println(this.name + "님이 눈보라 시전!!");
        this.mana -= 30;
        System.out.print( "30마나가 소모됩니다.");
        System.out.println("남은 정신력: " + this.mana);

        System.out.println("----------------------------------------");
        for (Player player : target) {
            if(player == this) continue;
            int random = (int) (Math.random() * 6 + 10);
            player.hp -= random;
            System.out.println(player.name + "님이 " + random + "의 피해를 입었습니다. (남은체력: " + player.hp + ")");
        }
    }


    @Override
    void characterInfo(){
        super.characterInfo();
        System.out.println("# 마나: " + mana);
    }


}
