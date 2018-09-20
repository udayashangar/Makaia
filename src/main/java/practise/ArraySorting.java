package practise;

public class ArraySorting {

	public static void main(String[] args) {
		
		int a[]= {3,2,0,5,6,1};
		int l = a.length;
		for (int i = 0; i < 3; i++) {
			for (int j = i+1; j <3; j++) {
				if(a[i]>a[j]) {
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		for (int e : a) {
			System.out.print(e);
			
		}

	}

}
