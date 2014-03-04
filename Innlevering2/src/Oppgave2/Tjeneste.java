package Oppgave2;

public class Tjeneste {
	
	public int regnr;
	public String kontaktperson;
	public int pris;
	
	public Tjeneste()	{
		
		this(0, "", 0);
	}
	
	public Tjeneste(int regnr, String kontaktperson, int pris)	{
		
		setRegnr(regnr);
		setKontaktperson(kontaktperson);
		setPris(pris);
		
	}

	private void setRegnr(int regnr) {
		
		this.regnr = regnr;
		
	}

	private void setKontaktperson(String kontaktperson) {
		
		this.kontaktperson = kontaktperson;
		
	}

	private void setPris(int pris) {
		
		this.pris = pris;
		
	}
	
	public int getRegnr()	{
		
		return regnr;
		
	}
	
	public String getKontaktperson()	{
		
		return kontaktperson;
		
	}
	
	public int getPris()	{
		
		return pris;
		
	}
	
	/*public int getGebyr()	{
		
		return gebyr;
		
	}
	
	public String getDag()	{
		
		return dag;
	}
	
	public int getVarighet()	{
		
		return varighet;
		
	}
	
	public String toString()	{
		
		return;
	}*/
	
	/*public String toString()	{
		
		
	}*/
	
}
