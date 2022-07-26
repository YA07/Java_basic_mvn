package Collection;

import java.util.HashMap;

/**
 * @Coder 17
 * @ClassName HashMapDemo
 * @Description TODO
 * @date 2022/6/7 20:45
 * @Version 1.0
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, Character> hashMap = new HashMap(8,0.75f);
        hashMap.put(1,'a');
        hashMap.put(2,'b');
        hashMap.put(3,'c');
        hashMap.put(4,'d');
        hashMap.put(5,'a');
        hashMap.put(6,'e');
        hashMap.put(7,'f');
        hashMap.put(8,'g');
        hashMap.put(9,'h');


        char res = hashMap.get(6);

        System.out.println(hashMap.size());
        System.out.println(res);

    }
}
