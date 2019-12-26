package stream.others;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    public static void main(String[] args) throws IOException {

        RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
        rf.writeInt(100);
        System.out.println(rf.getFilePointer()); //getFilePointer : 포인터의 위치를 알 수 있음
        rf.writeDouble(3.14);
        rf.writeUTF("안녕하세요");

        //포인터가 쓴 마지막으로 이동해서, 읽으려면 처음으로 되돌아가야 함.
        rf.seek(0); //처음위치로 이동
        int i = rf.readInt();
        double d = rf.readDouble();
        String str = rf.readUTF();

        System.out.println(i);
        System.out.println(d);
        System.out.println(str);

        //꼭 파일을 닫아줘야 함.
        rf.close();
    }
}
