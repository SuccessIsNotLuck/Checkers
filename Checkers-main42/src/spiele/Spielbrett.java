package spiele;

public class Spielbrett 
{
    private final int groesse = 8;
    private char[][] zellen = new char[groesse][groesse]; // [Reihen][Zeilen]

    public Spielbrett() 
    {
        for (int i = 0; i < groesse; i++) {
            for (int j = 0; j < groesse; j++) {
                zellen[i][j] = '-';
            }
        }
    }

    public int getGroesse() 
    {
        return groesse;
    }

    // Spielfigur auf dem Spielbrett platzieren
    public void platziereSpielfigur(int reihe, int spalte, Stein spielfigur) 
    {
        zellen[reihe][spalte] = spielfigur.getSymbol();
    }

    // Spielbrett ausgeben
    public void anzeigen() 
    {
        for (int i = 0; i < groesse; i++) {
            for (int j = 0; j < groesse; j++) {
                System.out.print(zellen[i][j] + " ");
            }
            System.out.println(i);
        }

        for (int i = 0; i < groesse; i++) {
            System.out.print((char) ('a' + i) + " ");
        }
    }
}