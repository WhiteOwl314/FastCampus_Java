package lambda;

public class TestMyNumber {
    public static void main(String[] args) {

        MyMaxNumber max = (x, y) -> (x >= y)?x : y; //(x >= y) 가 참일때 x, 거짓일때 y
        //interfate에 이름과 매개변수, 반환자료형만 구현하고 함수내용은 즉석에서 씀.
        //이름은 인터페이스 이름으로.

        System.out.println(max.getMaxNumber(1,2)); //메서드 이름은 여기서 쓰임.

    }
}
