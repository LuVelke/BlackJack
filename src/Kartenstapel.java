import java.util.ArrayList;
import java.util.Collections;

public class Kartenstapel {
	public static ArrayList<Spielkarte> Deck = new ArrayList<Spielkarte>(52);

	public void KartenErstellen() { // neue Methode
		String[] Farbe = new String[] { "Karo", "Herz", "Pik", "Kreuz" };
		String[] Wert = new String[] { "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun", "Zehn",
				"Bube", "Dame", "König", "Ass" };
		int[] Zahlen = new int[] { 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11 };
		for (int i = 1; i <= Farbe.length; i++) {
			for (int j = 1; j <= Wert.length; j++) {
				Spielkarte a = new Spielkarte(Zahlen[j - 1], Farbe[i - 1], Wert[j - 1]);
				Kartenstapel.Deck.add(a);
			}
		}
		Collections.shuffle(Deck);
	}

	public void SpielerZieht() {
		Spielkarte Karte = Kartenstapel.Deck.get(Kartenstapel.Deck.size() - 1);
		Kartenhand.Hand.add(Karte);
		Deck.remove(Karte);
	}

	public void DealerZieht() {
		Spielkarte Karte = Kartenstapel.Deck.get(Kartenstapel.Deck.size() - 1);
		Dealer.Hand.add(Karte);
		Deck.remove(Karte);
	}

	public void GrößeKartenstapel() {
		int groesse = Kartenstapel.Deck.size();
		System.out.println("Restliche Karten: " + groesse);
	}

	public static void main(String[] args) {

	}

}

