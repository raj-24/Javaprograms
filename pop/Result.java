package pop;

import java.util.ArrayList;
import java.util.List;

public class Result {
public static void main(String[] args) {
	int sum=0;
	List<Integer> li=new ArrayList<>();
	for(int i=101;i<150;i++) {
		String str=String.valueOf(i);
		char[] ch=str.toCharArray();
		for (char c : ch) {
			int j=(int)c;
			sum=sum+j;	
		}
      	if(sum%2==0)
			li.add(i);
		
	}
	
System.out.println(li);
	
	
}
	
}

