package pop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrList {
public static void main(String[] args) {
	ArrayList<String> al =new ArrayList<>();
	al.add("red");
	al.add("yellow");
	al.add("white");
	al.add("blue");
	//adding in first position
	al.add(0,"green");
	//adding in specific position
	al.add(2,"voilet");
	//remove element at specific index
	al.remove(3);
	
	//iterator
  Iterator<String> it=al.iterator();
  while (it.hasNext()) {
System.out.println(it.next());
	
}
  System.out.println(".......After Sorting.......");
//sorting array
	Collections.sort(al);
	for (String str : al) {
		System.out.println(str);
	}
} 
}
