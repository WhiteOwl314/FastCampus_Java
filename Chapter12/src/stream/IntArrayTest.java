package stream;

import java.util.Arrays;

public class IntArrayTest {
    public static void main(String[] args) {

        //배열 생성
        int [] arr = {1, 2, 3, 4, 5};

        //Arrays 객체
        //다 합쳐서 sum 변수에 넣음
        int sum = Arrays.stream(arr)/* stream 생성*/.sum(); //sum은 어디서 나온거지?
        int count = (int) Arrays.stream(arr).count()/*어레이의 메서드인듯*/; //Arrays.stream은 한번 쓰면 또 쓸 수 없음. -> 다시 써주기

        System.out.println(count);
        System.out.println(sum);

        System.out.println(Arrays.stream(arr).reduce(0, (a, b) -> a+b)); //0은 무엇인가?

    }
}
