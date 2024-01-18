package array;

public class p1 {

	public static void main(String[] args) {
		// data_Type[] namearray={}
		int[] abhi= {1,2,3,4,5,6,7};
		for(int i:abhi)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		int[] arr2=new int[5];
		for(int j=0,i=21;i<=25;i++,j++)
		{
			arr2[j]=i;
		}
		for(int i:arr2)
		{
			System.out.print(i+" ");
		}

	}

}
