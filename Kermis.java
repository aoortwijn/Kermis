import java.util.ArrayList;

public class Kermis {

	public static void main(String[] args) {

	Botsauto botsauto = new Botsauto("Botsauto", 2.50, 0);
	Spin spin = new Spin ("Spin", 2.25, 0);
	Spiegelhuis spiegelhuis = new Spiegelhuis("Spiegelhuis", 2.75, 0);
	Spookhuis spookhuis = new Spookhuis("Spookhuis", 3.20, 0);
	Hawaii hawaii = new Hawaii("Hawaii", 2.90, 0);
	Ladderklimmen ladderklimmen = new Ladderklimmen("Ladderklimmen", 5.00, 0);

		

		System.out.println("Welkom op de kermis");
		botsauto.draaien();
	}

}

class Attractie {
	String naam;
	double prijs;
	int oppervlakte;

	public Attractie(String naam, double prijs, int oppervlakte) {
		this.naam = naam;
		this.prijs = prijs;
		this.oppervlakte = oppervlakte;
	}
	public void draaien() {
		System.out.println("De attractie '" + this.naam + "' draait.");
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
