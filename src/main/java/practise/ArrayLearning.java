package practise;

import java.util.ArrayList;
import java.util.List;

public class ArrayLearning {

	public static void main(String[] args) {
		int o=0;
		int p=0;
		int a[]= {2,3,4,4,5,6,5,7,8,8};
		int l=a.length;
		System.out.print("A elements are ");
		for(int aArray:a) {
			System.out.print(aArray);
		}
		System.out.println();
		System.out.println("Length of aArray is "+l);
		List <Integer> duplicate = new ArrayList<Integer>();
		List <Integer> unique = new ArrayList<Integer>();
		/*int[] b= new int[l]; 
		int[] c= new int[l];*/
		
		for(int i =0; i<l; i++)
		{
			for(int j=i+1; j<l; j++)
			{
				if(a[i]==a[j]&&(i!=j))
				{
					duplicate.add(a[j]);
					
				}else
				{
					unique.add(a[j]);
					
				}
			}
		}
		
		System.out.println();
		System.out.print("Duplicate elements are ");
		for(int bArray:duplicate) {
			System.out.print(bArray);
		}
		System.out.println();
		System.out.print("Unique elements are ");
		for(int cArray:unique) {
			System.out.print(cArray);
		}
	}

}
