package spiele;

import java.util.Scanner;

public class Checkers 
{
	// Instanzvariablen zur Verwaltung des Spielzustands (Wir)
    private Spielbrett spielbrett;
    private Stein spieler1;
    private Stein spieler2;
    private Stein spielerAmZug;

    public Checkers() 
    {
    	// Initialisierung der Variablen (Wir)
        spielbrett = new Spielbrett();
        spieler1 = new Stein('x');
        spieler2 = new Stein('o');
        spielerAmZug = spieler1;

        // Positionierung der Spielsteine (Wir)
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
    
    // Rückgabe des Spielstein-Objekts für den angegebenen Spieler: 1 oder 2 (Wir)
    public Stein getSpieler(int num) 
    {
        if (num == 1)
            return spieler1;
        if (num == 2)
            return spieler2;
        else
            return null;
    }

    // Rückgabe des Spielbrett-Objekts (Wir)
    public Spielbrett getSpielbrett() 
    {
        return spielbrett;
    }
    
    // Startet das Spiel und initialisiert den Scanner für die Benutzereingabe (ChatGPT)
    // Die Variable „spielBeendet“ wird auf "false" gesetzt, um den Spielzustand zu verfolgen (ChatGPT)
    public void spielen() {
        Scanner scanner = new Scanner(System.in);
        boolean spielBeendet = false;
        while (!spielBeendet) 
        {
        	
            // Spielbrett anzeigen (Wir)
            spielbrett.anzeigen();

            // Zug des aktuellen Spielers abfragen (ChatGPT - verändert)
            System.out.println();
            System.out.println();
            System.out.print("Spieler " + spielerAmZug.getSymbol() + " ist am Zug.");
            System.out.print(" Geben Sie die Startposition ein (Reihe | Spalte): ");
            int startReihe = scanner.nextInt();

            // (Start) Spalte als Buchstabe eingeben und in numerischen Wert umwandeln (ChatGPT - verändert)
            String startSpalteInput = scanner.next();
            char startSpalteChar = startSpalteInput.toLowerCase().charAt(0); // Kleinbuchstaben verwenden und ersten Buchstaben nehmen
            int startSpalte = startSpalteChar - 'a'; // Buchstabe in numerischen Wert umwandeln (a=0, b=1, usw.)

            System.out.println("Geben Sie die Zielposition ein (Reihe | Spalte): ");
            int zielReihe = scanner.nextInt();

            // (Ziel) Spalte als Buchstabe eingeben und in numerischen Wert umwandeln (ChatGPT)
            String zielSpalteInput = scanner.next();
            char zielSpalteChar = zielSpalteInput.toLowerCase().charAt(0); // Kleinbuchstaben verwenden und ersten Buchstaben nehmen
            int zielSpalte = zielSpalteChar - 'a'; // Buchstabe in numerischen Wert umwandeln (a=0, b=1, usw.)

            
            // Zug ausführen (ChatGPT)
            boolean gueltigerZug = spielbrett.istGueltigerZug(startReihe, startSpalte, zielReihe, zielSpalte);
            if (gueltigerZug) {
                spielbrett.bewegeSpielfigur(startReihe, startSpalte, zielReihe, zielSpalte);
                spielerAmZug = (spielerAmZug == spieler1) ? spieler2 : spieler1;
            } else {
                System.out.println("Ungültiger Zug. Bitte erneut eingeben."); }
            
            
            // Überprüfen, ob das Spiel beendet ist (ChatGPT)
            spielBeendet = spielbrett.istSpielBeendet(); }

        // Spielende anzeigen (ChatGPT)
        spielbrett.anzeigen();
        System.out.println("Spiel beendet!"); }
    
    // Hauptmethode des Programms, erstellt ein Checkers-Objekt und ruft die „spielen“ Methode auf, um das Spiel zu starten (Wir)
    public static void main(String[] args) 
    {
        Checkers checkers = new Checkers();
        checkers.spielen();
    }
}