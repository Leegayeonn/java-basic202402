package etc.api.io.rw;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileReaderExample {

    public static void main(String[] args) {

        /*
         - 문자기반으로 읽어들이는 클래스는 FileReader 입니다.
         - 2바이트 단위로 읽기 때문에 문자를 읽어들이기 적합합니다.
         */

        try(FileReader fr = new FileReader("C:/MyWorkSpace/bao.txt")) {
            // 첫번째 방법
            /*  read()는 기본적으로 단일 문자 하나씩 읽어들임.
            int data = 0;
            while (data != -1) {
                data = fr.read();
                System.out.print((char) data);
            }
            */
            // 두번째 방법
            char[] arr = new char[50];
            // read()는 기본적으로 단일 문자 하나씩 읽어들임. -> 위에서는 반복문으로 한글자씩 계속 읽어들임
            // 배열을 전달하면 배열의 크기만큼 한번에 읽어들임.
            int read = fr.read(arr);
            System.out.println(read); // 문자의 개수
            for (char c : arr) {
                System.out.print(c);
                if(c == 0) break;  // 배열내부에서 0이 나오면 멈추겠다
            }


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
