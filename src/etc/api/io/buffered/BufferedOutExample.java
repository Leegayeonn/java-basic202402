package etc.api.io.buffered;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutExample {

    public static void main(String[] args) {

        System.out.println("시작!!");

        //dummy data
        StringBuilder text = new StringBuilder();

        for (int i = 0; i < 1000000; i++) {
            text.append(i + "안녕하세요!\n");
        }


        // fos 와 bos 소요시간 비교!

        long start = System.currentTimeMillis();

        // Buffered 가 붙은 객체들은 기존에 사용했던 객체를 생성자의 매개값으로 전달.
        // ex) BufferedOutputStream -> FileOutputStream 을 매개값으로 받아야한다.
        // BufferedInputStream  -> FileInputStream 을 매개값으로 받아야 한다.
        try(FileOutputStream fos = new FileOutputStream("C:/MyWorkSpace/bout.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            // 더미 데이터를 StringBuilder 로 생성함
            // 새로운 String 객체를 생성 -> 생성자의 매개값으로 StringBuilder 를 전달
            // 바이트 데이터로 변환.
            String str = new String(text); // 스트링빌더객체를 스트링 객체로 변환한것
            /*
            byte[] data = str.getBytes(); // 바이트 배열로 변환한것
            bos.write(data);
             */
            for (byte b : str.getBytes()) {
                bos.write(b);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();

        System.out.println("소요시간: " + (end-start)*0.001 + "초");

        // fos > bos : bos 시간이 더 빠름
    }
}