/*
 * -> alte Version -> Test ob neues System funzts { // Karokarten erschaffen
 * Spielkarte KaroZwei = new Spielkarte(2, "Karo", "Zwei"); Spielkarte KaroDrei
 * = new Spielkarte(3, "Karo", "Drei"); Spielkarte KaroVier = new Spielkarte(4,
 * "Karo", "Vier"); Spielkarte KaroFuenf = new Spielkarte(5, "Karo", "Fünf");
 * Spielkarte KaroSechs = new Spielkarte(6, "Karo", "Sechs"); Spielkarte
 * KaroSieben = new Spielkarte(7, "Karo", "Sieben"); Spielkarte KaroAcht = new
 * Spielkarte(8, "Karo", "Acht"); Spielkarte KaroNeun = new Spielkarte(9,
 * "Karo", "Neun"); Spielkarte KaroZehn = new Spielkarte(10, "Karo", "Zehn");
 * Spielkarte KaroBube = new Spielkarte(10, "Karo", "Bube"); Spielkarte KaroDame
 * = new Spielkarte(10, "Karo", "Dame"); Spielkarte KaroKoenig = new
 * Spielkarte(10, "Karo", "König"); Spielkarte KaroAss = new Spielkarte(11,
 * "Karo", "Ass");
 * 
 * // Herzkarten erschaffen Spielkarte HerzZwei = new Spielkarte(2, "Herz",
 * "Zwei"); Spielkarte HerzDrei = new Spielkarte(3, "Herz", "Drei"); Spielkarte
 * HerzVier = new Spielkarte(4, "Herz", "Vier"); Spielkarte HerzFuenf = new
 * Spielkarte(5, "Herz", "Fünf"); Spielkarte HerzSechs = new Spielkarte(6,
 * "Herz", "Sechs"); Spielkarte HerzSieben = new Spielkarte(7, "Herz",
 * "Sieben"); Spielkarte HerzAcht = new Spielkarte(8, "Herz", "Acht");
 * Spielkarte HerzNeun = new Spielkarte(9, "Herz", "Neun"); Spielkarte HerzZehn
 * = new Spielkarte(10, "Herz", "Zehn"); Spielkarte HerzBube = new
 * Spielkarte(10, "Herz", "Bube"); Spielkarte HerzDame = new Spielkarte(10,
 * "Herz", "Dame"); Spielkarte HerzKoenig = new Spielkarte(10, "Herz", "König");
 * Spielkarte HerzAss = new Spielkarte(11, "Herz", "Ass");
 * 
 * // Pikkarten erschaffen Spielkarte PikZwei = new Spielkarte(2, "Pik",
 * "Zwei"); Spielkarte PikDrei = new Spielkarte(3, "Pik", "Drei"); Spielkarte
 * PikVier = new Spielkarte(4, "Pik", "Vier"); Spielkarte PikFuenf = new
 * Spielkarte(5, "Pik", "Fünf"); Spielkarte PikSechs = new Spielkarte(6, "Pik",
 * "Sechs"); Spielkarte PikSieben = new Spielkarte(7, "Pik", "Sieben");
 * Spielkarte PikAcht = new Spielkarte(8, "Pik", "Acht"); Spielkarte PikNeun =
 * new Spielkarte(9, "Pik", "Neun"); Spielkarte PikZehn = new Spielkarte(10,
 * "Pik", "Zehn"); Spielkarte PikBube = new Spielkarte(10, "Pik", "Bube");
 * Spielkarte PikDame = new Spielkarte(10, "Pik", "Dame"); Spielkarte PikKoenig
 * = new Spielkarte(10, "Pik", "König"); Spielkarte PikAss = new Spielkarte(11,
 * "Pik", "Ass");
 * 
 * // Kreuzkarten erschaffen Spielkarte KreuzZwei = new Spielkarte(2, "Kreuz",
 * "Zwei"); Spielkarte KreuzDrei = new Spielkarte(3, "Kreuz", "Drei");
 * Spielkarte KreuzVier = new Spielkarte(4, "Kreuz", "Vier"); Spielkarte
 * KreuzFuenf = new Spielkarte(5, "Kreuz", "Fünf"); Spielkarte KreuzSechs = new
 * Spielkarte(6, "Kreuz", "Sechs"); Spielkarte KreuzSieben = new Spielkarte(7,
 * "Kreuz", "Sieben"); Spielkarte KreuzAcht = new Spielkarte(8, "Kreuz",
 * "Acht"); Spielkarte KreuzNeun = new Spielkarte(9, "Kreuz", "Neun");
 * Spielkarte KreuzZehn = new Spielkarte(10, "Kreuz", "Zehn"); Spielkarte
 * KreuzBube = new Spielkarte(10, "Kreuz", "Bube"); Spielkarte KreuzDame = new
 * Spielkarte(10, "Kreuz", "Dame"); Spielkarte KreuzKoenig = new Spielkarte(10,
 * "Kreuz", "König"); Spielkarte KreuzAss = new Spielkarte(11, "Kreuz", "Ass");
 * 
 * // Karten in Kartenstapel legen Deck.add(KaroZwei); Deck.add(KaroDrei);
 * Deck.add(KaroVier); Deck.add(KaroFuenf); Deck.add(KaroSechs);
 * Deck.add(KaroSieben); Deck.add(KaroAcht); Deck.add(KaroNeun);
 * Deck.add(KaroZehn); Deck.add(KaroBube); Deck.add(KaroDame);
 * Deck.add(KaroKoenig); Deck.add(KaroAss);
 * 
 * Deck.add(HerzZwei); Deck.add(HerzDrei); Deck.add(HerzVier);
 * Deck.add(HerzFuenf); Deck.add(HerzSechs); Deck.add(HerzSieben);
 * Deck.add(HerzAcht); Deck.add(HerzNeun); Deck.add(HerzZehn);
 * Deck.add(HerzBube); Deck.add(HerzDame); Deck.add(HerzKoenig);
 * Deck.add(HerzAss);
 * 
 * Deck.add(PikZwei); Deck.add(PikDrei); Deck.add(PikVier); Deck.add(PikFuenf);
 * Deck.add(PikSechs); Deck.add(PikSieben); Deck.add(PikAcht);
 * Deck.add(PikNeun); Deck.add(PikZehn); Deck.add(PikBube); Deck.add(PikDame);
 * Deck.add(PikKoenig); Deck.add(PikAss);
 * 
 * Deck.add(KreuzZwei); Deck.add(KreuzDrei); Deck.add(KreuzVier);
 * Deck.add(KreuzFuenf); Deck.add(KreuzSechs); Deck.add(KreuzSieben);
 * Deck.add(KreuzAcht); Deck.add(KreuzNeun); Deck.add(KreuzZehn);
 * Deck.add(KreuzBube); Deck.add(KreuzDame); Deck.add(KreuzKoenig);
 * Deck.add(KreuzAss); Collections.shuffle(Deck);
 * 
 * }
 */