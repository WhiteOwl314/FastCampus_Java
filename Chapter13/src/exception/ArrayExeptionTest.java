package exception;

public class ArrayExeptionTest {
    public static void main(String[] args) {

        //Create IntArray stored 5 storage
        int[] arr = new int[5];

        // 아래와 같이 설계해놓고 런을 해보면 6번째 엘리먼트가 없기떄문에 오류가 남.
        /* for(int i = 0; i <= 5; i++){
            System.out.println(arr[i]);
        }
        */

        //예외처리 -> 서버가 죽지는 않음.
        try{
            for(int i = 0; i <= 5; i++){
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) { //어레이의 마지막엘리먼트가 없으면, e : exception
            System.out.println(e.toString());
            System.out.println("예외처리");
        }
        System.out.println("프로그램 종료");
    }
}
