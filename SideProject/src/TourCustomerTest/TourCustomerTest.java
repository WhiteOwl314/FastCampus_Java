package TourCustomerTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TourCustomerTest {
    public static void main(String[] args) {

        //Create Customer instance
        Customer customerLee = new Customer("이순신", 40);
        Customer customerKim = new Customer("김유신", 20);
        Customer customerHong = new Customer("홍길동", 13);


        //List 생성
        List<Customer> customerList = new ArrayList<Customer>();
        //고객 추가
        customerList.add(customerLee);
        customerList.add(customerKim);
        customerList.add(customerHong);

        //한줄 띄기
        System.out.println();

        //Create stream instace
        Stream<Customer> stream = customerList.stream();

        //1. 고객명단 출력
        System.out.println("고객명단: ");
        stream.forEach(s -> System.out.println(s.customerName));

        //2. 여행의 총 비용 계산
        //한칸 띄기
        System.out.println();
        int sum = 0;
        //for 로 합치기
        for(Customer customer : customerList){
            sum += customer.cost;
        }
        System.out.println("총 여행경비 : " + sum);

        //3. 20세 이상 가나다 순 고객명 출력
        //한칸 띄기
        System.out.println();
        /*
        //방법 1 : 스트링 어레이를 만들어서 거기에 넣고 출력한다.
        List<String> customerNameList = new ArrayList<String>();
        for(int i = 0; i < customerList.size(); i++){
            customerNameList.add(customerList.get(i).customerName);
        }
        Stream<String> stream1 = customerNameList.stream();
        stream1.sorted().forEach(s -> System.out.println(s));
        System.out.println();
        */

        //방법 2 : 어레이리스트에 Customer 객체를 넣고 이름을 출력한다.
        //customerList.stream().map(s -> s.customerName).sorted().forEach(n -> if());
        System.out.println("20세 이상손님 가나다순 출력 : ");
        customerList.stream().filter(s -> s.age >= 20).map(v -> v.customerName).sorted().forEach(n -> System.out.println(n));
    }
}
