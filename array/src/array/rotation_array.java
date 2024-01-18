package array;

public class rotation_array {
	public int[] rotate(int[] array,int k)
	{
		int count=0;
		while(count<=k)
		{
			int temp =array[array.length-1];
			for(int i=array.length-1;i>0;i--)
			{
				array[i]=array[i-1];
			}
			array[0]=temp;
			count++;
		}
		return array;
       
	}

	public static void main(String[] args) {
		int[] array= {1,2,3,4,5};
		int k=3;
		rotation_array obj=new rotation_array();
		for(int i:obj.rotate(array,k)) {
			System.out.println(i);
		}
		

	}

}
