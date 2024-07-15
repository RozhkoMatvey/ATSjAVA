import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class prog{

    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> ATS = new HashMap<>();
        addNum("Иванов", 123456, ATS);
        addNum("Соболев", 12145, ATS);
        addNum("Соболев", 123456, ATS);
        addNum("Иванов", 111111, ATS);
        addNum("Иванов", 123456, ATS);
        

        result(ATS);
       }
    public static void addNum(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }
    public static void result(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = " ";
            for(int el: item.getValue()){
                phones = phones + el + ",";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
}