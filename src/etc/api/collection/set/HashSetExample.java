package etc.api.collection.set;

import etc.api.lang.obj.Person;
import util.Utility;

import java.util.*;

import static util.Utility.*;

public class HashSetExample {

    public static void main(String[] args) {

        /*
         # Set
         - 집합을 구현해 놓은 인터페이스
         - 요소로 같은 값이 들어오는 것을 허용하지 않는다.(중복x)
         - 인덱스 없음

         # Hash
         - 어떤 값을 넣었을 때 전혀 예측하지 못할 값이 생성되어야 하는 알고리즘
         - 예측할 수 없는 값을 이용하기 때문에 정렬이 불가능.
         - 생성된 값으로 원래 값을 찾는 것도 불가능에 가깝다.
         - 다시 원래 값으로 돌아갈 수 없는 단방향성 알고리즘
         - 속도가 빠르고 보안성이 뛰어난 알고리즘. 객체의 주소값을 할당하거나
          암호화 알고리즘에서 많이 사용됩니다.
         */

        Set<String> set = new HashSet<>();

        // 객체를 저장: add(객체)
        set.add("Java");
        set.add("JSP");
        set.add("Spring");
        set.add("Oracle");
        Collections.addAll(set,"MySQL", "Java");
        System.out.println(set); //[Java, JSP, MySQL, Spring, Oracle] 인덱스 존재하지않음!!

        // set 의 크기 확인: size()
        System.out.println("set의 크기: " + set.size());

        /*
         - set 은 인덱스가 없기 때문에 메서드를 이용해서 객체를 얻는게 아니라
          반복자 (Iterator)를 통해서 요소를 하나씩 꺼내 보셔야 합니다.
          반복자 객체는 set 인터페이스가 제공하는 iterator()를 호출하여
          얻어옵니다.
         */
        Iterator<String> iter = set.iterator();

        /*
         Iterator 객체의 메서드 next()를 통해
         내부 요소를 하나씩 꺼내올 수 있습니다.
         next()를 요소의 개수보다 많이 호출하게 되면
         NoSuchElement 예외가 발생합니다.

         hasNext() -> 반복자가 가지고 있는 객체를 더 가지고 올 수 있는지의
         여부를 확인하는 메서드를 통해 next()를 호출하셔야 합니다.
        */
        while (iter.hasNext()) { //  true || false 호출
            System.out.println(iter.next()); // 더이상 꺼내올 요소가 없으면 멈춤
        }

        makeLine();

        // 향상 for 문 사용가능!  -> iterator 객체를 사용하기때문에 위에 반복문이랑 같다고 생각하자!
        for (String s : set) {
            System.out.println(s);
        }

        // set 에서 객체를 삭제: remove(객체) --> 인덱스가 없으므로 객체를 직접
        set.remove("JSP");
        System.out.println(set);

        // set 을 list 로 변환 -> 생성자의 매개값으로 set 을 전달.
        List<String> convertedList = new ArrayList<>(set);
        System.out.println(convertedList);
        String s = convertedList.get(2);
        System.out.println(s);

        // set 에서 저장된 모든객체를 삭제: clear()
        set.clear();
       System.out.println(set);

       // set 에서 객체가 비어있는지 확인: isEmpty()
        boolean b = set.isEmpty();
        System.out.println(b);

        /*
         # 객체에서 equals 메서드를 오버라이딩 할 때 hashCode도 같이 오버라이딩 해야 하는 이유
         - Hash 알고리즘을 사용하는 다른 객체가 본래의 속성을 띄게 하려면
          객체의 필드값이 같았을 때 같은 hashCode의 값을 띄게 해 줘야 한다.
          (HashSet -> HashCode를 통해 중복 여부를 확인하기 때문.)
         */

        Set<Person> personSet = new HashSet<>();

        Person kim = new Person("김춘식", 30);
        Person kim2 = new Person("김춘식", 30);

        System.out.println(kim.equals(kim2));

        personSet.add(kim); personSet.add(kim2);
        System.out.println(personSet);

    }
}
