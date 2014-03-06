package Oppgave2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Tjeneste utrykning = new utrykning(212, "testperson1", 123, 123);
		Tjeneste kontrakt = new kontrakt(213, "testperson2", 232, "fredag");
		Tjeneste engasjement = new engasjement(1232, "testperson3", 231, 213);
		
		ArrayList<Tjeneste> tjenester = new ArrayList<Tjeneste>();
		
		tjenester.add(utrykning);
		tjenester.add(kontrakt);
		tjenester.add(engasjement);
		
		for(int i = 0; i < tjenester.size(); i++)	{
			
			Tjeneste temp = tjenester.get(i);
			
			System.out.println(temp);
		}
	}
}
