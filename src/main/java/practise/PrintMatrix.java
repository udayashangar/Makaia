package practise;

public class PrintMatrix {

	public static void main(String[] args) {
	/*	int n=0;
		for(int i=1;i<5;i++) {
			for(int j=1;j<5;j++) {
				 n=n+1;
				System.out.print(n);
				
				
			}System.out.println();
		}*/
		//array declaration
		int a[][] = {{1,2,3,4},
					 {5,6,7,8},
				     {9,10,11,12},
				     {13,14,15,16}};
		
		//print the array
		
		for(int a1=0;a1<4;a1++) {
			for(int a2=0; a2<4;a2++) {
				System.out.print(a[a1][a2]);
			}System.out.println();
		             
		}
		
		//print the array element in circle order
		
		//row index declaration
		int k=0,m=4;
		
		//col index declaration
		int l=0, n=4;
		
		
		while(k<m && l<n) {
			//print first row
			for(int i=l;i<n;i++) {
				System.out.print(a[k][i]+", ");
			}k++; 
			
			//print last colomn
			
			for(int i=k;i<m;i++) {
				System.out.print(a[i][n-1]+", ");
				
			}n--;
			
			//print last row
			if(k<m) {
			for(int i=n;i>=l;--i) {
				System.out.print(a[m-1][i]+", ");
			}m--;
			}
			
			//print first col
			if(l<n) {
			for(int i=m-1;i>=k;--i) {
				System.out.print(a[i][l]+", ");
			}l++;
			
		}
		}
	}

}
