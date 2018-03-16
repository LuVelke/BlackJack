import java.util.ArrayList;

//import javax.swing.JOptionPane;

public class Kartenhand {
	public static ArrayList<Spielkarte> Hand = new ArrayList<Spielkarte>();

	public void Spieler_GibKarten() {
		for (int i = 1; i <= Kartenhand.Hand.size(); i++) {
			Spielkarte a = Kartenhand.Hand.get(i - 1);
			System.out.println(a.Kartenfarbe + " " + a.Kartenname);

		}
	}

	public int Spieler_GibWert() {
		int Wert = 0;
		for (int i = 1; i <= Kartenhand.Hand.size(); i++) {
			Spielkarte a = Kartenhand.Hand.get(i - 1);
			Wert = Wert+  a.Kartenwert;
		}
		return Wert;
	}

	public static void main(String[] args) {

	}

}
