package practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import com.mongodb.connection.ClusterType;
import com.mongodb.operation.ListCollectionsOperation;

public class RemoveDuplicate {

	public static void main(String[] args) {

		String cmpName ="google";
		char[] charArray = cmpName.toCharArray();
		
		System.out.println();
		Set<Character> cSet = new LinkedHashSet<>();
		for (Character c : charArray) {
		cSet.add(c);
		}System.out.println("Using Set :"+cSet);	
		
		
		System.out.println();
		List cList = new  ArrayList<>();
		for (char ch :charArray ) {
			if(!cList.contains(ch)) {
				cList.add(ch);
			}
		}System.out.println("Using List :"+cList);	
			
		//Collections.sort(cList);
		
		System.out.println("Using String :");
		
		char[] sortArr = new char[charArray.length];
		
		for(int i=0; i<=charArray.length; i++)
		{
			for (int j = 0; j <= charArray.length; j++) {
				if (charArray[i]==charArray[j]) {
					
					sortArr[i]= charArray[i];
				}
				
			}
			for (char c : sortArr) {
				System.out.print(c);
			}
			
		}
		
		
		
	}
		
	}
	
	

