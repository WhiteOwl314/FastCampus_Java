package collection.set.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {

    //Member클래스를 받는 HasSet 멤버변수를 선언
    private TreeSet<Member> treeSet;

    //생성자
    //기본적으로 hashSet 객체 생성
    public  MemberTreeSet(){
        treeSet = new TreeSet<Member>(new Member());
    }


    //hashSet 을 활용한 멤버 추가 메소드 정의
    public void addMember(Member member){
        treeSet.add(member);
    }

    //멤버 아이디를 받고 그 아이디의 멤버를 지우는 메소드
    public boolean removeMember(int memberId){
        Iterator<Member> ir = treeSet.iterator();
        // Iterator 는 모든 변수 하나씩 다 소환
        //다음 멤버가 있는지 확인
        while ( ir.hasNext() ){
            //다음 멤버 변수에 집어넣기
            Member member = ir.next();
            //하나씩 다 돌면서 아이디랑 맞으면 삭제
            if(member.getMemberId() == memberId){
                treeSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "번호가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember(){
        for(Member member : treeSet){
            System.out.println(member);
        }
        System.out.println();
    }
}
