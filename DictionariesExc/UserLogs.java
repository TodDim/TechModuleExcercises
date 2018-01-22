package DictionariesExc;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        TreeMap<String,LinkedHashMap<String,Integer>> users=new TreeMap<>();
        String input=scanner.nextLine();
        while (!input.equals("end")) {
            String[] aruments=input.split(" ");
            String name=aruments[2];
            String ip=aruments[0].replaceAll("IP=","");

            users.putIfAbsent(name,new LinkedHashMap<>());
            users.get(name).putIfAbsent(ip,0);
            users.get(name).put(ip,users.get(name).get(ip)+1);
            input=scanner.nextLine();

        }
        for (Map.Entry<String, LinkedHashMap<String, Integer>> user : users.entrySet()) {
            System.out.println(user.getKey()+": ");
            StringBuilder sb=new StringBuilder();
            user.getValue().entrySet().forEach(es->sb.append(es.getKey())
            .append(" => ").append(es.getValue()).append(","));
            sb.replace(sb.length()-1,sb.length(),".");
            System.out.println(sb.toString());
        }
    }
}
