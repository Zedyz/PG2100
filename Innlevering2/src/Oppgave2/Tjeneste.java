package Oppgave2;

public class Tjeneste {
	
	public int regNr;
	public String kontaktperson;
	public int pris;
	
	public Tjeneste()	{
		
		this(0, "", 0);
	}

	public Tjeneste(int regNr, String kontaktperson, int pris) {
		
		setRegNr(regNr);
		setKontaktperson(kontaktperson);
		setPris(pris);
	}

	private void setRegNr(int regNr) {
		
		this.regNr = regNr;
	}

	private void setKontaktperson(String kontaktperson) {
		
		this.kontaktperson = kontaktperson;
	}

	private void setPris(int pris) {
		
		this.pris = pris;	
	}
	
	public int getRegNr()	{
		
		return regNr;
	}
	
	public String getKontaktperson()	{
		
		return kontaktperson;
	}
	
	public int getPris()	{
		
		return pris;
	}
	
	public boolean equals(Object other)	{
		if(!(other instanceof Tjeneste)) return false;
		if(other == this) return true;
		Tjeneste t = (Tjeneste) other;
		return getRegNr() == (t.getRegNr());
	}
	
	public String toString()	{
		
		return getRegNr() + " " + getKontaktperson() + " " + getPris();
	}
	
}
