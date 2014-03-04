package Oppgave2;

public class kontrakt extends Tjeneste {

	public String dag;
	
	public kontrakt()	{
		
		this("");
		
	}
	
	public kontrakt(String dag)	{
		
		setDag(dag);
		
	}

	private void setDag(String dag)	{
		
		this.dag = dag;
		
	}
	
	public String getDag()	{
		
		return dag;
		
	}
	
	public String toString()	{
			
			return "Dag: " + getDag();
			
		}
	
}
