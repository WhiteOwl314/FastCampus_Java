package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//Input 테스트
public class FileInputTest {
    public static void main(String[] args) {
        //바이트 단위로 읽어주는 FileInputStream 변수 칸 생성
        FileInputStream fis = null;

        try {
            //FileInputStream 인스턴스 생성
            fis = new FileInputStream("input.txt");
            //읽어보자
            /* int i = fis.read();
            System.out.println((char)i);
             */
            int i ;
            while((i= fis.read())!= -1){ //-1 이되면 끝
                System.out.println((char)i);
            }
        } catch (IOException e) { //file 이 없을때
            e.printStackTrace();
        } finally {
            //이건 마지막으로 꼭 실행
            try {
                //파일은 마지막에 닫아야 함.
                fis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //file handling 이 잘 되었는지 보자
        System.out.println("end");
    }
}
