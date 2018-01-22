package StringsAndTexts;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * Created by TYDimitrov on 25.10.2017 г..
 */
public class Beginnn {
    public static void main(String[] args) {
        String str="Zdrasti";
        char[] chars= str.replaceAll("[a-s]","").toCharArray();
//        Collections.reverse(Arrays.asList(chars));
        String reverse = new StringBuilder(new String(chars)).reverse().toString();
        System.out.println(reverse);
String text="abababa".toLowerCase();
String pattern="aba".toLowerCase();
int count=0;
int index=-1;
while (true){
     index=text.indexOf(pattern,index+1);
    if (index==-1){
        break;
    }
    count++;
}
        System.out.println(count);

String listofBeers="Amstel,  Zagorka,      Tuborg";
String[] beers=listofBeers.split("\\s+");
        for (String s:beers
             ) {
            System.out.println(s);
        }
        for (String f: Arrays.stream(beers).filter(f->f.length()>0).collect(Collectors.toList())) {
            System.out.println(f);
        }
    }
}
