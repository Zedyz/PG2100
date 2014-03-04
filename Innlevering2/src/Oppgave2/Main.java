package Oppgave2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		utrykning utrykning = new utrykning();
		kontrakt kontrakt = new kontrakt();
		engasjement engasjement = new engasjement();
		
		ArrayList<Tjeneste> tjenester = new ArrayList<Tjeneste>();
		
		tjenester.add(utrykning);
		tjenester.add(kontrakt);
		tjenester.add(engasjement);
		
		for(int i = 0; i < tjenester.size(); i++)	{
			
			Tjeneste tjeneste2 = tjenester.get(i);
			
			System.out.println(tjeneste2.getRegnr() + "Reg nr" +
			
					tjeneste2.getKontaktperson() + "kontaktperson" + 
					tjeneste2.getPris() + "Pris"
					
					);
			

			
			
			System.out.println(tjeneste2);
			
		}
		
		
		
		/*Tjeneste tjeneste1 = new Tjeneste();
		
		Tjeneste tjeneste[] = new Tjeneste[3];
		tjeneste[0] = new utrykning();
		tjeneste[1] = new kontrakt();
		tjeneste[2] = new engasjement();
		
		for(int i = 0; i < tjeneste.length; i++)	{
			
			
			
			System.out.println(tjeneste1.toString());
			
			System.out.println(tjeneste[i].toString());
			
		}*/
		
	}
	
}
