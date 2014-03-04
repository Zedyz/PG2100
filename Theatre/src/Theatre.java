
public class Theatre {

	private Actors [] actors;
	private int staff;
	
	public Theatre()	{
		
		
	}
	
	public Theatre (int size)	{
		
		actors = new Actors[size];
		this.staff = 0;
		
	}
	
	public boolean employ(Actors actor) {
		Class<?> [] interfaces = actor.getClass().getInterfaces();
		if (interfaces.length == 0 || !(interfaces[0].getName().equals("forelesning.Acting")))
			return false;
		if (staff < actors.length) {
			actors[staff++] = actor;
			return true;
		}
		return false;
	}
	
}
