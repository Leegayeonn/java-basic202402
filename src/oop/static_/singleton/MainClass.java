package oop.static_.singleton;

public class MainClass {

    public static void main(String[] args) {

        for (int i = 0; i < 10000 ; i++) {
        //Singleton s = new Singleton();  // 객체를 무분별하게 많이 만들면 데이터 효율성이 떨어지므로 앞에서 미리 객체를 생성하여 사용


            Singleton s = Singleton.getInstance();  // 객체 생성 메서드(딱 하나만 만들기위함)
            // Singleton s = Singleton.s; // s 객체를 직접 사용하면 안됨, 객체생성시 private 하게 바꾸어주면됨
            s.method1();
            s.method2();
            System.out.println("s = " + s);


        }


    }
}
