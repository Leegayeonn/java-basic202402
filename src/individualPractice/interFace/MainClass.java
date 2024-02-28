package individualPractice.interFace;

import java.awt.*;
import java.sql.SQLOutput;

public class MainClass {


    public static void main(String[] args) {

        DailyMenu menu;
        menu = new Customers();
        menu.food();

        menu = new CustomerA();
        menu.food();

        menu = new CustomerB();
        menu.food();


    }

}
