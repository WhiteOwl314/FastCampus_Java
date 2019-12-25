package stream.inputstream;

import java.io.IOException;

public class SystemInTest2 {
    public static void main(String[] args) {

        System.out.println("입력 : ");

        try {
            int i; //왜 int 자료형이지??
            while((i = System.in.read()) != '\n') { //엔터가 나올때까지 읽은 글자 출력
                System.out.print((char)i); //글자 형태로 출력
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
