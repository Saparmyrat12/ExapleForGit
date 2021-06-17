import java.util.*;

/**
 * <p/>
 * Copyright (C) 2021
 * <p/>
 * Date: май 05, 2021
 *
 * @author Sapar
 */
public class Test {
    public static void main(String[] args) {
        Map<Integer, String> states = new HashMap<Integer, String>();
        states.put(1, "Germany");
        states.put(2, "Spain");
        states.put(4, "France");
        states.put(3, "Italy");


//        for (Map.Entry<Integer, String> item : states.entrySet()) {
//            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
//        }
//
//        Set<Integer> keys = states.keySet();
//        System.out.println("Ключи: " + keys);
//
//        ArrayList<String> values = new ArrayList<>(states.values());
//        System.out.println("Значения: " + values);
//        Iterator<String> iter = values.listIterator();
//        while (iter.hasNext()){
//            System.out.println(iter.next());
//        }

        Iterator<Map.Entry<Integer, String>> itr = states.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        Iterator<Map.Entry<Integer, String>> item = states.entrySet().iterator();
        while (item.hasNext()) {
            Map.Entry<Integer, String> it = item.next();
            System.out.println(it.getKey() + " " + it.getValue());
        }

    }
}
