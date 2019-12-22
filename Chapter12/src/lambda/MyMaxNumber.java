package lambda;

@FunctionalInterface //함수형 인터페이스라고 표시
public interface MyMaxNumber {
    int getMaxNumber(int x, int y); //메서드 선언

    //함수형 인터페이스는 메서드를 두개 이상 선언할 수 없음
    //why? 어느 함수가 호출되는지 알 수 가 없음.
}
