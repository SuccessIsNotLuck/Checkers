package spiele;

public class Spielbrett {
	private final int groesse = 8;
	private char [][] zellen = new
			char [groesse][groesse]; // [Reihen][Zeilen]
	
	public Spielbrett() {
		for (int i = 0; i < groesse; i++) {
			for (int j = 0; j < groesse; j++) {
				zellen[i][j] = '-'; 
			}
		}
	}
	
	// Spielbrett ausgeben 
	public void anzeigen() {
		for (int i = 0; i < groesse; i++) {
			
		for (int j = 0; j < groesse; j++) {
			System.out.print(zellen[i][j] + " ");
		}
		System.out.println(i);
		
	}	
		for(int i = 0; i < groesse;i++)
		{
			System.out.print((char)('a' + i) + " ");
		}
  }
}