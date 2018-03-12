import java.util.ArrayList;

public class Dealer {
	public static ArrayList<Spielkarte> Hand = new ArrayList<Spielkarte>();

	public static void main(String[] args) {

		Kartenstapel Deck = new Kartenstapel();
		Kartenhand KingKieran = new Kartenhand();
		Dealer Geber = new Dealer();
		
		Deck.KartenErstellen();
		
		Deck.SpielerZieht();
		Deck.DealerZieht();

		System.out.println("Der Dealer hat folgende karten: ");
		Geber.Dealer_GibKarten();
		System.out.println("Mit folgendem Wert: " + Geber.Dealer_GibWert());

		System.out.println("Der Spieler hat folgende karten: ");
		KingKieran.Spieler_GibKarten();
		System.out.println("Mit folgendem Wert: " + KingKieran.Spieler_GibWert());

		Deck.GrößeKartenstapel();

		Geber.DealerWartet(3000);

		System.out.println("genug gewartet...");

	}

	public void Dealer_GibKarten() {

		for (int i = 1; i <= Dealer.Hand.size(); i = i + 1) {
			Spielkarte a = Dealer.Hand.get(i - 1);
			System.out.println(a.Kartenfarbe + " " + a.Kartenname);
		}
	}

	public int Dealer_GibWert() {
		int Wert = 0;
		for (int i = 1; i <= Dealer.Hand.size(); i++) {
			Spielkarte a = Dealer.Hand.get(i - 1);
			Wert = a.Kartenwert;
		}
		return Wert;
	}

	public void DealerWartet(int a) {
		try {
			Thread.sleep(a);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

}
