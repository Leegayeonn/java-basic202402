package individualPractice.interFace;

public class CustomerA extends Customers implements DailyMenu{

    @Override
    public void food() {
        System.out.println("단골손님 A는 김치찌개를 주문해요!");
    }
}
