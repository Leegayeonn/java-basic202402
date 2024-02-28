package individualPractice.interFace;

public class CustomerB extends Customers implements DailyMenu {


    @Override
    public void food() {
        System.out.println("단골손님 B는 제육볶음을 주문해요!");
    }
}
