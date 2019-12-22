package collection.set.hashset;

import java.util.ArrayList;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {

        ArrayList<String> set = new ArrayList<String>();
        set.add("이순신");
        set.add("김유신");
        set.add("김감찬");



        Iterator<String> ir = set.iterator();

        while (ir.hasNext()){
            String str = ir.next();
            System.out.println(str);
        }
    }
}
