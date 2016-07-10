package Match;

public class Fight {

	public static void main(String[] args) {
		
		Fighter fighter1=new Fighter();

		
		fighter1.assignBoyka();
		System.out.println(fighter1.getName());
		System.out.println(fighter1.getBlock());
		System.out.println(fighter1.getDamage());
		System.out.println(fighter1.getDodge());
		System.out.println(fighter1.getLife());
		System.out.println("------------------");
		
		Fighter fighter2=new Fighter();
		fighter2.assignGeorgeChambers();
		System.out.println(fighter2.getName());
		System.out.println(fighter2.getBlock());
		System.out.println(fighter2.getDamage());
		System.out.println(fighter2.getDodge());
		System.out.println(fighter2.getLife());
		
		System.out.println("------------------");
		
		fighter1.setEnemy(fighter2);
		
		int cnt1=0;
		int cnt2=0;
		
		for (int i = 0; i < 1000; i++) {
			fighter1.assignBoyka();
			fighter2.assignGeorgeChambers();
		
			while (true) {
				
				fighter1.attack();
				printStats(fighter1, fighter2);
				if (fighter2.isAlive()) {
					fighter2.attack();
					printStats(fighter1, fighter2);
				}
				else {
					System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
					System.out.println(fighter1.getName()+" WINS!");
					cnt1++;
					break;
				}

				if (!(fighter1.isAlive())) {
					System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
					System.out.println(fighter2.getName()+" WINS!");
					cnt2++;
					break;
				}
			}

		}
		
		System.out.println("\n=================================");
		System.out.println(fighter1.getName()+" won "+cnt1+" times;");
		System.out.println(fighter2.getName()+" won "+cnt2+" times;");

	}
	static void printStats(Fighter fighter1, Fighter fighter2) { // Prints the current stats (life) of the two fighters
		System.out.println("\nStats: "+fighter1.getName()+" ["+fighter1.getLife()+" hp] | "+fighter2.getName()+" ["+fighter2.getLife()+" hp]\n");
	}

}
