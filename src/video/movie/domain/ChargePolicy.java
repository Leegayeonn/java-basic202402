package video.movie.domain;


import util.Utility;

import java.time.LocalDate;
import java.util.List;

/**
 * 요즘 정책
 * 1. 올해 출시된 영화는 기본적으로 5000원
 * 2. 출시 후 1년이 지날 때마다 500원씩 차감
 * 3. 최소요금은 2000원 그 밑으로는 차감되지 않음.
 */
public class ChargePolicy {

    private static final int BASE_CHARGE = 5000; // 기본료 고정
    private static final int DISCOUNT = 500; // 요금 차감
    private static final int LIMIT_CHARGE = 2000; // 최소요금 -> 아래로는 차감되지않는 값


    // 전달된 Movie 의 발행년도에 따른 가격을 계산하는 메서드
    public static int calculateDvdCharge(Movie movie) {
        // 올해 연도 정보
        int thisYear = LocalDate.now().getYear();
        // 출시 후 경과년도 계산
        int movieAge = thisYear - movie.getPubYear();
        int charge = BASE_CHARGE - (movieAge * DISCOUNT);

        if (charge < LIMIT_CHARGE) {
            charge = LIMIT_CHARGE;
        }
        return charge;
    }
}
















