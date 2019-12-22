package lambda;

//다른 파일이 아니면 @FunctionalInterface 표시 안해도 됨
interface PrintString { //본 클래스에서 함수형인터페이스 구현하기 위해 그 인터페이스 구현
    void showString(String str);
}

public class TestLambda {
    public static void main(String[] args) { //main도 사실 내부클래스였다!

        PrintString lambdaStr = s -> System.out.println(s);
        lambdaStr.showString("Test");

        showMyString(lambdaStr); //스태틱 클래스 호출 + 매개변수에 함수형 인터페이스
        //java 는 절차지향이 아니라 객체선언을 순서대로 할 필요가 없음

        PrintString test = returnString();
        test.showString("Test4");
    }

    public static void showMyString(PrintString p){ //내부클래스 구현부는 main안에 있음.
        p.showString("Test2");
    }

    public static PrintString returnString(){

        return s -> System.out.println(s + "!!!"); // 람다식 형식 -> 함수형인터페이스에 넣어주려고
    }
}
