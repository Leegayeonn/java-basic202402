package basic.Operator;

public class ConditionalOperator {

    public static void main(String[] args) {

/*
         # 3항 연산자
         - 피 연산자(연산을 당하는 값)가 3개인 연산자를 말합니다.
         - (조건식 ? 좌항 : 우항);
         - 조건식을 비교하여 true일 경우에는 좌항이,
          false일 경우에는 우항의 값이 도출됩니다.
         */

        int x = 10, y = 20;

        String result = x > y ? "x는 y보다 큽니다" : "x는 y보다 작습니다";
        System.out.println("result = " + result);


        /////////////////////////////////////////////

        // 난수를 발생시키는 매서드 Math.random();
        // 0.0 이상 1.0 미만의 실수 난수값을 반환합니다.

        // 1~ 10까지의 정수 난수를 발생.
        // Math.floor(Math.random()*10) + 1;

        // 자바는 형변환을 통해서 정수로 바꾸기
        int random = (int) (Math.random()*10 + 1);
        System.out.println("random = " + random);
        
        double random1 = (int) (Math.random()*10 + 1);
        System.out.println("random1 = " + random1);

        //////////////////////////////////////////////

        // 10~100까지의 정수 난수를 발생
        int random3 = (int) (Math.random()*91 + 10);
        System.out.println("random3 = " + random3);





    }
}
