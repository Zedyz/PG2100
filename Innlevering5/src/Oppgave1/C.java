package Oppgave1;

public class C {

	private int m = -1;
	private int n = -2;
	
	public C()	{
		
		m = 1;
		n = 2;
		
	}
	
	public C (int m, int n)	{
		
		setM(m);
		setN(n);
		
	}
	
	public int getM()	{
		
		return m;
		
	}
	
	public int getN()	{
		
		return n;
		
	}
	

	private void setN(int n) {

		
		
	}

	private void setM(int m) {
		
		
		
	}
	
	public void metode1()	{
		
		System.out.println("C sin metode!");
		
	}
	
	public String toString()	{
		
		return "m = "  + m + ", n= " + n;
		
	}
	
}
