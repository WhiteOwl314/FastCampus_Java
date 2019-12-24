package TourCustomerTest;

public class Customer {

    //인스턴스 생성과 독립된 숫자
    private static int staticNumber = 1000;

    //멤버변수
    private int customerId ;
    String customerName ;
    int age ;
    int cost ;

    //생성자 추가
    public Customer (String customerName, int age){

        //id 만들어주기
        // staticNumber 하나 올리기
        staticNumber += 1;
        // id 에 대입
        this.customerId = staticNumber;

        this.customerName = customerName;
        this.age = age;

        //age에 따라 cost 산정
        if(age >= 15){
            this.cost = 100;
        } else {
            this.cost = 50;
        }

        //생성 반응 문자출력
        System.out.println("고객번호는 " + customerId + "번, 이름은 " + customerName + ", 나이는" + age + "살 , 여행경비는 " + cost + "만원인 인스턴스가 생성되었습니다.");
    }
}
