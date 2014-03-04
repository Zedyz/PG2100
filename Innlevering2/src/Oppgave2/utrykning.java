package Oppgave2;

public class utrykning extends Tjeneste {

	public int gebyr;
	
	/*
	 * public void testmetode()	{
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	public utrykning()	{
		
		
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
	
}
