package collection.set.treeset;

public class MemberTreeSetTest {
    public static void main(String[] args) {

        //MemberHashSet 객체 생성
        MemberTreeSet manager = new MemberTreeSet();

        //멤버 생성
        Member memberLee = new Member(300, "Lee");
        Member memberKim = new Member(200, "Kim");
        Member memberPark = new Member(100, "Park");


        manager.addMember(memberLee);
        manager.addMember(memberKim);
        manager.addMember(memberPark);

        manager.showAllMember();

    }
}

