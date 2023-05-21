package spiele;

/* 

Die Klasse „Spiel“ enthält die Hauptmethode des Programms 
In der Hauptmethode wird ein Checkers-Objekt erstellt und die Methode „anzeigen“ des Spielbrett-Objekts aufgerufen, 
um das Spielbrett auszugeben 

*/

public class Spiel // Wir 
{

	public static void main(String[] args) 
	{
		Checkers checkers = new Checkers();
		checkers.getSpielbrett().anzeigen();
		
	}
}