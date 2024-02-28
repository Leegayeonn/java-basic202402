package oop.final_.field;

public class MainClass {

    public static void main(String[] args) {

        Person kim = new Person("김철수");
        //kim.nation = "미국"; (x) // final(불변의 값을 가짐)이기때문에
        //kim.name = "김마이클"; (x) // final 은 한번 값을 가지면 불변이다.
        kim.age = 30;

        Person park = new Person("박영희");
        //park.nation = "영국"; (x)
        //park.name = "박영국"; (x)

    }
}
