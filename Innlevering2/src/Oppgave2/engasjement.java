package Oppgave2;

public class engasjement extends Tjeneste {

	public int varighet;
	
	public engasjement()	{
		
		this(0);
	}
	
	public engasjement(int varighet)	{
		
		setVarighet(varighet);
		
	}

	private void setVarighet(int varighet) {
		
		this.varighet = varighet;
		
	}
	
	public int getVarighet()	{
		
		return varighet;
		
	}
	
}
