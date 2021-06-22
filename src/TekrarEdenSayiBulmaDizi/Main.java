package TekrarEdenSayiBulmaDizi;



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
		
		int[] list = {10,20,20,10,10,20,5,2};
		int[] duplicate = new int[list.length];
		int index = 0;
		
		//Tekrar eden sayıları bulma ve yeni listeye ekleme
		for(int i = 0 ; i< list.length ; i++) {
			for(int j = 0 ; j<list.length ; j++) {
				if((i!=j) && (list[i] == list[j])) {
					if(!isFind(duplicate, list[i])) {
						duplicate[index++] = list[i];
					}
				    break;
				}
			}
		}
		
		//Diziyi yazdırma
		System.out.print ("Dizi : ");
		System.out.print ("[ ");
		for(int i : list) {
			System.out.print(i + ",");
		}
		System.out.println ("]");
		
	
		//Tekrar eden sayıların adedini bulma
		System.out.println("Tekrar Sayılar : ");
		for(int i = 0 ; i<duplicate.length ; i++) {
			int count = 0;
			if(duplicate[i] == 0) {
				break;
			}
			for(int j = 0 ; j< list.length ; j++) {
				if(duplicate[i] == list[j]) {
					count++;
				}
			}
			
			
			System.out.println(duplicate[i] +" sayısı " + count + " kez tekrar edildi");
		}
		
		//Tekrar etmeyen sayıların adetini yazdırma
		for(int i = 0 ; i<list.length ; i++) {
			int a=0;
			for(int j = 0 ; j<duplicate.length; j++) {
				if(list[i] == duplicate[j]) {
					a++;
				}
			}
			if(a == 0) {
				System.out.println(list[i] +" sayısı 1 kez tekrar edildi");
				
			}
		}
		
		

		
	}

}
