package video.order.domain;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

// 연체료 정책 설정
public class OverduePolicy {

    private static final int BASE_OVERDUE_CHARGE = 300;

    // 연체 일자 계산 메서드
    static int calculateOverdueDay(Order order) {
        LocalDate now = LocalDate.now(); // 현재 날짜
        LocalDate returnDate = order.getReturnDate(); // 대여 주문 당시 세팅된 반납 날짜.

        if (returnDate.isBefore(now)) {  // 리턴데이트(반납일자)가 현재보다 이전이니? -> 연체되었니?
            return (int) ChronoUnit.DAYS.between(now, returnDate);
        }
        return 0;
    }

    // 연체료 계산
    static int calculateOverdueCharge(Order order) {
        int overdueDay = calculateOverdueDay(order);
        return overdueDay * BASE_OVERDUE_CHARGE;
    }

}
