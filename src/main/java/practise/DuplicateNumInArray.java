package practise;

import java.util.HashSet;

public class DuplicateNumInArray {

	public static void main(String[] args) {
		
		        //int[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};
				int[] a = {1,2,2,3,3,4,5,5,6,7};
		        HashSet<Integer> set = new HashSet<Integer>();
		        System.out.println("Duplicate Elements are :");
		        for (int arrayElement : a)
		        {
		            if(!set.add(arrayElement))
		            {
		                System.out.print(arrayElement);
		            }
		        }
		    }    
		}
