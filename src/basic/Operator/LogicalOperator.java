package basic.Operator;

public class LogicalOperator {

    public static void main(String[] args) {

        // 비교 연산자 (<, <=, > ,>=,==,!=)
        // 좌항과 우항의 크기를 비교하여, 결과값으로
        // 항상 논리형 타입의 값을 도출합니다.

        int x = 10, y = 20;
        System.out.println(x != y);  //true
        System.out.println(x == y);  //false

        /*
         # 논리 연산자 (&, &&, |, ||)
         - 좌항과 우항의 논리값을 연산하여 하나의 논리값을 도출합니다.
         1. &, &&: 양쪽 항의 논리값이 모두 true일 경우에만 true가 도출됩니다.
         2. |, ||: 양쪽 항의 논리값 중 한 쪽만 true여도 true를 도출합니다.

         &&, || -> 단축 평가 연산 (short circuit operation)
         - 좌항의 연산 결과가 전체 연산 결과에 영향을 미칠 경우
          우항의 연산을 진행하지 않습니다.
         */

        // 우항에 무조건 에러가 발생하는 식을 작성함 -> 좌항에서 결과가 나오면 우항을 실행하지않음.
        System.out.println(x > 10 && (y / 0 == 10));
        // & 하나만 작성하면 우항도 연산이 됨, && 두개작성하면 좌항이 연산결과에 영향을 미치면 우항연산 안됨.
        System.out.println(x >= 10 || (y / 0 == 10));

        // 논리 반전 연산자 (!: 단항)
        // 단순히 논리값을 반전시킬 때 사용합니다.
        // true -> false, false -> true

        boolean flag = false;
        if(!flag){
            System.out.println("if문 실행!");
        }
    }









}
