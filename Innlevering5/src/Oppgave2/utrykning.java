package Oppgave2;

public class utrykning extends Tjeneste {

	public int gebyr;
	
	public utrykning()	{
		
		this(0, "", 0, 0);
	}

	public utrykning(int regNr, String kontaktperson, int pris, int gebyr) {
		
		super(regNr, kontaktperson, pris);
		setGebyr(gebyr);
	}

	private void setGebyr(int gebyr) {
		
		this.gebyr = gebyr;
	}
	
	public int getGebyr()	{
		
		return gebyr;
	}
	
	public String toString()	{
		
		return super.toString() + getGebyr();
	}
	
}
