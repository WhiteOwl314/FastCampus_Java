package collection.treemap;

import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {

    private TreeMap<Integer, Member> treeMap;

    //생성자정의
    //생성될 때 treeMap 호출됨
    public MemberTreeMap() {
        treeMap = new TreeMap<Integer, Member>();
    }

    //멤버추가 메소드
    //
    public void addMember(Member member){
        treeMap.put(member.getMemberId(), member);
    }

    //멤버제거 메소드
    public boolean removeMember(int memberId){
        if(treeMap.containsKey(memberId)){
            treeMap.remove(memberId);
            return true;
        }
        System.out.println("회원 번호가 없습니다.");
        return false;
    }

    //모든멤버 출력 메소드
    public void showAllMember(){
        Iterator<Integer> ir = treeMap.keySet().iterator();
        while(ir.hasNext()){
            int key = ir.next();
            Member member = treeMap.get(key);
            System.out.println(member);
        }
        System.out.println();
    }
}
