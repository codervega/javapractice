package array;

public class finding_mid {
	public void peak(int[] abhi,int low,int high) {
		int mid=(low+(high-low))/2;
		while(low<=high)
		{
			if(abhi[mid]>abhi[mid+1] && abhi[mid]>abhi[mid-1])
			{
				System.out.println("the peak value is"+abhi[mid]);
				break;
			}
			else
			{
				if(abhi[mid]<abhi[mid+1])
				{
				  low=mid+1;
				  peak(abhi,low ,high);
				}
				else
				{
					  high=mid-1;
					  peak(abhi,low ,high);
					
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] abhi= {12,13,14,7,4,2};
		int low=0;
		int high=abhi.length-1;
		finding_mid obj=new finding_mid();
		obj.peak(abhi,low,high);
		
	}

}
