package ThreadlerinYarisi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> liste = new ArrayList<Integer>();
		List<Integer> liste1 = new ArrayList<Integer>();
		List<Integer> liste2 = new ArrayList<Integer>();
		List<Integer> liste3 = new ArrayList<Integer>();
		List<Integer> liste4 = new ArrayList<Integer>();
		for(int i = 1 ; i<=10000; i++) {
			liste.add(i);
		}
		for(int i = 1 ; i<=10000 ; i++) {
			if(i<=2500) {
				liste1.add(i);
			}else if(i<=5000) {
				liste2.add(i);
			}else if(i<=7500) {
				liste3.add(i);
			}else{
				liste4.add(i);
			}
		}
		Liste list1 = new Liste(liste1);
		Liste list2 = new Liste(liste2);
		Liste list3 = new Liste(liste3);
		Liste list4 = new Liste(liste4);
		
		Thread t1 = new Thread(list1);
		Thread t2 = new Thread(list2);
		Thread t3 = new Thread(list3);
		Thread t4 = new Thread(list4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
