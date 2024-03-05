package etc.generic.basic;

public class Box<T> { // 제네릭 클래스로 선언. <T> type, 박스를 생성할때

        private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
