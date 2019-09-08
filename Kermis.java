import java.util.ArrayList;
import java.util.Scanner;

public class Kermis {

	public static void main(String[] args) {

		Attractie attractie = new Attractie(null, 0, 0);
		Botsauto botsauto = new Botsauto("Botsauto", 2.50, 0);
		Spin spin = new Spin("Spin", 2.25, 0);
		Spiegelhuis spiegelhuis = new Spiegelhuis("Spiegelhuis", 2.75, 0);
		Spookhuis spookhuis = new Spookhuis("Spookhuis", 3.20, 0);
		Hawaii hawaii = new Hawaii("Hawaii", 2.90, 0);
		Ladderklimmen ladderklimmen = new Ladderklimmen("Ladderklimmen", 5.00, 0);

		System.out.println("Welkom op de kermis");
		attractie.attractieDraaien();
	}

}

class Attractie {
	String naam;
	double prijs;
	int oppervlakte;
	int aantalKeerDraaien;
	double omzet;
	int aantalKaartjes;

	public Attractie(String naam, double prijs, int oppervlakte) {
		this.naam = naam;
		this.prijs = prijs;
		this.oppervlakte = oppervlakte;
	}

	public Attractie attractieDraaien() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Voer een getal van 1-6 in om een attractie te laten draaien");
		String invoer = scanner.next();
		if (invoer.equals("1")) {
			naam = "Botsauto";
			return draaien();
		} else if (invoer.equals("2")) {
			naam = "Spin";
			return draaien();
		} else if (invoer.equals("3")) {
			naam = "Spiegelhuis";
			return draaien();
		} else if (invoer.equals("4")) {
			naam = "Spookhuis";
			return draaien();
		} else if (invoer.equals("5")) {
			naam = "Hawaii";
			return draaien();
		} else if (invoer.equals("6")) {
			naam = "Ladderklimmen";
			return draaien();
		}
		return null;

	}

	public Attractie draaien() {
		System.out.println("De attractie '" + this.naam + "' draait.");
		

		this.aantalKeerDraaien++;
		this.omzet = aantalKeerDraaien * prijs;
		aantalKeerDraaien = this.aantalKaartjes;

		System.out.println("Voer 'o' in voor de omzet, voer 'k' in voor het aantal verkochte kaartjes");
		Scanner scanner2 = new Scanner(System.in);
		String omzetOfKaartjes = scanner2.next();
		if (omzetOfKaartjes.equals("o")) {
			System.out.println(this.omzet);
		} else if (omzetOfKaartjes.equals("k")) {
			System.out.println(this.aantalKaartjes);

			return null;
		}
		return null;
	}
}

class Botsauto extends Attractie {
	public Botsauto(String naam, double prijs, int oppervlakte) {
		super(naam, prijs, oppervlakte);
	}
}

class Spin extends Attractie {
	public Spin(String naam, double prijs, int oppervlakte) {
		super(naam, prijs, oppervlakte);
	}
}

class Spiegelhuis extends Attractie {
	public Spiegelhuis(String naam, double prijs, int oppervlakte) {
		super(naam, prijs, oppervlakte);
	}
}

class Spookhuis extends Attractie {
	public Spookhuis(String naam, double prijs, int oppervlakte) {
		super(naam, prijs, oppervlakte);
	}
}

class Hawaii extends Attractie {
	public Hawaii(String naam, double prijs, int oppervlakte) {
		super(naam, prijs, oppervlakte);
	}
}

class Ladderklimmen extends Attractie {
	public Ladderklimmen(String naam, double prijs, int oppervlakte) {
		super(naam, prijs, oppervlakte);
	}
}

class Kassa {
	double omzetHeleKermis;
	int totaalAantalKaartjes;
}