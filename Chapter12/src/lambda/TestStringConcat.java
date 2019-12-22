package lambda;

public class TestStringConcat {
    public static void main(String[] args) {

        //전통적인 방식 : 클래스 양식에 맞게 인스턴스객체 만들고 인스턴스객체의 메서드 호출
        StringConimpl impl = new StringConimpl(); // 인스턴스 생성
        impl.makeString("Hello", "World"); //메서드 호출

        //함수형 인터페이스로 구현
        StringConcat concat = (x , v) -> System.out.println(x + "," + v); //함수의 구현부가 concat에 변수처럼 대입됨
        concat.makeString("Hello", "World2");

        //어떻게 돌아가냐?
        StringConcat/*선언한 인터페이스*/ concat2 = new StringConcat()/*자동 익명 이너클래스 생성*/ {
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1 + "," + s2);
            }
        }; //람다식에 익명내부클래스가 사용이 됨.
        //호출 시범
        concat2.makeString("Hello","World3");
    }
}
