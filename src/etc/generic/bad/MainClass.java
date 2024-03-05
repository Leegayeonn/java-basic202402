package etc.generic.bad;

public class MainClass {

    public static void main(String[] args) {

        /*
         Object 타입으로 선언하면 무엇이든 저장할 수는 있지만
         반대로 저장했던 값을 꺼내올 때는 타입별로 일일히 형변환을 해야하는
         문제가 발생합니다.
         잘못 형 변환 했을 시에는 예외가 발생할 수도 있습니다.
         */

        Box box = new Box();
        box.setObj(new String("유사뱀")); // 매개변수 타입 Object 이기 때문에 어떠한 객체든 전달가능

        System.out.println(((String)box.getObj()).charAt(0));

        Box p = new Box();
        p.setObj(new Person()); //Person 도 Object 의 자식 -> 전달 가능.
        ((Person)p.getObj()).getName();

    }

}
