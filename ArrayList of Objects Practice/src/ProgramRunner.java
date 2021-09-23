import java.util.ArrayList;
public class ProgramRunner {
	static ArrayList<Program>TVShows = new ArrayList<Program>();
	public static void main(String[] args) {
		
		TVShows.add(new Program("The Office", "Humor", 9));
		TVShows.add(new Program("Outer Banks", "Action", 2));
		TVShows.add(new Program("Loki", "Action", 1));
		TVShows.add(new Program("Wanda Vision", "Action", 1));
		TVShows.add(new Program("The Mandolorian", "Action", 2));
		
		printList();
		TVShows.get(3).setNumberOfSeasonsAired(TVShows.get(3).getNumberOfSeasonsAired()+ 1);
		
		printList();
	}
	public static void printList() {
		;
		for(int i = 0; i < TVShows.size(); i++) {
			System.out.println(TVShows.get(i).getTitle());
			System.out.println(TVShows.get(i).getGenre());
			System.out.println(TVShows.get(i).getNumberOfSeasonsAired());
			System.out.println(" ");
		}
	}

}
