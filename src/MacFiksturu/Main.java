package MacFiksturu;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		List<String> teams = new ArrayList<>();
		List<String> teamsCopy = new ArrayList<>();
		teams.add("Galatasaray");
		teams.add("Bursaspor");
		teams.add("Fenerbahçe");
		teams.add("Başakşehir");
		teams.add("Trabzonspor");
		teams.add("Beşiktaş");
		teams.add("Boluspor");
		
		if(teams.size()%2 != 0) {
			teams.add("Bay");
		}
		
		System.out.println(teams);
		String countTeam = teams.get(0);
		
		
		teams.remove(countTeam);
		
		for(int i = 0 ; i< teams.size(); i++) {
			teamsCopy.add(teams.get(i));
		}
		
		 
		// countTeam - teamCopy(lastIndex)      0 + lastIndex = teamCopy.size()
		// teamCopy(1) - teamCopy(lastIndex-1)  1 + lastIndex-1 = teamCopy.size()
		// teamCopy(2) - teamCopy(lastIndex-2)  2 + lastIndex-2 = teamCopy.size()
		//...
		
		for(int  i = 0 ; i <teamsCopy.size() ; i++) {
			
			System.out.println((i+1) + " HAFTA" );
			System.out.println();
			System.out.println(countTeam + " VS " + teamsCopy.get(teamsCopy.size()-1));  
			for(int j = 0; j<teams.size()/2 ; j++) {
				System.out.println(teamsCopy.get(j) + " VS " + teamsCopy.get((teamsCopy.size()-1)-j-1));  
			
			}
		
			
			System.out.println();
			//teamCopy[0,1,2,3,4] -> teamCopy[4,0,1,2,3] -> teamCopy[3,4,0,1,2] -> ....
			teams.set(0, teamsCopy.get(teamsCopy.size()-1));
			for(int j = 0 ; j < teams.size()-1;j++) {
				teams.set(j+1,teamsCopy.get(j));
			}
			for(int j = 0 ; j < teams.size();j++) {
				teamsCopy.set(j,teams.get(j));
			}
			
		}
		
		for(int  i = 0 ; i <teamsCopy.size() ; i++) {
			
			System.out.println((i+6) + " HAFTA" );
			System.out.println();
			System.out.println(teamsCopy.get(teamsCopy.size()-1) + " VS " + countTeam);
			for(int j = 0; j<teams.size()/2 ; j++) {
				System.out.println( teamsCopy.get((teamsCopy.size()-1)-j-1)+ " VS " + teamsCopy.get(j));
			
			}
		
			
			System.out.println();
			teams.set(0, teamsCopy.get(teamsCopy.size()-1));
			for(int j = 0 ; j < teams.size()-1;j++) {
				teams.set(j+1,teamsCopy.get(j));
			}
			for(int j = 0 ; j < teams.size();j++) {
				teamsCopy.set(j,teams.get(j));
			}
			
		}

		
		
		
		
	}

}
