package collection.set.hashset;

public class MemberHashSetTest {
    public static void main(String[] args) {

        //MemberHashSet 객체 생성
        MemberHashSet manager = new MemberHashSet();

        //멤버 생성
        Member memberLee = new Member(100, "Lee");
        Member memberKim = new Member(200, "Kim");
        Member memberPark = new Member(300, "Park");


        manager.addMember(memberLee);
        manager.addMember(memberKim);
        manager.addMember(memberPark);

        manager.showAllMember();

        manager.removeMember(100);

        manager.showAllMember();

    }
}

