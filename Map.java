package pop;

import java.util.HashMap;

public class Map {
public static void main(String[] args) {
	HashMap<Integer, String> h=new HashMap<>();
	h.put(0, "raj");
	h.put(1, "venu");
	h.put(2, "ravi");
	h.put(3, "vamsi");
	//Getting key value
	System.out.println(h.get(2));
		//Size of Hashmap
	System.out.println(h.size());
	//copying elements from one to another map
	HashMap<Integer, String> hh=new HashMap<>(h);
	
	System.out.println(hh);
	//value of specific key
	if(hh.containsKey(3))
		System.out.println(hh.get(3));
	
}
}
