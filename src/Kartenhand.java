import javax.swing.JOptionPane;

public class Kartenhand {

	public static void main(String[] args) {
		
		String a= JOptionPane.showInputDialog("Wie viele Karten?");
		int b = Integer.valueOf(a);
		int d=0;
		for (int c=1; c<=b;c++)
		{
			Spielkarte Karte=Kartenstapel.Kartenstapel.get(Kartenstapel.Kartenstapel.size()-1);
			d=d+Karte.Kartenwert;
			Kartenstapel.Kartenstapel.remove(Karte);
			System.out.println("Spieler zieht als "+c+". Karte: " + Karte.Kartenfarbe+" "+Karte.Kartenname);
		}
		int groesse = Kartenstapel.Kartenstapel.size();
		System.out.println("Somit ist der aktuelle Wert auf der Hand: "+d);
		System.out.println("Resltiche Karten: "+groesse);
		System.out.println(".... du sexy Hexy");
		
	}

}
