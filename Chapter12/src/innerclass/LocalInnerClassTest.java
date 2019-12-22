package innerclass;

//Outer 클래스 생성
class Outer{

    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i){

        int num = 100; // 메서드 run 이 불려지면 이 지역변수가 사라지기 때문에 final로 처리해줘야 함.

        class MyRunnable implements Runnable{

            @Override
            public void run() {
                System.out.println(num);
                System.out.println(i);
                System.out.println(outNum);
                System.out.println(Outer.sNum);
            }

        }

        return new MyRunnable();
    }
}

public class LocalInnerClassTest {
    public static void main(String[] args) {

        Outer outer = new Outer();
        Runnable runnable = outer.getRunnable(50);

        runnable.run();
    }
}
