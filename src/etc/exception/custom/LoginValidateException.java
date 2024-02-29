package etc.exception.custom;

public class LoginValidateException extends Exception{  // 1. 부모타입을 상속

    // 2. 기본생성자 생성
    public LoginValidateException() {}

    // 3. 커스텀 에러 메세지를 받는 생성자 생성
    public LoginValidateException(String message) {
        super(message);
    }


















}
