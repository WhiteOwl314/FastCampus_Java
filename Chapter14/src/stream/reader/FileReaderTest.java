package stream.reader;

import java.io.*;

public class FileReaderTest {
    public static void main(String[] args) throws IOException {

        //바이트 단위 출력 -> 한글 깨짐
        /*
        FileInputStream fis = new FileInputStream("reader.txt");
        int i;
        while((i = fis.read()) !=-1){
            System.out.print((char)i);
        }
        fis.close();
         */

        /*
        //바이트단위 출력 + 추가기능 -> 문자출력
        FileInputStream fis = new FileInputStream("reader.txt");
        //문자도 읽을 수 있는 추가기능
        InputStreamReader isr = new InputStreamReader(fis);
        int i;
        while((i = isr.read()) !=-1){
            System.out.print((char)i);
        }
        isr.close();
        */


        //문자단위로 출력
        /*
        FileReader fis = new FileReader("reader.txt");
        int i;
        while ((i=fis.read()) != -1){
            System.out.print((char)i);
        }
        */

        FileReader fis = new FileReader("reader.txt");
        int i;
        while((i = fis.read()) !=-1){
            System.out.print((char)i);
        }
        fis.close();
    }
}
