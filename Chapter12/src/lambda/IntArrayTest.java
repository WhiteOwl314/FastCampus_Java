package lambda;

import java.util.Arrays;

public class IntArrayTest {
    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 5};

        //Arrays 객체
        //다 합쳐서 sum 변수에 넣음
        int sum = Arrays.stream(arr).sum();
        int count = (int) Arrays.stream(arr).count(); //Arrays.stream은 한번 쓰면 또 쓸 수 없음. -> 다시 써주기

        System.out.println(count);
        System.out.println(sum);

    }
}
