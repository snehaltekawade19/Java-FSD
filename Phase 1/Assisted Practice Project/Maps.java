package practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<>();
		 
        map.put("Snehal", 3);
        map.put("Tekawade", 17);
        map.put("Vimal", 10);
        map.put("Uttam", 1);
        map.put("Demo", 69);
        
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.size());
        System.out.println(map.get("Snehal"));
	}

}
