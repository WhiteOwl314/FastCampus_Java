package collection.treemap;

public class MemberTreeMapTest {
    public static void main(String[] args) {

        //MemberHashSet 객체 생성
        MemberTreeMap manager = new MemberTreeMap();

        //멤버 생성
        Member memberLee = new Member(100, "Lee");
        Member memberKim = new Member(200, "Kim");
        Member memberPark = new Member(300, "Park");


        manager.addMember(memberLee);
        manager.addMember(memberKim);
        manager.addMember(memberPark);

        manager.showAllMember();

        manager.removeMember(200);

        manager.showAllMember();

    }
}
