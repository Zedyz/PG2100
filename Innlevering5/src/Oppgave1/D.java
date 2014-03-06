package Oppgave1;

public class D {

	private int i = 3;

	public D(int i) {
		
		super();
		setI(i);
	}

	public int getI()	{
		
		return i;
		
	}

	private void setI(int i) {
		
		this.i = i;
		
	}
	
	public void metode1()	{
		
		System.out.println("D sin metode1!");
		
	}
	
	public String toString()	{
		
		return "i = " + i;
		
	}
	
}
