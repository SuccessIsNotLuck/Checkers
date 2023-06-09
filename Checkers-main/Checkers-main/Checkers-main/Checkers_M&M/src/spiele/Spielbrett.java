package spiele;

// Die Klasse „Spielbrett“ repräsentiert das Spielfeld und ermöglicht das Verwalten und Abfragen des Zustands der einzelnen Zellen

public class Spielbrett // Wir
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

    // Spielsteine auf dem Spielbrett platzieren (Wir)
    public void platziereSpielfigur(int reihe, int spalte, Stein spielfigur) 
    {
        zellen[reihe][spalte] = spielfigur.getSymbol();
    }

    
    // Spielbrett ausgeben (Wir)
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
        
        // Überprüfen, ob eine Position auf dem Spielbrett liegt (ChatGPT - verändert)
        private boolean istGueltigePosition(int reihe, int spalte) 
        {
            return reihe >= 0 && reihe < groesse && spalte >= 0 && spalte < groesse;
        }

        // Überprüfen, ob eine bestimmte Position leer ist (ChatGPT - verändert)
        private boolean istLeerePosition(int reihe, int spalte) 
        {
            return zellen[reihe][spalte] == '-';
        }

        // Überprüfen, ob ein Zug gültig ist (ChatGPT)
        public boolean istGueltigerZug(int startReihe, int startSpalte, int zielReihe, int zielSpalte) {
        	
            // Überprüfen, ob Start- und Zielposition gültig sind (ChatGPT)
            if (!istGueltigePosition(startReihe, startSpalte) || !istGueltigePosition(zielReihe, zielSpalte)) {
                return false;
            }

            // Überprüfen, ob die Startposition ein Spielstein enthält (ChatGPT)
            if (istLeerePosition(startReihe, startSpalte)) {
                return false;
            }

            // Überprüfen, ob die Zielposition leer ist (ChatGPT)
            if (!istLeerePosition(zielReihe, zielSpalte)) {
                return false;
            }

            return true;
        }

        
        // Spielstein von der Startposition zur Zielposition bewegen + übersprungene Spielsteine entfernen (ChatGPT - verändert)
        public void bewegeSpielfigur(int startReihe, int startSpalte, int zielReihe, int zielSpalte) 
        {
            if (!istGueltigerZug(startReihe, startSpalte, zielReihe, zielSpalte)) 
            {
                return;
            }

            int uebersprungeneReihe = (startReihe + zielReihe) / 2;
            int uebersprungeneSpalte = (startSpalte + zielSpalte) / 2;

            if (Math.abs(startReihe - zielReihe) == 2 && Math.abs(startSpalte - zielSpalte) == 2) 
            {
                if (!istLeerePosition(uebersprungeneReihe, uebersprungeneSpalte)) 
                {
                    zellen[uebersprungeneReihe][uebersprungeneSpalte] = '-';
                }
            }

            zellen[zielReihe][zielSpalte] = zellen[startReihe][startSpalte];
            zellen[startReihe][startSpalte] = '-';
        }

        // Überprüfen, ob das Spiel beendet ist (Wir)
        public boolean istSpielBeendet() 
        {
            // Implementieren: Logik für das Spielende

            return false; // Rückgabewert entsprechend anpassen
        }
      }