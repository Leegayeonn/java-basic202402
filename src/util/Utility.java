package util;

import oop.obj_arr.Score;

import java.util.Scanner;

public class Utility {

    public static final String FILE_PATH = "C:/MyWorkSpace/music";

    static Scanner sc;

    static {
        sc = new Scanner(System.in);
    }


    // 입력창의 구분을 위해 줄을 그어주는 메서드
    public static void makeLine() {
//
        System.out.println("===================================");
    }

    //문자열을 입력받는 기능
    public static String input(String message) {
        System.out.print(message);
        return sc.nextLine();
    }
}
