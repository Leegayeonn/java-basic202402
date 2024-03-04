package etc.api.util.arrays;

import java.util.Arrays;

public class ArraysExample {

    public static void main(String[] args) {

        char[] arr = {'J','A','V','A'};
        // 배열의 복사
        // 1. Arrays.copyOf(복사할배열,처음부터 복사할배열개수)
        char[] arr2 = Arrays.copyOf(arr, arr.length);
        // 2. Arrays.copyOfRange(복사할배열,begin, end) begin 부터 end 미만, 인덱스로 범위지정
        char[] arr3 = Arrays.copyOfRange(arr, 1,3);


        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));


        // 배열의 탐색: binarySearch (배열, 검색할 값) -> 인덱스 값으로 출력됨
        // 반드시 정렬이 선행되어야 합니다.
        // 존재하지 않는 값이라면 음수로 표현되는데, 해당값이 존재해야 할 위치를 알려줌.
        int[] numbers = {1, 3, 5, 7, 9, 11, 13};
        System.out.println("4의 위치: " + Arrays.binarySearch(numbers, 4));  // -3

        // 배열의 정렬
        int[] nums = {42, 11, 35, 88, 34, 100};
        Arrays.sort(nums); //보이드 메서드
        System.out.println(Arrays.toString(nums));

        // 배열 내부 요소가 모두 동일한지의 여부를 확인 -> true || false 로 출력됨
        arr2[2] = 'F';
        System.out.println(Arrays.equals(arr, arr2));  // 모두일치해야 true
  

        
        
        
        
        
        
        
        

    }
}
