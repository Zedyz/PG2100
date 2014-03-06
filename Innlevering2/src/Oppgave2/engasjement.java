package Oppgave2;

public class engasjement extends Tjeneste {

	public int varighet;
	
	public engasjement()	{
		
		this(0, "", 0, 0);
	}

	public engasjement(int regNr, String kontaktperson, int pris, int varighet) {
		
		super(regNr, kontaktperson, pris);
		setVarighet(varighet);
	}

	private void setVarighet(int varighet) {
		
		this.varighet = varighet;
	}
	
	public int getVarighet()	{
		
		return varighet;
	}
	
	public String toString()	{
		
		return super.toString() + getVarighet();
	}
	
}
