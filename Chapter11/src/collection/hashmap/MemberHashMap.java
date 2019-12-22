package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

    private HashMap<Integer, Member> hashMap;

    //생성자 정의
    //생성될때 hashMap 호출됨
    public MemberHashMap(){
        hashMap = new HashMap<Integer, Member>();
    }

    //멤버추가 메소드
    //
    public void addMember(Member member){
        hashMap.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memberId){
        if(hashMap.containsKey(memberId)){
            hashMap.remove(memberId);
            return true ;
        }
        System.out.println("회원 번호가 없습니다.");
       return false;
    }

    public void showAllMember(){

        Iterator<Integer> ir = hashMap.keySet().iterator();
        while(ir.hasNext()){
            int key = ir.next();
            Member member = hashMap.get(key);
            System.out.println(member);
        }
        System.out.println();
    }
}
