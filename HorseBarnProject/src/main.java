
public class main {

	public static void main(String[] args) {
		
		HorseBarn hb = new HorseBarn(7);
		
		hb.addHorse("Bob", 2500);
		hb.addHorse("Kelly", 2500);
		hb.addHorse("Bill", 1200);
		hb.addHorse("Sue", 1600);
		hb.addHorse("Jeff", 2000);
		hb.addHorse("Michael", 1500);
		hb.addHorse("Rodney", 1800);
		
		System.out.println("Barn with horses:");
		hb.showBarn();
		
		hb.removeHorse("Sue");
		hb.removeHorse("Rodney");
		hb.removeHorse("Kelly");
		
		System.out.println();
		System.out.println("Barn with horses removed");
		hb.showBarn();
		
		hb.consolidate();
		
		System.out.println();
		System.out.println("Barn with horses consolidated");
		hb.showBarn();
		
		hb.removeHorse("Bill");
		hb.removeHorse("Bob");
		
		System.out.println();
		System.out.println("Barn with horses removed");
		hb.showBarn();
		
		hb.addHorse("Leo", 1700);
		hb.addHorse("Meghan", 1900);
		
		System.out.println();
		System.out.println("Barn with horses added");
		hb.showBarn();
		
		hb.removeHorse("Jeff");
		
		System.out.println();
		System.out.println("Barn with horses removed");
		hb.showBarn();
		
		hb.addHorse("Abin", 2700);
		hb.addHorse("Nestle", 1600);
		
		System.out.println();
		System.out.println("Barn with horses added");
		hb.showBarn();
		
		hb.removeHorse("Meghan");
		hb.removeHorse("Abin");
		hb.removeHorse("Michael");
		
		System.out.println();
		System.out.println("barn with horses removed");
		hb.showBarn();
		
		hb.consolidate();
		
		System.out.println();
		System.out.println("Barn with horses consolidated");
		hb.showBarn();
	}

}
