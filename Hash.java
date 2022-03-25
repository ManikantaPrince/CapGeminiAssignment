import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class Hash {
    public void mapsort(Map<String, String> map)
    {
        TreeMap<String, String> obj = new TreeMap<>();
        obj.putAll(map);
        for (Map.Entry<String, String> entry :obj.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
    }
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("H","java" );
        map.put("M", "oops");
        map.put("Y","exce");
        map.put("A", "camp");
        Hash ob1=new Hash();
        ob1.mapsort(map);
    }
}
