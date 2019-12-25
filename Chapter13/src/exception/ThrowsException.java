package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException /* exception을 미룸 -> 이 메서드를 호출하는 곳에서 처리 해야 함.*/ {
        FileInputStream fis = new FileInputStream(fileName); //FileInputStream 이 뭐지?
        Class c = Class.forName(className); //forName 은 뭐지 ?
        return c;

    }

    public static void main(String[] args) {

        /*
        ThrowsException test = new ThrowsException();
        try {
            test.loadClass("a.txt", "java.lang.string"); //여기서 throw 를 하면 jvm으로 넘어감.
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        System.out.println("end");
         */

        ThrowsException test = new ThrowsException();
        try {
            test.loadClass("a.txt", "java.lang.string");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (Exception e){ //Exception 이 최상위이기 때문에 다 여기에 걸림. 그래서 앞에다 쓰면 안됨. 어떤 거를 걸어야 할 지 모를때 이거 쓰면 됨.
            System.out.println(e);
        }

    }
}
