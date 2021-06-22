package DiziElemanlarininFrekansi;

import java.util.Arrays;
import java.util.Iterator;

public class Main {

static boolean isFind(int[] arr ,int value) {
		
		for(int i : arr) {
			if(i==value) {
				return true;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		
		int[] list = {3,7,3,3,2,9,10,21,1,33,9,2};
		int count = 1;
		int[] duplicate = new int[list.length];
		Arrays.sort(list);
		int index = 0;
		for(int i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i = 0 ; i<list.length ; i++) {
			for(int j = 0 ; j<list.length ; j++) {
				if((i != j) && (list[i] == list[j])) {
					if(!isFind(duplicate, list[i])) {
						duplicate[index++] = list[i];
						
					}
					count++;
					break;
				}
				
				
			}
			System.out.println(count);
			count = 0;
		}
		
		
		for(int i : duplicate) {
			System.out.print(i + " ");
		}
		
		System.out.print ("Dizi : ");
		System.out.print ("{ ");
		for(int i : list) {
			System.out.print(i + ",");
		}
		System.out.println ("}");
		
	}


}
