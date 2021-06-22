package HarmonikOrtalamaDizi;

public class Main {

	public static void main(String[] args) {
		
		double[] list = {2,4,8,16};
		double harmonikOrtalama = 0.0;
		double harmonikSeri = 1.0;
		
		for(int i = 0 ; i<list.length ; i++) {
			harmonikSeri+=(1/list[i]);
		}
		
		harmonikOrtalama = list.length / harmonikSeri;
		System.out.println(harmonikOrtalama);
		
	}

}
