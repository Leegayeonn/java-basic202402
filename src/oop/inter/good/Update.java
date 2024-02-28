package oop.inter.good;

public class Update implements IUserService {

    //회원정보수정


    public Update() {
        System.out.println("회원 정보 수정요청이 들어옴!");
    }


    @Override
    public void execute() {
        System.out.println("수정 정보를 받아서 데이터베이스에서 수정조치.....");
    }


}
