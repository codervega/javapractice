package array;

public class array_2d {

	public static void main(String[] args) {
	 int [][] Abhi= {{1,2,3,4,5},{22,23,24,25,25},
			 {31,32,33,34,35},{41,42,43,44,45},
			 {51,52,53,54,55},{61,62,63,64,65}};
	 for(int i=0;i<Abhi.length;i++)
	 {
		 for(int j=0;j<Abhi[i].length;j++)
		 {
			 System.out.print(Abhi[i][j]+" ");
		 }
		 System.out.println();
	 }

	}

}
