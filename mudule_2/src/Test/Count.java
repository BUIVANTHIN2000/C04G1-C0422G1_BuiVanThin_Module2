package Test;

import java.util.HashMap;
import java.util.Map;

public class Count {
    public static void main(String[] args) {
        String st1 = " bai kho qua anh ";
        String[] arrST = st1.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (String s : arrST) {
            if (map.containsKey(s)) {
                Integer value = map.get(s);
                value++;
                map.replace(s, value);
            } else {
                map.put(s, 1);
            }
        }
        System.out.println(map.toString());
    }
}

