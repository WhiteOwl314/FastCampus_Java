package innerclass;

class OutClass{

    private int num = 10 ;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass(){
        inClass = new InClass();
    }

    class InClass{

        int iNum = 100;

        void inTest(){
            System.out.println(num);
            System.out.println(sNum);
        }
    }

    //InClass -> private : 외부에서 호출 할 수 없음
    //호출할 수 있는 메서드 구현
    public void usingInner(){
        inClass.inTest();
    }

    static class InStaticClass{
        int inNum = 100;
        static int sinNum = 200;

        void inTest(){
            System.out.println(inNum);
            System.out.println(sinNum);
            System.out.println(sNum);
        }

        static void sTest(){
            System.out.println(sinNum);
            System.out.println(sNum);
        }
    }

}

public class InnerTest {
    public static void main(String[] args) {

        OutClass outClass = new OutClass();
        outClass.usingInner();
        //Create inClass instance
        OutClass.InClass myInClass = outClass.new InClass();
        myInClass.inTest();

        System.out.println();

        //static 클래스는 독립적, 인스턴스 생성하지 않고 바로 생성.
        // OutClass.InStaticClass sInClass = new OutClass.InStaticClass();

        //static 메소드는 바로 출력 가능
        OutClass.InStaticClass.sTest();
    }
}



