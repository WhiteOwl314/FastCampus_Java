package stream.inputstream;

import java.io.IOException;

public class SystemInTest {
    public static void main(String[] args) {

        System.out.println("입력 : ");

        try {
            int i = System.in.read(); //표준 io는 항상 열려있는 것이기 때문에 close() 하지 않음 .
            System.out.println(i);
            System.out.println((char)i); //글자 형태로 출력
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
