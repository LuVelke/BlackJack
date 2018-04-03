import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Dealer {
	public static ArrayList<Spielkarte> Hand = new ArrayList<Spielkarte>();

	public static void main(String[] args) {

		Kartenstapel Deck = new Kartenstapel();
		Kartenhand KingKieran = new Kartenhand();
		Dealer Geber = new Dealer();
		
		Deck.KartenErstellen();
		Deck.SpielerZieht();
		Deck.DealerZieht();
		
		JOptionPane.showMessageDialog(null, "Der Dealer hat folgende Karten: " + Geber.Dealer_GibKarten() + "\n"+ "Mit folgendem Wert: " + Geber.Dealer_GibWert());
		JOptionPane.showMessageDialog(null, "Der Spieler hat folgende Karten: " + KingKieran.Spieler_GibKarten() + "\n"+ "Mit folgendem Wert: " + KingKieran.Spieler_GibWert());
System.out.println("Penis");

		

				
		while (KingKieran.Spieler_GibWert()<=21) {
			int frageNachKarte= JOptionPane.showConfirmDialog(null, "Soll eine weitere Karte gezogen werden?", "Zugabfrage", JOptionPane.YES_NO_CANCEL_OPTION);
			if (frageNachKarte == 0) {
				Deck.SpielerZieht();
				JOptionPane.showMessageDialog(null, "Der Spieler hat folgende Karten: " + KingKieran.Spieler_GibKarten() + "\n"+ "Mit folgendem Wert: " + KingKieran.Spieler_GibWert());
				
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
				JOptionPane.showMessageDialog(null, "Der Dealer hat folgende Karten: " + Geber.Dealer_GibKarten() + "\n"+ "Mit folgendem Wert: " + Geber.Dealer_GibWert());
				
				}
			if (Geber.Dealer_GibWert() > 21) {
				JOptionPane.showMessageDialog(null, "Das Haus hat " + Geber.Dealer_GibWert() +  " Punkte und somit verloren");
				System.exit(0);
		}
	
		
		JOptionPane.showMessageDialog(null, "Ergebnis: \n" + "King Kieran hat " + KingKieran.Spieler_GibWert() + " Punkte \n" + "Das Haus hat " + Geber.Dealer_GibWert() + " Punkte \n");

		if (KingKieran.Spieler_GibWert()>Geber.Dealer_GibWert()) {
			JOptionPane.showMessageDialog(null, "Somit hat King Kieran gewonnen");
		}
		else {
			if(KingKieran.Spieler_GibWert()<Geber.Dealer_GibWert()) {
				JOptionPane.showMessageDialog(null, "Somit hat das Haus gewonnen");
			}
			else {
				JOptionPane.showMessageDialog(null, "Unentschieden -> Der Pot wird geteilt");
			}
		}
		}

	}

	public String Dealer_GibKarten() {
		String test;
		StringBuffer Karten = new StringBuffer ("");
		for (int i = 1; i <= Dealer.Hand.size(); i++) {
			Spielkarte a = Dealer.Hand.get(i - 1);
			
			 Karten.append(a.Kartenfarbe + " " + a.Kartenname + ", ");
		}
		
	test = Karten.toString();
	return test;
	
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
