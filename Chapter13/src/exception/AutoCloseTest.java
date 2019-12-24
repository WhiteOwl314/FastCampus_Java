package exception;

public class AutoCloseTest {
    public static void main(String[] args) {

        /*
        try (AutoCloseObj obj = new AutoCloseObj()) {
            //exception 상황에서도 잘 호출되나 보기
            //강제로 예외 발생시킴
            throw new Exception(); //try 에서 catch로 넘어감

        } catch(Exception e) {
            System.out.println(e);
        }
        //AutoCloseable -> 자동으로 close() 호출 됨.

        */

        //변수가 하나 더 있을 경우
        //java 9 부터 변수를 그냥 try() 안에 쓰면 됨
        //향상된 try with resource구문이라고
        AutoCloseObj obj = new AutoCloseObj();
        try( obj /* obj2 같은 다른 변수 다시 안만들어도 됨 */) {
            //exception 상황에서도 잘 호출되나 보기
            //강제로 예외 발생시킴
            throw new Exception(); //try 에서 catch로 넘어감

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
