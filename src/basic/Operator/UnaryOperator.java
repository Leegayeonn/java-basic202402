package basic.Operator;

public class UnaryOperator {
    public static void main(String[] args) {

        // 증감 연산자 (++. --)
        // 변수의 값을 단순히 하나 올리거나 내릴 때 사용합니다.


        int i = 1;
        int j = i++;
        int k = i--;

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);

        System.out.println("---------------------------------");

        int x = 1;
        int y = ++x;
        int z = --x;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
}
