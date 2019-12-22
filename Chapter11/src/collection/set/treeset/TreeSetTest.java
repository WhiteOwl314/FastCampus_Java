package collection.set.treeset;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {

        //Create TreeSet
        TreeSet<String> treeSet = new TreeSet<String>();
        //Insult Element
        treeSet.add("홍길동");
        treeSet.add("강감찬");
        treeSet.add("이순신");

        for(String str : treeSet){
            System.out.println(str);
        }
    }
}
