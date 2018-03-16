import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Dealer {
	public static ArrayList<Spielkarte> Hand = new ArrayList<Spielkarte>();

	public static void main(String[] args) {

		Kartenstapel Deck = new Kartenstapel();
		Kartenhand KingKieran = new Kartenhand();
		Dealer Geber = new Dealer();
		
		Deck.KartenErstellen();
		Deck.GrößeKartenstapel();
		Deck.SpielerZieht();
		Deck.DealerZieht();

		System.out.println("Der Dealer hat folgende karten: ");
		Geber.Dealer_GibKarten();
		System.out.println("Mit folgendem Wert: " + Geber.Dealer_GibWert());

		System.out.println("Der Spieler hat folgende karten: ");
		KingKieran.Spieler_GibKarten();
		System.out.println("Mit folgendem Wert: " + KingKieran.Spieler_GibWert());

		Deck.GrößeKartenstapel();

				
		while (KingKieran.Spieler_GibWert()<=21) {
			int frageNachKarte= JOptionPane.showConfirmDialog(null, "Soll eine weitere Karte gezogen werden?", "Zugabfrage", JOptionPane.YES_NO_CANCEL_OPTION);
			if (frageNachKarte == 0) {
				Deck.SpielerZieht();
				KingKieran.Spieler_GibKarten();
				System.out.println("Mit folgendem Wert: " + KingKieran.Spieler_GibWert());
				System.out.println();
			}
			if(frageNachKarte == 1) {
				break;
			}
			if(frageNachKarte == 2) {
				System.exit(0);
			}
		}
		
		if (KingKieran.Spieler_GibWert() > 21) {
			JOptionPane.showMessageDialog(null, "Du hast " + KingKieran.Spieler_GibWert() +  " Punkte und somit verloren");
			System.exit(0);
		}
		else {
			while (Geber.Dealer_GibWert()<=16) {
				Deck.DealerZieht();
				Geber.Dealer_GibKarten();
				System.out.println();
				}
			if (Geber.Dealer_GibWert() > 21) {
				JOptionPane.showMessageDialog(null, "Das Haus hat " + Geber.Dealer_GibWert() +  " Punkte und somit verloren");
				System.exit(0);
		}
	
		
		System.out.println("Ergebnis:");
		System.out.println("King Kieran hat " + KingKieran.Spieler_GibWert() + " Punkte");
		System.out.println("Das Haus hat " + Geber.Dealer_GibWert() + " Punkte");
		if (KingKieran.Spieler_GibWert()>Geber.Dealer_GibWert()) {
			System.out.println("Somit hat King Kieran gewonnen");
		}
		else {
			if(KingKieran.Spieler_GibWert()<Geber.Dealer_GibWert()) {
				System.out.println("Somit hat das Haus gewonnen");
			}
			else {
				System.out.println("Unentschieden -> Der Pot wird geteilt");
			}
		}
		}

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
			Wert =  Wert + a.Kartenwert;
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
