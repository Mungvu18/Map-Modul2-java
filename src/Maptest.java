import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maptest {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("hiếu",30);
        hashMap.put("duyệt",25);
        hashMap.put("toàn",34);
        hashMap.put("mung",100);
//        System.out.println("Display entris in HashMap " + hashMap);
        for (String i: hashMap.keySet()) {
            System.out.println("key: " + i +" value " + hashMap.get(i));
        }
        Map <String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key ");
        System.out.println(treeMap);
        //LinkedHashMap trong main lưu danh sách sinh viên và hiển thị dữ liệu
        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f, true);
        linkedHashMap.put("Smith",30);
        linkedHashMap.put("Anderson",31);
        linkedHashMap.put("cook",29);
        System.out.println(linkedHashMap.get("cook"));
    }

}