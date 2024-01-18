//package array;
//
//public class second_highest {
//	public int max(int[] array)
//	{
//		int high=array[0];
//		for(int i=1;i<array.length;i++)
//		{
//			if(array[i]>high)
//			{
//				high=array[i];
//				
//			}
//		}
//		return high;
//	}
//	public int second_max(int[] array) {
//		int max=max(array);
//		int[] abhi=new int[array.length];
//		for(int i=0,j=0;i<array.length;i++,j++)
//		{
//			abhi[j]=array[i]-max;
//		}
//		System.out.println(max(abhi));
//	}
//
//	public static void main(String[] args) {
//		int[] array= {5,1,4,8,10,6};
//		second_highest obj=new second_highest();
//		System.out.println("the highest Number is " +obj.max(array));
//		
//		
//
//	}
//
//}
