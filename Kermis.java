import java.util.Scanner;

public class Kermis {

	Attractie botsauto = new Botsauto("Botsauto", 2.50, 0);
	Attractie spin = new Spin("Spin", 2.25, 0);
	Attractie spiegelhuis = new Spiegelhuis("Spiegelhuis", 2.75, 0);
	Attractie spookhuis = new Spookhuis("Spookhuis", 3.20, 0);
	Attractie hawaii = new Hawaii("Hawaii", 2.90, 0);
	Attractie ladderklimmen = new Ladderklimmen("Ladderklimmen", 5.00, 0);

	public static void main(String[] args) {
		Kermis kermis = new Kermis();

		System.out.println("Welkom op de kermis");
		kermis.kermisDraaien();
	}

	public void kermisDraaien() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Voer een getal van 1-6 in om een attractie te laten draaien");
		int invoer = scanner.nextInt();
		if(invoer < 1 || invoer >  6) {
			System.out.println("Ongeldige invoer, probeer opnieuw een getal tussen 1-6 in te voeren");
			kermisDraaien();
		} else
		switch (invoer) {
		case 1:
			botsauto.draaien();
			break;
		case 2:
			spin.draaien();
			break;
		case 3:
			spiegelhuis.draaien();
			break;
		case 4:
			spookhuis.draaien();
			break;
		case 5:
			hawaii.draaien();
			break;
		case 6:
			ladderklimmen.draaien();
			break;
		
			
		}

	}

}

class Attractie {
	String naam;
	double prijs;
	int oppervlakte;
	int aantalKeerDraaien;
	int aantalKaartjes;
	double omzet;

	public Attractie(String naam, double prijs, int oppervlakte) {
		this.naam = naam;
		this.prijs = prijs;
		this.oppervlakte = oppervlakte;
	}

	public void draaien() {
		System.out.println("De attractie '" + this.naam + "' draait.");

//		this.aantalKeerDraaien++;
//		this.omzet = aantalKeerDraaien * prijs;
//		aantalKeerDraaien = this.aantalKaartjes;
//
//		System.out.println("Voer 'o' in voor de omzet, voer 'k' in voor het aantal verkochte kaartjes");
//		Scanner scanner2 = new Scanner(System.in);
//		String omzetOfKaartjes = scanner2.next();
//		if (omzetOfKaartjes.equals("o")) {
//			System.out.println(this.omzet);
//		} else if (omzetOfKaartjes.equals("k")) {
//			System.out.println(this.aantalKaartjes);
//
//			return null;
//		}
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