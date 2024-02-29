package etc.exception.throws_;

public class ThrowsExample {

    static  String[] greeting = {"안녕","헬로","니하오"};


        /*
     # throws

     - throws는 예외의 원인이 메서드 선언부가 아닌 호출부에 있을 경우
      예외 처리를 메서드의 호출부로 떠넘기는 방식입니다.

     - throws는 생성자에서도 선언이 가능하며, 메서드나 생성자를 호출 시
      예외 처리를 강요하고 싶을 때 사용합니다.

     - 또한, 원하는 영역으로 예외를 모아서 한번에 처리하는 것도 가능합니다.
     */

    static void greet(int idx) throws Exception{  //부모예외타입(어떤예외든지!)
        System.out.println(greeting[idx]);
    }
    public static void main(String[] args) {


        try {
            greet(5);
        } catch (Exception e) {
            System.out.println("배열의 참조 범위를 벗어남");

            //printStackTrace() 메서드
            // 예외 발생 원인을 역추적하여 예외가 어디에서 발생했는지, 그 이유가 무엇인지를
            // 메세지를 통해 개발자에게 전달하므로 자주 사용하는 메서드입니다.
            e.printStackTrace();  //예외처리된 후 에러메세지 확인가능!(문제발생지점을 알고싶을때!)

            //getMessage() 메서드
            //간략하게 예외발생이유 전달해준다!
            System.out.println("예외 발생원인: " + e.getMessage());
        }

        System.out.println("프로그램 정상 종료!");


    }
}
