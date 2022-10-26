package pop;

public class MaxAndMin {
public static void main(String[] args) {
	int[] a=new int[] {3,10,22,2,11};
	int min=a[0];
	int max=0;
	for(int i=0;i<a.length;i++) {
		 min=Math.min(min, a[i]);
		 max=Math.max(max, a[i]);
	}
	System.out.println(min);
	System.out.println(max);
	
}
}
