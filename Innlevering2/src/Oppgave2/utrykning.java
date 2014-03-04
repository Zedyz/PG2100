package Oppgave2;

public class utrykning extends Tjeneste {

	public int gebyr;
	
	public utrykning()	{
		
		this(0);
		
	}
	
	public utrykning(int gebyr)	{
		
		setGebyr(gebyr);
		
	}

	private void setGebyr(int gebyr) {
		
		this.gebyr = gebyr;
		
	}
	
	public int getGebyr()	{
		
		return gebyr;
	}
	
	public String toString()	{
		
		return "Gebyr " + getGebyr();
		
	}
	
}
