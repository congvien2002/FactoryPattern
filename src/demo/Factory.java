package demo;

public class Factory {
	public void call(String menu) {
		if(menu.equals("rice")) {
			Rice rice = new Rice();
			rice.cook();
		}
		else if(menu.equals("noodle")) {
			Noodle noodle = new Noodle();
			noodle.cook();
		}
		else if(menu.equals("pasta")) {
			Pasta pasta = new Pasta();
			pasta.cook();
		}
		else if(menu.equals("KFC")) {
			KFC kfc = new KFC();
			kfc.cook();
		}
		else if(menu.equals("hotpot")) {
			Hotpot hotpot = new Hotpot();
			hotpot.cook();
		}
		else {
			System.out.println("Your dish don't have in menu");
		}
	}
}
