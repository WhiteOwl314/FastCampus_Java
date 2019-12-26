package stream.decorator;

import java.io.*;
import java.net.Socket;

public class FileCopy {
    public static void main(String[] args) throws IOException {

        //시간재기위해
        long milliseconds = 0;
        try(FileInputStream fis = new FileInputStream("a.zip");
            FileOutputStream fos = new FileOutputStream("copy.zip");
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos)){
            //Buffered ->  속도 향상

            //현재시간 대입
            milliseconds = System.currentTimeMillis();

            //한글자씩 읽기
            int i;
            while ((i = bis.read()) != -1){
                bos.write(i);
            }

            //걸린시간 대입
            milliseconds = System.currentTimeMillis() - milliseconds;

        } catch (IOException e ){
            System.out.println(e);
        }

        // Socket을 쓸 때 바이트형을 써야 함. -> 문자 쓸 수 있도록 변환
        Socket socket = new Socket();
        //빨라지게 버퍼로감싸고, 문자 읽을 수 있도록 리더로 감쌈.
        BufferedReader isr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        isr.readLine();


        System.out.println("시간 : " + milliseconds);
    }
}
