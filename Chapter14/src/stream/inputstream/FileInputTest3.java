package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

//Input 테스트
public class FileInputTest3 {
    public static void main(String[] args) {
        //바이트 단위로 읽어주는 FileInputStream 변수 칸 생성
        try (FileInputStream fis = new FileInputStream("input.txt")){
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
        }
        //file handling 이 잘 되었는지 보자
        System.out.println("end");
    }
}
