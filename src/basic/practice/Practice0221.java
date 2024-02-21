package basic.practice;

public class Practice0221 {

    public static void main(String[] args) {


        // 1 ~ 60000 까지의 정수 중 136의 배수의 개수

        int count = 0;
        int i = 1;

        while(i <= 60000) {
            if(i % 136 == 0) {
                count++;
                System.out.println("i = " + i);
            }
            i++;
        }
        System.out.println("count = " + count);

    }
}
