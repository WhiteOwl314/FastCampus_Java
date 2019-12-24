package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {

        /*
        FileInputStream fis = null ; //FileInputStream 이 뭐지?

        try {
            fis = new FileInputStream("a.txt"); //a.txt 부터 오픈, 이 파일이 없으면 어떻게 하냐고 빨간줄로 물어봄.-> 예외처리 선택
        } catch (FileNotFoundException e) {
            System.out.println(e);
            //finally 가 없다면 try, catch 구문마다 fis.close() 를 써줘야 함.
            //return을 여기서 써도 finally는 실행이 됨.
        } finally {
            //fis.close 도 오류가 날 수 있기 때문에 예외처리 해줌.
            try {
                fis.close();
                System.out.println("finally");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("end");
         */

        //try with resource 구문
        try (FileInputStream fis = new FileInputStream("a.txt")){

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
