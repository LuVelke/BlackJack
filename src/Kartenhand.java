import java.util.ArrayList;

//import javax.swing.JOptionPane;

public class Kartenhand {
	public static ArrayList<Spielkarte> Hand = new ArrayList<Spielkarte>();

		public String Spieler_GibKarten() {
			String test;
			StringBuffer Karten = new StringBuffer ("");
			for (int i = 1; i <= Kartenhand.Hand.size(); i++) {
				Spielkarte a = Kartenhand.Hand.get(i - 1);
				
				 Karten.append(a.Kartenfarbe + " " + a.Kartenname + ", ");
				 
			}
			
		test = Karten.toString();
		return test;
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