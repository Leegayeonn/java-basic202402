package etc.api.io.obj;

import oop.poly.car.Car;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SaveSnack {

    //객체를 만들어서 외부로 뽑아내기
    public static void main(String[] args) {

        // 객체 생성
        List<Snack> snackList = new ArrayList<>();
        Collections.addAll(snackList,
                new Snack("콘칩", 1970, 1500, "옥수수맛"),
                new Snack("새우깡", 1990, 1900, "새우맛"),
                new Snack("치토스", 2000, 1200, "바베큐맛")
                );

        // 위에서 만든 객체외부로 뽑아내기(저장하기)
        // 객체를 꺼내야하기때문에 (저장해야하기때문에) buffered 안쓰고 꺼내는 스트림사용
        try(FileOutputStream fos = new FileOutputStream("C:/MyWorkSpace/snack.sav")) {

        // 객체를 저장할 수 있는 보조 스트림
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(snackList);


         } catch (Exception e) {
            e.printStackTrace();
        }




    }
}
