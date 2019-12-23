package stream;

import java.util.Arrays;

public class ReduceTest {
    public static void main(String[] args) {

        String[] greetings = {"안녕하세요~~~", "hello", "Good morning", "반갑습니다."};

        String str = Arrays.stream(greetings).reduce("", (s1, s2)->{
            //조건문 : 더 큰 애를 반환하겠다
            if(s1.getBytes().length >= s2.getBytes().length){
                return s1;
            } else {
                return s2;
            }
        });

        System.out.println(str);
    }

}
