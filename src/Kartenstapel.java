import java.util.ArrayList;
import java.util.Collections;

public class Kartenstapel {
	public static ArrayList<Spielkarte> Kartenstapel = new ArrayList<Spielkarte>(52);
	
	static {
		//Karokarten erschaffen
				Spielkarte KaroZwei = new Spielkarte(2,"Karo","Zwei");
				Spielkarte KaroDrei = new Spielkarte(3,"Karo","Drei");
				Spielkarte KaroVier = new Spielkarte(4,"Karo","Vier");
				Spielkarte KaroFuenf = new Spielkarte(5,"Karo","Fünf");
				Spielkarte KaroSechs = new Spielkarte(6,"Karo","Sechs");
				Spielkarte KaroSieben = new Spielkarte(7,"Karo","Sieben");
				Spielkarte KaroAcht = new Spielkarte(8,"Karo","Acht");
				Spielkarte KaroNeun = new Spielkarte(9,"Karo","Neun");
				Spielkarte KaroZehn = new Spielkarte(10,"Karo","Zehn");
				Spielkarte KaroBube = new Spielkarte(10,"Karo","Bube");
				Spielkarte KaroDame = new Spielkarte(10,"Karo","Dame");
				Spielkarte KaroKoenig = new Spielkarte(10,"Karo","König");
				Spielkarte KaroAss = new Spielkarte(11,"Karo","Ass");
				
				//Herzkarten erschaffen
				Spielkarte HerzZwei = new Spielkarte(2,"Herz","Zwei");
				Spielkarte HerzDrei = new Spielkarte(3,"Herz","Drei");
				Spielkarte HerzVier = new Spielkarte(4,"Herz","Vier");
				Spielkarte HerzFuenf = new Spielkarte(5,"Herz","Fünf");
				Spielkarte HerzSechs = new Spielkarte(6,"Herz","Sechs");
				Spielkarte HerzSieben = new Spielkarte(7,"Herz","Sieben");
				Spielkarte HerzAcht = new Spielkarte(8,"Herz","Acht");
				Spielkarte HerzNeun = new Spielkarte(9,"Herz","Neun");
				Spielkarte HerzZehn = new Spielkarte(10,"Herz","Zehn");
				Spielkarte HerzBube = new Spielkarte(10,"Herz","Bube");
				Spielkarte HerzDame = new Spielkarte(10,"Herz","Dame");
				Spielkarte HerzKoenig = new Spielkarte(10,"Herz","König");
				Spielkarte HerzAss = new Spielkarte(11,"Herz","Ass");
				
				//Pikkarten erschaffen
				Spielkarte PikZwei = new Spielkarte(2,"Pik","Zwei");
				Spielkarte PikDrei = new Spielkarte(3,"Pik","Drei");
				Spielkarte PikVier = new Spielkarte(4,"Pik","Vier");
				Spielkarte PikFuenf = new Spielkarte(5,"Pik","Fünf");
				Spielkarte PikSechs = new Spielkarte(6,"Pik","Sechs");
				Spielkarte PikSieben = new Spielkarte(7,"Pik","Sieben");
				Spielkarte PikAcht = new Spielkarte(8,"Pik","Acht");
				Spielkarte PikNeun = new Spielkarte(9,"Pik","Neun");
				Spielkarte PikZehn = new Spielkarte(10,"Pik","Zehn");
				Spielkarte PikBube = new Spielkarte(10,"Pik","Bube");
				Spielkarte PikDame = new Spielkarte(10,"Pik","Dame");
				Spielkarte PikKoenig = new Spielkarte(10,"Pik","König");
				Spielkarte PikAss = new Spielkarte(11,"Pik","Ass");
				
				//Kreuzkarten erschaffen
				Spielkarte KreuzZwei = new Spielkarte(2,"Kreuz","Zwei");
				Spielkarte KreuzDrei = new Spielkarte(3,"Kreuz","Drei");
				Spielkarte KreuzVier = new Spielkarte(4,"Kreuz","Vier");
				Spielkarte KreuzFuenf = new Spielkarte(5,"Kreuz","Fünf");
				Spielkarte KreuzSechs = new Spielkarte(6,"Kreuz","Sechs");
				Spielkarte KreuzSieben = new Spielkarte(7,"Kreuz","Sieben");
				Spielkarte KreuzAcht = new Spielkarte(8,"Kreuz","Acht");
				Spielkarte KreuzNeun = new Spielkarte(9,"Kreuz","Neun");
				Spielkarte KreuzZehn = new Spielkarte(10,"Kreuz","Zehn");
				Spielkarte KreuzBube = new Spielkarte(10,"Kreuz","Bube");
				Spielkarte KreuzDame = new Spielkarte(10,"Kreuz","Dame");
				Spielkarte KreuzKoenig = new Spielkarte(10,"Kreuz","König");
				Spielkarte KreuzAss = new Spielkarte(11,"Kreuz","Ass");
				
				//Karten in Kartenstapel legen
				Kartenstapel.add(KaroZwei);
				Kartenstapel.add(KaroDrei);
				Kartenstapel.add(KaroVier);
				Kartenstapel.add(KaroFuenf);
				Kartenstapel.add(KaroSechs);
				Kartenstapel.add(KaroSieben);
				Kartenstapel.add(KaroAcht);
				Kartenstapel.add(KaroNeun);
				Kartenstapel.add(KaroZehn);
				Kartenstapel.add(KaroBube);
				Kartenstapel.add(KaroDame);
				Kartenstapel.add(KaroKoenig);
				Kartenstapel.add(KaroAss);
				
				Kartenstapel.add(HerzZwei);
				Kartenstapel.add(HerzDrei);
				Kartenstapel.add(HerzVier);
				Kartenstapel.add(HerzFuenf);
				Kartenstapel.add(HerzSechs);
				Kartenstapel.add(HerzSieben);
				Kartenstapel.add(HerzAcht);
				Kartenstapel.add(HerzNeun);
				Kartenstapel.add(HerzZehn);
				Kartenstapel.add(HerzBube);
				Kartenstapel.add(HerzDame);
				Kartenstapel.add(HerzKoenig);
				Kartenstapel.add(HerzAss);
				
				Kartenstapel.add(PikZwei);
				Kartenstapel.add(PikDrei);
				Kartenstapel.add(PikVier);
				Kartenstapel.add(PikFuenf);
				Kartenstapel.add(PikSechs);
				Kartenstapel.add(PikSieben);
				Kartenstapel.add(PikAcht);
				Kartenstapel.add(PikNeun);
				Kartenstapel.add(PikZehn);
				Kartenstapel.add(PikBube);
				Kartenstapel.add(PikDame);
				Kartenstapel.add(PikKoenig);
				Kartenstapel.add(PikAss);
				
				Kartenstapel.add(KreuzZwei);
				Kartenstapel.add(KreuzDrei);
				Kartenstapel.add(KreuzVier);
				Kartenstapel.add(KreuzFuenf);
				Kartenstapel.add(KreuzSechs);
				Kartenstapel.add(KreuzSieben);
				Kartenstapel.add(KreuzAcht);
				Kartenstapel.add(KreuzNeun);
				Kartenstapel.add(KreuzZehn);
				Kartenstapel.add(KreuzBube);
				Kartenstapel.add(KreuzDame);
				Kartenstapel.add(KreuzKoenig);
				Kartenstapel.add(KreuzAss);
				Collections.shuffle(Kartenstapel);
	}
	
	
	
	public static void main(String[] args) {
		
		
		
		
		
		
		


	}
	


}
