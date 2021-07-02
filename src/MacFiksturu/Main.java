package MacFiksturu;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		List<String> teams = new ArrayList<>();
		teams.add("Galatasaray");
		teams.add("Bursaspor");
		teams.add("Fenerbahçe");
		teams.add("Başakşehir");
		teams.add("Trabzonspor");
		teams.add("Beşiktaş");
		//teams.add("Boluspor");
		
		if(teams.size()%2 != 0) {
			teams.add("Bay");
		}
		
		System.out.println(teams);
		String countTeam = teams.get(0);
		
		//teams.remove(0);
		
		for(int i = 0 ; i<teams.size()-1; i++) {
			System.out.println((i+1) + "HAFTA" );
			System.out.println();
			System.out.println(teams.get(i) + " vs " + teams.get(i+1));
			for(int j = i+2 ; j<teams.size()-2/2;j+=2) {
				System.out.println(teams.get(j) + " vs " + teams.get(j+1));
			}
			System.out.println();
		}
		
		
	}

}
