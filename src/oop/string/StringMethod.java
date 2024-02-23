package oop.string;

import java.util.Arrays;

public class StringMethod {

    public static void main(String[] args) {

        String str = "Hello Java";

        // charAt(index): 문자열 인덱스에 따른 단일 문자를 반환.
        // index 는 공백도 포함
        char c = str.charAt(6);  
        System.out.println("6번 인덱스 = " + c);

        // subString(begin, end): 문자열을 범위를 지정해서 부분 추출.(end는 미만이라 미포함)
        String substring = str.substring(1, 5);  // 1부터 4까지 추출
        System.out.println("1부터 5미만까지 추출 = " + substring); // 1부터 5미만까지 추출 = ello

        String substring1 = str.substring(6);// 6번부터 끝까지 추출
        System.out.println("6번부터 끝까지 추출 = " + substring1);
        
        //length(): 문자열의 총길이 반환 (공백까지 포함)
        int length = str.length();
        System.out.println("str 문자열의 총 길이 = " + length);

        //indexOf(문자열: str): 해당 문자가 있는 인덱스를 반환
        //lastIndexOf()
        // 해당 문자가 존재하지 않는다면 -1을 리턴
        //먼저 발견된것만 리턴해준다.
        int idx1 = str.indexOf("l");  // 앞에서 부터 탐색
        System.out.println("idx1 = " + idx1);  //idx1 = 2

        int idx2 = str.lastIndexOf("l");  // 뒤에서 부터 탐색
        System.out.println("idx2 = " + idx2); //idx2 = 3

        //여러문자를 전달하면 시작 인덱스를 알려줍니다.
        int idx3 = str.indexOf("Java"); //Java가 시작하는 인덱스 지점
        System.out.println("idx3 = " + idx3); //idx3 = 6


        // toLowerCase(): 일괄 소문자 변경
        // toUpperCase(): 일괄 대문자 변경
        String str2 = "HeLLo WoRLd";
        String lowerCase = str.toLowerCase(); //일괄 소문자
        System.out.println("lowerCase = " + lowerCase);
        String upperCase = str.toUpperCase(); //일괄 대문자
        System.out.println("upperCase = " + upperCase);

        // trim(): 문자열의 앞, 뒤 공백을 제거
        String name = "            홍길동    ";
        String trim = name.trim();
        System.out.println(name.trim() + "님 어디가세요~?");
        System.out.println("안녕하세요 " + trim+ "님~");

        // replace(old, new): 기존 문자열 내부의 old값을 모두 찾아서 new 문자열로 일괄변경.
        String java = "자바는 재밌습니다. 자바 커피도 맛있습니다.";
        System.out.println(java.replace("자바", "java"));
        System.out.println(java.replace("습니","")); // 삭제하는 용도로도 가능

        // split(구분자): 문자열을 구분자로 구분하여 분할.
        // 분할된 문자들은 String 배열에 담겨서 리턴.
        String phone = "010-1234-5678";
        String[] split = phone.split("-"); //배열로!
        System.out.println(Arrays.toString(split)); // [010, 1234, 5678]: 문자 (정수처럼 생긴문자임!, 헷갈릴수있음)

        String pet = "멍멍이, 야옹이, 찍찍이";
        String[] split1 = pet.split(", "); //기준이 되는 구분자를 잘 선택하기,공백있으면 공백까지
        System.out.println(Arrays.toString(split1));

        System.out.println("-------------------------------------------");

        // 문자열의 정수/실수 변환
        String s1 = "100"; //생긴건 정수지만 문자임
        String s2 = "3.14";
        System.out.println(s1 + s2); //문자열끼리 합해진값이 출력 (연산x)

        // 순수한 정수 or 실수로 이루어져 있어야 변환이 가능!

        // Integer.parseInt(): 문자를 정수로
        int i = Integer.parseInt(s1); // 정수전용~
        // Double.parseDouble(): 문자를 실수로
        double d = Double.parseDouble(s2); //실수전용
        System.out.println(i + d);

        // String.valueOf: 기본타입을 문자열로 변경
        System.out.println(String.valueOf(i) + String.valueOf(d));




    }
}
