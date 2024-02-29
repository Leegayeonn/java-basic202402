package etc.api.lang.math;

public class MathExample {

    public static void main(String[] args) {

        // 올림
        int ceil = (int) Math.ceil(1.1); //올리는건 버려주는거니까 정수로
        System.out.println("ceil = " + ceil);

        // 내림
        int floor = (int) Math.floor(1.5);
        System.out.println("floor = " + floor);
        
        // 반올림 :
        double round = Math.round(3.141592*100) * 0.01;
        System.out.println("round = " + round);

        // 제곱  : 변수는 실수값으로 받음
        double pow = Math.pow(3.0, 4.0);
        System.out.println("pow = " + pow);

        // 최대값
        int max = Math.max(2,10);
        System.out.println("max = " + max);

        // 최솟값
        int min = Math.min(40, 29);
        System.out.println("min = " + min);

        // 절댓값
        int abs = Math.abs(-4000);
        System.out.println("abs = " + abs);
        
        
        
        
    }
}
