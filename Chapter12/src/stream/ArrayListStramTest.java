package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStramTest {
    public static void main(String[] args) {

        List<String> sList = new ArrayList<String>(); //List는 뭐야?
        sList.add("Tomas");
        sList.add("Edward");
        sList.add("Jack");

        Stream<String> stream /* Stream 인스턴스 선언 */= sList.stream(); /* sList의 stream 생성 */ //Stream은 뭐야?
        stream.forEach(s -> System.out.print(s + " "));
        System.out.println();

        sList.stream().sorted().forEach(s -> System.out.print(s + " ")); //steam을 다시 가져다 쓸 수 없고 다시 stream을 만들어야 함.
        System.out.println();

        sList.stream().map(s -> s.length()).forEach(n -> System.out.println(n));
    }
}
