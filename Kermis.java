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
		if (invoer < 1 || invoer > 6) {
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
	Kassa kassa = new Kassa();

	public Attractie(String naam, double prijs, int oppervlakte) {
		this.naam = naam;
		this.prijs = prijs;
		this.oppervlakte = oppervlakte;
	}

	public void draaien() {
		System.out.println("De attractie '" + this.naam + "' draait.");
		this.aantalKeerDraaien++;
//		System.out.println(this.naam + " heeft zo vaak gedraaid: " + this.aantalKeerDraaien);
		kaartVerkoop();
	}
	
	

	public void kaartVerkoop() {
		this.aantalKaartjes++;
		this.omzet = aantalKaartjes * this.prijs;
//		System.out.println("deze attractie heeft zoveel kaartjes verkocht: " + this.aantalKaartjes);
//		System.out.println("de omzet van deze attractie is " + this.omzet  );
		kassa.omzetKermis(this.omzet);
		kassa.kaartVerkoopKermis(this.aantalKaartjes);
		kassa.toonOmzetOfKaartverkoop();
		

	}

}

class Kassa{
	double totaleOmzetKermis;
	int totaalAantalKaartjes;

	
	public void omzetKermis(double omzet){
		this.totaleOmzetKermis = totaleOmzetKermis + omzet;
//		System.out.println("De totale omzet van de kermis is: " + totaleOmzetKermis);
	}
	
	public void kaartVerkoopKermis(int kaartjes) {
//		this.totaalAantalKaartjes = totaalAantalKaartjes + kaartjes;
		System.out.println("Er zijn in totaal zoveel kaartjes verkocht: " + totaalAantalKaartjes);
	}
	
	public void toonOmzetOfKaartverkoop() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Voer een 'o' in voor de totale omzet van de kermis, voer een 'k' in voor het totale aantal verkochte kaartjes");
		String invoer = scanner.next();
		if (invoer.equals("o")){
			System.out.println("De totale omzet van de kermis is: " + this.totaleOmzetKermis);
		} else if (invoer.equals("k")) {
			System.out.println("Het totaal aantal verkochte kaartjes op de kermis is: " + this.totaalAantalKaartjes);
		}
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









