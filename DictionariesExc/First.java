package DictionariesExc;

import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class First {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

//        map.put("dog", "type of animal");
//        System.out.println(map.get("dog"));
        String input=scanner.nextLine();
        String[] words=input.toLowerCase().split("\\s+");
        Map<String, Integer> count = new HashMap<String, Integer>();
        for (String word:words
             ) {
            if (count.containsKey(word)){
                count.put(word, count.get(word) + 1);
            }
            else {
                count.put(word, 1);
            }
        }
        System.out.println(count);


        List<String> result= new ArrayList<>();
        for (String key:count.keySet()
             ) {
            if (count.get(key)%2!=0){
            result.add(key);
            }
        }
        System.out.println(result);
        System.out.println(count.values());
        System.out.println(count.keySet());
        List<Integer> ints=Arrays.asList(10, 20 , 30, 40, 50);
        List<Integer> res=ints.stream().filter(x->x>25).collect(Collectors.toList());
        System.out.println(res);
        List<Integer> two=ints.stream().map(x->x*2).collect(Collectors.toList());
        System.out.println(two);
        Map<Double, Integer> dict = new HashMap<Double, Integer>(){{
        put (3.14,7) ;put (3.14,7) ;}};

    }
}