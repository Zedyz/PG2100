package Oppgave2;

public class kontrakt extends Tjeneste {

	public String dag;
	
	public kontrakt()	{
		
		this(0, "", 0, "");
	}

	public kontrakt(int regNr, String kontaktperson, int pris, String dag) {
		
		super(regNr, kontaktperson, pris);
		setDag(dag);
	}

	private void setDag(String dag) {
		
		this.dag = dag;
	}
	
	public String getDag()	{
		
		return dag;
	}
	
	public String toString()	{
		
		return super.toString() + getDag();
	}
	
}
