package pop;

import java.util.Scanner;

public class EvenorOdd {
	public static void main(String[] args) {
	    try (Scanner sc = new Scanner(System.in)) {
			int n=sc.nextInt();
			if(n==0)
				System.out.println("even");
			if(n%2==0)
				System.out.println("even");
			else
				System.out.println("odd");
		}
	}
}
