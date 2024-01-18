package array;

import java.util.Scanner;

public class reverse_array {
	public int[] reverse(int array[])
	{
		int n=array.length;
		for(int i=0;i<=n/2;i++)
		{
			int temp=array[i];
			array[i]=array[n-1];
			array[n-1]=temp;
			n--;
		}
		return array;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Size of Array");
		int size=sc.nextInt();
		int[] array=new int[size];
		System.out.println("Enter the eleemnts");
		for(int j=0;j<size;j++)
		{
			array[j]=sc.nextInt();
		}
		reverse_array obj=new reverse_array();	
		for(int i:obj.reverse(array)) {
			System.out.print(i+" ");
		}
	}

}
