package AsalSayiBulma;

public class Main {

	public static void main(String[] args) {
		int asal=0;
		int j=2;
		while(j<100) {
			for(int i = 2 ; i<j; i++) {
				if(j%i == 0) {
					asal=1;
				}
			}
			if(asal != 1) {
				System.out.print(j + " ");
			}
			asal = 0;
			j++;
		}		
	}
}
