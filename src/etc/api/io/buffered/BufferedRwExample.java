package etc.api.io.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedRwExample {

    public static void main(String[] args) {

        // BufferedWriter
        try(FileWriter fr = new FileWriter("C:/MyWorkSpace/hello.txt");
            BufferedWriter bw = new BufferedWriter(fr)) {
            
            // 더미데이터
            StringBuilder text = new StringBuilder();

            for (int i = 0; i < 1000000; i++) {
                text.append(i + "안녕하세요!\n");
            }

            bw.write(new String(text));  //문자 기반 스트림이기 때문에 바이트로 변환불필요
                                        // 문자열 그대로 전달.

            System.out.println("파일 정상 출력 완료!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // BufferedReader
        try(FileReader fr = new FileReader("C:/MyWorkSpace/hello.txt");
            BufferedReader br = new BufferedReader(fr)) {

            // BufferedReader 에는 readLine() 메서드가 있고
            // 한줄 통째로 읽어서 String 으로 리턴합니다.
            // 더이상 읽어들일 데이터가 없다면 null 을 리턴.
            String str;
            while( (str = br.readLine()) != null) {
                System.out.println(str);
            }

            System.out.println("파일 읽기 완료!");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
