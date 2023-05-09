package spiele;

import java.util.Scanner;

public class Checkers {
	private Spielbrett spielbrett;
	private Stein spieler1;
	private Stein spieler2;
	private Stein spielerAmZug;
	
	public Checkers() {
		spielbrett = new Spielbrett();
		spieler1 = new Stein('x');
		spieler2 = new Stein('o');
		spielerAmZug = spieler1;
	}
	
	public Stein getSpieler(int num)
	{
		if(num == 1)
			return spieler1;
		if(num==2)
			return spieler2;
		else
			return null;
	}
	
	public Spielbrett getSpielbrett()
	{
		return spielbrett;
	}
	
	public void spielen(){
		
		Scanner scanner = new
				Scanner(System.in);
	}
}