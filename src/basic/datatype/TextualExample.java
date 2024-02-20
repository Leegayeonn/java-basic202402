package datatype;

public class TextualExample {

    public static void main(String[] args) {


        //char : 문자형

        char c1 = 'A';  //문자 한개만 , 쌍따옴표 안됨(String으로 인식함)
        System.out.println("c1 = " + c1); //A
        
        char c2 = 65;  //문자표 대로 출력
        System.out.println("c2 = " + c2);  //A

        /*
         # 문자열을 저장할 수 있는 데이터 타입 String
         - 저장하고 싶은 문자열을 겹따옴표("")에 담아 대입합니다.
         - String은 기본 데이터 타입은 아니지만 자주 쓰이기 때문에
         기본 데이터 타입처럼 사용합니다. (사실은 객체 타입)
         */ //스트링이 기본타입이 아닌이유 (객체이지 기본타입이아님, 사용은 기본타입과다르지않음

        String s1 = "my dream "; //문자열 (한글자는 '',여러글자는 ""(거의 쌍타옴표많이씀))
        String s2 = "is a programmer";

        //문자열의 덧셈 연산 -> 문자열을 단순히 연결해서 결합한 결과.
        System.out.println(s1 + s2);

        // 문자열과 다른 데이터 타입 간의 연산 -> 무조건 문자열 덧셈 연산의 결과와 같다.
        int month = 8;
        int day = 19;

        System.out.println("내생일은 " + month + "월 "+ day + "일 입니다!");

    }
}
