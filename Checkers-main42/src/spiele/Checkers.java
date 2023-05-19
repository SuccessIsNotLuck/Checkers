package spiele;

public class Checkers 
{
	
    private Spielbrett spielbrett;
    private Stein spieler1;
    private Stein spieler2;
    private Stein spielerAmZug;

    public Checkers() 
    {
    	
        spielbrett = new Spielbrett();
        spieler1 = new Stein('x');
        spieler2 = new Stein('o');
        spielerAmZug = spieler1;

        // Positionierung der Spielsteine zu Beginn des Spiels
        spielbrett.platziereSpielfigur(0, 0, spieler1);
        spielbrett.platziereSpielfigur(0, 2, spieler1);
        spielbrett.platziereSpielfigur(0, 4, spieler1);
        spielbrett.platziereSpielfigur(0, 6, spieler1);
        spielbrett.platziereSpielfigur(1, 1, spieler1);
        spielbrett.platziereSpielfigur(1, 3, spieler1);
        spielbrett.platziereSpielfigur(1, 5, spieler1);
        spielbrett.platziereSpielfigur(1, 7, spieler1);
        spielbrett.platziereSpielfigur(2, 0, spieler1);
        spielbrett.platziereSpielfigur(2, 2, spieler1);
        spielbrett.platziereSpielfigur(2, 4, spieler1);
        spielbrett.platziereSpielfigur(2, 6, spieler1);

        spielbrett.platziereSpielfigur(5, 1, spieler2);
        spielbrett.platziereSpielfigur(5, 3, spieler2);
        spielbrett.platziereSpielfigur(5, 5, spieler2);
        spielbrett.platziereSpielfigur(5, 7, spieler2);
        spielbrett.platziereSpielfigur(6, 0, spieler2);
        spielbrett.platziereSpielfigur(6, 2, spieler2);
        spielbrett.platziereSpielfigur(6, 4, spieler2);
        spielbrett.platziereSpielfigur(6, 6, spieler2);
        spielbrett.platziereSpielfigur(7, 1, spieler2);
        spielbrett.platziereSpielfigur(7, 3, spieler2);
        spielbrett.platziereSpielfigur(7, 5, spieler2);
        spielbrett.platziereSpielfigur(7, 7, spieler2);
    }

    public Stein getSpieler(int num) 
    {
        if (num == 1)
            return spieler1;
        if (num == 2)
            return spieler2;
        else
            return null;
    }

    public Spielbrett getSpielbrett() 
    {
        return spielbrett;
    }

    public void spielen() {
        // Implementieren: Spielablauf und die Logik für die Spielzüge
    }
}