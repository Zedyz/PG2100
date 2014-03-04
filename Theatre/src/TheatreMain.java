
public class TheatreMain {

	public static void main(String[] args) {
		Theatre t = new Theatre(1);
		
		Actors actor1 = new Actor1();
		Actors actor2 = new Actor2();
		
		boolean employed = t.employ(actor1);
		System.out.println("Actor1 ansatt: " + employed);
		
		employed = t.employ(actor2);
		System.out.println("Actor2 ansatt: " + employed);
		
	}

}
