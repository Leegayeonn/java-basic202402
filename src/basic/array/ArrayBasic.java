package basic.array;

import java.util.Arrays;

public class ArrayBasic {

    public static void main(String[] args) {

        // #배열(array)
        // -> 같은 데이터 타입의 값을 집합 형태로 나열하기 위한 자료형

        // 1. 배열 변수를 선언
        int[] arr;   // 이 방식으로 주로 선언, 데이터 타입처럼 써주면 된다.
        int arr2[]; // 허용하지만 c언어 style

        // 2. 배열 객체를 생성 - 실제 값들이 저장될 공간
        // 생성할 때 배열의 크기를 지정해야 한다.
        arr = new int[5];  // arr 에는 주소가 저장되어있음

        // 3. 배열의 초기화 - 배열 내부에 실제 값들을 저장
        // 배열의 초기화는 인덱스를 이용합니다.
        // 인덱스: 배열 내부의 위치를 지정할 수 있는 값
        // 인덱스는 0번부터 시작하여 1씩 순차적을 증가합니다.

//        arr = 65;
        arr[0] = 65;
        arr[1] = 88;
        arr[2] = arr[0];  // 배열자체를 가지고 값 저장가능
        arr[3] = (int) 3.14;
//        arr[4] = "들어갈까요?"; (x) 문자형은 불가능 데이터 타입이 int 이기 때문
        arr[4] = 100;
//        arr[5] = 200; (x) index 범위를 초과 (위에 배열크기를 5로 지정했기때문에)

        // 4. 배열의 총 크기(길이) 확인 - 배열변수명.length
        System.out.println("arr 배열의 길이: " + arr.length);

        // 5. 배열에 저장된 값을 참조(사용)하는법 -> 인덱스를 활용
        System.out.println("배열의 1번째 데이터: " + arr[0]);
        System.out.println("배열의 2번째 데이터: " + arr[1]);
        System.out.println("배열의 3번째 데이터: " + arr[2]);
        System.out.println("배열의 4번째 데이터: " + arr[3]);
        System.out.println("배열의 5번째 데이터: " + arr[4]);

        System.out.println("----------------------------------------");

        // 6. 배열의 반복문 처리
        // 배열은 인덱스를 제어변수로 활용하여 쉽게 반복문 처리가 가능하다.
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("배열의 %d번째 데이터: %d\n",i+1, arr[i]);

            /*
            배열의 1번째 데이터: 65
            배열의 2번째 데이터: 88
            배열의 3번째 데이터: 65
            배열의 4번째 데이터: 3
            배열의 5번째 데이터: 100
            */
        }

        // 7. 배열 내부의 요소값을 문자열 형태로 한눈에 확인하기
        // 배열 변수에는 배열의 주소가 들어있으므로 아래클래스와매서드이용해서 배열확인가능
        // Arrays 클래스,toSting() 매서드
        // Arrays.toString(변수명)
        System.out.println("arr = " + Arrays.toString(arr)); //arr = [65, 88, 65, 3, 100]


        // 8. 배열은 선언과 생성이 동시에 가능
        double[] dArr = new double[3];
        String[] sArr = new String[4];
        byte[] bArr = new byte[10];

        // 배열은 생성됨과 동시에 각 타입의 기본값으로 자동 초기화 됩니다.
        System.out.println(Arrays.toString(dArr)); // [0.0, 0.0, 0.0]
        System.out.println(Arrays.toString(sArr)); // [null, null, null, null]
        System.out.println(Arrays.toString(bArr)); // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]


        // 9. 배열의 생성과 동시에 초기화도 하는 방법
        // char[] 이름 = new char[] {배열};
        char[] letters = new char[] {'A', 'B', 'C', 'D'};
        System.out.println(Arrays.toString(letters));

        // 선언과 동시에 초기화를 할 때 딱 한번만 가능한 문법
        // 자바의 배열은 크기가 고정이기 때문에 늘어나거나 줄어들 수 없습니다.
        // 만약 배열의 크기를 늘리거나 줄이고 싶다면 새롭게 만들어야합니다
        // 이름 = new String[] {배열 추가/ 삭제};

        String[] names = {"홍길동", "김철수", "박영희"};
        System.out.println("names: " + Arrays.toString(names));
//        names = {"홍길동", "김철수", "박영희", "김뽀삐"}; (x)
//        -> 배열의 크기가 위에서 고정되었기때문에 추가,삭제가 불가능
        names = new String[] {"홍길동", "김철수", "박영희", "김뽀삐"};






    }
}
