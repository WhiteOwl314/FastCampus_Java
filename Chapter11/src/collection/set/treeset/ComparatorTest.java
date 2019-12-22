package collection.set.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparable implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {

        return (s1.compareTo(s2)*(-1)); // -1을 곱하는것은 역순이라는 뜻
    }
}
public class ComparatorTest {
    public static void main(String[] args) {

        //Create TreeSet
        TreeSet<String> treeSet = new TreeSet<String>(new MyComparable()); //Compare 방식 여기에넣어주면 됨.
        //Insult Element
        treeSet.add("홍길동");
        treeSet.add("강감찬");
        treeSet.add("이순신");

        for(String str : treeSet){
            System.out.println(str);
        }
    }
}
