package array;

import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size OF the Array");
		int size=sc.nextInt();
		int[] gopi=new int[size];
		for(int i=0;i<gopi.length;i++) {
			gopi[i]=sc.nextInt();
		}
		for(int i:gopi)
		{
			System.out.print(i+" ");
		}

	}

}
