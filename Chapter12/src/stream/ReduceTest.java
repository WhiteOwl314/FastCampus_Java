package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> /* 얘는 뭐지? */ {

    @Override
    public String apply(String s1, String s2) {
        //조건문 : 더 큰 애를 반환하겠다
        if(s1.getBytes().length >= s2.getBytes().length){
            return s1;
        } else {
            return s2;
        }
    }
}

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

        String str2 = Arrays.stream(greetings).reduce(new CompareString()).get();
        System.out.println(str2);
    }
}
