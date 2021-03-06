package collection.treemap;

import java.util.Comparator;

public class Member implements Comparator<Member> {

    //멤버변수 선언
    private int memberId;
    private String memberName;

    //디폴트 생성자
    public Member() {}

    //정보를 받는 생성자
    public Member(int memberId, String memberName){
        this.memberId = memberId;
        this.memberName = memberName;
    }

    //get,set 메소드
    //cmd + n 단축키
    public int getMemberId() {
        return memberId;
    }
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
    public String getMemberName() {
        return memberName;
    }
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    //toString 오버라이딩
    @Override
    public String toString() {
        return memberName + "회원님의 ID는 " + memberId + "입니다. ";
    }

    //equals, hashcode Overriding

    @Override
    public int hashCode() {
        return memberId;
    }

    @Override
    public int compare(Member member1, Member member2) {
        return (member1.memberId- member2.memberId);
    }

    @Override
    public boolean equals(Object obj) {
        //obj의하위클래스에 Member가 있는지 확인
        if(obj instanceof Member){
            //다운 캐스팅
            Member member = (Member)obj;
            return (this.getMemberId() == member.memberId);
        }
        return false;
    }
}
