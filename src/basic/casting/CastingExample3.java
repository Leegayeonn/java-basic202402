package basic.casting;

public class CastingExample3 {

    public static void main(String[] args) {

        char c = 'B';
        int i = 2;
        //int+char ? = 4?

        int intResult = c + i;
        char charResult = (char) (c + i);
        System.out.println("intResult = " + intResult);
        System.out.println("charResult = " + charResult);

        int k = 10;
        double d = k / 4.0;  // int/int 소수점을 버림
        // double d = (double) k / 4;
        System.out.println("d = " + d);


    }
}
