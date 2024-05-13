package etc.stream.quiz;

import etc.stream.quiz.Trader;

public class Transaction {
    private final etc.stream.quiz.Trader trader; // 거래자
    private final int year; // 거래연도
    private final int value; // 거래금액

    public Transaction(etc.stream.quiz.Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public etc.stream.quiz.Trader getTrader() {
        return trader;
    }

    public int getYear() {
        return year;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", year=" + year +
                ", value=" + value +
                '}';
    }
}