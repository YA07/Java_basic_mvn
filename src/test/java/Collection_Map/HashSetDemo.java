package Collection_Map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


/**
 * HashSet是Set接口的一个子类，
 * 主要的特点是：里面不能存放重复元素，而且采用散列的存储方法，所以没有顺序。
 * 这里所说的没有顺序是指：元素插入的顺序与输出的顺序不一致。
 */

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("a");
        set.add("b");
        set.add("c");

        Iterator<String> iterator= set.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }


    }
}
