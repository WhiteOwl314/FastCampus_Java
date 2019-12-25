package stream.inputstream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest3 {
    public static void main(String[] args) {

        //한글입력 시
        System.out.println("입력 후 '끝'이라고 쓰세요 : ");

        try {
            int i; //왜 int 자료형이지??
            //보조 스트림 : 문자를 읽게 해줌
            InputStreamReader isr = new InputStreamReader(System.in);
            while((i = isr.read()) != '끝') { // 한글은 2byte 이니 인식을 못함 -> 보조스트림으로 문자를 읽을 수 있도록 해줘야 함.
                System.out.print((char)i); //글자 형태로 출력
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
