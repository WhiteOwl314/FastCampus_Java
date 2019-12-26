package stream.coffee;

//new 해서 쓰지 않을 것이기 때문에 추상으로 만듬
public abstract class Decorator extends Coffee{

    //멤버변수
    Coffee coffee;
    //생성자
    //혼자 쓰일 수 없어서 커피를 매개변수로 받음
    public Decorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void brewing() {
        //원래 생성자에서 받은 기능을 호출
        coffee.brewing();
    }
}
