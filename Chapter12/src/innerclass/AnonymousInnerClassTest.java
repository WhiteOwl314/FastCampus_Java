package innerclass;

class Outer2{

    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i){
        int num = 100;


        return new Runnable() { // 익명InnterClass(이름 필요 없음)

            @Override
            public void run() {
                System.out.println(num);
                System.out.println(i);
                System.out.println(outNum);
                System.out.println(Outer.sNum);
            }
        };
    }

    // 클래스 생성 2번째 방법
    Runnable runner = new Runnable /* 여기서 자동생성기능 있음, 단 하나의 인터페이스나 추상클래스는 이름 없이 new로 바로 부를 수 있음.*/ () {
        @Override
        public void run() {

            System.out.println("test");
        }
    };
}

public class AnonymousInnerClassTest {
    public static void main(String[] args) {

        Outer2 outer = new Outer2();
        Runnable runnable = outer.getRunnable(50);

        runnable.run();

        outer.runner.run(); //클래스 생성 2번째 방법 호출
    }

}
